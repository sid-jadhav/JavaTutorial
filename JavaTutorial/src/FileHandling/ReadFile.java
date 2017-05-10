package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br= null;
		try{
			br = new BufferedReader( new FileReader("SidFile.txt"));
			String pr;
			while((pr=br.readLine())!=null){
				System.out.println(pr);
			}
		}catch(IOException e){
			
		}finally{
			br.close();
		}

	}

}
