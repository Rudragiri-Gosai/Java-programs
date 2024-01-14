package chapter2;

import java.util.Scanner;

public class ch2pro4 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter value of V and U respectivly :");
        int v = get.nextInt();
        int u = get.nextInt();
        float formula = (float) (v ^ 2 - u ^ 2) / 2;
        get.close();
        System.out.println("The after operation with ((v^2-u^2)/2) formula is ::  " + formula);
    }
}
