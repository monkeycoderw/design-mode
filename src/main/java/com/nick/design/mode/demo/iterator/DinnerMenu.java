package com.nick.design.mode.demo.iterator;

import com.nick.design.mode.demo.facade.Screen;
import java.util.ArrayList;

/**
 * @author zhongwei
 * @date 2019-09-05
 * @time: 08:16
 * @description:
 *
 *  自定义迭代器，中餐厅对象，返回实现的迭代器对象即可遍历集合
 *
 */
public class DinnerMenu {

  private final static int MAX_ITEMS = 5;
  private int index = 0;
  private MenuItem[] menuItems;

  public DinnerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("vegetable Blt", "bacon&lettuce&tomato&cabbage", true, 3.58f);
    addItem("Blt", "bacon&lettuce&tomato", false, 3.00f);
    addItem("bean soup", "bean&potato salad", true, 3.28f);
    addItem("hotdog", "onions&cheese&bread", false, 3.05f);
  }

  private void addItem(String name, String desc, boolean vegetable, float price) {
    if (index < MAX_ITEMS) {
      menuItems[index++] = new MenuItem(name, desc, vegetable, price);
    } else {
      System.err.println("Sorry, The menu ");
    }
  }

  public Iterator getIterator() {
    return new DinnerIterator();
  }

  class DinnerIterator implements Iterator {

    private int position;

    @Override
    public boolean hasNext() {
      if (position < index) {
        return true;
      }
      return false;
    }

    @Override
    public MenuItem next(){
      return menuItems[position++];
    }

  }

}
