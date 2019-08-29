package com.nick.design.mode.demo.factory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:34
 * @description:
 */
public class GifReader implements Reader {

  @Override
  public void read () {
    System.out.println("Gif read");
  }

}
