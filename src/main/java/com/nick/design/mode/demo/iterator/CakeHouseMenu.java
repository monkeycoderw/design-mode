package com.nick.design.mode.demo.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义迭代器，西餐厅对象，返回实现的迭代器对象即可遍历集合
 * @author zhongwei
 * @date 2019-09-05
 * @time: 08:03
 * @description:
 *
 */
public class CakeHouseMenu {

  private List<MenuItem> menuItems;

  public CakeHouseMenu() {
    menuItems = new ArrayList<>();
    addItem("KFC Cake Breakfast", "boiled eggs&toast&cabbage", true, 3.99f);
    addItem("MDL Cake Breakfast", "fried eggs&toast", false, 3.59f);
    addItem("Stawberry Cake", "fresh stawberry", true, 3.29f);
    addItem("Regular Cake Breakfast", "toast&sausage", true, 2.59f);  }

  private void addItem(String name, String desc, boolean vegetable, float price) {
    menuItems.add(new MenuItem(name, desc, vegetable, price));
  }

  public Iterator getIterator() {
    return new CakeHouseIterator();
  }

  /**
   * 自定义迭代器对象，西餐厅实现迭代方法
   */
  class CakeHouseIterator implements Iterator {

    private int position = 0;

    public CakeHouseIterator() {}

    @Override
    public boolean hasNext () {
      if (position < menuItems.size()) {
        return true;
      }
      return false;
    }

    @Override
    public Object next() {
      return menuItems.get(position++);
    }

  }

}
