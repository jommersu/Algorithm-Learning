package sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = generateArr();
        printArr(arr);
        quickSort(arr);
        printArr(arr);
    }

    public static void quickSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int left , int right){
        if(left < right){
            swap(arr,  left + (int)((right - left + 1) * Math.random()), right );
            int[] p = partition(arr, left, right);
            quickSort(arr, left, p[0] - 1);
            quickSort(arr, p[1] + 1, right);
        }
    }

    public static int[] partition(int[] arr, int left, int right){
        int less = left - 1;
        int more = right;

        while (left < more){
            if(arr[left] < arr[right]){
                swap(arr, ++less, left++);
            }else if(arr[left] > arr[right]){
                swap(arr, --more, left);
            }else {
                left++;
            }
        }
        swap(arr, more, right);

        return new int[] {less + 1, more};
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static int[] generateArr(){
        int[] arr = new int[(int)(5 * Math.random() + 5)];

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