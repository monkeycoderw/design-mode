package com.nick.design.mode.demo.bridge;

/**
 * 桥接模式，Sharp遥控器对遥控器统一方法的实现
 * @author zhongwei
 * @date 2019-08-30
 * @time: 16:26
 * @description:
 *
 */
public class SharpControl implements Control {

  @Override
  public void on () {
    System.out.println("Sharp On");
  }

  @Override
  public void off () {
    System.out.println("Sharp Off");
  }

  @Override
  public void setChannel(int ch) {
    System.out.println("The Sharp TV Channel is " + ch + " **");
  }

  @Override
  public void setVolume(int vol) {
    System.out.println("The Sharp TV Volume is " + vol + " **");
  }

}
