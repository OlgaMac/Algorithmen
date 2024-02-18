package com.algorithmen.tasks.day2;

/**
 * Реализовать класс Stack с использованием массива/списка;
 */

public class TaskDayTwo2 {

    public static String reverseString(String str) {
        StackCustom<Character> stack = new StackCustom<>();
        String result = "";
        for (Character character : str.toCharArray()) {
            stack.push(character);
        }
        while (!stack.empty()) {
            result = result + stack.pop();
        }
        return result;
    }
}
