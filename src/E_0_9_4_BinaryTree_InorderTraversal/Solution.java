package E_0_9_4_BinaryTree_InorderTraversal;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> myList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return myList;
    }

    public void helper(TreeNode root) {
        if (root != null) {
            helper(root.left);
            myList.add(root.val);
            helper(root.right);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
