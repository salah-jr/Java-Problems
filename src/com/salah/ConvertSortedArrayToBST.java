package com.salah;

public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return helper(nums, 0, nums.length-1);
    }

    TreeNode helper(int[] nums, int low, int high)
    {
        if(low > high) return null;
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.right = helper(nums, mid+1, high);
        node.left = helper(nums, low, mid-1);
        return node;
    }
}
