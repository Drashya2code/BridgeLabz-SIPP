package searching;

public class searching {
    public static void main(String[] args) {
        int [] arr = {11,12,22,25,34,64,90};
        int key = 11;
        int n = arr.length;
        int left = 0;
        int right = n-1;
        search(arr,left, right, key);
    }    

    public static void search(int[] arr,int left, int right, int key){
        int mid1 = left + (right - left)/3;
        int mid2 = right- (right - left)/3;
        if(arr[mid1] == key){
            System.out.println(mid1);
            return;
        }if(arr[mid2] == key){
            System.out.println(mid2);
            return;
        }
        if(key > arr[mid2]){
            search(arr, mid2+1, right,key);
        }else if (key< arr[mid1]){
            search(arr,left, mid1, key);
        }else{
            search(arr,mid1+1,mid2-1,key);
        }

    }
}
