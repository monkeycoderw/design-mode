package com.nick.design.mode.demo.bridge;

/**
 *
 * 面向对象模式，定义厂家的遥控器对象，实现厂家制定的遥控器方法
 *
 *
 * @author zhongwei
 * @date 2019-08-30
 * @time: 19:53
 * @description:
 */
public class SonyTvControl extends SonyControl implements TVControl {

  private static int ch = 0;
  private static boolean isOn = false;

  @Override
  public void onOff() {
    if (isOn) {
      isOn = false;
      super.off();
    } else {
      isOn = true;
      super.on();
    }
  }

  @Override
  public void nextChannel () {
    ch++;
    super.setChannel(ch);
  }

  @Override
  public void preChannel () {
    ch--;
    if (ch < 0) {
      ch = 200;
    }
    super.setChannel(ch);
  }
}
