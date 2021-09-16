package com.aswin;

// Problem 1: https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Problem 2: https://leetcode.com/problems/find-peak-element/
// Solution is literally the same for both problems

public class Mountain {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8, 7, 6, 3, 0};
        // int[] arr = {1, 2, 5, 7};
	int ansIdx = peekIndexInMountainArray(arr);
	System.out.println("Index=" + ansIdx + ", arr[idx]=" + arr[ansIdx]);
	// System.out.println("Index=" + ansIdx);
   }

    static int peekIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            // find the middle element
            // int mid = (start + end) / 2;
            // Problem: might be possible that (start + end) exceeds the range of int in Java

            int mid = start + ( (end - start) / 2 );


	    if(arr[mid] < arr[mid+1]) {
		// You're in ascending part
                start = mid + 1;
		// because we know that mid+1 element > mid element
            } 
	    else {
		// You're in dec part of the array
		// this may be an ans, but look at left
		// this is why end != mid - 1
                end = mid;
            } 
        }
	// In the end, start == end and pointing to the largest number because of the 2 checks above
	// start and end are always trying to find the max element in the above 2 checks
	// Hence, when they are pointing to just one element, that is the max one because that is what the checks say
	// More elaboration: at every point of the time for start and end, they have the best possible answer till that time
	// and if we are saying that only one item is remaining, hence cux of above line that is the best possible ans

        return end;
    }

}
