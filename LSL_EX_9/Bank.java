package LSL_EX_9;

public class Bank {
    double lilv;//年利率
    int year;
    double money,lixi;

    public double computerInterest(){
        lixi = money*year*lilv;
        return lixi;
    }

    public void setLilv(double lilv){
        this.lilv=lilv;
    }

}
