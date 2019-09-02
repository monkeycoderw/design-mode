package com.nick.design.mode.demo.command1;

/**
 * @author zhongwei
 * @date 2019-09-02
 * @time: 09:46
 * @description:
 */
public class Invoker {

  /**
   *
   */
  private Command command = null;

  public Invoker (Command command) {
    this.command = command;
  }

  /**
   *
   * 行动方法执行
   *
   */
  public void action () {
    command.execute();
  }

}
