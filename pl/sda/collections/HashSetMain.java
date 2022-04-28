package pl.sda.collections;

import java.util.HashSet;

public class HashSetMain {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(453);
        hashSet.add(13320);
        hashSet.add(1555);
        hashSet.add(76);

        hashSet.remove(1555);

        for (Integer i : hashSet) {
            System.out.print(i + " ");
        }

    }

}
