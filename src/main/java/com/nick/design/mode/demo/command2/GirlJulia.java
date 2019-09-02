package com.nick.design.mode.demo.command2;

/**
 *
 * @author zhongwei
 * @date 2019-09-02
 * @time: 22:49
 * @description:
 *
 */
public class GirlJulia {

  public static void main(String[] args) {

    AudioPlayer audioPlayer = new AudioPlayer();
    Command playCommand = new PlayCommand(audioPlayer);
    Command rewindCommand = new RewindCommand(audioPlayer);
    Command stopCommand = new StopCommand(audioPlayer);

    KeyPad keyPad = new KeyPad();
    keyPad.setPlayCommand(playCommand);
    keyPad.setRewindCommand(rewindCommand);
    keyPad.setStopCommand(stopCommand);

    keyPad.play();
    keyPad.rewind();
    keyPad.stop();
    keyPad.play();

  }

}
