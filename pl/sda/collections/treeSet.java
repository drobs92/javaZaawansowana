package pl.sda.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(24);
        treeSet.add(25);
        treeSet.add(20);
        treeSet.add(23);
        for (Integer i : treeSet) {
            System.out.println(i + " ");
        }
        System.out.println();//nowa linia dla przejrzystości poniżej mamy podzbiór
        SortedSet<Integer> tailSet = treeSet.tailSet(23);//pokazuje elementyh większe i równe 23
//jeżeli zrobie tailSet.add(10) np mniejsze niż 23 to wyskoczy błąd bo podzbiór jest od 23 w górę
        for (Integer i : tailSet) {
            System.out.println(i + " ");
        }
        System.out.println(" ");
        SortedSet<Integer> headSet = treeSet.headSet(24);//tutaj będzie do 23 pokazywać od najmniejszych
        headSet.add(2);
        for (Integer i : headSet) {
            System.out.println(i + " ");
        }
        System.out.println(" ");
        for (Integer i : treeSet) {
            System.out.println(i + " ");//dodał dwójkę do całego tree
        }
        System.out.println(" ");
        SortedSet<Integer> subSet=treeSet.subSet(1, 23);//od jakiej włącznie do jakiej wyłącznie
        for (Integer i :subSet) {
            System.out.println(i + " ");
        }
    }
}
