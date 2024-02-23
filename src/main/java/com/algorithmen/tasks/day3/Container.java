package com.algorithmen.tasks.day3;

import java.util.ArrayList;
import java.util.List;


public class Container {
    private List<NumberCustom> numbers = new ArrayList<>();
    private List<Operation> operations = new ArrayList<>();
    int index = 0;
    //Добавляет элемент в контейнер
    public void push(int item) {
        numbers.add(new NumberCustom(item, index));
        index++;
    }

    // Добавляет ко всем элементам контейнера значение value
    public void add(int value) {
        operations.add(new Operation("+", value, index));
        index++;
    }

    // Умножает все элементы
    public void mult(int value) {
        operations.add(new Operation("*", value, index));
        index++;
    }

    public int at(int index) {
        NumberCustom number = numbers.get(index);
        int result = number.getValue();
        for (int i = 0; i < operations.size(); i++) {
            if (operations.get(i).index > number.getIndex()) {
                if (operations.get(i).op.equals("+")) {
                    result = result + operations.get(i).value;
                } else {
                    result = result * operations.get(i).value;
                }
            }
        }
        return result;

    }


    public static void main(String[] args) {
        Container container = new Container();
        container.push(1);
        container.push(2);
        container.add(3);
        container.mult(2);
        container.push(1);
        container.mult(15);
        System.out.println(container.at(2));
    }
}
