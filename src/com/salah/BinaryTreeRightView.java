package com.salah;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightView {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList();
        List<Integer> list = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode cur = queue.poll();
                if(i == 0) list.add(cur.val);

                // Swap if you want the left view
                if(cur.right != null) queue.add(cur.right);
                if(cur.left != null) queue.add(cur.left);
            }
        }

        return list;
    }


    // Recursively
//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> result = new ArrayList<Integer>();
//        rightView(root, result, 0);
//        return result;
//    }
//
//    public void rightView(TreeNode curr, List<Integer> result, int currDepth){
//        if(curr == null){
//            return;
//        }
//        if(currDepth == result.size()){
//            result.add(curr.val);
//        }
//
//        //Swap if you want the left view
//        rightView(curr.right, result, currDepth + 1);
//        rightView(curr.left, result, currDepth + 1);
//    }


}
