package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("write.txt");
			pw = new PrintWriter(fw);
			pw.println("Hello World");
			pw.println("안녕하세요");
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			pw.close();
		}
		
	}

}
