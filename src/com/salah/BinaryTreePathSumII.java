package com.salah;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, targetSum, new ArrayList<>(), res);
        return res;
    }

    void helper(TreeNode root, int targetSum, ArrayList<Integer> sol, List<List<Integer>> res)
    {
        if(root == null) return;

        sol.add(root.val);

        if(root.left == null && root.right == null && targetSum == root.val) res.add(new ArrayList<>(sol));
        else {
            helper(root.left, targetSum - root.val, sol, res);
            helper(root.right, targetSum - root.val, sol, res);
        }

        sol.remove(sol.size() - 1);
    }
}
