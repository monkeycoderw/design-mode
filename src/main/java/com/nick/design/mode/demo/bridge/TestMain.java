package com.nick.design.mode.demo.bridge;

/**
 *
 * 传统面向对象的模式
 *
 * @author zhongwei
 * @date 2019-08-30
 * @time: 19:59
 * @description:
 */
public class TestMain {

  public static void main (String[] args) {

    LGTvControl lgtv = new LGTvControl();
    SonyTvControl snoytv = new SonyTvControl();

    lgtv.onOff();
    lgtv.nextChannel();
    lgtv.nextChannel();
    lgtv.preChannel();
    lgtv.onOff();

    snoytv.onOff();
    snoytv.nextChannel();
    snoytv.nextChannel();
    snoytv.preChannel();
    snoytv.onOff();

  }

}
