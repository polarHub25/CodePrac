public class MainPrac {

    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1};
        ArraySolution sol = new ArraySolution();

        int solution = sol.findMaxConsecutiveOnes(nums);

        System.out.println(solution);
    }
}
