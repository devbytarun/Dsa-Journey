package OOP_Basics;

class Phone {

    String brand;
    int price;

    Phone(String brand, int price) {

        this.brand = brand;
        this.price = price;
    }

    void showDetails() {

        System.out.println(brand);
        System.out.println(price);
    }
}

public class ThisKeyword {

    public static void main(String[] args) {

        Phone p1 = new Phone("Samsung", 50000);

        p1.showDetails();
    }
}