package com.algorithmen.tasks.day3;

public class Operation {
    String op;
    int value;
    int index;

    public Operation() {
    }

    public Operation(String op, int value, int index) {
        this.op = op;
        this.value = value;
        this.index = index;
    }


    public String getOp() {
        return op;
    }

    public int getValue() {
        return value;
    }
}
