package com.salah;

public class BestTimeToBuy {
    public int maxProfit(int[] prices) {
        int i = 0, j = prices.length-1;
        int max = 0;
        int min = Integer.MAX_VALUE;
        while(i <= j){
            if(prices[i] < min)
            {
                min = prices[i];
            } else if (prices[i] - min > max){
                max = prices[i] - min;
            }

            i++;
        }

        return max;
    }
}
