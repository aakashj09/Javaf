/*
 * Mr S deposited 500000 amount for 5 years with a rate of interest 6.8%, 
 * now calculate interest amount and final amount?
 */
public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 500000;
		double r = 6.8;
		int t = 5;
		
		
		double InterestAmount = p*t*r/100;
		
		double finalAmount = p+InterestAmount;
		
		System.out.println("InterestAmount =" + InterestAmount);
		System.out.println("finalAmount =" + finalAmount);

	}

}
