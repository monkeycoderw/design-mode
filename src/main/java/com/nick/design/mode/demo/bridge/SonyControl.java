package com.nick.design.mode.demo.bridge;

/**
 * 桥接模式，Sony遥控器对遥控器统一方法的实现
 * @author zhongwei
 * @date 2019-08-30
 * @time: 16:26
 * @description:
 *
 */
public class SonyControl implements Control {

  @Override
  public void on () {
    System.out.println("Sony On");
  }

  @Override
  public void off () {
    System.out.println("Sony Off");
  }

  @Override
  public void setChannel(int ch) {
    System.out.println("The Sony TV Channel is " + ch + " **");
  }

  @Override
  public void setVolume(int vol) {
    System.out.println("The Sony TV Volume is " + vol + " **");
  }

}
