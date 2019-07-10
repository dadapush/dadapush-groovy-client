package com.dadapush.client.model;

import groovy.transform.Canonical
import com.dadapush.client.model.Action;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class MessageObject {
    /* action size range is 0,3 */
    List<Action> actions = new ArrayList<Action>()
    
    String channelName
    
    String content
    
    String createdAt
    
    Long id
    
    String title
}
