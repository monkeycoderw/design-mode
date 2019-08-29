package com.nick.design.mode.demo.abstactfactory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:55
 * @description:
 */
public class WapOperationController implements OperationController {

  @Override
  public void control () {
    System.out.println("Wap Operation Control");
  }

}
