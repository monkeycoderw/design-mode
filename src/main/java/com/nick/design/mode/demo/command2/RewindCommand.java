package com.nick.design.mode.demo.command2;

/**
 * @author zhongwei
 * @date 2019-09-02
 * @time: 22:43
 * @description:
 */
public class RewindCommand implements Command {

  AudioPlayer audio;

  RewindCommand(AudioPlayer audio) {
    this.audio = audio;
  }

  @Override
  public void execute () {
    audio.rewind();
  }

}
