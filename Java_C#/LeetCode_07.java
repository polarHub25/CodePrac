public class LeetCode_07 {
    
    /*
     * 시간복잡도 : O(n)
     * 공간복잡도 : O(1)
     */
    public static void main(String[] args){
        LeetCode_07 sol = new LeetCode_07();

        int x = 123;
        System.out.println("Reversed num : " + sol.reverse(x)); // Output: 321

        x = -123;
        System.out.println("Reversed minus : " + sol.reverse(x)); // Output: -321

        x = 1534236469;
        System.out.println("Reversed overflow : " + sol.reverse(x)); // Output: 0 (Overflow)
    }

    public int reverse(int x) {

        int result = 0;
        while(x != 0){
            int digit = x % 10;
            x /= 10;

            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if(result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)){
                return 0;
            }
            result = result + 10 + digit;
        }
        return result;
    }

}
