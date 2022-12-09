package com.salah;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleI {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list.add(list1);
        if(numRows == 1) {
            return list;
        }

        for(int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            for(int j = 1; j < i; j++) {
                temp.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }

            temp.add(1);
            list.add(temp);
        }

        return list;
    }
}
