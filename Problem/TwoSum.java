package Problem;

import java.util.Arrays;

public class TwoSum {
    /**
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution(int[] nums, int target) {
       if(nums.length < 0 ){
            return null;
        }
        
        if(target >=2){
            for(int i=0; i < nums.length; i++){
                if(nums[i]+nums[i+1] == target){
                   int[] arr ={i,i+1};
                   return arr;
                }
            }
        }
        return null;
    }

    public static void main(String args[]) {
        int[] array = {2,7,11,15};
        System.out.println("Array Is -"+Arrays.toString(array) +"\n");
        System.out.println("Two Sum -"+ solution(array, 9));
    }
}
