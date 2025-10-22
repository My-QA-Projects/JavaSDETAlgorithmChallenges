package arrays;

// =====================================================
// 2. BEST TIME TO BUY AND SELL STOCK
// =====================================================
// Find max profit from buying and selling stock once
// Time: O(n), Space: O(1)
import java.util.*;

class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int profit = maxProfit(prices);

        System.out.println("Best Time to Buy and Sell Stock");
        System.out.println("Prices: [7, 1, 5, 3, 6, 4]");
        System.out.println("Max Profit: " + profit);
        System.out.println("(Buy at 1, sell at 6)");
    }
}
