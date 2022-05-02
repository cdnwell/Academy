package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 파일명을 사용자로부터 입력 받아서 파일을 생성을 한 후
 * 사용자로 부터 문자열을 입력 받아서 입력 받은 내용을
 * 생성한 파일에 출력.
 * 단, exit라는 단어를 입력하면 사용자로부터 입력을 종료
 * 오픈한 파일 역시 close 작업을 수행
 * 
 */

public class NotePad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		PrintWriter pw = null;
		
		String str =sc.nextLine();
		str += ".txt";
		try {
			fw = new FileWriter(str);
			pw = new PrintWriter(fw);
			
			String []strNo = new String [100];
			int index = 0;
			while(true) {
				strNo[index] = sc.nextLine();
				if(strNo[index].equals("exit")) {
					break;
				}
				index++;
			}
			
			for(int i=0;i<index;i++) {
				pw.println(strNo[i]);
			}
			pw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pw != null) pw.close();
				if(fw != null) fw.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
