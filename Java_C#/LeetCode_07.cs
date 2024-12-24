using System;

public class LeetCode_07{
    public static void Main(string[] args){
        LeetCode_07 sol = new LeetCode_07();

        int x = 123;
        Console.WriteLine("Reversed num: " + sol.Reverse(x));
    }
    public int Reverse(int x){
        int result = 0; 
        while(x !=0){
            int digit = x % 10;
            x /= 10;

            if(result > int.MaxValue / 10 || (result == int.MaxValue /10 && digit > 7) ){
                return 0;
            }
            if(result < int.MinValue / 10 || (result == int.MinValue / 10 && digit < -8)){
                return 0;
            }

            result = result * 10 + digit;
        }
        return result;
    }
}
