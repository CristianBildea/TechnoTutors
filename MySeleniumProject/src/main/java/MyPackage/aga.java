package MyPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class aga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\crist_000\\Desktop\\JAVASelenium core\\SeleniumClass.txt");
		try {
			FileInputStream input = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
