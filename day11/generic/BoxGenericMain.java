package generic;

import javax.swing.Box;

public class BoxGenericMain {

	public static void main(String[] args) {
		BoxGeneric<Apple> box1 = new BoxGeneric<Apple>();
		//<T> 타입에는 참조형 변수만 저장할 수 있다. ex)class, interface
		box1.setObj(new Apple());
		Apple a = box1.getObj();
		a.printApple();
		
		BoxGeneric<Orange> box2 = new BoxGeneric<Orange>();
		box2.setObj(new Orange());
		Orange o = box2.getObj();
		o.printOrange();
		
	}

}
