import inputParameters.IInputParameters;
import presetParameters.IPresetParameters;
import resultOutput.IResultOutput;
import stepCalculators.IStepCalculator;

class App {
    private IStepCalculator calculator;
    private IPresetParameters setParameters;
    private IInputParameters inputParameters;
    private IResultOutput resultOutput;

    App(IStepCalculator calculator, IPresetParameters setParameters, IInputParameters inputParameters,
        IResultOutput resultOutput) {
        this.calculator = calculator;
        this.setParameters = setParameters;
        this.inputParameters = inputParameters;
        this.resultOutput = resultOutput;
    }

    void execute() {
        String inRangeStr = (" (in range " + setParameters.getMinStartHitChance() + " - " +
                setParameters.getMaxStartHitChance() + "): ").replace('.', ',');

        double playerStartHitChance = inputParameters.inputHitChance(
                "Enter start chance of hitting for PLAYER" + inRangeStr, setParameters.getMinStartHitChance(),
                setParameters.getMaxStartHitChance());
        double enemyStartHitChance = inputParameters.inputHitChance(
                "Enter start chance of hitting for ENEMY" + inRangeStr, setParameters.getMinStartHitChance(),
                setParameters.getMaxStartHitChance());
        int playerTurn = inputParameters.enterTurn();

        int resultStep = calculator.calculateStep(playerStartHitChance, enemyStartHitChance, playerTurn,
                setParameters.getDistanceInSteps());

        resultOutput.printResult(resultStep);
    }
}
