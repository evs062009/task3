package stepCalculators;

public class StepCalculator implements IStepCalculator {

    @Override
    public int calculateStep(double playerStartHitChance, double enemyStartHitChance, int playerTurn,
                             int distanceInSteps) {
        double playerHitChanceIncrInRound = (1 - playerStartHitChance) / 10;
        double enemyHitChanceIncrInRound = (1 - enemyStartHitChance) / 10;
        double playerHitChanceI;
        double enemyMissChanceI;
        double roundsDone;
        int step;

        if (playerTurn == 1) {
            roundsDone = 0;
        } else {
            roundsDone = 0.5;
        }

        for (step = 0; step < distanceInSteps / 2; step++) {
            playerHitChanceI = playerStartHitChance + playerHitChanceIncrInRound * (step + roundsDone);
            enemyMissChanceI = 1 - (enemyStartHitChance + enemyHitChanceIncrInRound * (step + roundsDone + 0.5));
            if (playerHitChanceI > enemyMissChanceI) {
                break;
            }
        }
        return step + 1;
    }
}
