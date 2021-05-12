public class BinarySearch {
	public static int search(int[] A, int n, int left, int right) {
		if(right >= 1) {
			int mid = left + (int) (right-1) / 2;
			if (A[mid] == n)
				return mid;
			else if (A[mid] > n)
				return search(A, n, left, mid-1);
			else 
				return search(A, n, mid+1, right);
			
		}else {
			// No result
			return -1;
		}
	}
}
