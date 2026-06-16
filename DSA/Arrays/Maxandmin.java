package DSA.Arrays;

public class Maxandmin {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 99, 2, 45};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {

                largest = numbers[i];
            }

            if (numbers[i] < smallest) {

                smallest = numbers[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}