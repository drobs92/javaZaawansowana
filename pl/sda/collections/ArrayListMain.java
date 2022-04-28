package pl.sda.collections;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        arrayList.add(0, 100);

        System.out.println(arrayList.size());
        System.out.println(arrayList.contains(5));

        System.out.println(arrayList.get(3)); //5
        //System.out.println(arrayList.get(10)); //wyjątek IndexOutOfBoundException

        arrayList.remove(Integer.valueOf(6)); //usuwamy pierwszy napotkany obiekt o wartości 6
        arrayList.remove(3); //usuwamy element o indeksie 3
        System.out.println("size after remove: " + arrayList.size());

        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }

    }

}
