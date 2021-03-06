package sort;

public class selectionSort {

    public static void main(String[] args){
        int[] arr = generateArr();
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }

    public static void selectionSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }


        for(int i = 0; i < arr.length; i++){
            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    public static int[] generateArr(){
        int[] arr = new int[(int)(1 * Math.random() + 4)];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(50 * Math.random());
        }

        return arr;
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
       /* int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        */
       arr[i] = arr[i] ^ arr[j];
       arr[j] = arr[i] ^ arr[j];
       arr[i] = arr[i] ^ arr[j];
    }

}
