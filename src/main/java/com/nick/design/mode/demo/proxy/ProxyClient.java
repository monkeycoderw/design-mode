package com.nick.design.mode.demo.proxy;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 15:57
 * @description:
 */
public class ProxyClient {

  public static void main (String[] args) {
    ISubject iSubject = new ProxySubject();
    iSubject.action();
  }
}
