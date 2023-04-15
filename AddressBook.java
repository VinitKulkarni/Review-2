package com.bridgelabz.review2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contactsList = new ArrayList<Contact>();

    void addContacts(){
        System.out.print("enter the name:");
        String name = sc.next();
        System.out.print("enter the age:");
        int age = sc.nextInt();
        System.out.print("enter the phoneNumber:");
        long phoneNumber = sc.nextLong();
        System.out.print("enter the city:");
        String city = sc.next();
        System.out.print("enter the state:");
        String state = sc.next();
        contactsList.add(new Contact(name,age,phoneNumber,city,state)); //contact object created here
        System.out.println(name + " is added");
    }

    void display(){
        if(contactsList.size() == 0){
            System.out.println("contacts are not added yet!!!");
        }
        else {
            System.out.println("-------------------");
            System.out.println("CONTACTS ARE . . .");
            for (int i = 0; i < contactsList.size(); i++) {
                System.out.println("CONTACT NAME = " + contactsList.get(i).name);
                System.out.println("AGE = " + contactsList.get(i).age);
                System.out.println("PHONE NUMBER = " + contactsList.get(i).phoneNumber);
                System.out.println("CITY NAME = " + contactsList.get(i).city);
                System.out.println("STATE NAME = " + contactsList.get(i).state);
                System.out.println();
            }
            System.out.println("-------------------");
        }
    }
}
