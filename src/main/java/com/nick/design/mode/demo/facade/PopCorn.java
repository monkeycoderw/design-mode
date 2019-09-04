package com.nick.design.mode.demo.facade;

/**
 * @author zhongwei
 * @date 2019-09-04
 * @time: 08:13
 * @description:
 */
public class PopCorn {

  private volatile static PopCorn instance = null;

  public static PopCorn getInstance() {
    if (instance == null) {
      synchronized (PopCorn.class) {
        if (instance == null) {
          return new PopCorn();
        }
      }
    }
    return instance;
  }

  public void on() {
    System.out.println("PopCorn On");
  }

  public void off() {
    System.out.println("PopCorn off");
  }

  public void pop() {
    System.out.println("PopCorn Pop");
  }

}
