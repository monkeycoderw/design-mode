package com.nick.design.mode.demo.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author zhongwei
 * @date 2019-08-29
 * @time: 15:48
 * @description:
 *
 */
@Slf4j
public class ConcreteSubject implements ISubject {

  @Override
  public void action() {
    log.info("ConcreteSubject action()");
  }

}
