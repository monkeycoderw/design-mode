package com.nick.design.mode.demo.abstactfactory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 18:03
 * @description:
 */
public class IOSFactory implements SystemFactory {

  @Override
  public OperationController createOperationController () {
    return new IOSOperationController();
  }

  @Override
  public UIController createUIController () {
    return new IOSUIController();
  }

}
