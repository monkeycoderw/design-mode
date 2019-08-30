package com.nick.design.mode.demo.chain;

/**
 * @author zhongwei
 * @date 2019-08-30
 * @time: 15:53
 * @description:
 */
public class PresidentApprover extends Approver {

  public PresidentApprover(String name) {
    super(name + " President");
  }

  @Override
  public void ProcessRequest(PurchaseRequest request) {
    if (50000 < request.getNum()) {
      System.out.println("**This request " + request.getNum()
          + " will be handled by " + this.name + " **");
    } else {
      successor.ProcessRequest(request);
    }
  }

}
