package QuizOfJava;
import java.util.Scanner;

public class CBSECalculater {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int subject=5;
        float sum=0;
        float[] marks = new float[subject];
        System.out.println("Enter any 5 Subject marks :: ");
        System.out.println("Enter SUbject marks out of 100 :: ");
        for (int i = 0; i < subject; i++) {
            System.out.print("Enter "+(i+1)+" subject marks :: ");
            marks[i]= get.nextInt();
            sum+=marks[i];
        }
        float avg = sum/5;
        System.out.println("Your total Score of marks 500 is :: "+sum);
        System.out.println("Your Percentage is  :: "+ avg);
    }
}
