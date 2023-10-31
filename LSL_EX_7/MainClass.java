package LSL_EX_7;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        TV hairTV = new TV();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前频道：");
        int currentChannel = scanner.nextInt();
        hairTV.setChannel(currentChannel);
        System.out.print("当前频道为：");
        hairTV.showProgram();

        Family xiaoWangFamily = new Family();
        xiaoWangFamily.setTV(hairTV);
        System.out.println("请输入需要切换的频道（1-3之间）：");
        int targetChannel = scanner.nextInt();
        xiaoWangFamily.changeChannel(targetChannel);
        System.out.print("切换频道为：");
        xiaoWangFamily.seeTv(hairTV);

    }
}
