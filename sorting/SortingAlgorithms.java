package sorting;

public class SortingAlgorithms {
   // custom sorting
   public static int max(int[]data, boolean[] trackData) {
       int maxVal = Integer.MIN_VALUE;
int maxIndex = -1;

for (int i = 0; i < data.length; i++) {
if (!trackData[i] && data[i] > maxVal) {
maxVal = data[i];
maxIndex = i;
}
}
return maxIndex;
   }
   public static int[] customSorting(int[] data) {
       
       boolean[] trackData = new boolean[data.length];
int[] sorted = new int[data.length];

for (int i = 0; i < data.length; i++) {
int maxIndex = max(data, trackData);
trackData[maxIndex] = true;
sorted[i] = data[maxIndex]; // store sorted values from largest to smallest
}

return sorted;
   }

// Bubble Sort
public static void bubbleSort(int[] arr) {
int n = arr.length;
boolean swapped;
for (int i = 0; i < n - 1; i++) {
swapped = false;
for (int j = 0; j < n - 1 - i; j++) {
if (arr[j] > arr[j + 1]) {
// Swap data
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
swapped = true;
}
}
if (!swapped) break;
}
}

// Insertion Sort
public static void insertionSort(int[] arr) {
for (int i = 1; i < arr.length; i++) {
int key = arr[i];
int j = i - 1;

while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j = j - 1;
}
arr[j + 1] = key;
}
}

// 64, 34, 25, 12, 22, 11, 90
// key -> 34
// j = 0
// 

// Merge Sort
public static void mergeSort(int[] arr) {
if (arr.length < 2) return;

int mid = arr.length / 2;
int[] left = new int[mid];
int[] right = new int[arr.length - mid];


// notes => copy a method which is copy the data from the array
System.arraycopy(arr, 0, left, 0, mid);
System.arraycopy(arr, mid, right, 0, arr.length - mid);

mergeSort(left);
mergeSort(right);

merge(arr, left, right);
}

private static void merge(int[] arr, int[] left, int[] right) {
int i = 0, j = 0, k = 0;

// Merge the temp arrays
while (i < left.length && j < right.length) {
if (left[i] <= right[j]) {
arr[k++] = left[i++];
} else {
arr[k++] = right[j++];
}
}

// Copy remaining elements
while (i < left.length) {
arr[k++] = left[i++];
}

while (j < right.length) {
arr[k++] = right[j++];
}
}

// Quick Sort
public static void quickSort(int[] arr, int low, int high) {
if (low < high) {
int p = partition(arr, low, high);
quickSort(arr, low, p - 1);
quickSort(arr, p + 1, high);
}
}

private static int partition(int[] arr, int low, int high) {
int pivot = arr[high]; // Choose last element as pivot
int i = low - 1;

for (int j = low; j < high; j++) {
if (arr[j] < pivot) {
i++;

// Swap arr[i] and arr[j]
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}

// Swap arr[i+1] and pivot (arr[high])
int temp = arr[i + 1];
arr[i + 1] = arr[high];
arr[high] = temp;

return i + 1;
}

// Utility method to print array
public static void printArray(int[] arr) {
for (int value : arr) {
System.out.print(value + " ");
}
System.out.println();
}

// Main method to test all sorting algorithms
public static void main(String[] args) {
// int[] data = {64, 34, 25, 12, 22, 11, 90};
int[] custom = {63, 54, 325, 62, 32, 11, 97};


// custom sorting
int [] customSorting = customSorting(custom);
System.out.println(" Custom Sorting");
for(int i =customSorting.length-1; i>=0; i--) {
    System.out.print( customSorting[i]+ " ");
}
System.out.println();

// // Bubble Sort
// int[] bubbleData = data.clone();
// bubbleSort(bubbleData);
// System.out.println("Bubble Sorted:");
// printArray(bubbleData);
//
// // Insertion Sort
// int[] insertionData = data.clone();
// insertionSort(insertionData);
// System.out.println("Insertion Sorted:");
// printArray(insertionData);
//
// // Merge Sort
// int[] mergeData = data.clone();
// mergeSort(mergeData);
// System.out.println("Merge Sorted:");
// printArray(mergeData);

// Quick Sort
// int[] quickData = data.clone();
// quickSort(quickData, 0, quickData.length - 1);
// System.out.println("Quick Sorted:");
// printArray(quickData);
}
}