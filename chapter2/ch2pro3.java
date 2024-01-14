package chapter2;

import java.util.Scanner;

public class ch2pro3 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("It will Return true if Given Value is Greater than defalut value otherwise false.");
        System.out.println("Enter any number : ");
        int num = get.nextInt();
        get.close();
        System.out.println(num > 10);
    }
}
