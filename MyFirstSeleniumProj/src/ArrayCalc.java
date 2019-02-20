
public class ArrayCalc {

	public static void main(String[] args) {
		
		int[] array1 = {1,4,5,8};
		int[] array2 = {5,7,0,9};
		int[] array3 = new int [4];
		for(int i=0; i < array1.length; i++)
		{
			array3[i] = array1[i] + array2[i];
			
		}
		 for(int i =0; i < array3.length; i++)
			 System.out.println(array3[i]);
	}

}
