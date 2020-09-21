package day5;
import java.io.*;
public class ExceptionExample7 {
 public static void main(String[] args) throws IOException{
		/*
		 * FileInputStream fis = null; f
		 * is = new FileInputStream("input.txt"); 
		 * int k;
		 * while((k=fis.read())!=-1) { 
		 * System.out.println((char)k); 
		 * } 
		 * fis.close();
		 */
	 FileInputStream fis = null;
		try{
		    fis = new FileInputStream("B:/myfile.txt"); 
		}catch(FileNotFoundException fnfe){
	            System.out.println("The specified file is not " +
				"present at the given path");
		 }
		int k; 
		try{
		    while(( k = fis.read() ) != -1) 
		    { 
			System.out.print((char)k); 
		    } 
		    fis.close(); 
		}catch(IOException ioe){
		    System.out.println("I/O error occurred: "+ioe);
		 }
}
}
