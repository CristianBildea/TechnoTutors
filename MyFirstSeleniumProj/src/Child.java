
public class Child extends Parent{
	
	//Method ovveriding, Dynamic/Run time polymorphins
	
	void sum(int a, int b) {
		System.out.println("Sum method in Child Class");
		int c;
		c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Parent obj = new Child();
		obj.sum(5,  5);
		
	

	}

}
