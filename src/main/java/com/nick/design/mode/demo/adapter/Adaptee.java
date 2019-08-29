package com.nick.design.mode.demo.adapter;

/**
 *
 * 被适配的对象
 *
 * @author zhongwei
 * @date 2019-08-29
 * @time: 20:06
 * @description:
 */
public class Adaptee {

  /**
   *
   * 原来的业务
   *
   */
  public void specificRequest() {
    System.out.println("Adaptee Specific Request");
  }
}
