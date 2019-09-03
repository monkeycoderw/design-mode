package com.nick.design.mode.demo.singleton;

/**
 *
 * 利用volatile关键字和双重验证以及同步锁，即保证了内存的合理分配和原子性，也无需每次都加上同步锁
 *
 * @author zhongwei
 * @date 2019-09-03
 * @time: 08:23
 * @description:
 */
public class ChocolateFactory {

  private boolean empty;
  private boolean boiled;
  private volatile static ChocolateFactory uniqueInstance = null;

  private ChocolateFactory () {
    empty = true;
    boiled = false;
  }

  public static ChocolateFactory getInstance() {
    if (uniqueInstance == null) {
      synchronized (ChocolateFactory.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new ChocolateFactory();
        }
      }
    }
    return uniqueInstance;
  }

}
