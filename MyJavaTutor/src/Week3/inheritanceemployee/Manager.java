package Week3.inheritanceemployee;

import java.util.ArrayList;

public class Manager extends Employee {

    private ArrayList<Worker> supervises;

    public Manager(String name, double wage) {
        super(name, wage);
        this.supervises = new ArrayList<>();
    }

    public void addSupervisedEmployee(Worker employee) {
        this.supervises.add(employee);
    }

    public ArrayList<Worker> getSupervises() {
        return this.supervises;
    }
}
