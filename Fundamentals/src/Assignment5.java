//swap 4 number with temp
public class Assignment5 {
	
	public static void main(String[] arg) {
		
		int a = 10;
		int b = 20;
		int c= 30;
		int d = 40;
		
		
		//swap
		int temp = 0;
		
		temp = d;
		d = a;
		a = b;
		b = c;
		c = temp;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		
		
	}

}
