public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int temp = x;
        int rev = 0;
        
        while (x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;
        }
        
        return rev == temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int x = 121;

        System.out.println("Is " + x + " a palindrome? " + solution.isPalindrome(x1)); 
    }
}
