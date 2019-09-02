package com.nick.design.mode.demo.bridge;

/**
 * @author zhongwei
 * @date 2019-08-30
 * @time: 20:29
 * @description:
 */
public class BridgeClient {

  public static void main (String[] args) {

    TvControlLab lgControlLab;
    TvControlLab sonyControlLab;

    lgControlLab = new TvControlLab(new LGControl());
    sonyControlLab = new TvControlLab(new SonyControl());

    lgControlLab.onOff();
    lgControlLab.nextChannel();
    lgControlLab.nextChannel();
    lgControlLab.preChannel();
    lgControlLab.onOff();

    sonyControlLab.onOff();
    sonyControlLab.nextChannel();
    sonyControlLab.nextChannel();
    sonyControlLab.preChannel();
    sonyControlLab.onOff();

    NewTvControlLab sharpControlLab =
        new NewTvControlLab(new SharpControl());
    sharpControlLab.onOff();
    sharpControlLab.nextChannel();
    sharpControlLab.nextChannel();
    sharpControlLab.preChannel();
    sharpControlLab.onOff();
  }

}
