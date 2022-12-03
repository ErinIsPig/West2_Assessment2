package Assessment2.question1;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop {
    private double balance;//余额
    private ArrayList<Animal> animals;//动物列表
    private ArrayList<Customer> customers;//顾客列表
    private LocalDate localDate;//开店日期
    private boolean isOpen;//是否正在营业
    private double profit = 0;//当天利润

    public MyAnimalShop() {
    }

    public MyAnimalShop(double balance, ArrayList<Animal> animals, ArrayList<Customer> customers, LocalDate localDate, boolean isOpen) {
        this.balance = balance;
        this.animals = animals;
        this.customers = customers;
        this.localDate = localDate;
        this.isOpen = isOpen;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "MyAnimalShop{" +
                "balance=" + balance +
                ", animals=" + animals +
                ", customers=" + customers +
                ", localDate=" + localDate +
                ", isOpen=" + isOpen +
                ", daily profit=" + profit +
                '}';
    }


    @Override
    public void purchaseAnimals(Animal animal) {

        if (balance - animal.getPurchasingPrice() < 0) {
            throw new InsufficientBalanceException("余额不足，无法买入该动物 余额为：" + balance + "," + animal.getName() + "的进价为：" + animal.getPurchasingPrice());
        } else {
            balance = balance - animal.getPurchasingPrice();
            animals.add(animal);
            profit = profit - animal.getPurchasingPrice();
        }
    }

    @Override
    public void treatCustomers(Customer customer, Animal animal) {
        if (!isOpen) {
            System.out.println(localDate + "不营业");
        } else {
            if (customers.contains(customer)) {
                customer.setStoreVisits(customer.getStoreVisits() + 1);
                customer.setArrivalTime(localDate);
            } else {
                customers.add(customer);
                customer.setStoreVisits(customer.getStoreVisits() + 1);
                customer.setArrivalTime(localDate);
            }

            if (animals.contains(animal)) {
                System.out.println(animal);
                balance = balance + animal.getSellingPrice();
                animals.remove(animal);
                if (customer.getArrivalTime().equals(localDate)) {
                    profit = profit + animal.getSellingPrice();
                }
            } else {
                throw new AnimalNotFoundException("该店不存在该动物：" + animal.getName());
            }
        }
    }

    @Override
    public void closeShop() {
        for (Customer customer : customers) {
            if (customer.getArrivalTime().equals(localDate)) {
                System.out.println(customer);
            }
        }
        System.out.println("daily profit : " + profit);
    }
}
