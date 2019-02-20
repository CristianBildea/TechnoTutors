package MyPackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingExampleCreateFile {

	public static void main(String[] args) {
		//File is a class
   File file = new File("C:\\Users\\crist_000\\Desktop\\JAVASelenium core\\SeleniumClass.txt");//SeleniumClass.txt is new file created
   try {
	   
   if (file.exists()) {
	   System.out.println("file exist");	   
   }else {
	   System.out.println("File does not exist");
   }
	   file.createNewFile();//creare de file nou
	    PrintWriter p = new PrintWriter(file);
	   p.write("Hi Cristian, Wake Up!!!!");
	   
	   p.close();
	     
   } catch (IOException e) {
	   System.out.println("File related exception");
   }
   
	}

}
