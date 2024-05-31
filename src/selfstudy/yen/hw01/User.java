package selfstudy.yen.hw01;

public class User {
	private String name;
	private String id;
	private String pw;
	private int balance;	//잔액
	private int account;	//계좌번호
	
	public User() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public User(String name, String id, String pw, int balance, int account) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.balance = balance;
		this.account = account;
	}
}
