package com.salah;

import java.util.ArrayList;
import java.util.List;

public class FindSmallestSetOfVerticesToReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res = new ArrayList<>();
        int [] seen = new int[n];

        for(List<Integer> e : edges)
        {
            seen[e.get(1)]++;
        }

        for(int i = 0; i < seen.length; i++)
        {
            if(seen[i] == 0) res.add(i);
        }

        return res;
    }
}
