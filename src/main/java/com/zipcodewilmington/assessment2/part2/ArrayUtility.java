package com.zipcodewilmington.assessment2.part2;

import com.sun.tools.javac.util.ArrayUtils;

public class ArrayUtility {


    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] joinedArray = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);

        return joinedArray;
    }

    public Integer[] rotate(Integer[] array, int numberOfSpaces){
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[(i + (array.length - numberOfSpaces)) % array.length] = array[i];
        }
        return result;
    }

    public Integer countOccurrance(Integer[] array1, Integer[] array2, Integer valueToCount){
        int counter = 0;
        Integer[] newArray = merge(array1, array2);
        for(int i = 0; i < newArray.length; i++){
            if (valueToCount == newArray[i]){
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        int count = 1, tempCount;
        Integer common = array[0];
        Integer temp = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            temp = array[i];
            tempCount = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count) {
                common = temp;
                count = tempCount;
            }
        }
        return common;
    }
}
