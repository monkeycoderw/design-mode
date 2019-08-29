package com.nick.design.mode.demo.strategy;

import java.lang.annotation.Documented;
import lombok.Data;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 23:16
 * @description:
 */
@Data
public abstract class DisCount {

  protected Double finalPrice;
  protected String desc;

  public DisCount(String desc) {
    this.desc = desc;
  }

  abstract double discount(double price);

}
