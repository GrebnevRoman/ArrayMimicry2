package data;

import java.util.Arrays;

public class Array {

    private int[] array;

    public Array() {

    }

    public int[] getArrayData() {
        return Arrays.copyOf(array, array.length);
    }


    public Array(int size) {
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 5));
        }
    }


    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "array=" + Arrays.toString(array);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
