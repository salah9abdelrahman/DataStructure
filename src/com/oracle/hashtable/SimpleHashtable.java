package com.oracle.hashtable;

import com.oracle.Employee;

public class SimpleHashtable {
    private Employee[] hashtable;

    public SimpleHashtable() {
        this.hashtable = new Employee[10];
    }

    //o(1)
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        // not dealing with collisions
        if (hashtable[hashedKey] != null) {
            System.out.println("Sorry, there's an employee at position: " + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    //o(1)
    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    public void printHashtable() {
        System.out.println("**********");
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
        System.out.println("**********");
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
}
