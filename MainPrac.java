public class MainPrac {

    public static void main(String[] args) {

        //int[] nums = {12,345,2,6,7896};
        int[] nums ={-4,-1,0,3,10};

        int[] solution = new int[nums.length];
        SquaresSortedArray sol = new SquaresSortedArray();
       
        solution = sol.sortedSquares(nums);

       System.out.println(solution[0]);

    }
}
