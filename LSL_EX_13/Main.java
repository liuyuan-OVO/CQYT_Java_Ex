package LSL_EX_13;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        Monkey monkey = new Monkey();
        Banana banana = new Banana();
        people.feed(monkey,banana);

        Tiger tiger   = new Tiger();
        Meat meat     = new Meat();
        people.feed(tiger,meat);

        Grass grass   = new Grass();
        people.feed(Horse.Horseeat(),grass);
    }
}
