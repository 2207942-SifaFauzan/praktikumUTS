package com.mycompany.palindrom;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tiga digit integer: ");
        int number = scanner.nextInt();
        
        int number1 = number / 100; 
        int number2 = (number / 10) % 10; 
        int number3 = number % 10; 
        
        if (number1 == number3) {
            System.out.println(number + " adalah palindrom");
        } else {
            System.out.println(number + " bukan palindrom");
        }
        
        scanner.close();
    }
}

