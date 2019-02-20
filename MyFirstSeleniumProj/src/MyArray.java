
public class MyArray {

	public static void main(String[] args) {//args is arguments string[] is array
		String[] a = {"Sadaj", "Raj", "Chris", "Hilda", "Sushma"};// a is array
		String name = "Chris";
		for(int i = 0; i<a.length;i++) {
			String n = a[i];
			if(n.equals(name)) {
				System.out.println("The index of the name is: " + i);
			}
		}

	}

}
