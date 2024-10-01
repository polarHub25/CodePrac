package ArrayPrac;

public class Array04 {
    public static void main(String[] args) {
        
        Array04 array04 = new Array04();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int sol = array04.removeDuplicates(nums);

        // Comparator<Integer> naturalOrder = (i, j) -> ( i< j) ? -1 : (i == j ? 0 :1);
        // System.out.println(naturalOrder.compare(new Integer(42), new Integer(42)));

        int[] prices = {7,1,5,3,6,4};
        int sol2 = array04.maxProfit(prices);

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
