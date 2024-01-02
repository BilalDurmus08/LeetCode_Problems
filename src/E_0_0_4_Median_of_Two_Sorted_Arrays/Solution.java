package E_0_0_4_Median_of_Two_Sorted_Arrays;

import java.util.ArrayList;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> myList = new ArrayList<>();
        while (true) {
            if (i == nums1.length) {
                while (j != nums2.length) {
                    myList.add(nums2[j]);
                    j++;
                }
                break;
            }
            if (j == nums2.length) {
                while (i != nums1.length) {
                    myList.add(nums1[i]);
                    i++;
                }
                break;
            }
            if (nums1[i] <= nums2[j]) {
                myList.add(nums1[i]);
                i++;
            } else {
                myList.add(nums2[j]);
                j++;
            }

        }
        if (myList.size() % 2 == 0) {
            int index1 = myList.size() /2;
            int index2 = myList.size() /2 - 1;
            double number = myList.get(index1) + myList.get(index2);
            return number/2;
        }else{
            int index = myList.size() / 2;
            return myList.get(index);
        }
    }
}
