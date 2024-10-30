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
    public String convert(String s, int numRows) {
        return "";
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
