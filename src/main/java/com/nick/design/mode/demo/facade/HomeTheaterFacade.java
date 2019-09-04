package com.nick.design.mode.demo.facade;

/**
 * @author zhongwei
 * @date 2019-09-04
 * @time: 08:35
 * @description:
 */
public class HomeTheaterFacade {

  private TheaterLights theaterLights;
  private DVDPlayer dvdPlayer;
  private PopCorn popCorn;
  private Projector projector;
  private Screen screen;
  private Stereo stereo;

  public HomeTheaterFacade() {
    this.theaterLights = TheaterLights.getInstance();
    this.dvdPlayer = DVDPlayer.getInstance();
    this.popCorn = PopCorn.getInstance();
    this.projector = Projector.getInstance();
    this.screen = Screen.getInstance();
    this.stereo = Stereo.getInstance();
  }

  public void ready () {
    popCorn.on();
    popCorn.pop();
    screen.down();
    projector.on();
    stereo.on();
    dvdPlayer.on();
    dvdPlayer.setDVD();
    theaterLights.bright(10);
  }

  public void end() {
    popCorn.off();
    screen.up();
    projector.focus();
    stereo.off();
    dvdPlayer.off();
    theaterLights.off();
  }

  public void play() {
    dvdPlayer.play();
  }

  public void pause() {
    dvdPlayer.pause();
  }

}
