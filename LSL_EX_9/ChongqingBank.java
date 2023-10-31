package LSL_EX_9;

public class ChongqingBank extends Bank{

    double year;
    double daylilv=0.0002;

    public double computerInterest() {
        int integerYear = (int) year;
        super.year = integerYear;
        double parentInterest = super.computerInterest();
        double dayInterest = (year - integerYear) * daylilv * money;

        lixi = parentInterest + dayInterest;
        return lixi;
    }

}
