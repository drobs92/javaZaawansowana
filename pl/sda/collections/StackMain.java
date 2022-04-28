package pl.sda.collections;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(143);
        stack.push(212);
        stack.push(54);

        System.out.println(stack.peek()); //zwraca wierzchołek stosu, ale go nie usuwa

        System.out.println(stack.pop()); //zwraca i usuwa wierzchołek stosu

        for (Integer i : stack) {
            System.out.print(i + " ");
        }




    }

}
