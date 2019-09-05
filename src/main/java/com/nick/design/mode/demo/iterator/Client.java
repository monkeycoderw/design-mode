package com.nick.design.mode.demo.iterator;

public class Client {

    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        CakeHouseMenu cakeHouseMenu = new CakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        waitress.addIterator(cakeHouseMenu.getIterator());
        waitress.addIterator(dinnerMenu.getIterator());
        waitress.printMenu();
    }

}
