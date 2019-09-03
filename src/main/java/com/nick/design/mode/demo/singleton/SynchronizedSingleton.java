package com.nick.design.mode.demo.singleton;

/**
 *
 * 同步 synchronized getInstance
 *
 * @author zhongwei
 * @date 2019-09-03
 * @time: 08:19
 * @description:
 */
public class SynchronizedSingleton {

  private static SynchronizedSingleton uniqueInstance = null;

  private SynchronizedSingleton () {

  }

  public static synchronized SynchronizedSingleton getInstance() {
    if (uniqueInstance == null) {
      synchronized (SynchronizedSingleton.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new SynchronizedSingleton();
        }
      }
    }
    return uniqueInstance;
  }
}
