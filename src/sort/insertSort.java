package sort;

public class insertSort {
    public static void main(String[] args){
        int[] arr = generateArr();
        printArr(arr);
        InsertSort(arr);
        printArr(arr);
    }

    public static void InsertSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static int[] generateArr(){
        int[] arr = new int[(int) (9 * Math.random() + 5)];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(50 * Math.random());
        }

        return arr;
    }

    public static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
