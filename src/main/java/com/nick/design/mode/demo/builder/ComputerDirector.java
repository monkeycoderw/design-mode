package com.nick.design.mode.demo.builder;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 20:42
 * @description:
 */
public class ComputerDirector {

  public Computer construct(Builder builder) {
    builder.buildBrand();
    builder.buildCpu();
    builder.buildMainBoard();
    builder.buildHardDisk();
    builder.buildPower();
    builder.buildMemory();
    return builder.createComputer();
  }

}
