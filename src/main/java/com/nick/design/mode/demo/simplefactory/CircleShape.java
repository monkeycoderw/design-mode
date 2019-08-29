package com.nick.design.mode.demo.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:09
 * @description:
 */
@Slf4j
public class CircleShape implements Shape {

  public CircleShape () {
    log.info("CircleShape Create");
  }

  @Override
  public void draw () {
    log.info("Circle Shape draw");
  }

}
