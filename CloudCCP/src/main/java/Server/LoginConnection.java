package Server;

import redis.clients.jedis.Jedis;

public class LoginConnection implements Connection{

	private static final String IP = "raspberrypi.home";
	private static final int LOGIN_DATABASE = 0;
	
	private Jedis client;

	public LoginConnection(){
		connect();
	}
	public void connect() {
		client = new Jedis(IP);
	}

	@Override
	public void disconnect() {
		client.quit();
		client.close();
	}

	public boolean login(String username, String password) {
		client.select(LOGIN_DATABASE);
		if(client.get(username).equals(password))
			return true;
		return false;
			
	}
	

}
