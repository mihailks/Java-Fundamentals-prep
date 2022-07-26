package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class P03GamingStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String gameName = scanner.nextLine();
        ;
        double priceForGames = 0;

        while (!gameName.equals("Game Time")) {
            double pricePerGame = gamePick(gameName);

            if (pricePerGame > 0) {
                if (budget < pricePerGame) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.println("Bought " + gameName);
                    budget -= pricePerGame;
                    priceForGames += pricePerGame;
                }
            }
            if (budget == 0) {
                System.out.println("Out of money!");
                break;
            }
            gameName = scanner.nextLine();
        }
        if (budget != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", priceForGames, budget);
        }
    }

    public static double gamePick(String gameName) {
        double pricePerGame = 0.0;
        switch (gameName) {
            case "OutFall 4":
            case "RoverWatch Origins Edition":
                pricePerGame = 39.99;
                break;
            case "CS: OG":
                pricePerGame = 15.99;
                break;
            case "Zplinter Zell":
                pricePerGame = 19.99;
                break;
            case "Honored 2":
                pricePerGame = 59.99;
                break;
            case "RoverWatch":
                pricePerGame = 29.99;
                break;
            default:
                System.out.println("Not Found");
                break;
        }
        return pricePerGame;
    }


}
