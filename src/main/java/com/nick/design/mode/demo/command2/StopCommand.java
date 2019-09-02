package com.nick.design.mode.demo.command2;

/**
 *
 * @author zhongwei
 * @date 2019-09-02
 * @time: 22:45
 * @description:
 *
 */
public class StopCommand implements Command {

  AudioPlayer audio;

  StopCommand(AudioPlayer audio) {
    this.audio = audio;
  }

  @Override
  public void execute () {
    audio.stop();
  }
}
