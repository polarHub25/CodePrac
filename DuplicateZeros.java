public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        // input : {1,0,2,3,0,4,5,0} output: {1,0,0,2,3,0,0,4}
        // input : {1,2,3} output : {1,2,3}
        // zero duplicate 
        for(int i = 0; i < arr.length; i++){
            // 0을 만나면 0추가하고, 나머지 배열값을 오른쪽으로 이동
            if(arr[i] == 0){
                //한칸씩 뒤로 이동
                for(int j = arr.length-1; j > i; j--){ //7 < 0 
                    arr[j] = arr[j-1];
                }

                //0추가
                i++;
            //    System.out.println("output :::" + arr[i]);
            }
            System.out.println(arr[i]);
        }
        


    }
}
