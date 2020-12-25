package com.oracle.hashtable;

import com.oracle.Employee;

public class HashtableMain {
    public static void main(String[] args) {
        Employee salah = new Employee("Salah", "Abdo", 4);
        Employee hussein = new Employee("Hussein", "Abdelrahman", 1);
        Employee lobna = new Employee("Lobna", "said", 3);
        Employee nour = new Employee("Nour", "Rahim", 2);
        Employee zain = new Employee("zain", "mhmd", 2);
        Employee oudi = new Employee("Oudi", "Amr", 5);

        SimpleHashtable simpleHashtable = new SimpleHashtable();
        simpleHashtable.put(salah.getLastName(), salah);
        simpleHashtable.put(hussein.getLastName(), hussein);
        simpleHashtable.put(lobna.getLastName(), lobna);
//        simpleHashtable.put(nour.getLastName(), nour);
        simpleHashtable.put(oudi.getLastName(), oudi);
        simpleHashtable.put(zain.getLastName(), zain);
        simpleHashtable.printHashtable();
        System.out.println(simpleHashtable.get(salah.getLastName()));
        System.out.println(simpleHashtable.get(lobna.getLastName()));
        System.out.println(simpleHashtable.remove(lobna.getLastName()));
        simpleHashtable.printHashtable();
        System.out.println( simpleHashtable.get(zain.getLastName()));

    }
}


