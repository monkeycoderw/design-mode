package com.nick.design.mode.demo.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 16:05
 * @description:
 */
@Slf4j
public class DecoratorClient {

  public static void main(String[] args) {
    ISubject subject = new ConcreteSubject();
    ISubject preDecorator = new SubjectPreDecorator(subject);
    ISubject postDecorator = new SubjectPostDecorator(preDecorator);
    postDecorator.action();
  }

}
