package HW_2;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import java.io.FileWriter;


/*дополнительно. К калькулятору из предыдущего дз добавить логирование.
1 + 3 = 4
4 + 3 = 7 */


public class Dz_3 {
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
        StringBuilder strB = new StringBuilder();
        strB.append(num1).append(operation).append(num2).append("=").append(x).append("\n");
        try {
            FileWriter fw = new FileWriter("log_Dz_3.txt", true);
            fw.write(strB.toString());
            fw.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
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
        
    