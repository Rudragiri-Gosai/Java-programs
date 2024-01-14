package chapter1;

import java.util.Scanner;

public class ch1pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Subject : ");
        int n = sc.nextInt();
        double[] marks = new double[n];
        double cgpa, sum = 0;

        System.out.println("Enter the marks of three subjects (out of 100):");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Marks of " + (i + 1) + " Subject : ");
            marks[i] = sc.nextDouble();
            sum += marks[i] / 10;
        }

        cgpa = sum / n;
        sc.close();

        System.out.printf("CGPA: %.2f\n", cgpa);
    }
}
