package com.nick.design.mode.demo.strategy;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 23:18
 * @description:
 */
public class Dis9Discount extends DisCount {

  public Dis9Discount() {
    super("打九折");
  }

  @Override
  public double discount(double price) {
    this.finalPrice = price * 0.9;
    return this.finalPrice;
  }

}
