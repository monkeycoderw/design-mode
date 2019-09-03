package com.nick.design.mode.demo.observer;

/**
 * @author zhongwei
 * @date 2019-09-03
 * @time: 07:44
 * @description:
 */
public interface Subject {

  void registerObserver(Observer o);
  void removeObserver(Observer o);
  void notifyObserver();

}
