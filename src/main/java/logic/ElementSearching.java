package logic;

import data.Array;

public class ElementSearching {
    public int searchMinOfArray(Array objectArray) {
        int [] array = objectArray.getArrayData();
        int max = array[0];
        for (int arrayIndex : array) {
            if (arrayIndex > max) {
                max = arrayIndex;
            }
        }
        return max;
    }

    public int searchMaxOfArray(Array objectArray) {
        int [] array = objectArray.getArrayData();
        int min = array[0];
        for (int arrayIndex : array) {
            if (arrayIndex < min) {
                min = arrayIndex;
            }
        }
        return min;
    }

}
