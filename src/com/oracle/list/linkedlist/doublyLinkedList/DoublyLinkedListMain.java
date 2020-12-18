package com.oracle.list.linkedlist.doublyLinkedList;

import com.oracle.Employee;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        Employee salah = new Employee("Salah", "Abdelrahman", 4);
        Employee hussein = new Employee("Hussein", "Abdelrahman", 1);
        Employee lobna = new Employee("Lobna", "Abdelrahman", 3);
        Employee nour = new Employee("Nour", "Abdelrahman", 2);
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
//
        list.addToEnd(salah);
        list.removeFromFront();
        list.addToEnd(lobna);
//        System.out.println(list.getHead());
//        System.out.println(list.getTail());
//        list.addToFront(nour);
//        list.addToEnd(lobna);
//        list.addToFront(hussein);


        list.printList();
//        System.out.println(list.getSize());
    }
}
