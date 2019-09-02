package com.nick.design.mode.demo.command1;

/**
 *
 * @author zhongwei
 * @date 2019-09-02
 * @time: 09:44
 * @description:
 *
 */
public class ConcreteCommand implements Command {

  Receiver receiver = null;

  ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  /**
   *
   * 通常会转调接收者的形影方法，让接收者来真正执行功能
   *
   */
  @Override
  public void execute () {
    this.receiver.action();
  }

}
