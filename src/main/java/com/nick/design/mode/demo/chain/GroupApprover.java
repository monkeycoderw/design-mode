package com.nick.design.mode.demo.chain;

/**
 *
 * 责任链模式，组长的责任，不在权限范围内就往下传
 *
 * @author zhongwei
 * @date 2019-08-30
 * @time: 15:42
 * @description:
 */
public class GroupApprover extends Approver {

  public GroupApprover(String name) {
    super(name + " GroupLeader");
  }

  @Override
  public void ProcessRequest(PurchaseRequest request) {
    if (request.getNum() < 5000) {
      System.out.println("**This request " + request.getNum()
          + " will be handled by " + this.name + " **");
    } else {
      successor.ProcessRequest(request);
    }
  }
}
