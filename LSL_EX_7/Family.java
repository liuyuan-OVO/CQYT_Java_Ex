package LSL_EX_7;

public class Family {
    private TV homeTv;
    public  void setTV(TV tv){
        this.homeTv=tv;
    }
    public void changeChannel(int channel){
        homeTv.setChannel(channel);
    }
    public void seeTv(TV hairTv){
        homeTv.showProgram();
    }
}
