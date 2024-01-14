package chapter1;

import java.util.Scanner;

public class ch1pro5 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("It will return True if Given value is integer And \n False is given value is Not Integer");
        System.out.println("Enter any number : ");
        get.close();
        System.out.println(get.hasNextInt());
    }
}
