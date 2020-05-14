package sort;

public class InsertionSort {
	/*
	 * Insertion Sort: 
	 * Parameters
	 * Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. 
	 * It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, 
	 * or merge sort.
	 * ----------------
	 * array (Int[]): List of Integer values
	 * */	
	private int[] array;
	
	public void InsertionSort(int[] array) {
		/*
		 * InsertionSort Constructor
		 * Args:
		 * 	array (int[])
		 * Returns: Void
		 */
		this.array = array;
	}
	
	public int[] getArray() {
		return array;
	}
	
	public void setArray(int[] array) {
		this.array = array;
	}
	
	public int[] sort() {
		/*
		 * Insertion Sort 
		 * Returns: int[] Sorted list */
		int length = this.array.length;
		for(int i = 1; i < length; i++) {
			int j = i;
			while(j>0 && this.array[j]<this.array[j-1]) {
				int temp = this.array[j];
				this.array[j] = this.array[j-1];
				this.array[j-1] = temp;
				j-=1;
			}
		}
		return this.array;
	}

}
