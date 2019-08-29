package com.nick.design.mode.demo.builder;

/**
 *
 * 抽象建造者
 *
 * @author zhongwei
 * @date 2019-08-29
 * @time: 20:29
 * @description:
 */
public abstract class Builder {

  protected Computer computer = new Computer();

  public abstract void buildBrand();
  public abstract void buildCpu();
  public abstract void buildMainBoard();
  public abstract void buildHardDisk();
  public abstract void buildDisplayCard();
  public abstract void buildPower();
  public abstract void buildMemory();

  public Computer createComputer() {
    return computer;
  }

}
