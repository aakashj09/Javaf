// Swap three number with temp variable
public class Assignment3 {

	public static void main(String[] args) {
		
		int a = 10;  //30
		int b = 20;  //10
		int c = 30;  //20
		
	
		
		// Swap 
		
		int temp = 0;
		
		temp = c; // temp = 30
		c = b ;   // b=10
		b = a ; // a = 30
		a = temp;
		
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
