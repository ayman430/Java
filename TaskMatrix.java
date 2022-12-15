public class TaskMatrix {
    public static void main(String[] args) {
        int[] arr = {3,1,9,5,-12,24};
        int[][] x = {{1,2,3}, {4,5,6},{7,8,9}};
        arrayTranspose(x);


    }


    //(4) max number in array
    static void Max(int...n){
        int maxNumber = n[0];
        for(int i:n) {
            if(maxNumber <= i)
                maxNumber=i;
        }
        System.out.println("max number is => " + maxNumber);
    }
   ////////////////////////////////////////////////////////////////////////////
   // (5) sort array
    static void sortArray(int...arr){
        int num;
        for (int i = 0; i < arr.length; i++){
            for (int x = i + 1; x < arr.length; x++) {
                if (arr[i] > arr[x]) {
                    num = arr[i];
                    arr[i] = arr[x];
                    arr[x] = num;
                }
            }
        }

        for (int c : arr)
            System.out.print(c + " ");
    }
    //////////////////////////////////////////////////
    // (6) array transpose
    static void arrayTranspose(int[][] x){
        for (int i =0 ; i< x.length; i++){
            for(int j=0; j<x[0].length; j++)
                System.out.print(x[j][i] + " ");
            System.out.println();
        }
    }

}


