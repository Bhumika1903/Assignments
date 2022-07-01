//perform selection sort.

package array;

public class selection_sorting_array {
	public static void selectionsort(int[] arr) {
		for (int i = 0;i<arr.length-1;i++) {
			int min = arr[i];
			int minindex = i;
			for (int j = i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minindex = j;
				}
				
			}
			if(minindex != i) {
				arr[minindex] = arr[i];
				arr[i] = min;
			}
			
		}
	}

	public static void main(String[] args) {
		int arr[] = {9,5,6,13,0,3};
		selectionsort(arr);
		for (int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		

	}

}
