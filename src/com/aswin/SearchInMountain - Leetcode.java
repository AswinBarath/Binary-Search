package com.aswin;

// Problem: https://leetcode.com/problems/find-in-mountain-array/

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        return search(mountainArr, target);
    } 

    int search(MountainArray arr, int target) {
        int peak = findPeakElement(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length()-1);
    }

    int findPeakElement(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;
        while(start < end) {
            int mid = start + ( (end - start) / 2 );
            if(arr.get(mid) < arr.get(mid+1)) {
                    start = mid + 1;
            } else {
                    end = mid;
            } 
        }
        return end;
    }

    int orderAgnosticBS(MountainArray arr, int target, int start, int end) {

        boolean isAsc = arr.get(start) < arr.get(end);

        while(start <= end) {
            int mid = start + ( (end - start) / 2 );
            if(arr.get(mid) == target) {
                // ans found
                return mid;
            }
            if(isAsc) {
                if(target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if(target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}