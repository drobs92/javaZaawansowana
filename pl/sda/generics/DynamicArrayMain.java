package pl.sda.generics;

public class DynamicArrayMain {

    public static void main(String[] args) {

        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.print();

    }
}
