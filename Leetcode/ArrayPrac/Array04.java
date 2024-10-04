package ArrayPrac;

public class Array04 {
    public static void main(String[] args) {
        
        Array04 array04 = new Array04();

        // int[] nums = {0,0,1,1,1,2,2,3,3,4};
        // int sol = array04.removeDuplicates(nums);

        // int[] prices = {7,1,5,3,6,4};
        // int sol2 = array04.maxProfit(prices);

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

    }
    
    public void rotate(int[] nums, int k) {
     
        /** Input: nums = [1,2,3,4,5,6,7], k = 3
            Output: [5,6,7,1,2,3,4] */
        
        int n = nums.length;
        k = k % n; 
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }

    private void reverse(int[] nums , int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }
    }

    public int maxProfit(int[] prices) {
     
        int profit = 0; 

        for(int i = 0; i< prices.length-1; i++){
            if( prices[i] < prices[i+1]) {
                profit += prices[i+1] - prices[i];
            }
        }

        return profit; 
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
