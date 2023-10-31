package LSL_EX_10;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Shop shop = new Shop();
        String[] types = { "台式机", "笔记本", "商务笔记本", "游戏本" };
        shop.setTypes(types);
        shop.showComputer();

        // 用户输入电脑类型
        System.out.println("which type you choose:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        shop.chooseComputer(userInput);
    }
}
