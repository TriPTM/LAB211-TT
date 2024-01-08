
package model;

public class Numberic {
    private int[] num;

    public Numberic() {
    }

    public Numberic(int[] num) {
        this.num = num;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }
    
    public void doSelfBuddle(){
        doBuddleSort(num);
    }
    
    public void doBuddleSort(int[] number){
        int i, j, n=number.length;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    swap(number,j,j+1);
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
        
    public void swap(int[] number, int i, int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }
      
    public void doSelfQuick(){
        doQuickSort(num,0,num.length-1);
    }
    
    public static void doQuickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            doQuickSort(array, low, pivotIndex);
            doQuickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivotIndex = (low + high) / 2;
        int pivotValue = array[pivotIndex];

        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (array[i] < pivotValue);

            do {
                j--;
            } while (array[j] > pivotValue);

            if (i >= j) {
                return j;
            }

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    
    public int linearSearch(int x){
        for(int i=0;i<num.length;i++){
            if(num[i]==x){
                return i+1;
            }
        }
        return -1;
    }
    
    public int binarySearch(int x){
        doSelfBuddle();
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == num[mid]) {
                return mid;
            }
            else if (x > num[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
