package LSL_EX_8;

public class Main {
    public static void main(String[] args) {
        People p = new People();
        p.speakHello();
        p.averageHeight();
        p.averageWeight();
        System.out.println("-----------------------------------------");
        ChinaPeople c = new ChinaPeople();
        c.speakHello();
        c.averageHeight();
        c.averageWeight();
        c.chinaGongfu();
        System.out.println("-----------------------------------------");
        AmericanPeople a = new AmericanPeople();
        a.speakHello();
        a.averageHeight();
        a.averageWeight();
        a.americanBoxing();
        System.out.println("-----------------------------------------");
        BeijingPeople b = new BeijingPeople();
        b.speakHello();
        b.averageHeight();
        b.averageWeight();
        b.chinaGongfu();
        b.beijingOpera();
    }
}
