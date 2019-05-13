package presetParameters;

public class PresetParameters implements IPresetParameters {

    @Override
    public int getDistanceInSteps() {
        return 20;
    }

    @Override
    public double getMinStartHitChance() {
        return 0.1;
    }

    @Override
    public double getMaxStartHitChance() {
        return 0.3;
    }
}
