package com.nick.design.mode.demo.strategy;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 23:23
 * @description:
 */
public class NoneDiscount extends DisCount {

  NoneDiscount() {
    super("不打折");
  }

  @Override
  public double discount(double price) {
    this.finalPrice = price;
    return this.finalPrice;
  }

}
