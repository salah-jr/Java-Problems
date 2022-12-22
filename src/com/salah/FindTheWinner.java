package com.salah;

import java.util.ArrayList;

public class FindTheWinner {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> players = new ArrayList<>();

        for(int i = 1; i <= n; i++)
        {
            players.add(i);
        }

        int cur = 0;
        while(players.size() != 1)
        {
            cur = (cur+k-1) % players.size();
            players.remove(cur);
        }

        return players.get(0);
    }


    // Recursive
//    public int findTheWinner(int n, int k) {
//        return helper(n,k)+1;
//    }
//    public int helper(int size, int k){
//        if(size==1)return 0;
//        return (helper(size-1,k)+k)%size;
//    }
}
