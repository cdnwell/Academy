package generic;

public class BoxGeneric<T> {
	// new BoxGeneric할 때 타입 결정
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
