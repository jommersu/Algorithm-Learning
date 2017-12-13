public class BubbleSort {
    public static void main(String[] args){
        int arr[] = new int[(int)(11 * Math.random() + 5)];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(500 * Math.random());
        }

        printArr(arr);
        bubbleSort(arr);
        printArr(arr);

    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void bubbleSort(int[] arr){

        if(arr == null && arr.length < 2){
            return;
        }

        for(int end = arr.length - 1; end > 0; end--){
            for(int i = 0; i < end; i++){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i+1);
                }
            }
        }
    }
}
