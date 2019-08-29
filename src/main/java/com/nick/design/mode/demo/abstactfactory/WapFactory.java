package com.nick.design.mode.demo.abstactfactory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 18:04
 * @description:
 */
public class WapFactory implements SystemFactory {

  @Override
  public OperationController createOperationController() {
    return new WapOperationController();
  }

  @Override
  public UIController createUIController () {
    return new WapUIController();
  }

}
