package assignments;

public class ConditionalStatements_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] transactions = { 50000, -2000, 3000, -15000, -200, -300, 4000, -3000};

		// Variables to store the count and amount of credits and debits
		int totCredits = 0;
		int totalDebits = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousTransactions = 0;

		// Iterate through each transaction in the array
		for (int amount: transactions) {
			if (amount > 0) {
				// It's a credit transaction
				totCredits++; // Increment the credit transaction count
				totalCreditAmount += amount; // Add to total credited amount

				// Check for suspiciously large credit transaction
				if (amount > 10000) {
					System.out.println("Suspicious credit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			} else {
				// It's a debit transaction
				totalDebits++; // Increment the debit transaction count
				totalDebitAmount -= amount; // Convert to positive and add to total debited amount

				// Check for suspiciously large debit transaction
				if (amount < -10000) {
					System.out.println("Suspicious debit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			}
		}

		// Final balance is the total credit minus total debit
		int finalBalance = totalCreditAmount - totalDebitAmount;

		// Print a summary of the account activity
		System.out.println("----- Transaction Summary -----");
		System.out.println("Total number of credit transactions: " + totCredits);
		System.out.println("Total number of debit transactions: " + totalDebits);
		System.out.println("Total amount credited: " + totalCreditAmount);
		System.out.println("Total amount debited: " + totalDebitAmount);
		System.out.println("Final remaining amount in the account: " + finalBalance);
		System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);
	}
}
