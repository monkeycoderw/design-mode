package com.nick.design.mode.demo.command2;

/**
 *
 * @author zhongwei
 * @date 2019-09-02
 * @time: 22:42
 * @description:
 *
 */
public class PlayCommand implements Command {

  private AudioPlayer audio;

  PlayCommand(AudioPlayer audio) {
    this.audio = audio;
  }

  @Override
  public void execute() {
    audio.player();
  }

}
