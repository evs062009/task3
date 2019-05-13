package resultOutput;

public class ResultOutput implements IResultOutput{

    @Override
    public void printResult(int result) {
        System.out.println("============================================");
        System.out.println("Optimal step for player`s shooting is " + result);
        System.out.println("============================================");
    }
}
