package GroupStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Prepare {

    public static void main(String[] args) {
        
        Prepare pre = new Prepare();

        int[] height = {1,8,6,2,5,4,8,3,7};;
        
        int output = pre.maxArea(height);
        System.out.println("output :: " + output);

    }


    // 11. Container With Most Water
    //https://leetcode.com/problems/container-with-most-water/description/
    public int maxArea(int[] height) {
       // 시간 복잡도 : O(n) 배열을 한번 순회 
       // 공간 복잡도 : O(1) 추가적인 메모리 사용없이 상수 공간만 사용 
       
        
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;

        while(left < right ){
            int width = right - left;
            int area = Math.min(height[right], height[left]) * width;
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }

        }

        return maxArea;
    }


    // 8. String to Integer (atoi)
    // https://leetcode.com/problems/string-to-integer-atoi/
    public int myAtoi(String s) {
        // 문제의 단계 순으로 나눠서 처리하는 로직으로 구현 
        // 시간 복잡도 O(n) : 전체 문자열을 한번만 순차 탐색 
        // 공간 복잡도 O(1) : 리턴값이 int 정수현 변수로 고정된 크기이므로 상수O(1)

        int index = 0; 
        int sign = 1;
        int result = 0;
        int len = s.length();

        while(index < len && s.charAt(index) == ' '){
            index++;
        }

        if(index < len && (s.charAt(index) == '-' || s.charAt(index) == '+')){
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        while (index < len && String.valueOf(s.charAt(index)).matches("[0-9]")) {
            int digit = Integer.parseInt(String.valueOf(s.charAt(index)));

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
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
        
        ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap();

        Map<String, Integer> map2 = new HashMap<>();

        //return new String(result);
        return result.toString();
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
