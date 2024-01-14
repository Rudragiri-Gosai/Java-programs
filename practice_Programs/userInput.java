package practice_Programs;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        System.out.println("Taking Input form user :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int b = sc.nextInt();
        System.out.println("Number 1 is ::" + a);
        System.out.println("Number 2 is ::" + b);
        int sum = a + b;
        sc.close();
        System.out.println("The sum of Given NUmber is :: " + sum);
    }
}
