package Server;

import redis.clients.jedis.Jedis;

public class Connection {
	final String IP = "raspberrypi.home";
	Jedis client;
	
	public Connection(){
		connect();
	}
	public void connect(){
		client = new Jedis(IP);
	}
	public void close(){
		client.quit();
	}
	//flesh out later
	public String testConection(String testVal){
		
		client.set(testVal, "This has been a successful test. Congrats!!!");
		return client.get(testVal);
	}
	
}
