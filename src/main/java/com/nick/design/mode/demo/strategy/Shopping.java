package com.nick.design.mode.demo.strategy;

import java.text.MessageFormat;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 23:25
 * @description:
 */
public class Shopping {

  private String goods;
  private double price;
  private DisCount disCount;

  public Shopping(String goods, double price, DisCount disCount) {
    this.goods = goods;
    this.price = price;
    this.disCount = disCount;
  }

  public double calculate() {
    double finalPrice = disCount.discount((this.price));
    String desc = disCount.getDesc();
    System.out.println(
        MessageFormat.format("Goods:{0}, price:{1},{2}, finalPrice:{3}",
        goods, price, desc, finalPrice));
    return finalPrice;
  }

}
