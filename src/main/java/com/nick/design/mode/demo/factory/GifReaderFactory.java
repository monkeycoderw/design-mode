package com.nick.design.mode.demo.factory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:38
 * @description:
 */
public class GifReaderFactory implements ReaderFactory {

  @Override
  public Reader getReader () {
    return new GifReader();
  }

}
