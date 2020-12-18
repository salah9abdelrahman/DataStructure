package com.oracle.list.linkedlist.doublyLinkedList;

import com.oracle.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    private int size;

    // o(1)
    public void addToFront(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        if (isEmpty()) {
            tail = node;
        } else {
            node.setNext(head);
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    // o(1)
    public void addToEnd(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        if (isEmpty()) {
            head = node;
        } else {
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    // o(1)
    public EmployeeDoublyNode removeFromFront() {
        if (isEmpty()) {
            return null;
        } else {
            EmployeeDoublyNode removedItem = head;
            // list contains one node
            if (head.getNext() == null) {
                head = null;
                tail = null;
            } else {
                head = head.getNext();
                head.setPrevious(null);
                // clean resources
                removedItem.setNext(null);
            }
            size--;
            return removedItem;
        }
    }

    public EmployeeDoublyNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        } else {
            EmployeeDoublyNode removedItem = tail;
            if (tail.getPrevious() == null) {
                tail = null;
                head = null;
            } else {
                tail = tail.getPrevious();
                tail.setNext(null);
                // clean resources
                removedItem.setPrevious(null);
            }
            size--;
            return removedItem;
        }
    }

    public void printList() {
        EmployeeDoublyNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }


}
