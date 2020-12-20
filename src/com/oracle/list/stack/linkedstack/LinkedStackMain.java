package com.oracle.list.stack.linkedstack;

import com.oracle.Employee;
import com.oracle.list.stack.arraystack.ArrayStack;

public class LinkedStackMain {
    public static void main(String[] args) {
       LinkedStack<Employee> linkedStack = new LinkedStack<>();
        linkedStack.push(new Employee("Salah", "Abdelrahman", 4));
        linkedStack.push(new Employee("Hussein", "Abdelrahman", 1));
        linkedStack.push(new Employee("Lobna", "Abdelrahman", 3));
        linkedStack.push( new Employee("Nour", "Abdelrahman", 2));

        linkedStack.pop();
        System.out.println(linkedStack.peek());

        linkedStack.printStack();
    }
}
