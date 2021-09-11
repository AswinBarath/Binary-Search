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
- 2. Find all the numbers which are greater than the previous result
- 3. Return the smallest number from the previous category    
---  
- _Consider the following example:_
- arr = [2, 3, 5, 9, 14, 16, 18], target = 14
- ceiling(arr, target=14) = 14
- ceiling(arr, target=15) = 16
- ceiling(arr, target=4) = 5
- ceiling(arr, target=9) = 9
---

