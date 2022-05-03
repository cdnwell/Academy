package inner;

import inner.OutterClass.InnerClass;
import inner.OutterStaticClass.InnerStaticClass;

public class OutterMain {

	public static void main(String[] args) {
		
		OutterClass outter = new OutterClass(100);
		InnerClass  inClass = outter.new InnerClass(20);
		System.out.println(inClass.sum());
		inClass = outter.new InnerClass(40);
		System.out.println(inClass.sum());
		
		//public으로 썼기 때문에 접근 가능
		
		OutterStaticClass out = new OutterStaticClass(100);
		OutterStaticClass.InnerStaticClass in = new InnerStaticClass(5);
		//import를 하거나 outterstaticclasss. 으로 이너클래스에 접근하면 생성 가능해진다.
		System.out.println(in.sum());
		
	}

}
