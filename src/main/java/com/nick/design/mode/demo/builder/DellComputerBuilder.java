package com.nick.design.mode.demo.builder;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 20:36
 * @description:
 */
public class DellComputerBuilder extends Builder {

  @Override
  public void buildBrand() {
    computer.setBrand("Dell电脑");
  }

  @Override
  public void buildCpu() {
    computer.setCpu("i5");
  }

  @Override
  public void buildMainBoard() {
    computer.setMainBoard("戴尔主板");
  }

  @Override
  public void buildHardDisk () {
    computer.setHardDisk("1T");
  }

  @Override
  public void buildDisplayCard() {
    computer.setDisplayCard("GTX 1600");
  }

  @Override
  public void buildPower() {
    computer.setPower("180W");
  }

  @Override
  public void buildMemory () {
    computer.setMemory("4G + 4G");
  }
}
