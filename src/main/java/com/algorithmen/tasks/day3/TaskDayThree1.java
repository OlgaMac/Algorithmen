package com.algorithmen.tasks.day3;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив высот зданий. Требуется вычислить количество зданий, из
 * которых виден закат
 */
public class TaskDayThree1 {
    static List<Integer> findBuildings(List<Integer> array, Integer newBuild) {

        List<Integer> result = new ArrayList<>();
        result.add(array.get(array.size() - 1));
        for (int a = array.size() - 2; a > 0; a--) {
            Integer value = array.get(a);
            Integer resultValue = result.get(0);
            if (value > resultValue) {
                result.add(value);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            if (newBuild > result.get(i)) {
                result.remove(i);
                i = i - 1;
            }
        }
        result.add(newBuild);
        return result;
    }
}
