package inputParameters;

import java.util.Scanner;

public class InputParameters implements IInputParameters {

    @Override
    public double inputHitChance(String message, double minStartHitChance, double maxStartHitChance) {
        double hitChance;

        System.out.println("____________________________________________");
        System.out.print(message);
        while (true) {
            hitChance = inputDouble();
            if (hitChance >= minStartHitChance && hitChance <= maxStartHitChance) {
                System.out.println();
                return hitChance;
            }
            System.out.println("Quantity not in range.");
        }
    }

    @Override
    public int enterTurn() {
        int turn;

        System.out.println("____________________________________________");
        System.out.print("Enter turn of player (either 1 or 2) ");
        while (true) {
            turn = inputInt();
            if (turn == 1 || turn == 2) {
                System.out.println();
                return turn;
            }
            System.out.println("Invalid neither 1 nor 2.");
        }
    }

    private double inputDouble() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
            System.out.println("Invalid input format.");
        }
    }

    private int inputInt() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Invalid input format.");
        }
    }
}
