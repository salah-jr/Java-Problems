package com.salah;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> mainList = new ArrayList<>();

        if (root == null) return mainList;

        helper(mainList, root, 0);

        return mainList;
    }

    static void helper(List<List<Integer>> mainList, TreeNode root, int level) {
        if (root != null) {
            if (mainList.size() == level) mainList.add(new ArrayList<>());

            mainList.get(level++).add(root.val);

            helper(mainList, root.left, level);
            helper(mainList, root.right, level);
        }
    }
    // public List<List<Integer>> levelOrder(TreeNode root) {
        // List<List<Integer>> res = new ArrayList<>();
        // if (root == null) return res;
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);
        // while (!queue.isEmpty()) {
        // 　　List<Integer> level = new ArrayList<>();
        // 　　int cnt = queue.size();
        // 　　for (int i = 0; i < cnt; i++) {
        // 　　　　TreeNode node = queue.poll();
        // 　　　　level.add(node.val);
        // 　　　　if (node.left != null) {
        // 　　　　　　queue.add(node.left);
        // 　　　　}
        // 　　　　if (node.right != null) {
        // 　　　　　　queue.add(node.right);
        // 　　　　}
        // 　　}
        // 　　res.add(level);
        // }
        // return res;
    //}
}
