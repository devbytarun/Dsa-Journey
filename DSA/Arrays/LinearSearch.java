package DSA.Arrays;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        int target = 50;

        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];

            if (current == target) {

                System.out.println("Element Found");

                isFound = true;

                break;
            }
        }

        if (isFound) {

            System.out.println("Search Successful");

        } else {

            System.out.println("Element Not Found");
        }
    }
}