package Assessment2.question1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Animal d1 = new Dog("中华田园犬A",2,"f",100,50,true);
        Animal d2 = new Dog("中华田园犬B",1,"m",100,70,true);
        Animal c1 = new Cat("加菲猫A",4,"m",200,100);
        Animal c2 = new Cat("加菲猫B",3,"m",200,70);
        Animal p1 = new Pig("花猪A",4,"m",300,150);
        Animal p2 = new Pig("花猪B",2,"f",250,120);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(d1);
        animals.add(d2);
        animals.add(c1);
        animals.add(c2);
//        System.out.println(animals);
        LocalDate date = LocalDate.parse("2022-11-07");
        ArrayList<Customer> customers = new ArrayList<>();

        MyAnimalShop myAnimalShop = new MyAnimalShop(0,animals, customers,date,true);
//        myAnimalShop.purchaseAnimals(p1);
        Customer customer1 = new Customer("Erin",0,LocalDate.parse("2022-11-06"));
//        myAnimalShop.treatCustomers(customer1,p1);
//        System.out.println(customer1);
        myAnimalShop.treatCustomers(customer1,d1);
//        System.out.println(animals);
//        System.out.println(customer1);
//        myAnimalShop.closeShop();

        Customer customer2 = new Customer("Harry",2,LocalDate.parse("2022-11-06"));
//        System.out.println(customer2);
        myAnimalShop.setBalance(1000);
        myAnimalShop.purchaseAnimals(p2);
        myAnimalShop.treatCustomers(customer2,p2);
//        System.out.println(customer2);
        myAnimalShop.closeShop();





    }
}
