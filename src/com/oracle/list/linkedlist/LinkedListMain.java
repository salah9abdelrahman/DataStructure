package com.oracle.list.linkedlist;

import com.oracle.Employee;

public class LinkedListMain {
    public static void main(String[] args) {
        Employee salah = new Employee("Salah", "Abdelrahman", 4);
        Employee hussein = new Employee("Hussein", "Abdelrahman", 1);
        Employee lobna = new Employee("Lobna", "Abdelrahman", 3);
        Employee nour = new Employee("Nour", "Abdelrahman", 2);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());

        list.addToFront(salah);
        list.addToFront(hussein);
        list.addToFront(lobna);
        list.addToFront(nour);
        System.out.println(list.isEmpty());

        System.out.println(list.removeFromFront());
        System.out.println(list.getSize());

        list.printList();


    }
}
