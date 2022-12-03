package Assessment2.question1;

import java.time.LocalDate;

public class Customer {
    private String name;
    private int storeVisits;
    private LocalDate arrivalTime;


    public Customer() {
    }

    public Customer(String name,int storeVisits,LocalDate arrivalTime) {
        this.name = name;
        if(storeVisits < 0){
            System.out.println("不合理的输入");
        }else{
            this.storeVisits = storeVisits;
        }

        if((storeVisits == 0) && (arrivalTime != null)){
           //并未到过宠物店，没有到店时间
            this.arrivalTime = null;
        }else{
            this.arrivalTime = arrivalTime;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoreVisits() {
        return storeVisits;
    }

    public void setStoreVisits(int storeVisits) {

        if(storeVisits < 0){
            System.out.println("不合理的输入");
        }else{
            this.storeVisits = storeVisits;
        }

    }

    public void setArrivalTime(LocalDate arrivalTime) {
        if ((storeVisits == 0) && (arrivalTime != null)) {
            //并未到过宠物店，没有到店时间
            this.arrivalTime = null;
        } else {
            this.arrivalTime = arrivalTime;
        }
    }

    public LocalDate getArrivalTime() {
        return arrivalTime;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", storeVisits=" + storeVisits +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
