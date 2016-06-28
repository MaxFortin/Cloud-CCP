package Server;

public class LoginConnection extends Connection{
		
	public boolean login(String USERNAME,String PASSWORD){
		super.connect();
		String pulledPassword = client.get(USERNAME);
		super.close();
		return (pulledPassword.equals(PASSWORD));
		
	}
}
