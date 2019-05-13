package inputParameters;

public interface IInputParameters {

    double inputHitChance(String message, double minStartHitChance, double maxStartHitChance);

    int enterTurn();
}
