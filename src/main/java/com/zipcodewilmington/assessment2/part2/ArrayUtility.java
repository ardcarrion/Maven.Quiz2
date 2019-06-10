package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] result = new Integer[array1.length + array2.length];
        for (int i= 0; i < array1.length; i++) result[i] = array1[i];
        for (int j = 0; j < array2.length; j++) result[j+array1.length] = array2[j];
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        LinkedList<Integer> rotate = new LinkedList<>(Arrays.asList(array));
        Integer rotations = 0;
        while (rotations < index) {
            rotate.addLast(rotate.removeFirst());
            rotations++;
        }
        Integer[] rotated = new Integer[array.length];
        return rotate.toArray(rotated);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] total = (array2.length > 0) ? merge(array1, array2) : array1;
        Integer occurrences = 0;
        for (int i = 0; i < total.length; i++) {
            if (total[i].equals(valueToEvaluate)) occurrences++;
        }
        return occurrences;
    }

    public Integer mostCommon(Integer[] array) {
        if (array.length < 1) return null;
        Integer[] empty = new Integer[0];
        Integer maxValue = array[0];
        Integer maxCount = countOccurrence(array, empty, maxValue);
        for (Integer i : array) {
            Integer occurrences = countOccurrence(array, empty, i);
            if (occurrences >= maxCount) {
                maxValue = i;
                maxCount = occurrences;
            }
        }
        return maxValue;
    }
}
