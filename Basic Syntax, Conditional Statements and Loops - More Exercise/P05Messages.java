package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int mainNum;
        int digits = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            mainNum = number % 10;

            while (number > 0) {
                number /= 10;
                digits++;
            }

            int offset = (mainNum - 2) * 3;
            if (mainNum == 8 || mainNum == 9) {
                offset +=1;
            }
            int letterIndex = offset + digits - 1;

            int letter = 97 + letterIndex;
            System.out.printf("%c", letter);

        }

    }
}
