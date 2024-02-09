package leet_code.interview_prep;

public class HighlyProfitableMonths {

    public static int highlyProfitable(int[] stockPrices, int k){
        //5,3,5,7,8}
        //0 1 2 3 4
        int count=0;
        for (int i = 0; i <= stockPrices.length-k; i++) {
            if (stockPrices[i]<stockPrices[i+1] && stockPrices[i+1]<stockPrices[i+2]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] stockPrices = new int[]{10,20,30,40,50};
        int k=3;
        System.out.println(highlyProfitable(stockPrices, k));
    }
}


/*
Problem 2: Highly Profitable Months

The Stocks of a company are being surveyed to analyse the net profit of the company over a period

For an analysis parameter k, an interval of k concutive months is said to be hightly profitable if the values of the stock prices are strictly increasing for those months. Given the stock prices of the company for n months and the analysis parameter k find the number of highly profitable intervals.

Example : stockPrices=[5,3,5,7,8], K=3
Here the answer is 2


 */
