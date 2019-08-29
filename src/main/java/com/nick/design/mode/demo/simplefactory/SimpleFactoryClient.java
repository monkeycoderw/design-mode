package com.nick.design.mode.demo.simplefactory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:20
 * @description:
 */
public class SimpleFactoryClient {

  public static void main (String[] args) {
    Shape triangleShape = SimpleFactory.getShape("triangle");
    triangleShape.draw();

    Shape rectShape = SimpleFactory.getShape("rect");
    rectShape.draw();

    Shape circleShape = SimpleFactory.getShape("circle");
    circleShape.draw();
  }

}
