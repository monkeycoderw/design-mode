package com.nick.design.mode.demo.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 16:01
 * @description:
 */
@Slf4j
public class SubjectPreDecorator implements ISubject {

  private ISubject iSubject;

  public SubjectPreDecorator (ISubject iSubject) {
    this.iSubject = iSubject;
  }

  @Override
  public void action() {
    preAction();
    iSubject.action();
  }

  private void preAction () {
    log.info("SubjectPreDecorator PreAction");
  }
}
