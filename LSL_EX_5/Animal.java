package LSL_EX_5;

class Animal {
    private double weight;
    private String name;

    public Animal(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setWeight(double w) {
        weight = w;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
    }
}
