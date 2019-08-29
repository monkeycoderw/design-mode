package com.nick.design.mode.demo.strategy;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 23:21
 * @description:
 */
public class Cash10Discount extends DisCount {

  Cash10Discount() {
    super("返现10元");
  }

  @Override
  public double discount(double price) {
    this.finalPrice = price >= 10 ? price - 10 : 0;
    return this.finalPrice;
  }
}
