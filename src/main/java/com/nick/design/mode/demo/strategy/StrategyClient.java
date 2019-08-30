package com.nick.design.mode.demo.strategy;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 23:30
 * @description:
 */
public class StrategyClient {

  public static void main(String[] args) {
    Shopping shopping1 = new Shopping("深入理解JVM", 54.0, new Dis9Discount());
    shopping1.calculate();

    Shopping shopping2 = new Shopping("显示器", 1490.0, new Dis9Discount());
    shopping2.calculate();

    Shopping shopping3 = new Shopping("大疆无人机", 2366.0, new Dis9Discount());
    shopping3.calculate();
  }

}
