package com.salah;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIVBinarySearchTree {
    Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        if(set.contains(root.val)) return true;
        set.add(k-root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
