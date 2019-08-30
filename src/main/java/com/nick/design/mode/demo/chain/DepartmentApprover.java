package com.nick.design.mode.demo.chain;

/**
 *
 * 责任链模式，部门经理的责任，不在权限范围内就往下传
 *
 * @author zhongwei
 * @date 2019-08-30
 * @time: 15:48
 * @description:
 *
 */
public class DepartmentApprover extends Approver {

  public DepartmentApprover(String name) {
    super(name + " DepartmentLeader");
  }

  @Override
  public void ProcessRequest(PurchaseRequest request) {
    if (5000 < request.getNum() && request.getNum() < 10000) {
      System.out.println("**This request " + request.getNum()
          + " will be handled by " + this.name + " **");
    } else {
      successor.ProcessRequest(request);
    }
  }

}
