package LSL_EX_5;

public class Zoo {
    public static void main(String[] args) {
        Animal cat = new Animal(5, "cat");
        Animal dog = new Animal(10, "dog");

        cat.show();
        dog.show();

        cat.setName("小花");
        dog.setName("小黑");

        cat.setWeight(10);
        dog.setWeight(20);

        cat.show();
        dog.show();
    }
}
