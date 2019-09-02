package com.nick.design.mode.demo.bridge;

/**
 *
 * 桥接模式，桥接的抽象类，定义基本的抽象方法可桥接对象
 *
 * @author zhongwei
 * @date 2019-08-30
 * @time: 20:17
 * @description:
 *
 */
public abstract class TvControllabs {

  Control mControl = null;

  public TvControllabs(Control mControl) {
    this.mControl = mControl;
  }

  public abstract void onOff();

  public abstract void nextChannel();

  public abstract void preChannel();

}
