package Server;

public class LoginConnection extends Connection{
	
	final String USERNAME, PASSWORD;
	
	public LoginConnection(String username,String password){
		USERNAME = username;
		PASSWORD = password;
	}	
	public boolean login(){
		super.connect();
		String pulledPassword = client.get(USERNAME);
		super.close();
		return (pulledPassword.equals(PASSWORD));
		
	}
}
