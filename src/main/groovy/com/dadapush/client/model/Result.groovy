package com.dadapush.client.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Result {
    
    Integer code
    
    Object data = null
    
    String errmsg
}
