# Binary Search

### Binary Search Study Material & Resources

- [SDE Sheet - 180 FAANG Problems (Striver)](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/)
- [Kunal Kushwaha - Java + DSA + Interview Course](https://www.youtube.com/playlist?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ)
    - [Binary Search Algorithm - Theory + Code](https://youtu.be/f6UU7V3szVw?si=-k6FO1LpfBKjp0aJ)
    - [Binary Search Interview Questions - Google, Facebook, Amazon](https://youtu.be/W9QJ8HaRvJQ?si=m-niAYVCe9UWiFbT)
    - [Binary Search in 2D Arrays](https://youtu.be/enI_KyGLYPo?si=pgnP1C-vNRWV31yO)


---

<details>
    <summary>Problems based on the Binary Search (Big List) (Goals Tracking)</summary>
    <p>

### Problems based on the Binary Search (Big List) (Goals Tracking)

- [x] [Steps used in Binary Search](#steps-used-in-binary-search)
- [x] [Binary Search in Java](#binary-search-in-java)
- [x] [Order-Agnostic Binary Search](#order-agnostic-binary-search)
- [x] [When do we apply Binary Search ?](#when-do-we-apply-binary-search)
- [x] Templates(Patterns) in Binary Search
	- [x] [Template I](./src/template_I/BinarySearchTemplate_I.java)
	- [x] [Template II](./src/template_II/BinarySearchTemplate_II.java)
	<!-- - [x] [Template III](./src/template_III/BinarySearchTemplate_III.java) -->
- [ ] [Problems on Binary Search](#problems-on-binary-search)
	- [ ] Easy
		- [x] [Square Root](https://leetcode.com/problems/sqrtx/)
		- [x] [Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/)
		- [x] [First Bad Version](https://leetcode.com/problems/first-bad-version/)
		- [ ] [Two Sum II - Input array is sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
		- [ ] [Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/)
		- [ ] [Arranging Coins(Easy)](https://leetcode.com/problems/arranging-coins/)
		- [x] [Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
		- [x] [Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/)
		- [x] [Search Insert Position](https://leetcode.com/problems/search-insert-position/)
		- [x] [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/)
		- [ ] [Count Negative Numbers in a Sorted Matrix](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)
		- [ ] [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)
		- [ ] [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)
		- [ ] [Fair Candy Swap](https://leetcode.com/problems/fair-candy-swap/)
		- [ ] [Check If N and Its Double Exist](https://leetcode.com/problems/check-if-n-and-its-double-exist/)
		- [ ] [Special Array With X Elements Greater Than or Equal X](https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/)
		- [x] [Binary Search](https://leetcode.com/problems/binary-search/)
	- [ ] Medium
		- [x] [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
		- [x] [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/)
		- [x] [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
		- [x] [Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
		- [x] [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
		- [x] [Find Peak Element](https://leetcode.com/problems/find-peak-element/)
		- [ ] [Find Right Interval](https://leetcode.com/problems/find-right-interval/)
		- [ ] [Reach a Number](https://leetcode.com/problems/reach-a-number/)
		- [ ] [Maximum Value at a Given Index in a Bounded Array](https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/)
		- [ ] [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/)
		- [ ] [Minimum Absolute Sum Difference](https://leetcode.com/problems/minimum-absolute-sum-difference/)
		- [ ] [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)
		- [ ] [Find a Peak Element II](https://leetcode.com/problems/find-a-peak-element-ii/)
		- [ ] [Frequency of the Most Frequent Element](https://leetcode.com/problems/frequency-of-the-most-frequent-element/)
		- [ ] [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)
		- [ ] [Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)
		- [ ] [4 Sum](https://leetcode.com/problems/4sum/)
	- [ ] Hard
		- [ ] [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)
		- [x] [Find Minimum in Rotated Sorted Array II](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/)
		- [ ] [Aggressive cows](https://www.spoj.com/problems/AGGRCOW/)
		- [ ] [Book allocation](https://www.geeksforgeeks.org/allocate-minimum-number-pages/)
		- [ ] [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/)
		- [x] [Find in Mountain Array](https://leetcode.com/problems/find-in-mountain-array/)
		- [ ] [Count smaller number after Self](https://leetcode.com/problems/count-of-smaller-numbers-after-self/)
		- [ ] [Divide Chocolate Problem](https://curiouschild.github.io/leetcode/2019/06/21/divide-chocolate.html)


</p>
</details>

---

<details>
  <summary>Binary Search Problems (SDE Sheet - Day 11) (Striver) (Goals Tracking)</summary>
<p>

### Binary Search Problems (SDE Sheet - Day 11) (Striver) (Goals Tracking)

- Difficulity: Medium to Hard

| Completion Status | Problems on Binary Search | Explanation | Solution |
| --- | --- | --- | --- |
| 🔃 | [Calculating n-th real root using binary search](https://www.geeksforgeeks.org/calculating-n-th-real-root-using-binary-search/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [Median in a row-wise sorted Matrix](https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1#) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| ✅ | [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/SingleElementInSortedArray.java) |
| ✅ | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | [Approach](#8-search-in-rotated-sorted-array) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [K-th Element of Two Sorted Arrays](https://www.geeksforgeeks.org/k-th-element-two-sorted-arrays/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [Allocate Minimum Number of Pages](https://www.interviewbit.com/problems/allocate-books/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [Aggressive Cows](https://www.spoj.com/problems/AGGRCOW/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |

</p>
</details>

---

## Binary Search Notes

**Condition: Array must be sorted**

### Steps used in Binary Search

  - Find the middle element 
    - ( mid = ( start + end ) / 2 )
  - Optimization for finding middle element
    - mid = start + ( (end - start) / 2 )
    - *Problem before: might be possible that (start + end) exceeds the range of int in Java*
  - If target > mid => search in the right
  - Else search in left
  - If middle element == target element (answer)

### Binary Search in Java (Code)

```
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

### Order-Agnostic Binary Search

- When the array order is unknown ( ascending order or descending order ?)

#### Steps for descending order

- Find the middle element
    - ( mid = ( start + end ) / 2 )
- If target > mid => search in the left
- If target < mid => search in right
- Else middle element == target element (answer)

#### So, How do we find the order?

- Just check the start and end
- **Steps** :
    - if start < end => Ascending order
    - else => Descending order
    
#### Java Code - Order Agnostic Binary Search

- One small change in Binary Search logic: **find whether the array is sorted in ascending or descending**
    - `boolean isAsc = arr[start] < arr[end]`

```
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

---

### When do we apply Binary Search ?

- If we are given a sorted array
- When you are required to get one particular answer and you are following a continuous sequence to get the answer:
    - Square Root of a number
- much more ...

---

## Binary Search Problems w/ Dry Run, Breakdowns, & Code (Kunal Kushwaha)

- Difficulity: Easy to Hard

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

#### Java Code Link: [Ceiling of a number](./src/template_I/CeilingOfNumber.java)

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

#### Java Code Link: [Floor of a number - JavaCode](./src/template_I/CeilingOfNumber.java)

---


### 3. Find Smallest Letter Greater Than Target

- Similar to Ceiling of a number
- Change: Ignore mid == target condition
- Change: Return start % arr.length as the result

---

#### LeetCode Link: [Find Smallest Letter Greater Than Target - LeetCode](https://leetcode.com/problems/find-smallest-letter-greater-than-target)

#### Java Code Link: [Find Smallest Letter Greater Than Target - JavaCode](./src/template_I/FindSmallestLetterGreaterThanTarget.java)

---


### 4. Find First and Last Position of Element in Sorted Array `Facebook`

- Apply Binary Search Twice:
- Find the first occurrence of the target - Change: Update ans and end each time
- Find the last occurrence of the target - Change: Update ans and start each time

---

#### LeetCode Link: [Find First and Last Position of Element in Sorted Array - LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array)


#### Java Code Link: [Find First and Last Position of Element in Sorted Array - JavaCode](./src/template_I/FindFirstAndLastPosition.java)

---


### [5. Find position of an element in a sorted array of infinite numbers](https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/) `Amazon`

- In an infinte array of numbers, the size is unknown.
- Binary search divides the array by two for each iteration following **Top - down approach**
- For this problem, as we are unaware about the **end** pointer, we will follow **Bottom - up approach**
- *Bottom-up* : Start with a small chunk of array and double up the size of the chunk by two for every iteration
- Apply Binary search for each chunk and keep doubling the chunk until the element is found.

---

#### [Find position of an element in a sorted array of infinite numbers - JavaCode](./src/template_I/SearchInInfiniteSortedArray.java)

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

#### [Peak Index in Mountain Array - JavaCode](./src/template_II/PeakIndexinMountainArray.java)

---

#### [Peak Index in Mountain Array - LeetCode](https://leetcode.com/problems/peak-index-in-a-mountain-array/)

---

#### [Find Peak Element - LeetCode](https://leetcode.com/problems/find-peak-element/)

---


### 7. Find in Mountain Array

- Similar to Peak Index in Mountain Array, except the **target** is given
- Here, we can first find the *Peak Index*
- Then, apply Order Agnostic Binary Search in both parts of the Mountain array:
	- `0 -> peakIndex`
	- `peakIndex+1 -> arr.length - 1`
- And, finally return the answer

---

#### [Find in Mountain Array - JavaCode](./src/template_II/FindInMountainArray.java)

---

#### [Find in Mountain Array - LeetCode](https://leetcode.com/problems/find-in-mountain-array/)

---


### 8. Search in Rotated Sorted Array
#### `Amazon`, `Google`

#### Rotated Array:
- Consider an array = `[2, 4, 5, 7, 8, 9, 10, 12]`
- After 1st rotation, array = `[12, 2, 4, 5, 7, 8, 9, 10]`
- After 2nd rotation, array = `[10, 12, 2, 4, 5, 7, 8, 9]`

---

#### Approach: Find the pivot in the array
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

#### [Search in Rotated Sorted Array - JavaCode](./src/template_I/SearchRotatedSortedArray.java)

---

#### [Search in Rotated Sorted Array - LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array/)

---


### 9. Search in Rotated Sorted Array with duplicates

- The approach for duplicates are same as the previous problem except
	- The while loop should terminate when start>=end
	- The Case 3 & 4 will not work for duplicates
	
- So, we can skip the duplicates by comparing start, mid and end only if they are not pivot elements
- And then we can start reducing the search space based on the comparision of start, mid, and end


---

#### [Search in Rotated Sorted Array with duplicates - JavaCode](./src/template_I/SearchRotatedSortedArray.java)

---

#### [Search in Rotated Sorted Array with duplicates - LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)

---


### 10. Find the Rotation Count in Rotated Sorted Array

- Similar to previous approaches except
	- We return 0 if array's pivot is -1
	- Else we return the pivot+1 as the answer
- Because the array rotates pivot times, and as we get 0-indexed pivot, we return pivot+1 as the answer.


---

#### [Find the Rotation Count in Rotated Sorted Array - JavaCode](./src/template_I/FindRotationCountInRotatedSortedArray.java)

---

#### [Find the Rotation Count in Rotated Sorted Array - GFG](https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/)

---


### 11. Split Array Largest Sum  
#### `Google`, `Leetcode Hard Problem` 

- Find the minimum (minAns) and maximum no. of splits (maxAns) we can make  
- Take the minAns and maxAns as start and end respectively
- Apply binary search such that
    - the mid will be (minAns + maxAns) / 2
    - Traverse the array and calculate the cummulative sum to calculate how many pieces you can divide the array with this mid (max sum)
        - if sum becomes greater than mid, then reset sum to current number, and increment the no. of pieces
        - else continue adding sum
    - Now, apply checks for binary search
        - If no. of pieces are greater than `m` (given no. of partitions) then update start = end + 1
        - Else update end = mid

---

<img src="assets/Split Array Largest Sum 1.jpg" alt="Split Array Largest Sum 1" width="400px" >

<img src="assets/Split Array Largest Sum 2.jpg" alt="Split Array Largest Sum 2" width="400px" >

<img src="assets/Split Array Largest Sum 3.jpg" alt="Split Array Largest Sum 3" width="400px" >

---

#### [Split Array Largest Sum - JavaCode](./src/binary_search_problems/SplitArrayLargestSum.java)

#### [Split Array Largest Sum - LeetCode](https://leetcode.com/problems/split-array-largest-sum/)

---
