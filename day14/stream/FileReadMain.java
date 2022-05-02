package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		FileReader readFile = null;
		BufferedReader br = null;
		try {
			readFile = new FileReader("gisa.txt");
			br = new BufferedReader(readFile);
			String str = null;
			while(true) {
				str = br.readLine();
				if(str == null)
					break;
				System.out.println(str);
						
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
