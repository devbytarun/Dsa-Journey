package DSA.Arrays;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 10, 10};

        int target = 10;
        int frequency = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                frequency++;
            }
        }

        System.out.println("Total Frequency = " + frequency);
    }
}