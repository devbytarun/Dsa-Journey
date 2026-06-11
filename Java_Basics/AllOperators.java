package Java_Basics;


public class AllOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

  
        System.out.println("\nComparison Operators");
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        
        System.out.println("\nLogical Operators");

        boolean x = true;
        boolean y = false;

        System.out.println("AND (&&): " + (x && y));
        System.out.println("OR (||): " + (x || y));
        System.out.println("NOT (!): " + (!x));

    }
}