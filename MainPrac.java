public class MainPrac {

    public static void main(String[] args) {

        //public int removeElement(int[] nums, int val) {
        /*
         * Input: nums = [3,2,2,3], val = 3
            Output: 2, nums = [2,2,_,_]
            Explanation: Your function should return k = 2, with the first two elements of nums being 2.
            It does not matter what you leave beyond the returned k (hence they are underscores).
         */
        // int[] nums = {3,2,2,3};
        // int val = 3;

        // RemovedArray sol = new RemovedArray();
        
        // //int solution = sol.removeElement(nums , val);
        // //System.out.println("solution:::"+ solution);


        // int[] nums2 = {1,1,2};
        // RemoveDuplicateSortArray sol2 = new RemoveDuplicateSortArray();

        // int solution2 = sol2.removeDuplicates(nums2);
        // System.out.println(solution2);

        int[] arr = {10,2,5,3};

        CheckIfDoubleExits sol = new CheckIfDoubleExits();
    
        boolean result = sol.checkIfExist(arr);

        System.out.println(result);

    }
}
