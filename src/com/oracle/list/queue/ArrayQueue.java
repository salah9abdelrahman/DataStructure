package com.oracle.list.queue;

import com.oracle.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    // o(n) because if the resizing
    public void add(Employee employee) {
        // queue is full so resize
        if (back == queue.length) {
            Employee[] newArray = new Employee[queue.length * 2];
            System.arraycopy(this.queue, 0, newArray, 0, this.queue.length);
            queue = newArray;
        }
        this.queue[back++] = employee;
    }

    public Employee remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;

        //optimization
        if (isEmpty()) {
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }



    public boolean isEmpty() {
        return ((back - front) == 0);
    }

    public void printQueue(){
        for (int i = front; i < back ; i++) {
            System.out.println(queue[i]);
        }
    }

}
