package com.nick.design.mode.demo.chain;

/**
 * @author zhongwei
 * @date 2019-08-30
 * @time: 16:03
 * @description:
 */
public class Client {

  public PurchaseRequest sentRequest(int type, int num, float price) {
    return new PurchaseRequest(type, num, price);
  }

}
