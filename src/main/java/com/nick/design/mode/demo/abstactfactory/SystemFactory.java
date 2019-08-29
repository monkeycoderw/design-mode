package com.nick.design.mode.demo.abstactfactory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:58
 * @description:
 */
public interface SystemFactory {

  OperationController createOperationController();

  UIController createUIController();

}
