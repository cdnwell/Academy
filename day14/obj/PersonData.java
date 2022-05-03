package obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonData {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		FileOutputStream fos =null;
		ObjectOutputStream oos =null;
		
 		ArrayList <Person> list = new ArrayList<Person>();
		try {
			fos = new FileOutputStream("person.dat");
			oos = new ObjectOutputStream(fos);
			
			String name;
			int age;
			for(int i=0;i<5;i++) {
				System.out.print("이름 : ");
				name =sc.nextLine();
				System.out.print("나이 : ");
				age = sc.nextInt();
				sc.nextLine();
				
				list.add(new Person(name,age));
			}

			for(int i=0;i<5;i++) {
				oos.writeObject(list.get(i));
				oos.flush();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(oos != null) oos.close();
				if(fos != null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
				
	}

}
