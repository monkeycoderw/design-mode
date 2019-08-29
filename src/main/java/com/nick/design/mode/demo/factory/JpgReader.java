package com.nick.design.mode.demo.factory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:32
 * @description:
 */
public class JpgReader implements Reader {

  @Override
  public void read () {
    System.out.println("Jpg read");
  }

}
