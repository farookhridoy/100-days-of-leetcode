#Define the function
def sorted_array(arr):
    #Base case
    if len(arr) <=0 or len(arr) <=1:
        return False
    XOR = 0

    for i in range(0,len(arr)):
        XOR = XOR ^ arr[i]
    return XOR

#Defien a array for test case

arr = [1,1,2,3,3,4,4,8,8]

print("Test case array: "+ str(arr))

non_duplicate_arr = sorted_array(arr)

print("Non duplicate array: "+ str(non_duplicate_arr))