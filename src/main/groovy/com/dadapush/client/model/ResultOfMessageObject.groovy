package com.dadapush.client.model;

import groovy.transform.Canonical
import com.dadapush.client.model.MessageObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ResultOfMessageObject {
    
    Integer code
    
    MessageObject data = null
    
    String errmsg
}
