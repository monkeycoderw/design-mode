package com.nick.design.mode.demo.abstactfactory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:50
 * @description:
 */
public class AndroidOperationController implements OperationController {

  @Override
  public void control () {
    System.out.println("Android Operation Controller");
  }

}
