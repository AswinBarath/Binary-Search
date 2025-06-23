package binary_search_problems;

public class Sum_of_k_Mirror_Numbers {

    public static void main(String[] args) {
        Sum_of_k_Mirror_Numbers obj = new Sum_of_k_Mirror_Numbers();
        System.out.println(obj.kMirror(7, 17));
    }

    public long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;
        int length = 1;

        while (count < n) {
            // Generate odd length palindromes
            for (int i = (int)Math.pow(10, length - 1); i < (int)Math.pow(10, length); i++) {
                String firstHalf = String.valueOf(i);
                String palindromeStr = firstHalf + new StringBuilder(firstHalf.substring(0, firstHalf.length() - 1)).reverse();
                long palindrome = Long.parseLong(palindromeStr);

                // Debug output
                // System.out.printf("Odd len=%d: %d (base-%d: %s) %s\n", length * 2 - 1, palindrome, k, toBaseK(palindrome, k), isPalindrome(toBaseK(palindrome, k)) ? "ACCEPTED" : "rejected");
                // try (java.io.FileWriter fw = new java.io.FileWriter("palindrome_debug_output.txt", true)) {
                //     fw.write(String.format("Odd len=%d: %d (base-%d: %s) %s\n", length * 2 - 1, palindrome, k, toBaseK(palindrome, k), isPalindrome(toBaseK(palindrome, k)) ? "ACCEPTED" : "rejected"));
                // } catch (Exception e) { e.printStackTrace(); }

                if (isPalindrome(toBaseK(palindrome, k))) {
                    sum += palindrome;
                    count++;
                    if (count == n) return sum;
                }
            }

            // Generate even length palindromes
            for (int i = (int)Math.pow(10, length - 1); i < (int)Math.pow(10, length); i++) {
                String firstHalf = String.valueOf(i);
                String palindromeStr = firstHalf + new StringBuilder(firstHalf).reverse();
                long palindrome = Long.parseLong(palindromeStr);

                // Debug output
                // System.out.printf("Even len=%d: %d (base-%d: %s) %s\n", length * 2, palindrome, k, toBaseK(palindrome, k), isPalindrome(toBaseK(palindrome, k)) ? "ACCEPTED" : "rejected");
                // try (java.io.FileWriter fw = new java.io.FileWriter("palindrome_debug_output.txt", true)) {
                //     fw.write(String.format("Even len=%d: %d (base-%d: %s) %s\n", length * 2, palindrome, k, toBaseK(palindrome, k), isPalindrome(toBaseK(palindrome, k)) ? "ACCEPTED" : "rejected"));
                // } catch (Exception e) { e.printStackTrace(); }

                if (isPalindrome(toBaseK(palindrome, k))) {
                    sum += palindrome;
                    count++;
                    if (count == n) return sum;
                }
            }

            length++;
        }

        return sum;
    }

    // Helper to check if a string is a palindrome
    private boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    // Convert number to base-k as string
    private String toBaseK(long num, int k) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % k);
            num /= k;
        }
        return sb.reverse().toString();
    }
}


/*

Let's break down the problem:
Crux of mirror number: Check palindrome 
(of base k numbers and base 10 numbers)

sum of n numbers 
(sorted in increasing order of smallest to largest k-mirror numbers 
(k-mirror numbers: base-10 numbers that has base-k & base-10 as palindromes)

base 2 to 9 convertion from base 10

Optimization Idea: eliminate numbers like Sieve of prime no.s.

*/
