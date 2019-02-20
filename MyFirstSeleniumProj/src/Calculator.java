
public class Calculator extends Parent{

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.sum(5,10);
        obj.sub(10,5);
		obj.mul(5,5);
		obj.div(10,3);
	}

	void mul(int a, int b) {
	int m = a*b;
	System.out.println(m);
	
	}
void div(int a, int b) {
	int m = a/b;
	System.out.println(m);
}
	}
	


