package com.mycompany.integerpalindrom;
import java.util.Scanner;

public class IntegerPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tiga digit integer: ");
        int number = scanner.nextInt();
        
        if (isPalindrom(number)) {
            System.out.println(number + " adalah palindrom");
        } else {
            System.out.println(number + " bukan palindrom");
        }
        
        scanner.close();
    }
    
    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
    
    public static boolean isPalindrom(int number) {
        return number == reverse(number);
    }
}

