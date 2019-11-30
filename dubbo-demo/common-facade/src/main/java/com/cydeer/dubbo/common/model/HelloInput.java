package com.cydeer.dubbo.common.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/30 12:19
 *
 */
@Data
@Accessors(chain = true)
public class HelloInput implements Serializable {

    private String name;
}
