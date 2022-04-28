package pl.sda.generics;

import java.util.Arrays;

public class DynamicArray<T> {

    private T[] array = (T[]) new Object[2];

    private int index = 0;

    public void add(T type) {
        ensureCapacity();
        array[index++] = type;
    }

    private void ensureCapacity() {
        if (index == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
            System.out.println("New array size: " + array.length);
        }
    }

    public void print() {
        for (int i = 0; i<index; i++) {
            System.out.println(array[i]);
        }
    }

}
