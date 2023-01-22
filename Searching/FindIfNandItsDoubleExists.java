package Searching;
import java.util.Arrays; 

public class FindIfNandItsDoubleExists {
    /**
     * @param array
     * @return
     */
    public static boolean checkIfExist(int[] array){
        if (array ==null || array.length <2) {
            return false;
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            int val=array[i];
            int item = Arrays.binarySearch(array, 2* val);
            if(item >=0 && item !=i){
                return true;
            }
        }
        return false;
    }
    /**
     * @param args
     * @param c TODO
     */
    public static void main(String args[]) {
        int[] array = {10,2,5,3};
        System.out.println("Array Is -"+Arrays.toString(array) +"\n");
        System.out.println("Find if N and Its Double Exists -"+ FindIfNandItsDoubleExists.checkIfExist(array));
    }
}
