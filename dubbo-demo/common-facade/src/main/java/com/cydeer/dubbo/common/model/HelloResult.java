package com.cydeer.dubbo.common.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/30 12:23
 *
 */
@Data
@Accessors(chain = true)
public class HelloResult implements Serializable {

    private String name;

    private List<String> tags;
}
