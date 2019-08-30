package com.nick.design.mode.demo.chain;

import lombok.Data;

/**
 *
 * 采购申请
 *
 * @author zhongwei
 * @date 2019-08-30
 * @time: 15:33
 * @description:
 */
@Data
public class PurchaseRequest {

  private int id;
  private int type;
  private int num;
  private float price;

  public PurchaseRequest(int type, int num, float price) {
    this.type = type;
    this.num = num;
    this.price = price;
  }

  public int getId() {
    return (int) (Math.random() * 1000);
  }
}
