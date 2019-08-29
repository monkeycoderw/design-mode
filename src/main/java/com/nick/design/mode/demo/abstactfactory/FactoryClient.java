package com.nick.design.mode.demo.abstactfactory;

/**
 *
 * 抽象工厂
 *
 * @author zhongwei
 * @date 2019-08-29
 * @time: 18:06
 * @description:
 */
public class FactoryClient {

  public static void main (String[] args) {
    SystemFactory facory;
    UIController uiController;
    OperationController operationController;

    facory = new AndroidFactory();
//    facory = new IOSFactory();
//    facory = new WapFactory();

    operationController = facory.createOperationController();
    uiController = facory.createUIController();

    operationController.control();
    uiController.display();
  }

}
