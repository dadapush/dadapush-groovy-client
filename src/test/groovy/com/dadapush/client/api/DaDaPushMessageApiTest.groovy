package com.dadapush.client.api

import com.dadapush.client.api.DaDaPushMessageApi
import com.dadapush.client.model.Action
import com.dadapush.client.model.MessagePushRequest
import com.dadapush.client.model.ResultOfMessagePushResponse

class DaDaPushMessageApiTest extends GroovyTestCase {

  void testCreateMessage() {
    def api = new DaDaPushMessageApi(
//            basePath: "http://127.0.0.1:8080"
    )
    def channelToken = "ctb3lwO6AeiZOwqZgp8BE8980FdNgp0cp6MCf"
    def body = new MessagePushRequest()
    body.title = "Good News!"
    body.content = "Good News! DaDaPush releasing new version"
    body.needPush = true
    def action = new Action(name: "view", url: "https://www.dadapush.com/", type: "link")
    body.actions = [action]
    def onSuccess = {
      ResultOfMessagePushResponse response -> println response
    }
    def onError = {
      int statusCode, String message ->
        println statusCode
        println message
    }
    api.createMessage(body, channelToken, onSuccess, onError)

  }

  @SuppressWarnings("GroovyAssignabilityCheck")
  void testDeleteMessage() {
    def api = new DaDaPushMessageApi(
//            basePath: "http://127.0.0.1:8080"
    )
    def channelToken = "ctb3lwO6AeiZOwqZgp8BE8980FdNgp0cp6MCf"
    def messageId=227882
    def onSuccess = {
       response -> println response
    }
    def onError = {
      int statusCode, String message ->
        println statusCode
        println message
    }
    api.deleteMessage(messageId, channelToken, onSuccess, onError)
  }

  @SuppressWarnings("GroovyAssignabilityCheck")
  void testGetMessage() {
    def api = new DaDaPushMessageApi(
//            basePath: "http://127.0.0.1:8080"
    )
    def channelToken = "ctb3lwO6AeiZOwqZgp8BE8980FdNgp0cp6MCf"
    def messageId=227882
    def onSuccess = {
      response -> println response
    }
    def onError = {
      int statusCode, String message ->
        println statusCode
        println message
    }
    api.getMessage(messageId, channelToken, onSuccess, onError)
  }

  @SuppressWarnings("GroovyAssignabilityCheck")
  void testGetMessages() {
    def api = new DaDaPushMessageApi(
//            basePath: "http://127.0.0.1:8080"
    )
    def channelToken = "ctb3lwO6AeiZOwqZgp8BE8980FdNgp0cp6MCf"
    def page = 1
    def pageSize = 10
    def onSuccess = {
      response -> println response
    }
    def onError = {
      int statusCode, String message ->
        println statusCode
        println message
    }
    api.getMessages(page, pageSize, channelToken, onSuccess, onError)
  }
}
