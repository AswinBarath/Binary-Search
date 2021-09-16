# Binary Search

**Condition: Array must be sorted**

### Steps

  - Find the middle element 
    - ( mid = ( start + end ) / 2 )
  - If target > mid => search in the right
  - Else search in left
  - If middle element == target element (answer)

### Java Code

```aidl
package com.aswin;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 3;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2;
            // Problem: might be possible that (start + end) exceeds the range of int in Java

            int mid = start + ( (end - start) / 2 );

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }

        return -1;
    }

}

```

## Order-Agnostic Binary Search

- When the array order is unknown ( ascending order or descending order ?)

### Steps for descending order

- Find the middle element
    - ( mid = ( start + end ) / 2 )
- If target > mid => search in the left
- If target < mid => search in right
- Else middle element == target element (answer)

### So, How do we find the order?

- Just check the start and end


- **Steps** :
    - if start < end => Ascending order
    - else => Descending order
    
### Java Code - Order Agnostic Binary Search

```aidl
package com.aswin;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 3;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2;
            // Problem: might be possible that (start + end) exceeds the range of int in Java

            int mid = start + ( (end - start) / 2 );

            if(arr[mid] == target) {
                // ans found
                return mid;
            }
            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}

```

## Problems on Binary Search

### When do we apply Binary Search ?

- If we are given a sorted array
- When you are required to get one particular answer and you are following a continuous sequence to get the answer:
    - Square Root of a number

### 1. Ceiling of a number

- **Ceiling of number**: Smallest element in array which is greater than or equal to target
- Steps
- 1. Find the closest or equal number to target
- 2. Find all the numbers which are greater than the previous result (Binary Search)
- 3. Return the smallest number from the previous category    
---  
- _Consider the following example:_
- arr = [2, 3, 5, 9, 14, 16, 18], target = 14
- ceiling(arr, target=14) = 14
- ceiling(arr, target=15) = 16
- ceiling(arr, target=4) = 5
- ceiling(arr, target=9) = 9
---
- If target is found, return the **target**
- Else return the **start**
- Because when the condition is violated in the while loop: `start = end + 1`
-       start  target  end              =>              end  target  start
- So the answer is not in this range, and the smallest element which is greater than or equal to target is the **start**
---


### 2. Floor of a number

- **Ceiling of number**: Greatest element in array which is smaller than or equal to target
- Steps
- 1. Find the closest or equal number to target
- 2. Find all the numbers which are smaller than the previous result (Binary Search)
- 3. Return the greatest number from the previous category
---  
- _Consider the following example:_
- arr = [2, 3, 5, 9, 14, 16, 18], target = 14
- floor(arr, target=4) = 3
- floor(arr, target=9) = 9
- floor(arr, target=14) = 14
- floor(arr, target=19) = 18
---
- If target is found, return the **target**
- Else return the **end**
- Because when the condition is violated in the while loop: `start = end + 1`
-       start  target  end              =>              target  end  start
- So the answer is not in this range, and the greatest element which is smaller than or equal to target is the **end**
---


### 3. Find Smallest Letter Greater Than Target

- Similar to Ceiling of a number
- Change: Ignore mid == target condition
- Change: Return start % arr.length as the result
---


### 4. Find First and Last Position of Element in Sorted Array `Facebook`

- Apply Binary Search Twice:
- Find the first occurrence of the target - Change: Update ans and end each time
- Find the last occurrence of the target - Change: Update ans and start each time
---


### 5. Find position of an element in a sorted array of infinite numbers `Amazon`

- In an infinte array of numbers, the size is unknown.
- Binary search divides the array by two for each iteration following **Top - down approach**
- For this problem, as we are unaware about the **end** pointer, we will follow **Bottom - up approach**
- *Bottom-up* : Start with a small chunk of array and double up the size of the chunk by two for every iteration
- Apply Binary search for each chunk and keep doubling the chunk until the element is found.
---


### 6. Peak Index in Mountain Array

- Mountain Array is also known as **Bitonic array**.
- In this array, the numbers in first part are sorted in increasing order and the second part in decreasing order.
- Peak element is nothing but the maximum element in the array.
- So, we have two cases where we can compare adjacent elements:
	- **Ascending part** where we can update the start = mid + 1
	- **Descending part** where we can update the end = mid

- In the end, **start == end** and pointing to the largest number because of the 2 checks above
- start and end are always trying to find the max element in the above 2 checks
- Hence, when they are pointing to just one element, that is the max one because that is what the checks say
- More elaboration: at every point of the time for start and end, 
- they have the best possible answer till that time and if we are saying that only one item is remaining
- hence because of above line that is the best possible ans

---


### 7. Find in Mountain Array

- Similar to Peak Index in Mountain Array, except the **target** is given
- Here, we can first find the *Peak Index*
- Then, apply Order Agnostic Binary Search in both parts of the Mountain array:
	- `0 -> peakIndex`
	- `peakIndex+1 -> arr.length - 1`
- And, finally return the answer

---


### 8. Search in Rotated Sorted Array `Amazon`, `Google`

#### Rotated Array:
- Consider an array = `[2, 4, 5, 7, 8, 9, 10, 12]`
- After 1st rotation, array = `[12, 2, 4, 5, 7, 8, 9, 10]`
- After 2nd rotation, array = `[10, 12, 2, 4, 5, 7, 8, 9]`
---
#### Approach 1: Find the pivot in the array
- pivot is from where your next numbers are ascending
- **pivot** is also the largest number
- For example: `[3, 4, 5, 6, 7, 0, 1, 2]`
	- Here, the is pivot = 7
	- Both parts before & after the pivot is sorted in ascending order
- So, we can follow the following steps:
	- Find pivot
	- Search target in first half => Simple BS `(0 -> pivot)`
	- If still not found, search target in second half => Simple BS `(pivot+1, end)`
- Now, the problem is to find the pivot:
	- Consider `[3, 4, 5, 6, 7, 0, 1, 2]`
	- We can observe that only two elements `7, 0` are descending
	- So, when do we find the answer:
		- Case 1: When mid > mid+1 element, then mid is the pivot
		- Case 2: When mid < mid-1 element, then mid-1 is the pivot
		- Case 3: When start >= mid element, then end = mid - 1
		- Case 4: When start < mid element, then start = mid + 1
		- ( Explanation for case 3 & 4: if mid was pivot it would've returned by case 1 & 2... )
		- ( Hence, proved that bigger number lies behind in case 3 and ahead in case 4, so ignore mid in case 3 and 4 using mid (+ or -) 1 )
- Now, we have to find the target:
	- If target == arr[pivot] return pivot
	- If target >= arr[0], Search target in first half => Simple BS `(0 -> pivot)`
	- If target < arr[pivot] search target in second half => Simple BS `(pivot+1, end)`

---


### 9. Search in Rotated Sorted Array with duplicates



---