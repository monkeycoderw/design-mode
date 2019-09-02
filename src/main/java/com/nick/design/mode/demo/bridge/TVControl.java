package com.nick.design.mode.demo.bridge;

/**
 *
 * 面向对象模式，所有遥控器统一的界面，界面上定义3个统一的按钮
 *
 * @author zhongwei
 * @date 2019-08-30
 * @time: 16:47
 * @description:
 *
 */
public interface TVControl {

  public void onOff();

  public void nextChannel();

  public void preChannel();

}
