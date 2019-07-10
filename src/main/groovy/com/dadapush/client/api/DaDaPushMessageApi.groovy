package com.dadapush.client.api;

import com.dadapush.client.ApiUtils
import com.dadapush.client.model.MessagePushRequest
import com.dadapush.client.model.Result
import com.dadapush.client.model.ResultOfMessageObject
import com.dadapush.client.model.ResultOfMessagePushResponse
import com.dadapush.client.model.ResultOfPageResponseOfMessageObject

class DaDaPushMessageApi {
    String basePath = "https://www.dadapush.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createMessage ( MessagePushRequest body, String xChannelToken, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/message"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }


        if (xChannelToken != null) {
            headerParams.put("x-channel-token", xChannelToken)
        }

        contentType = 'application/json';
        bodyParams = body


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ResultOfMessagePushResponse.class )

    }

    def deleteMessage ( Long messageId, String xChannelToken, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/message/${messageId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }


        if (xChannelToken != null) {
            headerParams.put("x-channel-token", xChannelToken)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    Result.class )

    }

    def getMessage ( Long messageId, String xChannelToken, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/message/${messageId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }


        if (xChannelToken != null) {
            headerParams.put("x-channel-token", xChannelToken)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ResultOfMessageObject.class )

    }

    def getMessages ( Integer page, Integer pageSize, String xChannelToken, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/messages"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (page == null) {
            throw new RuntimeException("missing required params page")
        }
        // verify required params are set
        if (pageSize == null) {
            throw new RuntimeException("missing required params pageSize")
        }

        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }

        if (xChannelToken != null) {
            headerParams.put("x-channel-token", xChannelToken)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ResultOfPageResponseOfMessageObject.class )

    }

}
