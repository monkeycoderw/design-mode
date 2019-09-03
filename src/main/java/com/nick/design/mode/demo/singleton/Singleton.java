package com.nick.design.mode.demo.singleton;

/**
 * @author zhongwei
 * @date 2019-09-03
 * @time: 08:15
 * @description:
 */
public class Singleton {

  private static Singleton uniqueInstance = null;

  private Singleton () {

  }

  /**
   *
   * 利用静态方法和静态变量实现简单的单例
   *
   */
  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }

}
