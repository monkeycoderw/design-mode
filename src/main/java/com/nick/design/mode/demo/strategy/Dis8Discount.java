package com.nick.design.mode.demo.strategy;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 23:18
 * @description:
 */
public class Dis8Discount extends DisCount {

  public Dis8Discount() {
    super("打八折");
  }

  @Override
  public double discount(double price) {
    this.finalPrice = price * 0.8;
    return this.finalPrice;
  }

}
