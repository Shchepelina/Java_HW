package HW_1;

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 100: ");
        for(int i = 2; i <= 1000; i++) {
            int count = 0;
            for(int j = 1; j < i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 1){
                System.out.printf("%d, ", i);
            }
        }
        
    }
    
}