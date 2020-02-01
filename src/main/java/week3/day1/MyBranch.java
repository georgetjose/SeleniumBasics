package week3.day1;

public class MyBranch extends SBIHO 
{

	@Override
	public void documentRequiredForLoan() 
	{
		System.out.println("Different Manadatory Documents are required for Loan");
		
	}

	@Override
	public void aadharMandatory() {
		System.out.println("Aadhar is mandatory and should be linked with bank account");
		
	}

	@Override
	public void getCreditScore() {
		System.out.println("Credit is Score for the customer is 150");
		
	}
	
	@Override
	public void getSBIAuthorization() {
		System.out.println("SBI Authorization is provided!!!");
		
	}
	
	public static void main(String[] args) 
	{
		MyBranch myBank= new MyBranch();
		myBank.minBalance();
		myBank.maxTransactionLimit();
		myBank.documentRequiredForLoan();
		myBank.aadharMandatory();
		myBank.getSBIBranchCode();
		myBank.getCreditScore();
		myBank.getSBIAuthorization();
	}

}
