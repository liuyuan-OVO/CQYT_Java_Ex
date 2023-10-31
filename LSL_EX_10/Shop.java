package LSL_EX_10;

public class Shop {
    private String[]types;

    void setTypes(String[]types){
        this.types=types;
    }

    void showComputer(){
         for(String type:types){
             System.out.println("Computer's type in ship:"+type);
        }
    }

    void chooseComputer(String type){
        Computer computer;

        switch (type) {
            case "台式机":
                computer = new DesktopComputer();
                break;
            case "笔记本":
                computer = new LaptopComputer();
                break;
            case "商务笔记本":
                computer = new BusinessLaptop();
                break;
            case "游戏本":
                computer = new GameLaptop();
                break;
            default:
                System.out.println("ERROR type");
                return;
        }
        System.out.print(type + "的优势是：");
        computer.advantage();
    }
}
