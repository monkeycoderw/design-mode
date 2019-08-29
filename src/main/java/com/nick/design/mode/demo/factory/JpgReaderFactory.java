package com.nick.design.mode.demo.factory;

/**
 *
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:37
 * @description:
 *
 */
public class JpgReaderFactory implements ReaderFactory {

  @Override
  public Reader getReader() {
    return new JpgReader();
  }

}
