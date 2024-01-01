package QuizOfJava;

public class FormulaUsingPrecedenceAndAssociativity {
    public static void main(String[] args) {
//        Formula One
        int x = 4, y = 2;
        int f1 = x * y / 2;
        System.out.println(f1);
//        Formula Second
        int a = 1;
        int b = 4;
        int c = 5;
        int f2 = b * b - (4 * a * c) / (2 * a);
        System.out.println(f2);

//        Formula Third
        int v = 3;
        int u = 6;
        int f3 = v * v - u * u;
        System.out.println(f3);

//        Formula Four
        int a1 = 3;
        int b2 = 6;
        int d = 2;
        int f4 = a1 * b2 - d;
        System.out.println(f4);
    }
}
