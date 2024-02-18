package com.algorithmen.tasks.day2;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Реализовать класс Stack с использованием массива/списка;
 */

public class StackCustom<E> {

    public StackCustom() {
    }

    List<E> list = new ArrayList<>();

    public E push(E item) {
        list.add(item);
        return item;
    }

    public E pop() {
        E object;
        int len = list.size();
        object = list.get(len - 1);
        list.remove(len - 1);

        return object;
    }

    public E peek() {
        int len = list.size();

        if (len == 0)
            throw new EmptyStackException();
        return list.get(len - 1);
    }

    public boolean empty() {
        return list.size() == 0;
    }
}
