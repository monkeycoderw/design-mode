package com.nick.design.mode.demo.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 17:13
 * @description:
 */
@Slf4j
public class TriangleShape implements Shape {

  public TriangleShape () {
    log.info("TriangleShape Create");
  }

  @Override
  public void draw () {
    log.info("TriangleShape Draw");
  }

}
