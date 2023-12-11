package LeetCode_0_0_10.E_5_Longest_Palindromic_Substring;

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = "babad";
        String s = "aacabdkacaa";
        System.out.println(
                solution.longestPalindrome(a)+"\n"+solution.longestPalindrome(s));

    }
}
