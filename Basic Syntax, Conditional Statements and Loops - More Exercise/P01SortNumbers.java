package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a>b && a>c){
            System.out.println(a);
        }
        if (b>a && b>c){
            System.out.println(b);
        }
        if (c>a && c>b){
            System.out.println(c);
        }
    }
}
