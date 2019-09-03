package com.nick.design.mode.demo.decorator.decorator;

import com.nick.design.mode.demo.decorator.Drink;

/**
 * @author zhongwei
 * @date 2019-09-03
 * @time: 11:52
 * @description:
 */
public class Soy extends Decorator {

  public Soy(Drink drink) {
    super(drink);
    super.setDesc("Soy Drink Decorator");
    super.setPrice(60.0f);
  }
}
