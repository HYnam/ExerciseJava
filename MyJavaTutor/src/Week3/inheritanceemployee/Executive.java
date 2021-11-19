package Week3.inheritanceemployee;

public class Executive extends Employee {

    private double annualBonus;

    public Executive(String name, double wage, double annualBonus) {
        super(name, wage);
        this.annualBonus = annualBonus;
    }

    public double getAnnualBonus() {
        return this.annualBonus;
    }

    public double getWage() {
        double regularWage = super.getWage();
        double fortnightlyWage = getAnnualBonus() / 52;

        return regularWage + fortnightlyWage;
    }
}
