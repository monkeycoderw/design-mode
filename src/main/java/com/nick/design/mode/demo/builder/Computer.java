package com.nick.design.mode.demo.builder;

import lombok.Data;

/**
 *
 * 产品角色
 *
 * @author zhongwei
 * @date 2019-08-29
 * @time: 20:26
 * @description:
 */
@Data
public class Computer {

  private String brand;
  private String cpu;
  private String mainBoard;
  private String hardDisk;
  private String displayCard;
  private String power;
  private String memory;

}
