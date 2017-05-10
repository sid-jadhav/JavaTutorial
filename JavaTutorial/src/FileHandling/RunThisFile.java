package FileHandling;

import java.io.*;
import java.io.IOException;

public class RunThisFile {
	public static void main(String[] args){
		try{
			File f= new File("SidFile.txt");
			if(!f.exists()){
				f.createNewFile();
			}
			PrintWriter pw= new PrintWriter(f);
			pw.println("This Is first file sid created using file handling in java");
			pw.println("100/100 Marks");
			pw.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
