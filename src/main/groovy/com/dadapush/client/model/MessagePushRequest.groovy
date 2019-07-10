package com.dadapush.client.model;

import groovy.transform.Canonical
import com.dadapush.client.model.Action;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class MessagePushRequest {
    /* action size range is 0,3 */
    List<Action> actions = new ArrayList<Action>()
    /* message content */
    String content
    /* when value is false, will not send client push */
    Boolean needPush
    /* message title */
    String title
}
