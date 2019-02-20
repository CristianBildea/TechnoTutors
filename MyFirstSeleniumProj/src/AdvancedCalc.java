
public class AdvancedCalc extends Parent{
	
	void mod(int a, int b) {
		int m = a%b;  // % is for remender = rest
		System.out.println(m);
	}

	public static void main(String[] args) {
		AdvancedCalc obj = new AdvancedCalc();
		obj.sum(5,10);
		obj.sub(10,5);
		obj.mod(13,5);



	}

}
