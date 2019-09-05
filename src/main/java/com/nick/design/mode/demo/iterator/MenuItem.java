package com.nick.design.mode.demo.iterator;

import lombok.Data;

/**
 * @author zhongwei
 * @date 2019-09-05
 * @time: 08:04
 * @description:
 *
 *  菜单对象
 *
 */
@Data
public class MenuItem {

  private String name;
  private String desc;
  private boolean vegetable;
  private float price;

  public MenuItem(String name, String desc, boolean vegetable, float price) {
    this.name = name;
    this.desc = desc;
    this.vegetable = vegetable;
    this.price = price;
  }

}
