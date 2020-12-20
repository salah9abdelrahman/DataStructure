package com.oracle.list.queue;

import com.oracle.Employee;
import com.oracle.list.stack.arraystack.ArrayStack;

public class ArrayQueueMain {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(10);
        arrayQueue.add(new Employee("Salah", "Abdelrahman", 4));
        arrayQueue.add(new Employee("Hussein", "Abdelrahman", 1));
        arrayQueue.add(new Employee("Lobna", "Abdelrahman", 3));
        arrayQueue.add( new Employee("Nour", "Abdelrahman", 2));

        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
//        System.out.println(arrayQueue.peek());

        arrayQueue.printQueue();

    }
}
