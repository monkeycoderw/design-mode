package com.nick.design.mode.demo.decorator.coffee;

import com.nick.design.mode.demo.decorator.Drink;

/**
 *
 * @author zhongwei
 * @date 2019-09-03
 * @time: 08:36
 * @description:
 *
 */
public class Coffee extends Drink {

  @Override
  public float cost() {
    return super.getPrice();
  }

}
