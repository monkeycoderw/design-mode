package com.nick.design.mode.demo.abstactfactory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:53
 * @description:
 */
public class IOSOperationController implements OperationController {

  @Override
  public void control () {
    System.out.println("IOS Operation control");
  }
}
