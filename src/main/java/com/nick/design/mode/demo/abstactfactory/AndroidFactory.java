package com.nick.design.mode.demo.abstactfactory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:59
 * @description:
 */
public class AndroidFactory implements SystemFactory {

  @Override
  public OperationController createOperationController () {
    return new AndroidOperationController();
  }

  @Override
  public UIController createUIController () {
    return new AndroidUIController();
  }

}
