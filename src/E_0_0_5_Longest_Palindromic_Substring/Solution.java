package E_0_0_5_Longest_Palindromic_Substring;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String longestPalindrome(String s) {
        char[] myArray = s.toCharArray();
        List<Character> longest = new ArrayList<>();
        List<Character> temp;
        for (int i = 0; i < myArray.length; i++) {
            temp = new ArrayList<>();
            for (int j = i; j < myArray.length; j++) {
                temp.add(myArray[j]);
                if (isPalindrome(temp)) {
                    if (temp.size() > longest.size()) {
                        longest.clear();
                        longest.addAll(temp);
                    }
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder(); //I converted my list to String value;
        for (Character character : longest) {
            stringBuilder.append(character);
        }
        String message = stringBuilder.toString();
        return message;
    }

    private boolean isPalindrome(List<Character> array) {
        int last = array.size() - 1;
        int first = 0;
        if (last == first) {
            return true;
        } else if (first + 1 == last) {
            if (array.get(first) != array.get(last)) {
                return false;
            }
        }
        while (first - 1 != last  && first != last) {
            if (array.get(first) != array.get(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
