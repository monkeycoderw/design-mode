package com.nick.design.mode.demo.adapter;

/**
 *
 * 适配器
 *
 * @author zhongwei
 * @date 2019-08-29
 * @time: 20:08
 * @description:
 */
public class Adapter implements Target {

  private Adaptee adaptee;

  Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void request () {
    System.out.println("Adapter Request");
    adaptee.specificRequest();
  }
}
