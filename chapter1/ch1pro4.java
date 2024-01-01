package chapter1;
import java.util.Scanner;

public class ch1pro4 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter KM : ");
         double KM= get.nextDouble();
         double MILE=KM*0.62137;
        System.out.println("Given KM in MILE is : "+MILE);
    }
}
