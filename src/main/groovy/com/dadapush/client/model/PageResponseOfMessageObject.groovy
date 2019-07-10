package com.dadapush.client.model;

import groovy.transform.Canonical
import com.dadapush.client.model.MessageObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class PageResponseOfMessageObject {
    
    List<MessageObject> content = new ArrayList<MessageObject>()
    
    Long totalElements
    
    Long totalPages
}
