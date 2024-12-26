public class LeetCode_08 {
    
    //https://leetcode.com/problems/string-to-integer-atoi/description/?envType=problem-list-v2&envId=ar244hmv

    /*
     * 시간복잡도 : O(n)
     * 공간복잡도 : O(1)
     */

    public static void main(String[] args){

        LeetCode_08 sol = new LeetCode_08();

        System.out.println(sol.myAtoi("42")); // 42
        System.out.println(sol.myAtoi("   -42")); // -42
        System.out.println(sol.myAtoi("4193 with words")); // 4193
        System.out.println(sol.myAtoi("words and 987")); // 0
        System.out.println(sol.myAtoi("-91283472332")); // -2147483648 (Integer.MIN_VALUE)

    }
    public int myAtoi(String s) {

        s = s.trim();
        if(s.isEmpty()) return 0;

        int sign = 1;
        int index = 0;
        if(s.charAt(0) == '+' || s.charAt(0) == '-') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            index++;
        }

        long result = 0;
        while ( index < s.length() && Character.isDigit(s.charAt(index))){
            System.out.println("before : " + result);
            result = result * 10 + (s.charAt(index) - '0');
            System.out.println("after : " + result);
        if(result > Integer.MAX_VALUE){
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
            index++;
        }

        return (int)(sign * result);
    }
}
