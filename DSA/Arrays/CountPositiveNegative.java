package DSA.Arrays;

public class CountPositiveNegative {

    public static void main(String[] args) {

        int[] numbers = {-1, 2, 5, -6, 0};

        int positiveCount = 0;
        int negativeCount = 0;  
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < 0) {

                negativeCount++;

            } else if (numbers[i] > 0) {

                positiveCount++;

            } else {

                zeroCount++;
            }
        }

        System.out.println("Positive = " + positiveCount);
        System.out.println("Negative = " + negativeCount);
        System.out.println("Zero = " + zeroCount);
    }
}