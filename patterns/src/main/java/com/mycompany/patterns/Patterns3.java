package com.mycompany.patterns;

public class Patterns3 {
    public static void main(String[] args) {
        int rows = 6;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            
            System.out.println();
        }
    }
}

