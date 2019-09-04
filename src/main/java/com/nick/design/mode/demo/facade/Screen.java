package com.nick.design.mode.demo.facade;

/**
 *
 * @author zhongwei
 * @date 2019-09-04
 * @time: 08:19
 * @description:
 *
 */
public class Screen {

  private volatile static Screen instance = null;

  public static Screen getInstance() {
    if (instance == null) {
      synchronized (Screen.class) {
        if (instance == null) {
          return new Screen();
        }
      }
    }
    return instance;
  }

  public void up() {
    System.out.println("Screen Up");
  }

  public void down() {
    System.out.println("Screen Down");
  }
}
