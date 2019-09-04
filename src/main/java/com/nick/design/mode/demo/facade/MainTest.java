package com.nick.design.mode.demo.facade;

/**
 * @author zhongwei
 * @date 2019-09-04
 * @time: 08:41
 * @description:
 */
public class MainTest {

  public static void main(String[] args) {
    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
    homeTheaterFacade.ready();
    homeTheaterFacade.play();
  }

}
