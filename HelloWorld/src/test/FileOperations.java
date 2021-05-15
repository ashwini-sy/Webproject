package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fileoutput;
		
		try 
		{
		fileoutput=new FileOutputStream("integer.txt");
		String msg="Welcome to Java!";
        byte byteArray[] = msg.getBytes(); 
        fileoutput.write(byteArray);
        System.out.println("Message written to file successfuly!");   
        
				
		}catch(FileNotFoundException e)
		{
			System.out.println("Filenot Found  Exception handled");
		}
		catch(IOException e)
		{
			System.out.println("I/O  Exception handled"); 
		}
		

	}

}
