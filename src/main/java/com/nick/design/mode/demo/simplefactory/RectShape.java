package com.nick.design.mode.demo.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:11
 * @description:
 */
@Slf4j
public class RectShape implements Shape {

  public RectShape () {
    log.info("RectShape Create");
  }

  @Override
  public void draw() {
    log.info("RectShape Draw");
  }
}
