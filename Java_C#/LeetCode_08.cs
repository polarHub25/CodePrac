using System;

public class LeetCode_08 {
    
    public static void Main(string[] args)
    {
        LeetCode_08 sol = new LeetCode_08();

         Console.WriteLine(sol.MyAtoi("42")); // 42
         Console.WriteLine(sol.MyAtoi("   -42")); // -42
         Console.WriteLine(sol.MyAtoi("4193 with words")); // 4193
         Console.WriteLine(sol.MyAtoi("words and 987")); // 0
         Console.WriteLine(sol.MyAtoi("-91283472332")); // -2147483648 (Int32.MinValue)
    }

      public int MyAtoi(string s)
     {
        s = s.Trim();
        if(string.IsNullOrEmpty(s)) return 0;

        int sign = 1;
        int index = 0;
        if(s[0] == '+' || s[0] == '-')
        {
            sign = (s[0] == '-') ? -1 : 1;
            index++;
        }

        long result = 0;
        while(index < s.Length && char.IsDigit(s[index]))
        {
            result = result * 10 + (s[index] - '0');

            if(result > int.MaxValue){
                return (sign == 1) ? int.MaxValue : int.MinValue;
            }
            index++;
        }

     }

}
