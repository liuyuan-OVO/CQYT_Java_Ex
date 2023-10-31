package LSL_EX_11;

public class School implements ComputerAverage{

    @Override
    public double average(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / scores.length;
        return average;
    }
}
