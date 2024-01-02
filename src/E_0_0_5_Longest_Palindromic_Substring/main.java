package E_0_0_5_Longest_Palindromic_Substring;

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = "babad";
        String s = "aacabdkacaa";
        System.out.println(
                solution.longestPalindrome(a)+"\n"+solution.longestPalindrome(s));

    }
}
