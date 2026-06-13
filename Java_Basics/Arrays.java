package Java_Basics;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First Element: " + numbers[0]);

        numbers[1] = 100;

        System.out.println("Updated Element: " + numbers[1]);

        System.out.println("Array Length: " + numbers.length);

        System.out.println("All Elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}