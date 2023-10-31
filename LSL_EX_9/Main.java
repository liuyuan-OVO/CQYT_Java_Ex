package LSL_EX_9;

public class Main {
    public static void main(String[] args) {
        ConstructionBank jsbank = new ConstructionBank();
        jsbank.money = 80000;
        jsbank.setLilv(0.035);
        jsbank.year = 8.168;
        double jsbankInterest = jsbank.computerInterest();
        System.out.println("JSYH lixi: $" + jsbankInterest);

        ChongqingBank cqBank = new ChongqingBank();
        cqBank.money = 80000;
        cqBank.setLilv(0.042);
        cqBank.year = 8.168;
        double cqBankInterest = cqBank.computerInterest();
        System.out.println("CQYH lixi: $" + cqBankInterest);
    }
}
