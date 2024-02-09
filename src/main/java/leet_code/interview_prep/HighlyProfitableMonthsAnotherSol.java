package leet_code.interview_prep;

import java.util.ArrayList;
import java.util.List;

public class HighlyProfitableMonthsAnotherSol {
    public static int countHighlyProfitableMonths(List<Integer> stockPrices, int k) {
        int n = stockPrices.size();
        int count = 1;
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i + 1 < n; i++) {
            if (stockPrices.get(i+1)>stockPrices.get(i)){
                count += 1;
            }else{
                a.add(count);
                count = 1;
            }
        }
        a.add(count);
        int ans = 0;
        for (int x : a) {
            if (x >= k)
                ans += (x - k + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> stockPrices = new ArrayList<>();
        stockPrices.add(10);
        stockPrices.add(20);
        stockPrices.add(30);
        stockPrices.add(40);
        stockPrices.add(50);
        int k = 3;
        int result = countHighlyProfitableMonths(stockPrices, k);
        System.out.println(result);
    }

}
