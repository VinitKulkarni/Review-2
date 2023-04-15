package com.bridgelabz.review2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBookObject = new AddressBook();


        int temp = 1;
        while(temp != 0) {
            System.out.println("1.Add_Contact  2.Display  3.Exit");
            System.out.print("Enter the option:");
            int option = sc.nextInt();

            switch (option){
                case 1:
                    addressBookObject.addContacts();
                    break;
                case 2:
                    addressBookObject.display();
                    break;
                case 3:
                    temp = 0;
                    break;
                default:
                    System.out.println("!!!choose correct option!!!");
                    break;
            }
        }
    }
}
