package chapter2;

import java.util.Scanner;

public class ch2pro2 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter any Grade out of (A,B,C,D,E) : ");
        char ch = get.next().charAt(0); // This is important for getting single character from user.
        ch += 8;
        System.out.println("Encrypt Grade  :: " + ch);
        ch -= 8;
        get.close();
        System.out.println("Decrypt Grade  :: " + ch);
    }
}
