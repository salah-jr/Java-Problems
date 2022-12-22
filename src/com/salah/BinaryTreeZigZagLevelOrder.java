package com.salah;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigZagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> mainList = new ArrayList<>();

        if (root == null) return mainList;

        helper(mainList, root, 0);

        return mainList;
    }

    static void helper(List<List<Integer>> mainList, TreeNode root, int level) {
        if (root != null) {
            if (mainList.size() == level) mainList.add(new ArrayList<>());

            if(level % 2 == 0) mainList.get(level++).add(root.val);
            else mainList.get(level++).add(0, root.val);

            helper(mainList, root.left, level);
            helper(mainList, root.right, level);
        }
    }
}
