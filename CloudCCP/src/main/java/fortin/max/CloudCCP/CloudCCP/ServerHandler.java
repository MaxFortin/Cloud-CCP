package fortin.max.CloudCCP.CloudCCP;

import java.io.IOException;

import Window.Window;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import redis.clients.jedis.Jedis;

public class ServerHandler {
	final String IP = "raspberrypi.home";

	Jedis client;
	boolean connected = false;

	
public void connect() throws IOException{
		client = new Jedis(IP);
		connected = true;
	}
public void disconnect(){
		client.quit();
	}
//flesh out later, use currently to test redis server
public void testServerConnection(String key,String data){
		client.set(key, data);
		System.out.println("Submitted Data: " + data + " under " + key );
	}
public boolean alreadyExsits(String key){
		if(client.get(key) != null)
			return true;
		return false;
	}
}