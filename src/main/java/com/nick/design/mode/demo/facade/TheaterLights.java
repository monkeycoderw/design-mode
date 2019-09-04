package com.nick.design.mode.demo.facade;

/**
 * @author zhongwei
 * @date 2019-09-04
 * @time: 08:29
 * @description:
 */
public class TheaterLights {

  private volatile static TheaterLights instance = null;

  public static TheaterLights getInstance() {
    if (instance == null) {
      synchronized (TheaterLights.class) {
        if (instance == null) {
          return new TheaterLights();
        }
      }
    }
    return instance;
  }

  public void on() {
    System.out.println("TheaterLights On");
  }

  public void off() {
    System.out.println("TheaterLights Off");
  }

  private void dim(int d) {
    System.out.println("TheaterLights dim to " + d + "%");
  }

  public void bright(int d) {
    dim(d);
    System.out.println("TheaterLights bright");
  }

}
