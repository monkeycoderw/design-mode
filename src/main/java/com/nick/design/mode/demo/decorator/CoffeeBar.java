package com.nick.design.mode.demo.decorator;

import com.nick.design.mode.demo.decorator.coffee.Decaf;
import com.nick.design.mode.demo.decorator.coffee.LongBlack;
import com.nick.design.mode.demo.decorator.decorator.Chocalate;
import com.nick.design.mode.demo.decorator.decorator.Milk;

/**
 * @author zhongwei
 * @date 2019-09-03
 * @time: 11:55
 * @description:
 */
public class CoffeeBar {

  public static void main (String[] args) {

    Drink order;

    order = new Decaf();
    System.out.println("Order One Price: " + order.getPrice());
    System.out.println("Order One Desc: " + order.getDesc());

    // 任意搭配，自定义添加组合方式
    // 选好一次咖啡后添加一次牛奶、两次巧克力
    // 用装饰器将对象包装起来，在装饰器内自定义新的逻辑方法，不影响老的对象
    order = new LongBlack();
    order = new Milk(order);
    order = new Chocalate(order);
    order = new Chocalate(order);
    System.out.println("Order Two Price: " + order.cost());
    System.out.println("Order Two Desc: " + order.getDesc());

  }

}
