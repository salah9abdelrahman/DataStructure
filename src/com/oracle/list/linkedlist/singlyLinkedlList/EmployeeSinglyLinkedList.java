package com.oracle.list.linkedlist.singlyLinkedlList;

import com.oracle.Employee;

public class EmployeeSinglyLinkedList {
    private EmployeeSinglyNode head;
    private  int size;

    // o(1)
    public void addToFront(Employee employee) {
        size++;
        EmployeeSinglyNode node = new EmployeeSinglyNode(employee);
        node.setNext(head);
        head = node;
    }

    // o(1)
    public EmployeeSinglyNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        size--;
        EmployeeSinglyNode removedItem = head;
        head = head.getNext();
        removedItem.setNext(null);
        return removedItem;
    }

    public void printList(){
        EmployeeSinglyNode current = head;
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
