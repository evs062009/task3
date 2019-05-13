import inputParameters.IInputParameters;
import inputParameters.InputParameters;
import presetParameters.IPresetParameters;
import presetParameters.PresetParameters;
import resultOutput.IResultOutput;
import resultOutput.ResultOutput;
import stepCalculators.IStepCalculator;
import stepCalculators.StepCalculator;

public class Main {
    public static void main(String[] args) {
        IStepCalculator calculator = new StepCalculator();
        IPresetParameters setParameters = new PresetParameters();
        IInputParameters inputParameters = new InputParameters();
        IResultOutput resultOutput = new ResultOutput();
        App app = new App(calculator, setParameters, inputParameters, resultOutput);

        app.execute();
    }
}
