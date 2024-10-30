package GroupStudy;

import java.util.HashMap;

public class Prepare {

    public static void main(String[] args) {
        
         Prepare pre = new Prepare();

        String s = "PAHNAPLSIIGYIR";
        int numRows = 3;
        
        String output = pre.convert(s, numRows);
        System.out.println("output :: " + output);

    }

    // ZigzagConversion
    // https://leetcode.com/problems/zigzag-conversion/
    public String convert(String s, int numRows) {
        // 시간복잡도는 O(n) -> 2중 반복문이지만, 문자열에 한번씩만 추가하는 연산을 하므로
        // 공간복잡도 O(n) => 문자열 저장을 위한 공간을 사용하므로

        if(numRows == 1 || numRows >= s.length()) return s;

        StringBuilder result = new StringBuilder();
        int cycle = 2 * (numRows - 1); // 위에서 아래로의 한번 사이클

        for(int i = 0; i< numRows; i++){
            for(int j = i; j < s.length(); j += cycle){
                result.append(s.charAt(j));
                if(i > 0 && i < numRows - 1 && ( j + cycle - 2 * i ) < s.length()){
                    result.append(s.charAt(j + cycle - 2 * i));
                }
            }
        }

        return new String(result);
    }



    //Longest Palindromic Substring
    public String longestPalindrome(String s) {
        
        if(s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){
            int odd = calculateRange(s , i , i); // 홀수
            int even = calculateRange(s , i , i +1 ); // 짝수
            int len = Math.max(odd, even);

            if( len > end - start){
                start = i - (len -1)/2;
                end = i + len /2;
            }
        }
        return s.substring(start, end + 1);
    }
    

    private int calculateRange(String s, int left, int right) {
        while( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }

    public int longestSubstring(String input){
        
        HashMap<Character, Integer> checkMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; 

        for(int end = 0; end < input.length(); end++ ){
            char currentInput = input.charAt(end);

            if(checkMap.containsKey(currentInput)){
                start = Math.max(start, checkMap.get(currentInput)+1);
            }
            checkMap.put(currentInput, end);

            maxLength = Math.max(maxLength, end-start+1);

        }
        
        return maxLength;
    }
    
}
