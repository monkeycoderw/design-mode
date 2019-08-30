package com.nick.design.mode.demo.chain;

/**
 *
 * 责任链模式，管理者抽象对象，定义自己的处理内容和设置下一个责任链对象
 *
 *
 * @author zhongwei
 * @date 2019-08-30
 * @time: 15:37
 * @description:
 *
 *
 */
public abstract class Approver {

  Approver successor;
  String name;

  public Approver(String name) {
    this.name = name;
  }

  public abstract void ProcessRequest(PurchaseRequest request);

  public void setSuccessor(Approver approver) {
    this.successor = approver;
  }

}
