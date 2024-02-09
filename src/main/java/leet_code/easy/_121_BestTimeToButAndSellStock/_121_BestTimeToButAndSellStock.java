package leet_code.easy._121_BestTimeToButAndSellStock;

public class _121_BestTimeToButAndSellStock {
    public int maxProfit(int[] prices) {

        int l=0;
        int r=1;
        int max=0;
        while(r<prices.length){
            //calculate profit each time and update max acc.
            if(prices[l]<prices[r]){
                max=Math.max(max, (prices[r]-prices[l]));
            }else{
                //if right is smaller move l all the way to the right
                l=r;
            }
            //move right
            r++;
        }

        return max;

    }
}

