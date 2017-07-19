package socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class clientsocket {
	public static void main(String[] args) {
		try{
			//Connecting to server on port 8000
			Socket cSock = new Socket("127.0.0.1", 8000);
			BufferedReader serverInput = new BufferedReader(new InputStreamReader(cSock.getInputStream()));
			DataOutputStream serverOutput = new DataOutputStream(cSock.getOutputStream());  //connectionSock
			//Connection made, sending name.;
			serverOutput.writeBytes("Hello! I am a client...\n");
			//Waiting for reply.
			String serverData = serverInput.readLine();
			System.out.println("From Server: " + serverData);
			serverOutput.close();
			serverInput.close();
			cSock.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
