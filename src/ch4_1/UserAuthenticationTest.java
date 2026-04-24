package ch4_1;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserAuthenticationTest {
	@SuppressWarnings("unused")
	private UserAuthentication auth;
	
	@BeforeClass
	public void setup() {
		auth = new UserAuthentication();
	}
	
	/**
	 * 
	 * @return list of dummy login data
	 */
	@DataProvider (name="loginData")
	public Object[][] provideLoginData() {
		// username, password, expectedResult
		return new Object[][] {
			{"admin","password123",true},
			{"admin","999",false},
			{"999","password123",false},
			{"Admin","password123",false},
			{"admin","Password123",false},
			{null,null,false},
			{"admin",null,false},
			{null,"password123",false},
			{"admin","",false},
			{"","password123",false},
			{"","",false}
		};
	}
	
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @param expectedResult
	 * Assert if actual result as expected Result
	 */
	@Test (dataProvider="loginData")
	public void loginTest(String username,String password, boolean expectedResult) {
		boolean actualResult = auth.authenticate(username, password);
		Assert.assertEquals(actualResult, expectedResult,"Verifictaion failed!");
	}
}
