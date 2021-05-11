# Algorithms
## Bubble Sort
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
### Example
Given an array of  x = ( 5, 1, 4, 2, 8 )
#### First Pass
- ( **5**, **1**, 4, 2, 8, ) –> ( **1**, **5**, 4, 2, 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
- ( 1, **5**, **4**, 2, 8 ) –>  ( 1, **4**, **5**, 2, 8 ), Swap since 5 > 4
- ( 1, 4, **5**, **2**, 8 ) –>  ( 1, 4, **2**, **5**, 8 ), Swap since 5 > 2
- ( 1, 4, 2, **5**, **8** ) –> ( 1, 4, 2, **5**, **8** ), Now, since these elements are already in order (8 > 5), algorithm does not swap them

#### Second Pass:
- ( **1**, **4**, 2, 5, 8 ) –> ( **1**, **4**, 2, 5, 8 )
- ( 1, **4**, **2**, 5, 8 ) –> ( 1, **2**, **4**, 5, 8 ), Swap since 4 > 2
- ( 1, 2, **4**, **5**, 8 ) –> ( 1, 2, **4**, **5**, 8 )
- ( 1, 2, 4, **5**, **8** ) –>  ( 1, 2, 4, **5**, **8** )

Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted. Thus the algorithm will go on to the third pass

## Pseudo-code

```sh
# Given an array A of n Numbers
for j = 2 to n {
	key = A[j]
	i = j - 1
	# A[j] is added in the sorted sequence A[1... j-1]
	while((i> = 0) and (A[i] > key)){
		A[i+1] = A[i]
		i = i-1
	}
	A[i] =  key
}
```

Java Code is also provided.

License
----

None
