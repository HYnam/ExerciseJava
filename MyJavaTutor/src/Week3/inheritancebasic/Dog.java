package Week3.inheritancebasic;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public String communication() {
        return "Woof";
    }
}
