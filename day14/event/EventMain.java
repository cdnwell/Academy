package event;

public class EventMain {

	public static void main(String[] args) {
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		
		btn1.onClick();	//이벤트 처리 X, 실행이 안됨
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				System.out.println(view.name + " 클릭 이벤트");
			}
		});
		btn1.onClick();
		btn2.setOnClickListener(new ClickEvent()); // btn1의 방식이 더 선호된다.
		//btn2는 절차가 많아서 덜 씀
		btn2.onClick();
		
	}

}

/*
 * 오늘 배운 것 중 중요
 * 1.객체 파일 입출력
 * 2.inner class
 * 3.익명클래스
 * 05.03
 * 세 가지만 잘 익혀두기, 기본적인 객체 만드는 법이랑
 */
