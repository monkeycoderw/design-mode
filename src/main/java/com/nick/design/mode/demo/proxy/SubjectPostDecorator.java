package com.nick.design.mode.demo.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 16:03
 * @description:
 */
@Slf4j
public class SubjectPostDecorator implements ISubject {

  private ISubject iSubject;

  public SubjectPostDecorator(ISubject iSubject) {
    this.iSubject = iSubject;
  }

  @Override
  public void action() {
    iSubject.action();
    postAction();
  }

  private void postAction() {
    log.info("SubjectPostDecorator postAction");
  }
}
