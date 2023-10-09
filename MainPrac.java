public class MainPrac {

    public static void main(String[] args) {

        //int[] nums = {12,345,2,6,7896};
        int[] nums ={555,901,482,1771};
        FindNumWithEvenNum sol = new FindNumWithEvenNum();

        int solution = sol.findNumbers(nums);

        int solution2 = sol.findNumbersLimitSolution(nums);

        System.out.println(solution);
        System.out.println(solution2);
    }
}
