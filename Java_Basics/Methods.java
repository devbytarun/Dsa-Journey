package Java_Basics;

public class Methods {

    // Simple method
    static void greet() {
        System.out.println("Hello Tarun");
    }

    // Method with parameter
    static void printName(String name) {
        System.out.println("Name: " + name);
    }

    // Method with return
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        greet();

        printName("Tarun");

        int sum = add(10, 5);
        System.out.println("Sum: " + sum);
    }
}