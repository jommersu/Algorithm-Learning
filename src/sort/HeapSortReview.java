package sort;

public class HeapSortReview {

    public static void main(String[] args){
        int[] arr = generate();
        printArr(arr);
        heapSort(arr);
        printArr(arr);
    }

    public static void heapSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        for(int i = 0; i < arr.length; i++){
            heapInsert(arr, i);
        }


        int size = arr.length;
        swap(arr, 0, --size);

        while (size > 0){
            heapify(arr, 0, size);
            swap(arr, 0, --size);
        }
    }

    public static void heapify(int[] arr, int index, int size){
        int left = 2 * index + 1;
        int right = left + 1;

        while (left < size){
            int largest = right < size && arr[left] < arr[right] ? right : left;
            largest = arr[index] > arr[largest] ? index : largest;

            if(index == largest){
                break;
            }

            swap(arr, index, largest);
            index = largest;
            left = 2 * index + 1;
            right = left + 1;
        }
    }

    public static void heapInsert(int[] arr, int i){
        while (arr[i] > arr[(i - 1) / 2]){
            swap(arr, i ,(i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int[] generate(){
        int[] arr = new int[(int)(5 * Math.random()) + 5];

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
}
