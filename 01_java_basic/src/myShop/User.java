package myShop;

// 클래스 인데 인스턴스 변수만 가지고 있는 클래스를 vo valueobject , DTO 
public class User {
	private String id;
	private String pw;
	private int money;

	public User(String id, String pw, int money) {
		super();
		this.id = id;
		this.pw = pw;
		this.money = money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}