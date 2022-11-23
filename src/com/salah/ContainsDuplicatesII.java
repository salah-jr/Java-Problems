package com.salah;

import java.util.HashMap;

public class ContainsDuplicatesII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> seen = new HashMap<>();  //<value, index last seen>
        int lastSeen;
        for(int i = 0; i < nums.length; i++) {
            if(seen.containsKey(nums[i])){ //seen the value before


                lastSeen = seen.get(nums[i]);

                //check if diff between i and j is under k
                if(Math.abs(lastSeen - i) <= k){
                    return true;
                } else {
                    seen.put(nums[i], i); //update the Hashmap.
                }

            } else { //never seen the value before
                seen.put(nums[i], i);
            }
        }

        return false;
    }
}
