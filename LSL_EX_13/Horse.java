package LSL_EX_13;

class Horse {
    public static Animal Horseeat(){
        Animal horse = new Animal() {
            public void eat(){
                System.out.println("Horse eat grass");
            }
        };
        return horse;
    }
}