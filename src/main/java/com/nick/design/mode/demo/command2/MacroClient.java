package com.nick.design.mode.demo.command2;

/**
 * @author zhongwei
 * @date 2019-09-02
 * @time: 23:11
 * @description:
 */
public class MacroClient {

  public static void main(String[] args) {

    AudioPlayer audioPlayer = new AudioPlayer();
    Command playCommand = new PlayCommand(audioPlayer);
    Command rewindCommand = new RewindCommand(audioPlayer);
    Command stopCommand = new StopCommand(audioPlayer);

    MacroCommand macroCommand = new MacroAudioCommand();
    macroCommand.add(playCommand);
    macroCommand.add(rewindCommand);
    macroCommand.add(stopCommand);
    macroCommand.add(playCommand);
    macroCommand.execute();

  }

}
