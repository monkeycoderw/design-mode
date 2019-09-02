package com.nick.design.mode.demo.bridge;

/**
 *
 * 桥接模式，新电视机类型，实现基础抽象方法，以及新型的遥控器的方法
 *
 * @author zhongwei
 * @date 2019-08-30
 * @time: 20:21
 * @description:
 */
public class NewTvControlLab extends TvControllabs {

  private int ch = 0;
  private boolean ison = false;
  private int prech;

  public NewTvControlLab(Control mControl) {
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
    prech = ch;
    ch++;
    mControl.setChannel(ch);
  }

  @Override
  public void preChannel () {
    prech = ch;
    ch--;
    if (ch < 0) {
      ch = 200;
    }
    mControl.setChannel(ch);
  }

  public void setChannel(int nch) {
    prech = ch;
    ch = nch;
    mControl.setChannel(ch);
  }

  public void Back() {
    mControl.setChannel(prech);
  }

}

