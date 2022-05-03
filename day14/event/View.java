package event;

public class View {
	protected String name;
	private OnClickListener onClickListener;
	public View(String name) {
		this.name = name;
	}
	
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	public void onClick() {
		if(onClickListener != null)
			onClickListener.onClick(this);
	}
	//interface도 inner클래스를 만들 수 있다.
	
	public static interface OnClickListener{
		public void onClick(View view);
	}
	
}
