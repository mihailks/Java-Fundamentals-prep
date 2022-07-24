package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class P01CrossingSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tribonacciFirst = Integer.parseInt(scanner.nextLine());
        int tribonacciSecond = Integer.parseInt(scanner.nextLine());
        int tribonacciThird = Integer.parseInt(scanner.nextLine());

        int spiralCurrent = Integer.parseInt(scanner.nextLine());
        int spiralStep = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> tribonacciNumbers = new ArrayList<Integer>();
        tribonacciNumbers.add(tribonacciFirst);
        tribonacciNumbers.add(tribonacciSecond);
        tribonacciNumbers.add(tribonacciThird);

        int tribonacciCurrent = tribonacciThird;

        while (tribonacciCurrent < 10000) {
            tribonacciCurrent = tribonacciFirst + tribonacciSecond + tribonacciThird;

            tribonacciNumbers.add(tribonacciCurrent);

            tribonacciFirst = tribonacciSecond;
            tribonacciSecond = tribonacciThird;
            tribonacciThird = tribonacciCurrent;
        }
        ArrayList<Integer> spiralNumbers = new ArrayList<Integer>();
        int spiralCount = 0;
        int spiralStepMul = 1;
        spiralNumbers.add(spiralCurrent);
        while (spiralCurrent < 10000) {
            spiralCurrent += spiralStep * spiralStepMul;
            spiralNumbers.add(spiralCurrent);
            spiralCount++;
            if (spiralCount % 2 == 0) {
                spiralStepMul++;
            }
        }

        boolean found = false;
        for (int i = 0; i < tribonacciNumbers.size(); i++) {
            for (int j = 0; j < spiralNumbers.size(); j++) {
                if (tribonacciNumbers.get(i).equals(spiralNumbers.get(j)) && tribonacciNumbers.get(i) <= 10000) {
                    System.out.println(tribonacciNumbers.get(i));
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("No");
        }
    }
}
