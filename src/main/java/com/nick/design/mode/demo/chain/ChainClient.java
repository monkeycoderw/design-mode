package com.nick.design.mode.demo.chain;

/**
 * @author zhongwei
 * @date 2019-08-30
 * @time: 15:57
 * @description:
 */
public class ChainClient {

  public static void main (String[] args) {

//    PurchaseRequest request = new PurchaseRequest();

    Client client = new Client();

    Approver groupLeader = new GroupApprover("Tom");
    Approver departmentLeader = new DepartmentApprover("Jim");
    Approver vicePresident = new VicePresidentApprover("Kate");
    Approver president = new PresidentApprover("Nick");

    groupLeader.setSuccessor(departmentLeader);
    departmentLeader.setSuccessor(vicePresident);
    vicePresident.setSuccessor(president);
    // 循环？
    president.setSuccessor(groupLeader);

    vicePresident.ProcessRequest(client.sentRequest(1, 100, 40));
    vicePresident.ProcessRequest(client.sentRequest(1, 1000, 40));
    vicePresident.ProcessRequest(client.sentRequest(1, 6000, 40));
    vicePresident.ProcessRequest(client.sentRequest(1, 11000, 40));
    vicePresident.ProcessRequest(client.sentRequest(1, 60000, 40));

  }

}
