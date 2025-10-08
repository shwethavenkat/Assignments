package assignments;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		if(creditScore > 750) {
	    System.out.println("Loan is approved");
		}else if(creditScore >= 650 && creditScore < 750)
		{
			if(income >= 55000)
			{
				if(isEmployed)
				{
					if(debtToIncomeRatio < 40)
					{
						System.out.println("Loan is approved");
					}
					else {
						// If DTI is 40% or greater, deny the loan
						System.out.println("Loan Denied: Debt-to-Income ratio is too high.");
					}
				} else {
					// If the customer is unemployed, deny the loan
					System.out.println("Loan Denied: Customer is not employed.");
				}
			} else {
				// If income is less than $50,000, deny the loan
				System.out.println("Loan Denied: Income is less than required.");
			}
		} else {
			// If credit score is below 650, deny the loan
			System.out.println("Loan Denied: Credit score is too low.");
		}
				}
			
			
		}
	


