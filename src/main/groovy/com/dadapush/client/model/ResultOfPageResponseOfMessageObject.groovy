package com.dadapush.client.model;

import groovy.transform.Canonical
import com.dadapush.client.model.PageResponseOfMessageObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ResultOfPageResponseOfMessageObject {
    
    Integer code
    
    PageResponseOfMessageObject data = null
    
    String errmsg
}
