package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class fibunacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int fibFirst = 1;
        int fibSecond = 1;
        int fibCurrent = 0;

        for (int i = 1; i <= n; i++) {
            fibCurrent = fibFirst + fibSecond;
            fibFirst = fibSecond;
            fibSecond = fibCurrent;
            System.out.print(fibCurrent + " ");
        }
    }
}

