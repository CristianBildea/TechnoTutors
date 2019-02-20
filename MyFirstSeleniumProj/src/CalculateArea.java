
public class CalculateArea {
//Method Overloading which is an example of Static/Compile time polymorphins
	
	
	
	void area(int radius) {
		System.out.println("The Area of circle: ");
		int a = (22/7) * radius * radius;
		System.out.println(a);
	}
	
	void area (int len, int bre) {
		System.out.println("The area of rectangle: ");
		int a = len * bre;
		System.out.println(a);
	}
	void area(double side) {
		System.out.println("The area of square: ");
		double a = side * side;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		CalculateArea key = new CalculateArea();
		
		key.area (5);
		key.area (3,4);
		key.area(2.3);
	}
}
