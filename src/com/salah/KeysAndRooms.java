package com.salah;

import java.util.List;
import java.util.Stack;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> keys = new Stack<>();
        boolean[] opened = new boolean[rooms.size()];
        keys.add(0);
        opened[0] = true;

        while(!keys.isEmpty())
        {
            int curKey = keys.pop();
            opened[curKey] = true;
            for(int el : rooms.get(curKey))
            {
                if(!opened[el]) keys.add(el);
            }
        }

        for(boolean room : opened)
        {
            if(!room) return false;
        }

        return true;
    }
}
