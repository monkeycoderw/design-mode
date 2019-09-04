package com.nick.design.mode.demo.facade;

/**
 *
 * @author zhongwei
 * @date 2019-09-04
 * @time: 08:16
 * @description:
 *
 */
public class Projector {

  private volatile static Projector instance = null;

  private int size = 5;

  public static Projector getInstance() {
    if (instance == null) {
      synchronized (Projector.class) {
        if (instance == null) {
          return new Projector();
        }
      }
    }
    return instance;
  }

  public void on () {
    System.out.println("Projector On");
  }

  public void off () {
    System.out.println("Projector Off");
  }

  public void focus() {
    System.out.println("Projector Focus");
  }

  public void zoom(int size) {
    this.size = size;
    System.out.println("Projector Zoom to" + size);
  }

}
