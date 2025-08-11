package org.example;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask what their age is
        System.out.print("Please Enter Your Age: ");
        int age = scanner.nextInt();
        //return message with age
        int totalYearsLeft = 100 - age;
        System.out.print("You Have " + totalYearsLeft + " Until You're 100!");
    }
}
