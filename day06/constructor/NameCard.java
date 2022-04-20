package constructor;

public class NameCard {
	//이름
	String name;
	//회사명
	String company;
	//연락처
	String phone;
	//이메일
	String email;
	//직급
	String position;
	//주소
	String address;
	//field라고 부른다
	
	public NameCard() { }
	public NameCard(String name, String company, String phone) {
		super();
		this.name = name;
		this.company = company;
		this.phone = phone;
	}

	public NameCard(String name, String company, String phone, String email, String position, String address) {
		super();
		this.name = name;
		this.company = company;
		this.phone = phone;
		this.email = email;
		this.position = position;
		this.address = address;
	}
	
}
