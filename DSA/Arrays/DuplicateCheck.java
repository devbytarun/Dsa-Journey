package DSA.Arrays;

public class DuplicateCheck {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20};

        boolean isDuplicate = false;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {

                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                break;
            }
        }

        if (isDuplicate) {

            System.out.println("Duplicate Found");

        } else {

            System.out.println("No Duplicate Found");
        }
    }
}