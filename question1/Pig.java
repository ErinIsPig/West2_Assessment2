package Assessment2.question1;

import Assessment2.question1.Animal;

public class Pig extends Animal {
    public Pig() {
        super();
    }

    public Pig(String name, int age, String sex, double sellingPrice, double purchasingPrice) {
        super(name, age, sex, sellingPrice, purchasingPrice);
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", purchasingPrice=" + purchasingPrice +
                '}';
    }
}
