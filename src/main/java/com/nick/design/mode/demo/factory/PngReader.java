package com.nick.design.mode.demo.factory;

import java.net.SocketTimeoutException;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:33
 * @description:
 */
public class PngReader implements Reader {

  @Override
  public void read () {
    System.out.println("Png read");
  }

}
