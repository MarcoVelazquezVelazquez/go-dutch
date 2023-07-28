package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here

        Scanner input = new Scanner(System.in);

        int bill = input.nextInt();

        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
            return;
        }

        int billTotalAmount = (int) (bill + (bill * .10));

        int numberOfFriends = input.nextInt();

        if (numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }

        int partToPay = billTotalAmount / numberOfFriends;

        System.out.println(partToPay);
    }
}
