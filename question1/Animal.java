package Assessment2.question1;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String sex;//F or M


    protected double sellingPrice;//售价

    protected double purchasingPrice;//进价

    public Animal() {
    }

    public Animal(String name, int age, String sex, double sellingPrice, double purchasingPrice) {
        this.name = name;
        this.age = age;
        if(sex.matches("(F|f|M|m|男|女|公|母|Female|Male)")) {
            this.sex = sex;
        }else{
            System.out.println("无法识别出性别，请重新输入");
        }
        this.sellingPrice = sellingPrice;
        this.purchasingPrice = purchasingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex.matches("(F|f|M|m|男|女|公|母|Female|Male)")) {
            this.sex = sex;
        }else{
            System.out.println("无法识别出性别，请重新输入");
        }
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(double purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    @Override
    public abstract String toString();

}
