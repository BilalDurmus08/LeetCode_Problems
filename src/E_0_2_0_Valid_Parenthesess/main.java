package E_0_2_0_Valid_Parenthesess;

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "()[]{}";
        String s2 = "([])";
        String s3 = "({)}";
        System.out.println(solution.isValid(s1));
        System.out.println(solution.isValid(s2));
        System.out.println(solution.isValid(s3));

    }
}
