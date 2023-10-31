package LSL_EX_11;

public class MainClass {
    public static void main(String[] args) {
        double[] gymnasticsScores = {9.21, 8.53, 8.65, 9.50, 9.88, 8.76, 9.46, 9.78};
        Gymnastics gymnastics = new Gymnastics();
        double gymnasticsAverage = gymnastics.average(gymnasticsScores);
        System.out.printf("体操比赛得分的平均值：%.2f%n", gymnasticsAverage);



        double[] schoolScores = {80.5, 88, 98.5, 99, 78, 88, 85, 81.6, 92.5};
        School school = new School();
        double schoolAverage = school.average(schoolScores);
        System.out.printf("班级科目的平均成绩：%.2f%n", schoolAverage);
    }
}
