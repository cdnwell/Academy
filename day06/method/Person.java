package method;
/*
 * Person은 이름과 나이, 먹은 음식 내용을 가지고 있음
 * 생성자에서는 이름과 나이를 외부에서 받아서 초기화
 * 먹은 음식 내용은 빈문자열(""),아무내용이 없는 문자열;로 초기화
 */
public class Person {
	String name;
	int age;
	String food;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		food = "떡볶이";
	}
	
//	Person(String n,int a,String f){
//		name=n;
//		age=a;
//		food=f;
//	}
	
	/*
	 *  메서드(method) - 기능 작성
	 *  	리턴타입 메서드명([매개변수...]) {
	 *  [매개변수...] = 매개변수는 생략가능하다.
	 *  		실행할 코드;
	 *  		[return 결과값;]
	 *  }
	 *  
	 */
	
	/*
	 * 필드의 name과 age를 이용하여 Person에 정보를 출력
	 * 
	 * 이름 : OOO
	 * 나이 : 20
	 * 
	 */
	
	void info() {
		//printInfo, printPersonInfo로 메서드 명
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	
	/*
	 * 나이 값을 외부로 부터 받아서 field에 있는 age에 저장하는
	 * 메서드
	 * 단, 나이를 외부에서 받아서 저장할 때는
	 * 받아온 나이값이 0보다 큰 값만 저장
	 * 만약에 0이하의 값이 들어오면 저장을 못하게끔 처리
	 * 
	 */
	
	void inputAge(int a) {
		//setAge 데이터를 입력할 때는 보통 set부터 시작한다.
//		if(a<=0) {
//			System.out.println("num이 0이하의 값이라 저장이 안됩니다.");
//		}else {
//			age=a;
//		}
		if(a<1)
			return;		//메서드 종료하는 용도로도 쓰인다.
		// = return 이후는 실행되지 않는다.
		age=a;

	}
	
	/*
	 * 외부로부터 먹은 음식을 받아서
	 * food 문자열 끝에 붙여서 저장
	 * 
	 * 입력
	 * 기존값 "떡볶이"
	 * 받아온 값 "냉면"
	 * 
	 * 출력
	 * "떡볶이 냉면"
	 * 
	 */
	
	void setFood(String str) {
		food=food+" "+str;
		//food += " " = str;
		//과 같다.
	}
	
	String getFood() {
		return food;
	}

}
