package obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class PersonReadMain {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		ArrayList<Person> list = new ArrayList<Person>();
		try {
			fis = new FileInputStream("person.dat");
			ois = new ObjectInputStream(fis);
			
//			list=PersonWriteMain.getList();
//			
//			for(int i=0;i<list.size();i++) {
//				ois.readObject(list.get(i));
//			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
