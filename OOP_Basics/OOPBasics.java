package OOP_Basics;

class Phone {

    String brand = "Samsung";
    int price = 50000;

    void call() {
        System.out.println("Calling...");
    }
}

public class OOPBasics {

    public static void main(String[] args) {

        Phone p1 = new Phone();

        System.out.println(p1.brand);

        System.out.println(p1.price);

        p1.call();
    }
}