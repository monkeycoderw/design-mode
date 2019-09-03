package com.nick.design.mode.demo.decorator.decorator;

import com.nick.design.mode.demo.decorator.Drink;

/**
 * @author zhongwei
 * @date 2019-09-03
 * @time: 08:42
 * @description:
 */
public class Decorator extends Drink {

  private Drink drink;

  public Decorator(Drink drink) {
    this.drink = drink;
  }

  @Override
  public float cost () {
    return super.getPrice() + drink.cost();
  }

  @Override
  public String getDesc () {
    return super.getDesc() + "-" + super.getPrice() + "&&" + drink.getDesc() + "\n";
  }

}
