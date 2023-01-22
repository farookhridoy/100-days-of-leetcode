package Searching;
import java.util.Arrays; 

public class LinearSearch {
    /**
     * @param args
     */
    public static void main(String args[]) {
        //Declare array
        int[] arr = new int[8];
        int length = 0;
        // Iterate throw the 8 index of array
        for (int i = 0; i < 8; i++) {
            arr[length++] = i;
        }
        System.out.println("Array Is -"+Arrays.toString(arr));

        System.out.println("Does the array cotain the element 4?-"+ LinearSearch.search(arr, length, 0));
    }

    /**
     * @param array
     * @param length
     * @param element
     * @param í 
     * @return
     */
    public static boolean search(int[] array, int length, int element) {
        //Check for edge case
        if (array == null || length==0) {
            return false;
        }
        //Check each element starting from the one
        for (int i = 0; i < length; i++) {
            if (array[i]==element) {
                return true;
            }
        }
        return false;
    }
}
