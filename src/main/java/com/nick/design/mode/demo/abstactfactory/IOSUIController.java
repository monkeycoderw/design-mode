package com.nick.design.mode.demo.abstactfactory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:55
 * @description:
 */
public class IOSUIController implements UIController {

  @Override
  public void display () {
    System.out.println("IOS UI Display");
  }

}
