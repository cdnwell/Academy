package vopackage;

public class Student {
	private String studentNum;
	private String name;
	private String major;
	double avg;
	
	
	public Student(String studentNum, String name, String major, double avg) {
		super();
		this.studentNum = studentNum;
		this.name = name;
		this.major = major;
		this.avg = avg;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

//	@Override
//	public String toString() {
//		return "Student [studentNum=" + studentNum + ", name=" + name + ", major=" + major + ", avg=" + avg + "]";
//	}
	
	public void printStudentInfo() {
		System.out.println(studentNum+" "+name+" "+major+" "+avg);
		
	}
	
}
