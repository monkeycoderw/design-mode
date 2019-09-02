package com.nick.design.mode.demo.bridge;

/**
 * @author zhongwei
 * @date 2019-08-30
 * @time: 20:21
 * @description:
 */
public class TvControlLab extends TvControllabs {

  private int ch = 0;
  private boolean ison = false;

  public TvControlLab(Control mControl) {
    super(mControl);
  }

  @Override
  public void onOff() {
    if (ison) {
      ison = false;
      mControl.off();
    } else {
      ison = true;
      mControl.on();
    }
  }

  @Override
  public void nextChannel () {
    ch++;
    mControl.setChannel(ch);
  }

  @Override
  public void preChannel () {
    ch--;
    if (ch < 0) {
      ch = 200;
    }
    mControl.setChannel(ch);
  }

}

