package assignments;

public class TradingShares {

	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : prices) {
			if (price < minPrice) {
				minPrice = price; // Update the minimum price
			} else if (price - minPrice > maxProfit) {
				maxProfit = price - minPrice; // Update the maximum profit
			}
		}

		return maxProfit;
	}

	// Main method to test the program
	public static void main(String[] args) {
		int[] prices1 = { 7, 1, 5, 3, 6, 4 };
		int[] prices2 = { 7, 6, 4, 3, 1 };

		System.out.println("Example 1:");
		System.out.println("Input: [7, 1, 5, 3, 6, 4]");
		System.out.println("Maximum Profit: " + maxProfit(prices1)); // Output: 5

		System.out.println("\nExample 2:");
		System.out.println("Input: [7, 6, 4, 3, 1]");
		System.out.println("Maximum Profit: " + maxProfit(prices2)); // Output: 0
	}
}