package com.oracle.list.linkedlist;

import com.oracle.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private  int size;

    // o(1)
    public void addToFront(Employee employee) {
        size++;
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
    }

    // o(1)
    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        size--;
        EmployeeNode removedItem = head;
        head = head.getNext();
        removedItem.setNext(null);
        return removedItem;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null){
            System.out.print(current);
            System.out.print(" -> ");
          current = current.getNext();
        }
        System.out.println("null");
    }

    public  int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }


}
