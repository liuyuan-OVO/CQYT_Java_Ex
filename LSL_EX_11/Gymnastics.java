package LSL_EX_11;

public class Gymnastics implements ComputerAverage{

    @Override
    public double average(double[] scores) {
        double sum = 0;
        double min = scores[0];
        double max = scores[0];
        for (double score : scores) {
            sum += score;
            if (score < min) {
                min = score;
            }
            if (score > max) {
                max = score;
            }
        }
        double average = (sum - min - max) / (scores.length - 2);
        return average;
    }
}
