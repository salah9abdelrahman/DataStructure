package com.oracle.list.linkedlist;

import com.oracle.Employee;

public class EmployeeNode {
    private Employee current;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.current = employee;
    }

    public Employee getCurrent() {
        return current;
    }

    public void setCurrent(Employee current) {
        this.current = current;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return current.toString();
    }
}
