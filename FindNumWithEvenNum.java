public class FindNumWithEvenNum{
    public int findNumbers(int[] nums) {
        
        int checkNum = 0;

        //{12,345,2,6,7896};
        //555,901,482,1771
        //[12,345,2,6,7896] time limited 이게 효율이 구린가
        // 이렇게 해줬을때 위에 경우에서 시간 제한이 걸렸다. 왜지 
        for(int i = 0; i < nums.length; i++){
            
            int num = 0;

            while(nums[i] < 10){
                nums[i] = nums[i] / 10;
                num++;
            }

            if(num/2 == 0){
                checkNum++;
            }

        }

        return checkNum;
    }

    public int findNumbersLimitSolution(int[] nums) {
        
        int checkNum = 0;

        //{12,345,2,6,7896};
        //555,901,482,1771
        //[12,345,2,6,7896] time limited 이게 효율이 구린가
        // 이렇게 해줬을때 위에 경우에서 시간 제한이 걸렸다. 왜지 
        for(int i = 0; i < nums.length; i++){
            
            String str = Integer.toString(nums[i]); 
            // toString을 해주면 null 들어왔을때 nullpointerException 발생함 그래서 valueof 사용해야함
            int len = str.length();
            if(len%2==0){
                checkNum++;
            }

        }

        return checkNum;
    }
}