public class MergeSort {

    public static void main(String[] args){
        int[] arr = generate();
        printArr(arr);
        mergeSort(arr);
        printArr(arr);
    }

    public static void mergeSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left == right){
            return;
        }
        int mid = left + ((right - left) >> 1);
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int[] help = new int[right - left + 1];
        int p1 = left;
        int p2 = mid + 1;
        int i = 0;

        while (p1 <= mid && p2 <= right){
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid){
            help[i++] = arr[p1++];
        }
        while (p2 <= right){
            help[i++] = arr[p2++];
        }

        for(i = 0; i < help.length; i++){
            arr[left + i] = help[i];
        }
    }

    public static int[] generate(){
        int[] arr = new int[(int)(5 * Math.random() + 5)];
        for (int i = 0; i < arr.length; i++){
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

}
