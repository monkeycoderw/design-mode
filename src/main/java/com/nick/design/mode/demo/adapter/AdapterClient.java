package com.nick.design.mode.demo.adapter;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 20:11
 * @description:
 */
public class AdapterClient {

  public static void main (String[] args) {
    Adaptee adaptee = new Adaptee();
    Target target = new Adapter(adaptee);
    target.request();
  }

}
