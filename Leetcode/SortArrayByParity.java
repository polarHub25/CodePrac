public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        
        if(nums.length<2){return nums;} //edge case

    //1. inplace operation 퀵정렬
    int index = 0;

    for (int i = 0; i < nums.length ; i++) {
        if(nums[i]%2 == 0){
            //swap
            System.out.println("index::" + index);
            int temp = nums[index];
            nums[index++] = nums[i];
            System.out.println("index++::" + index);
            nums[i] = temp;
        }
        System.out.println("i :: "+nums[i]);
    }
        return nums;
        
    }
    
}
