package com.nick.design.mode.demo.factory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:39
 * @description:
 */
public class PngReaderFactory implements ReaderFactory {

  @Override
  public Reader getReader () {
    return new PngReader();
  }

}
