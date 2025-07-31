package sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] id = {2,6,22,1,9,50};
        
        int [] arr =insertionSorting(id);
        for(int i: arr){
            System.out.print(i + " ");
        }

    }

    public static int[]  insertionSorting(int[] arr){
        for(int i =1; i<arr.length;i++){
            int key = arr[i];
            int j = i -1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j +  1] = key;
        }
        return arr;
    }
}
