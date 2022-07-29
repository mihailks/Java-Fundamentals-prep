package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] first = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] second = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumFirst = 0;
        boolean isEqual = true;
        for (int i = 0; i < first.length; i++) {
            if (first[i]==second[i]){
                sumFirst+=first[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isEqual=false;
                break;
            }
        }
        if (isEqual){
            System.out.println("Arrays are identical. Sum: "  + sumFirst);
        }
    }
}
