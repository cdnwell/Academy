package constructor;

public class Student {
	String studentNo;
	String name;
	String major;
	double score;
	
	Student(String no,String na,String ma,double sc){
		System.out.println("Student(String,String,String,double)생성자 호출");
		studentNo=no;
		name=na;
		major=ma;
		score=sc;
	}
}
