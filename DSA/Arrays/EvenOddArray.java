package DSA.Arrays;

public class EvenOddArray {
     public static void main(String[] args) {
     int[] num = {2, 7, 10, 13};

   for (int i = 0; i < num.length; i++){
          if (num[i] % 2 == 0) {
               System.out.println(num + " is even");
          } else {
               System.out.println(num + " is odd");
          }
     }

     }
}
