package com.nick.design.mode.demo.decorator;

/**
 * @author zhongwei
 * @date 2019-09-03
 * @time: 08:33
 * @description:
 */
public abstract class Drink {

  public String desc = "";
  private float price = 0f;

  public abstract float cost();

  public String getDesc() {
    return desc + "-" + price;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }
}
