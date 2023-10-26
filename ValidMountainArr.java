public class ValidMountainArr {
    public boolean validMountainArray(int[] arr) {
        /**
         *  Input: arr = [2,1]
            Output: false

            Input: arr = [0,3,2,1]
            Output: true
         * 
         */
        if (arr == null || arr.length < 3) { // edge case
            return false;
        }
        boolean isAsc = true;    //상승여부
        for (int i = 1; i < arr.length; i++) {
            if (isAsc) {
                if (arr[i - 1] > arr[i]) {
                    if (i == 1) { // 처음부터 하강이면 탈락
                        return false;
                    } else {
                        isAsc = false; // 하강 전환
                    }
                } else if (arr[i - 1] == arr[i]) { // 상승때 같은 경우 false
                    return false;
                }
            } else { //하강
                if (arr[i - 1] <= arr[i]) { // 하강시 뒷숫자가 크거나 같으면 false
                    return false;
                }
            }
        }
        return isAsc? false: true; //하강없이 끝나면 산이 아니니 false 아니면 true;
    }

}
