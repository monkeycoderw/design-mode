package com.nick.design.mode.demo.chain;

/**
 *
 * @author zhongwei
 * @date 2019-08-30
 * @time: 15:53
 * @description:
 *
 */
public class VicePresidentApprover extends Approver {

  public VicePresidentApprover(String name) {
    super(name + " Vice President");
  }

  @Override
  public void ProcessRequest(PurchaseRequest request) {
    if (10000 < request.getNum() && request.getNum() < 50000) {
      System.out.println("**This request " + request.getNum()
          + " will be handled by " + this.name + " **");
    } else {
      successor.ProcessRequest(request);
    }
  }

}
