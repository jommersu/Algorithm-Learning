public class testofreview {

    public static void main(String[] args){
        int[] arr = generate();
        printArr(arr);
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertSort(arr);
        printArr(arr);
    }

    /**************BubbleSort Algorithm************/
/*    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        for(int end = arr.length - 1; end > 0; end--){
            for(int i = 0; i < end; i++){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i , i + 1);
                }
            }
        }
    }
*/

/****************SelectionSort Algorithm*********/

/*
    public static void selectionSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        for(int i = 0; i < arr.length; i++){

            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i , minIndex);
        }
    }
*/

/****************insertSort Algorithm**************/
/*
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            for(int j = i; j > 0 && arr[j] < arr[j - 1]; j--){
                swap(arr, j , j - 1);
            }
        }
    }
*/
    public static void swap(int[] arr, int i ,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int[] generate(){
        int[] arr = new int[(int) (5 * Math.random() + 5)];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (100 * Math.random());
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
