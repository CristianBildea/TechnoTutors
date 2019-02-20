import java.util.Scanner;

public class Chris_ReturnType {

	
		
		static int sum() { //static don't depend of the object
			int c= 5 +10;
			//System.out.println(c);
			return c;
		}
			public static void main(String[]args) {
			//Chris_ReturnType c = new Chris_ReturnType(); //object
			
			//int sum = c.sum();
			
			int sum = Chris_ReturnType.sum();
			int result = sum/2;
			System.out.println(result);
			
			//Taking Imputs from User
			
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			System.out.println("Value of i is: " + i);
			
		}
	}


