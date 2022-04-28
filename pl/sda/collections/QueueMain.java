package pl.sda.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueMain {
    public static void main(String[] args) {
        //kolejki dwukieronkowe i priorytetowe
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();//działa na podstawie tablicy a nie węzłów
        arrayDeque.offer(1);//dodaje na koniec
        arrayDeque.offer(12);//dodaje na koniec
        arrayDeque.offer(13);//dodaje na koniec
        arrayDeque.offerFirst(11);//a to na początek
        arrayDeque.offerFirst(15);//a to na początek
        arrayDeque.offerFirst(10);//a to na początek
        System.out.println(arrayDeque.element());//zwraca elelment head ale nie usuwa, get last podaje tail

        for (Integer i : arrayDeque) {
            System.out.println(i + " ");
        }
        System.out.println("Priority queue");
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("jan");
        priorityQueue.add("maciej");
        priorityQueue.add("robert");
        priorityQueue.add("adam");
        for (String s : priorityQueue) {
            System.out.println(s + " ");
        }
        System.out.println(priorityQueue.peek());//sprawdza początek kolejki
        System.out.println(" ");
        System.out.println(priorityQueue.poll());//sprawdza początek kolejki i usuwa początek
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}

