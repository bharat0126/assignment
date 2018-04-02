package problem1;

import java.util.Arrays;

public class SelectionSortDemo {

    public static int[] selectionSort(int[] data) {
	for (int i = 0; i < data.length; i++) {
	    int minimum = i;
	    for (int j = i+1; j < data.length; j++) {
		if (data[minimum] > data[j]) {
		    minimum = j;
		}
	    }
	    int temp = data[i];
	    data[i] = data[minimum];
	    data[minimum] = temp;

	}
	return data;
    }
    
    public static int[] sortSubArray(int startIndex,int endIndex,int[]array){
	int[] newArray = Arrays.copyOfRange(array, startIndex, endIndex+1);
	System.out.println("Unsorted sub array :-" + Arrays.toString(newArray));
	SelectionSortDemo.selectionSort(newArray);
	return newArray;
	
    }

    public static void main(String[] args) {
	//sort array
	int array1[] = { 33, 45, 21, 35, 67, 81, 69, 11, 20, 9 };
	System.out.println("Unsorted array :-" + Arrays.toString(array1));
	System.out.println("Sorted array :- " + Arrays.toString(SelectionSortDemo.selectionSort(array1)));
	
	System.out.println("/*******************/");
	//sort sub array
	int array2[] = { 33, 45, 21, 35, 67, 81, 69, 11, 20, 9 };
	System.out.println("Sorted sub array :- " + Arrays.toString(SelectionSortDemo.sortSubArray(2, 7, array2)));
	

    }
}
