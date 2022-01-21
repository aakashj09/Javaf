/*
 * Hima basic salary is 85000, company provide ta, da, hra. now calculate
 * her gross income and net amount  include pf, tax
 * 
 * ta 15%
 * da 20%
 * hra 18% of base salary
 * pf 	20%
 * tax 25% of base salary
 */
public class Assignment11 {
	
	public static void grossAmount() {
		int salary = 85000;
		double ta = 0.15 * salary;
		double da = 0.20 * salary;
		double hra = 0.18 * salary;
		double pf = 0.20 * salary;
		double tax = 0.25 * salary;
		
		double grossAmount = salary + ta +da+hra;
		System.out.println("grossAmount = " + grossAmount);
		
		double netAmount = grossAmount + (pf - tax);
		System.out.println("netAmount = " + netAmount);
		
		
		
	}

	public static void main(String[] args) {

		grossAmount();
		
				
	}

}
