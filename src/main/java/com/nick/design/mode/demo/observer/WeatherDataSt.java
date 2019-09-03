package com.nick.design.mode.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhongwei
 * @date 2019-09-03
 * @time: 07:47
 * @description:
 *
 */
public class WeatherDataSt implements Subject {

  private float mTemperature;
  private float mPressure;
  private float mHumidity;

  private List<Observer> mObservers;

  public WeatherDataSt() {
    mObservers = new ArrayList<>();
  }

  public void setData(float mTemperature, float mPressure, float mHumidity) {
    this.mTemperature = mTemperature;
    this.mPressure = mPressure;
    this.mHumidity = mHumidity;
    dataChange();
  }

  public void dataChange() {
    notifyObserver();
  }

  @Override
  public void registerObserver(Observer o) {
    mObservers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    mObservers.remove(o);
  }

  @Override
  public void notifyObserver() {
    for (Observer observer : mObservers) {
      observer.update(getTemperature(), getPressure(), getHumidity());
    }
  }

  private float getTemperature() {
    return mTemperature;
  }

  private float getPressure() {
    return mPressure;
  }

  private float getHumidity () {
    return mHumidity;
  }

}
