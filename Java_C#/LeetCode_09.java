public class LeetCode_09{
    public static void main(String[] args){

        LeetCode_09 sol = new LeetCode_09();

        System.out.println(sol.isPalindrome(12521)); 
        System.out.println(sol.isPalindrome(-121)); 
        System.out.println(sol.isPalindrome(10));
        
    }

    public boolean isPalindrome(int x) {
        
        if(x < 0 || (x % 10 == 0 && x != 0 )){
            return false;
        }

        int reverse = 0; 

        while ( x > reverse ){
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

     return x == reverse || x == reverse / 10;
     
    }
}
