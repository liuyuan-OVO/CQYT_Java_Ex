package LSL_EX_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int x = 1; x < 3; x = x+1){
            Scanner scanner = new Scanner(System.in);
            System.out.print("顾客准备看的汽车品牌：");
            String carName = scanner.nextLine();
            ICar car = Carshop.getCar(carName);
            if (car != null) {
                System.out.printf("商城展示"+carName+"汽车信息：");
                car.gerInfo();
            } else {
                System.out.println("没有这个汽车品牌。");
            }
        }
    }
}
