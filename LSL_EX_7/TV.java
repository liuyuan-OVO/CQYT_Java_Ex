package LSL_EX_7;

public class TV {
    private int channel;
    public void setChannel(int channel){
        this.channel=channel;
    }
    public  void showProgram(){
        switch (channel){
            case 1:
                System.out.println("少儿频道");
                break;
            case 2:
                System.out.println("金鹰卡通");
                break;
            case 3:
                System.out.println("CCTV1");
                break;
            default :
                System.out.println("非法频道");
        }
    }
}
