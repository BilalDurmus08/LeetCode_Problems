package LeetCode_0_0_10.E_3_Longest_Substring_Without_Repeating;

import java.util.LinkedList;

public class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        int current = 0;
        int current2;
        int temp;
        int max = 1;
        int i;
        outerLoop:
        // I defined a name for the outerLoop, That's allow to me break that all loop
        while (current < charArray.length - 1) {
            current2 = current;
            temp = 1;
            LinkedList<char> myList = new LinkedList<char>();
            myList.add(charArray[current2]);
            i = 1;

            while (true) {
                for (char c : myList) {
                    if (charArray[current2 + i] == c) {
                        break outerLoop;
                    }
                }
                temp++;
                myList.add(charArray[current2 + i]);
                i++;
                if (current2 + i == charArray.length) {
                    break;
                }
            }

            if (max < temp) {
                max = temp;
            }

            current++;
        }
        return max;
    }
}
