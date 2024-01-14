package chapter1;
import java.util.Scanner;

public class ch1pro3 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter Your name :: ");
        String str = get.nextLine();
        get.close();
        System.out.println("Hello "+str+", Have a Good day.");
    }
}
