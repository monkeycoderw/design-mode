package com.nick.design.mode.demo.proxy;

import java.util.Random;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 15:51
 * @description:
 */
@Slf4j
public class ProxySubject implements ISubject {

  private ISubject iSubject;

  public ProxySubject() {
    iSubject = new ConcreteSubject();
  }

  private void preAction() {
    log.info("ProxySubject PreAction");
  }

  private void postAction() {
    log.info("ProxySubject PostAction");
  }

  @Override
  public void action() {
    preAction();
    if ((new Random()).nextBoolean()) {
      iSubject.action();
    } else {
      log.info("Permission denied");
    }
    postAction();
  }

}
