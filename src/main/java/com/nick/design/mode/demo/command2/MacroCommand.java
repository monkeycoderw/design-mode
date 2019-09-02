package com.nick.design.mode.demo.command2;

/**
 * @author zhongwei
 * @date 2019-09-02
 * @time: 23:07
 * @description:
 */
public interface MacroCommand extends Command {

  public void add(Command command);

  public void remove(Command command);

}
