package Week3.inheritancebasic;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public String communication() {
        return "Meow";
    }
}
