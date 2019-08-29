package com.nick.design.mode.demo.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:15
 * @description:
 */
@Slf4j
public class SimpleFactory {

  private static String tag = "ShapeFactory";

  public static Shape getShape (String type) {
    Shape shape = null;
    if (type.equalsIgnoreCase("circle")) {
      shape = new CircleShape();
    } else if (type.equalsIgnoreCase("rect")) {
      shape = new RectShape();
    } else if (type.equalsIgnoreCase("triangle")) {
      shape = new TriangleShape();
    }
    return shape;
  }

}
