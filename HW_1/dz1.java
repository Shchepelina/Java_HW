package HW_1;

import java.util.Scanner;

/**
 * dz1
 */
public class dz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = sc.nextInt();
        System.out.printf("Треугольное число: %d\n", sumNumber(x)); 
        System.out.printf("Факториал числа: %d\n", getFactorial(x));         
        sc.close();
    }

    public static int sumNumber(int a) {
        return (a * (a + 1)) / 2;
    }  
    
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
           result = result * i;
        }
        return result;
    }
}
