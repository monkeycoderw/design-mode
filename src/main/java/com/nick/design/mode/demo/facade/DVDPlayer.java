package com.nick.design.mode.demo.facade;

/**
 *
 * DVD播放器
 *
 * @author zhongwei
 * @date 2019-09-04
 * @time: 08:08
 * @description:
 *
 *
 */
public class DVDPlayer {

  private volatile static DVDPlayer instance = null;

  public static DVDPlayer getInstance() {
    if (instance == null) {
      synchronized (DVDPlayer.class) {
        if (instance == null) {
          return new DVDPlayer();
        }
      }
    }
    return instance;
  }

  public void on() {
    System.out.println("DVDPlayer On");
  }

  public void off() {
    System.out.println("DVDPlayer Off");
  }

  public void play() {
    System.out.println("DVDPlayer play");
  }

  public void pause() {
    System.out.println("DVDPlayer pause");
  }

  public void setDVD() {
    System.out.println("DVDPlayer setDVD");
  }

}
