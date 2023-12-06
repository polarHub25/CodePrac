public class ReplaceRightSort {
    public int[] replaceElements(int[] arr) {

        //int[] arr = {17,18,5,4,6,1};
        int n =arr.length;
        System.out.println("len::"+n);
        int max = arr[n-1]; //제일 끝값
        System.out.println("max 초기값::"+max);
        arr[n-1] = -1;
        for(int i=n-2; i>=0; i--){
            System.out.println("i값:"+i);
            int temp = arr[i];
            System.out.println("temp::"+temp);
            arr[i]=max;
            if(max<temp)
                max= temp;
        }


        for(int j=0; j< arr.length; j++){
        System.out.println(arr[j]);
        }
        return arr;
    }
    
}
