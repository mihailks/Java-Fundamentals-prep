package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 == 0) {
            sumEven+=myArr[i];
            } else {
                sumOdd+=myArr[i];
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
