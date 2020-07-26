package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBuffered {

	public static void main(String[] args) {
		
		String [] lines = new String[] {"A man chooses","A slave obeys"};
		String path = "c:\\arquivo\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();				
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
