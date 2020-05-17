# Algorithms
## Merge Sort
Merge sort is one of the most efficient sorting algorithms. It works on the principle of Divide and Conquer. Merge sort repeatedly breaks down the given list until each sublist consists of a single element and merging those sublists in sorted manner.

### Example
Given an array of  x = ( 5, 1, 4, 2, 8 )
#### Divide
- ( 5, 1, 4, 2, 8, ) –> ( 5, 1 ), (4, 2, 8) Here, algorithm compares the first two elements, and swaps since 5 > 1.
- ( 5, 1 ), (4, 2, 8) –>  ((5), (1)), ((4), (2, 8)) -> (((5), (1)), ((4), ((2), (8)))

#### Sort
- (((**1**), (**5**)), ((4), (2, 8))–>  ((1, 5), ((4), (2, 8)) 
- ((1, 5), ((2, 4, 8))  –> ( 1, 2, 4, 5, 8 )


Now, the array is already sorted. it computes sorting in logarithmic time

Java Code is also provided.

License
----

None
