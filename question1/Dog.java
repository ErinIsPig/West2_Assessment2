package Assessment2.question1;

import Assessment2.question1.Animal;

public class Dog extends Animal {
    protected boolean isVaccineInjected;
    final double sellingPrice = 100;

    public Dog() {
        super();
    }

    public Dog(String name, int age, String sex, double sellingPrice, double purchasingPrice, boolean isVaccineInjected) {
        super(name, age, sex, sellingPrice, purchasingPrice);
        this.isVaccineInjected = isVaccineInjected;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isVaccineInjected=" + isVaccineInjected +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", purchasingPrice=" + purchasingPrice +
                '}';
    }
}
