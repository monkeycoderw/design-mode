package com.nick.design.mode.demo.decorator.decorator;

import com.nick.design.mode.demo.decorator.Drink;
import com.nick.design.mode.demo.singleton.ChocolateFactory;

/**
 * @author zhongwei
 * @date 2019-09-03
 * @time: 11:48
 * @description:
 */
public class Chocalate extends Decorator {

  public Chocalate(Drink drink) {
    super(drink);
    super.setDesc("Chocalate Drink Decorator");
    super.setPrice(30.0f);
  }

}
