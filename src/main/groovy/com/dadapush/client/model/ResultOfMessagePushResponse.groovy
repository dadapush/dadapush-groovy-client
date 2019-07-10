package com.dadapush.client.model;

import groovy.transform.Canonical
import com.dadapush.client.model.MessagePushResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ResultOfMessagePushResponse {
    
    Integer code
    
    MessagePushResponse data = null
    
    String errmsg
}
