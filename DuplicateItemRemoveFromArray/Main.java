class Main{
    /**
     * @param arr
     * @param arrLength
     * @return
     * Function for remove duplicate item
     * Pass the array and array length
     */
    static int removeDuplicateItem(int arr[], int arrLength){
        //Return, if array is empty or contains only one 
        if(arrLength < 0 || arrLength <=1){
            return arrLength;
        }

        int[] temp = new int[arrLength];
        //Start traversing elements
        int j =0;
        for (int i = 0; i < arrLength-1; i++) {
            // If current element is not equal
            // to next element then store that
            // current element

            if (arr[i] !=arr[i+1]) {
                temp[j++]=arr[i];
            }
        }
        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[arrLength-1];
        // Modify original array
        for (int i = 0; i < j; i++) {
            arr[i]=temp[i];
        }
        return j;
    }

    /**
     * @param args
     * @param i
     */
    public static void main(String[] args){
        int arr[] ={1,2,2,3,3,4,5,4,66,66};
        int arrLength = arr.length;

        arrLength = removeDuplicateItem(arr, arrLength);

        System.out.print("Aaray length="+arrLength+"\n");

        for (int i=0; i< arrLength; i++){
            System.out.print(arr[i]+",");
        }
           
    }
}