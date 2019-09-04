package com.nick.design.mode.demo.facade;

/**
 * @author zhongwei
 * @date 2019-09-04
 * @time: 08:22
 * @description:
 */
public class Stereo {

  private int volume = 5;

  private volatile static Stereo instance = null;

  public static Stereo getInstance() {
    if (instance==null) {
      synchronized (Stereo.class) {
        if (instance == null) {
          return new Stereo();
        }
      }
    }
    return instance;
  }

  public void on() {
    System.out.println("Stereo On");
  }

  public void off() {
    System.out.println("Stereo Off");
  }

  public void setVolume(int vol) {
    volume = vol;
    System.out.println("The volume is set to " + vol);
  }

  public void addVolume (int vol) {
    if (vol < 11) {
      volume++;
      setVolume(volume);
    }
  }

  public void subVolume() {
    if (volume > 0) {
      volume--;
      setVolume(volume);
    }
  }
}
