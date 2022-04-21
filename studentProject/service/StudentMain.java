package service;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		StudentService st1=new StudentService();
		
		st1.registerStudent(sc);
//		st1.registerStudent(sc);
		
		st1.printAllStudentInfo();
		
	}
}
