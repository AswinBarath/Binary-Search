package binary_search_on_answer;

// TC: O(N*log(sum(A) - max(A)))
// Must not sort the array => Because question demands to allocate books in contigous order

public class Allocate_Books {
    public int books(int[] A, int B) {
        int N = A.length;
        if (N < B)
            return -1; // Edge case
        long sum = 0, max = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
            if (A[i] > max)
                max = A[i];
        }
        if (N == B)
            return (int) max; // Edge case
        // Search Space
        long left = max;
        long right = sum;
        long ans = -1;
        while (left <= right) {
            // mid => no. of pages
            long mid = left + (right - left) / 2;
            int s = countStudents(A, mid);
            if (s == B) {
                ans = mid;
                right = mid - 1; // Go Left (More Pages -> Why? minimize Pages)
            } else {
                left = mid + 1; // Go Right
            }
            // Debugging
            // System.out.println("s="+s+", mid="+mid+", ans="+ans);
        }
        return (int) ans;
    }

    private int countStudents(int[] a, long pageLimit) {
        // code
        int students = 1;
        long pages = 0;
        for (int i = 0; i < a.length; i++) {
            pages += a[i];
            if (pages > pageLimit) {
                students++;
                pages = a[i];
            }
        }
        return students;
    }
}

/*
 * Problem Description
 * Given an array of integers A of size N and an integer B.
 * 
 * The College library has N books. The ith book has A[i] number of pages.
 * 
 * You have to allocate books to B number of students so that the maximum number
 * of pages allocated to a student is minimum.
 * 
 * A book will be allocated to exactly one student.
 * Each student has to be allocated at least one book.
 * Allotment should be in contiguous order, for example: A student cannot be
 * allocated book 1 and book 3, skipping book 2.
 * Calculate and return that minimum possible number.
 * 
 * NOTE: Return -1 if a valid assignment is not possible.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i], B <= 105
 * 
 * 
 * 
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 * 
 * 
 * 
 * Output Format
 * Return that minimum possible number.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * A = [12, 34, 67, 90]
 * B = 2
 * Input 2:
 * A = [12, 15, 78]
 * B = 4
 * 
 * 
 * Example Output
 * Output 1:
 * 113
 * Output 2:
 * -1
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * There are two students. Books can be distributed in following fashion :
 * 1) [12] and [34, 67, 90]
 * Max number of pages is allocated to student 2 with 34 + 67 + 90 = 191 pages
 * 2) [12, 34] and [67, 90]
 * Max number of pages is allocated to student 2 with 67 + 90 = 157 pages
 * 3) [12, 34, 67] and [90]
 * Max number of pages is allocated to student 1 with 12 + 34 + 67 = 113 pages
 * Of the 3 cases, Option 3 has the minimum pages = 113.
 * Explanation 2:
 * Each student has to be allocated at least one book.
 * But the Total number of books is less than the number of students.
 * Thus each student cannot be allocated to atleast one book.
 * 
 * Therefore, the result is -1.
 */