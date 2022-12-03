package Assessment2.question1;

import Assessment2.question1.Animal;

public class Cat extends Animal {
    final double sellingPrice = 200;

    public Cat() {
        super();
    }

    public Cat(String name, int age, String sex, double sellingPrice, double purchasingPrice) {
        super(name, age, sex, sellingPrice, purchasingPrice);

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", purchasingPrice=" + purchasingPrice +
                '}';
    }
}
