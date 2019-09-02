package com.nick.design.mode.demo.bridge;

/**
 *
 * 桥接模式，将遥控器所有需要用到的方法进行统一定义
 *
 * @author zhongwei
 * @date 2019-08-30
 * @time: 16:24
 * @description:
 *
 */
public interface Control {

  public void on();

  public void off();

  public void setChannel(int ch);

  public void setVolume(int vol);

}
