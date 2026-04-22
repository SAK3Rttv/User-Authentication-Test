package ch4_1;

public class UserAuthentication {
	public boolean authenticate(String username,String password) {
		if (username.equals("admin") && password.equals("password123")) {
			return true;
		} else {
			return false;
		}
	}
}
