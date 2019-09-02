package com.nick.design.mode.demo.command2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhongwei
 * @date 2019-09-02
 * @time: 23:08
 * @description:
 */
public class MacroAudioCommand implements MacroCommand {

  private List<Command> commandList = new ArrayList<>();

  @Override
  public void execute () {
    System.out.println("--- 自动回放保存的命令 ---");
    for (Command command : commandList) {
      command.execute();
    }
    System.out.println("--- 宏命令集回放完毕 ---");
  }

  @Override
  public void add(Command command) {
    commandList.add(command);
  }

  @Override
  public void remove(Command command) {
    commandList.remove(command);
  }
}
