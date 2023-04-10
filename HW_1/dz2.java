package HW_1;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите оператор: (+ или - или * или /) ");
        char operation = sc.next().charAt(0);
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
        int x = getNumber(operation, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operation, num2, x);
        sc.close();
    }

    public static int getNumber(char oper, int a, int b){
        int result = 0;
        switch (oper) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        
    }
        return result;
    }
}
