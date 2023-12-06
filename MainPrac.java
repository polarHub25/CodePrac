public class MainPrac {

    public static void main(String[] args) {

        MoveZeroes sol = new MoveZeroes();

        int[] nums = {0,1,0,3,12};

        //sol.moveZeroes(nums);


        SortArrayByParity sol2 = new SortArrayByParity();
        /**
         * Input: nums = [3,1,2,4]
           Output: [2,4,3,1]
         */
        int[] nums2 = {3,1,2,4};

        sol2.sortArrayByParity(nums2);
        

        RemoveElement sol3 = new RemoveElement();
        int[] nums3 = {3,2,2,3};
        int val = 3; 
        int result = sol3.removeElement(nums3, val);

    }
}
