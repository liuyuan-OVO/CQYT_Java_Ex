package LSL_EX_12;

public class Carshop {
    public static ICar getCar(String name){
        if(name.equals("BMW")){
            return new BMW();
        }else if (name.equals("Benz")){
            return  new Benz();
        }else {
            return null;
        }
    }
}
