package E_0_0_3_Longest_Substring_Without_Repeating;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        Set<Character> mySet;
        int k;
        int j;
        int max = 0;
        for (int i = 0; i < charArray.length; i++) {
            mySet = new HashSet<>();
            k = 0;
            j = i;
            while (true) {
                if (mySet.contains(charArray[j])) {
                    break;
                }
                mySet.add(charArray[j]);
                k++;
                j++;
                if (j == charArray.length){
                    break;
                }
            }
            if (max < k) {
                max = k;
            }
        }
        return max ;
    }
}
