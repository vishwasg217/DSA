public class Stock 
{
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int ans = 0;

        int minIndex = 0;
        int maxIndex = 1;
        int min = 10000;
        int max = -1;

        for(int i=0;i<n-1;i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
                minIndex = i;
                max = prices[i+1];
                maxIndex = i+1;
            }
            if(i > minIndex && prices[i] > max)
            {
                max = prices[i];
                maxIndex = i;
            }
        }

        ans = max - min;
        if(ans < 0)
            return 0;

        return ans;
    }

    public static void main(String[] args) {
        Stock s = new Stock();
        int[] prices = {2,1,2,1,0,1,2};
        System.out.println(s.maxProfit(prices));
    }
    
}
