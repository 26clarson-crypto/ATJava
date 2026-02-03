/* Chloe Larson
Lesson 05 - 06 Test
 */


import java.util.Arrays;

// existing code that was given on written portion of the test
public class Swap {
   public static void main (String[] args) {
       int [] numbers = {0,1,2,3,4,5,6,7,8,9};
         swap(2, 7, numbers);
         System.out.println(Arrays.toString(numbers));

    }
   // swap method that swaps two elements in an array (2 and 7 in this case)
   public static void swap(int index1, int index2, int[] array) {
       if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
           int temp = array[index1];
           array[index1] = array[index2];
           array[index2] = temp;
       }
   }
}

