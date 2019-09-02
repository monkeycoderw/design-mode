package com.nick.design.mode.demo.bridge;

/**
 * @author zhongwei
 * @date 2019-08-30
 * @time: 19:53
 * @description:
 */
public class LGTvControl extends LGControl implements TVControl {

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
