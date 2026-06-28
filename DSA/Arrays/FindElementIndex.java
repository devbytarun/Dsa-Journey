package DSA.Arrays;

public class FindElementIndex {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int target = 40;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {

                System.out.println("Index = " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {

            System.out.println("Element Not Found");
        }
    }
}