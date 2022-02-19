public class QuickSortMiddle {
    public static void main(String[] args) {
        int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int leng = args.length;

        QuickSortMiddle qsm=new QuickSortMiddle();
        qsm.quickSortRecursion(arr,0,leng-1);
        qsm.printArray(arr);
    }

    int partition(int[] arr, int low, int high)
    {
        int pivot = arr[(low + high) / 2];

        while (low <= high)
        {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];         // 15 & 11 elements swap
                arr[high] = temp;
                low++;                        // after elements swaped
                high--;
            }
        }
        return low;                          // lower index element ko return karwa denge
    }
    void quickSortRecursion(int[]arr,int low,int high)
    {
        int pi=partition(arr,low,high);   //int pi variable liya hai because->partition jo hai wo yahan lower index ko return karwa raha tha.
        if (low<pi-1)
        {
            quickSortRecursion(arr,low,pi-1);   // Left side ke liye
        }
        if (pi<high)
        {
            quickSortRecursion(arr,pi,high);        // Right side ke liye
        }
    }
    void printArray(int[] arr)                     // Sorted Array print karwadega
    {
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}

