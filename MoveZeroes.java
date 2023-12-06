public class MoveZeroes{
   
        /**
         * Input: nums = [0,1,0,3,12]
           Output: [1,3,12,0,0]   4 3 2 
         */
        public void moveZeroes(int[] nums) {
            System.out.println("len::"+nums.length);
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] != 0) {
                    continue;
                }
                for (int j = i; j < nums.length - 1; j++) {
                    System.out.println("j안에서 len ::"+ nums.length);
                    System.out.println("i값::" + i + "    j의 값::" + j);
                    swap(nums, j, j + 1);
                }
            }
        }
        
        public void swap(int[] nums, int x, int y) {
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
        }

}