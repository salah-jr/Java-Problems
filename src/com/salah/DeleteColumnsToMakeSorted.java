package com.salah;

public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int deleted = 0;
        int strLen = strs[0].length();

        for(int c = 0; c < strLen; c++)
        {
            for(int r = 1; r < strs.length; r++)
            {
                if(strs[r].charAt(c) < strs[r-1].charAt(c))
                {
                    deleted++;
                    break;
                }
            }
        }

        return deleted;
    }
}
