package com.nick.design.mode.demo.command1;

/**
 *
 * @author zhongwei
 * @date 2019-09-02
 * @time: 09:49
 * @description:
 *
 */
public class CommandClient {

  public static void main (String[] args) {

    // 创建接收者
    Receiver receiver = new Receiver();
    // 创建命令对象
    Command command = new ConcreteCommand(receiver);
    // 调用者
    Invoker invoker = new Invoker(command);
    // 执行方法
    invoker.action();

  }

}
