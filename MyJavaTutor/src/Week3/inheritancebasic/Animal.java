package Week3.inheritancebasic;

public abstract class Animal {
    String animal_name;
    int animal_age;

    public Animal(String name, int age) {
        this.animal_name = name;
        this.animal_age = age;
    }

    public String getName() {
        return this.animal_name;
    }

    public int getAge() {
        return this.animal_age;
    }

    public abstract String communication();
}
