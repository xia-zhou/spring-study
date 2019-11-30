package com.cydeer.dubbo.common.facade;

import com.cydeer.dubbo.common.model.HelloInput;
import com.cydeer.dubbo.common.model.HelloResult;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/30 12:25
 *
 */
public interface HelloService {

    HelloResult hello(HelloInput helloInput);
}
