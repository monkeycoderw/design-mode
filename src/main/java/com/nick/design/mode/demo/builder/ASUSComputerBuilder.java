package com.nick.design.mode.demo.builder;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 20:36
 * @description:
 */
public class ASUSComputerBuilder extends Builder {

  @Override
  public void buildBrand() {
    computer.setBrand("华硕电脑");
  }

  @Override
  public void buildCpu() {
    computer.setCpu("i8");
  }

  @Override
  public void buildMainBoard() {
    computer.setMainBoard("华硕主板");
  }

  @Override
  public void buildHardDisk () {
    computer.setHardDisk("256G SSD");
  }

  @Override
  public void buildDisplayCard() {
    computer.setDisplayCard("GTX 1600");
  }

  @Override
  public void buildPower() {
    computer.setPower("65W");
  }

  @Override
  public void buildMemory () {
    computer.setMemory("8G");
  }
}
