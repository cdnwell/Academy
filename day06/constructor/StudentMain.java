package constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student("00123477","홍길동","프로그래밍학과",3.0);
		System.out.println(s1.studentNo);
		System.out.println(s1.name);
		System.out.println(s1.major);
		System.out.println(s1.score);
		
	}

}
