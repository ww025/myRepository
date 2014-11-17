package git;

public class User {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public static void main(String[] args) {
		User user = new User();
		user.setUsername("ww");
		user.setPassword("i,ou");
		User user2 = new User();
		user2.setUsername("ww1");
		user2.setPassword("i,ou");
		System.out.println(user.toString());
		System.out.println(user2.toString());
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
}
