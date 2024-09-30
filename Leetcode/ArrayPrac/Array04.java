package ArrayPrac;

public class Array04 {
    public static void main(String[] args) {
        
        Array04 array04 = new Array04();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int sol = array04.removeDuplicates(nums);

    }
    
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0) return 0;

        int flag = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=nums[flag]){
                flag ++;
                nums[flag] = nums[i];
            }
        }

        return flag+1; 
    }


}
