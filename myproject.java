package myproject;

import java.util.Scanner;

public class myproject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num = scanner.nextFloat();
        float result = (float) Math.sqrt(num);
        System.out.println("The result is:" + result);
        System.out.printf("%,5f",result);



    }
}
