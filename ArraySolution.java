public class ArraySolution {

     //Max Consecutive Ones
    public int findMaxConsecutiveOnes(int[] nums) {
       
        int consecutive = 0; 
        int maxConsecutive = 0;

        for(int i = 0; i< nums.length; i++){
            
            if(nums[i]==1){
                consecutive++;
            }else{
                maxConsecutive = Math.max(consecutive, maxConsecutive);
                consecutive = 0;
            }

        }
        return Math.max(consecutive, maxConsecutive);
    }
}
