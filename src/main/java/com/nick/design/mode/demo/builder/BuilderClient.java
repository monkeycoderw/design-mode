package com.nick.design.mode.demo.builder;

/**
 * @author zhongwei
 * @date 2019-08-29
 * @time: 20:44
 * @description:
 */
public class BuilderClient {

  public static void main(String[] args) throws ClassNotFoundException,InstantiationException, IllegalAccessException{
    ComputerDirector director = new ComputerDirector();

    Builder dellBuilder = new DellComputerBuilder();
    Computer dell = director.construct(dellBuilder);
    System.out.println(dell.toString());

    Builder aussBuilder = new ASUSComputerBuilder();
    Computer auss = director.construct(aussBuilder);
    System.out.println(auss.toString());


    Class c = Class.forName("com.nick.design.mode.demo.builder.DellComputerBuilder");
    Builder builder = (Builder) c.newInstance();
    Computer computer = director.construct(builder);
    System.out.println(computer.toString());
  }

}
