package com.dadapush.client.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Action {
    /* action button name */
    String name
    /* fix value: link */
    String type
    /* action url */
    String url
}
