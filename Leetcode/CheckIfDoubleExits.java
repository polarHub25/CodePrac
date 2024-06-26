public class CheckIfDoubleExits {
    public boolean checkIfExist(int[] arr) {
        
        //10,2,5,3 : true
        //3,1,7,11 : falase 
        //On each step of the loop check if we have seen the element 2 * arr[i] so far or arr[i] / 2 was seen if arr[i] % 2 == 0.
        boolean result = false;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]==2*arr[j] || arr[j] == 2*arr[i]){
                    return result = true;
                }
            }
        }

        return result;
    }
}
