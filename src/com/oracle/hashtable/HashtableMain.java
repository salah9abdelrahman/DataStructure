package com.oracle.hashtable;

import com.oracle.Employee;

public class HashtableMain {
    public static void main(String[] args) {
        Employee salah = new Employee("Salah", "Abdelrahman", 4);
        Employee hussein = new Employee("Hussein", "Abdo", 1);
        Employee lobna = new Employee("Lobna", "Abdelrahman", 3);
        Employee nour = new Employee("Nour", "Rahim", 2);
        Employee oudi = new Employee("Oudi", "Amr", 5);

        SimpleHashtable simpleHashtable = new SimpleHashtable();
        simpleHashtable.put(salah.getLastName(), salah);
        simpleHashtable.put(hussein.getLastName(), hussein);
        simpleHashtable.put(lobna.getLastName(), lobna);
        simpleHashtable.put(nour.getLastName(), nour);
        simpleHashtable.put(oudi.getLastName(), oudi);
        simpleHashtable.printHashtable();
        System.out.println(simpleHashtable.get(oudi.getLastName()));
        System.out.println(simpleHashtable.get(hussein.getLastName()));

    }
}
