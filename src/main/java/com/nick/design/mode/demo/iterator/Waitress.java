package com.nick.design.mode.demo.iterator;

import java.util.ArrayList;
import java.util.List;

public class Waitress {

    private List<Iterator> iterators = new ArrayList<>();

    public Waitress() {}

    public void addIterator(Iterator iterator) {
        iterators.add(iterator);
    }

    public void printMenu() {
        for (Iterator iterator : iterators) {
            while (iterator.hasNext()) {
                MenuItem menuItem = (MenuItem) iterator.next();
                System.out.println("name:" + menuItem.getName() +
                  ", desc:" + menuItem.getDesc() +
                  ",price:" + menuItem.getPrice() +
                  ",vegetable:" + menuItem.isVegetable());
            }
        }
    }

}
