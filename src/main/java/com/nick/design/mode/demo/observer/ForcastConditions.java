package com.nick.design.mode.demo.observer;

/**
 *
 * @author zhongwei
 * @date 2019-09-03
 * @time: 08:00
 * @description:
 *
 */
public class ForcastConditions implements Observer {

  private float mTemperature;
  private float mPressure;
  private float mHumidity;

  @Override
  public void update(float mTemperature, float mPressure, float mHumidity) {
    this.mTemperature = mTemperature;
    this.mPressure = mPressure;
    this.mHumidity = mHumidity;
    display();
  }

  private void display () {
    System.out.println("*** Tomorrow Temperature: " + mTemperature + " **");
    System.out.println("*** Tomorrow Pressure: " + mPressure + " **");
    System.out.println("*** Tomorrow Humidity: " + mHumidity + " **");
  }

}
