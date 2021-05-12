
def binary_search(A, val, left, right):

	# check base case
	if right >= 1:
		mid = left + (right-1)//2
		print(mid)
		if A[mid] == val:
			return mid
		elif A[mid] > val:
			return binary_search(A, val, left, mid-1)
		else:
			return binary_search(A, val, mid+1, right)
	else:
		return -1


arr = [ 2, 3, 4, 10, 40 ]
x = 10
 
# Function call
result = binary_search(arr, x, 0, len(arr)-1)
 
if result != -1:
    print ("Element is present at index % d" % result)
else:
    print ("Element is not present in array")
