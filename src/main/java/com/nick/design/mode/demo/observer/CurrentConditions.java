package com.nick.design.mode.demo.observer;

/**
 *
 * @author zhongwei
 * @date 2019-09-03
 * @time: 08:00
 * @description:
 *
 */
public class CurrentConditions implements Observer {

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
    System.out.println("*** Today Temperature: " + mTemperature + " **");
    System.out.println("*** Today Pressure: " + mPressure + " **");
    System.out.println("*** Today Humidity: " + mHumidity + " **");
  }

}
