package com.nick.design.mode.demo.factory;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:40
 * @description:
 */
public class FactoryClient {

  /**
   *
   * 工厂模式
   *
   * @param args
   */
  public static void main(String[] args) {
    ReaderFactory readerFactory = new GifReaderFactory();
    readerFactory.getReader().read();

    readerFactory = new PngReaderFactory();
    readerFactory.getReader().read();

    readerFactory = new JpgReaderFactory();
    readerFactory.getReader().read();

  }

}
