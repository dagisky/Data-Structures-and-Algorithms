# Algorithms
## Insertion Sort
Insertion sort is a simple sorting algorithm that allows in-place sorting of the array, one element at a time. In-place sorting means the original array is modified.

### Example
Given an array of  x = ( 6,5,3,1,8,7,2,4 )
#### First Pass
- (**6**,**5**,3,1,8,7,2,4) –> (5, **6**,3,1,8,7,2,4), Here, algorithm compares the first two elements, and swaps since 6 > 5.
- (**5**, **6**,3,1,8,7,2,4) –>  (3,**5**, **6**,1,8,7,2,4), place 3 first since both 5 & 6 > 3

![Insertion Sort](https://en.wikipedia.org/wiki/File:Insertion-sort-example-300px.gif)


## Python Code Sample

```sh
def insertion_sort(num_list):
	num_list = list(num_list)
	for i in range(1,len(num_list)):
		j = i
		while j>0 and num_list[j] < num_list[j-1]:
			temp = num_list[j]
			num_list[j] = num_list[j-1]
			num_list[j-1] = temp
			j -= 1
	return num_list
```

Java Code is also provided.

License & Acknowledgement
----

Image provided by [wiki](https://en.wikipedia.org/wiki/Insertion_sort)
