package OOP_Basics;

class Phone {

    String brand;
    int price;

    // Constructor
    Phone(String b, int p) {
        brand = b;
        price = p;
    }

    void showDetails() {
        System.out.println(brand);
        System.out.println(price);
    }
}

public class ConstructorBasics {

    public static void main(String[] args) {

        Phone p1 = new Phone("Samsung", 50000);

        Phone p2 = new Phone("iPhone", 80000);

        p1.showDetails();

        p2.showDetails();
    }
}