package com.nick.design.mode.demo.decorator.decorator;

import com.nick.design.mode.demo.decorator.Drink;

/**
 * @author zhongwei
 * @date 2019-09-03
 * @time: 11:51
 * @description:
 */
public class Milk extends Decorator {

  public Milk(Drink drink) {
    super(drink);
    super.setDesc("Milk Drink Decorator");
    super.setPrice(60.0f);
  }

}
