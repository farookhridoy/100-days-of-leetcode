package Searching;

import java.util.Arrays;

public class ValidMountainInArray {
    /**
     * @param array
     * @return
     */
    public static boolean VMInArray(int[] A){

        int N = A.length;
        int i = 0;
        // walk up
        while (i+1 < N && A[i] < A[i+1]){
            i++;
        }
        // peak can't be first or last
        if (i == 0 || i == N-1){
            return false;
        }
        // walk down
        while (i+1 < N && A[i] > A[i+1]){
            i++;
        }
        return i == N-1;

    }

    /**
     * @param args
     */
    public static void main(String args[]) {
        int[] array = {10,2,5,3,1,18,5};

        System.out.println("Array Is -"+Arrays.toString(array) +"\n");
        System.out.println("Valid Mountain Array -"+ VMInArray(array));
    }

}
