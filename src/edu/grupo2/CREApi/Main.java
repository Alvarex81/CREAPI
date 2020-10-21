package edu.grupo2.CREApi;

import edu.grupo2.CREApi.pattern.*;

public class Main {

    public static void main(String[] args) {

        Aggregate facebook = new Facebook();
        printUsers(facebook.createIterator());
        printUsers(facebook.createInverseIterator());

        Aggregate google = new Google();
        printUsers(google.createIterator());
        printUsers(google.createInverseIterator());

        Aggregate cre = new CRE();
        printUsers(cre.createIterator());
        printUsers(cre.createInverseIterator());

    }

    public static void printUsers(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
        }
    }
}
