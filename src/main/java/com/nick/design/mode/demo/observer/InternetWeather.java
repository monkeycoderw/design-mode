package com.nick.design.mode.demo.observer;

/**
 * @author zhongwei
 * @date 2019-09-03
 * @time: 08:04
 * @description:
 */
public class InternetWeather {


  public static void main(String[] args) {

    CurrentConditions mCurrentConditions = new CurrentConditions();
    ForcastConditions mForcastConditions = new ForcastConditions();
    WeatherDataSt weatherDataSt = new WeatherDataSt();

    weatherDataSt.registerObserver(mCurrentConditions);
    weatherDataSt.registerObserver(mForcastConditions);

    weatherDataSt.setData(30,150, 55);
    weatherDataSt.removeObserver(mCurrentConditions);
    weatherDataSt.setData(40, 230, 65);
  }

}
