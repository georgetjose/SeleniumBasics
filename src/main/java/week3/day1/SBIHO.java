package week3.day1;

public abstract class SBIHO implements RBI, Cibil 
{
	public void minBalance()
	{
		System.out.println("The minimum balance is Rs.1000");
	}
	
	public void maxTransactionLimit()
	{
		System.out.println("The maximum Transaction Limit is Rs.250000");
	}
	
	public void getSBIBranchCode()
	{
		System.out.println("The Branch Code is SBI100");
	}
	
	public abstract void getSBIAuthorization();
	
	
}
