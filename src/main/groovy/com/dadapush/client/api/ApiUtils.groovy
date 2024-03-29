package com.dadapush.client

import static groovyx.net.http.HttpBuilder.configure
import static java.net.URI.create

class ApiUtils {

    void invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType, method, container, type)  {
        def (url, uriPath) = buildUrlAndUriPath(basePath, versionPath, resourcePath)
        println "url=$url uriPath=$uriPath"
        def http = configure {
            request.uri = url
            request.uri.path = uriPath
        }
        .invokeMethod(String.valueOf(method).toLowerCase()) {
            request.uri.query = queryParams
            request.headers = headerParams
            if (bodyParams != null) {
                request.body = bodyParams
            }
            request.contentType = contentType

            response.success { resp, json ->
                if (type != null) {
                    onSuccess(parse(json, container, type))
                }
            }
            response.failure { resp ->
                onFailure(resp.statusCode, resp.message)
            }
        }

    }

    private static def buildUrlAndUriPath(basePath, versionPath, resourcePath) {
        // HTTPBuilder expects to get as its constructor parameter an URL,
        // without any other additions like path, therefore we need to cut the path
        // from the basePath as it is represented by swagger APIs
        // we use java.net.URI to manipulate the basePath
        // then the uriPath will hold the rest of the path
        URI baseUri =  create(basePath)
        def pathOnly = baseUri.getPath()
        [basePath-pathOnly, pathOnly+versionPath+resourcePath]
    }

    private def parse(object, container, clazz) {
        if (container == "array") {
            return object.collect {parse(it, "", clazz)}
        }   else {
            return clazz.newInstance(object)
        }
    }

}
