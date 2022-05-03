package obj;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age; 	//transient 직렬화에서 제외시킨다. 나이는 저장이 안된다. 0으로 초기화 되서 바뀌지 않음
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
