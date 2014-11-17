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
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	public static void main(String[] args) {
		User user1 = new User();
		user1.setUsername("ww1");
		user1.setPassword("i,ou1");
		User user2 = new User();
		user2.setUsername("ww2");
		user2.setPassword("i,ou2");
		User user3 = new User();
		user3.setUsername("ww3");
		user3.setPassword("i,ou3");
		//System.out.println(user1.toString());
		System.out.println(user2.toString());
		System.out.println(user3.toString());
	}


}
