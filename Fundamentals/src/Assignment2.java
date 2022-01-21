
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);

		a = a + b; //30
		b = a - b; // 10
		a = a - b;
		
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);
	}

}
