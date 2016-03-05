package client_src;

public class RoboClient {
	/* CLASS INFORMATION */
	private static String IP = null;
	private static int PORT = 0;
	public static void main(String[] args){
		RoboClient client = new RoboClient();
		client.connect(IP, PORT);
	}
	/* INSTANCE INFORMATION */
	private Socket socket = null;
	private BufferedReader in = null;
	private DataOutputStream out = null;
	public void connect(String ip, int port){
		/* establish connection with server */
		socket = new Socket(ip, port);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new DataOutputStream(socket.getOutputStream());
		/* confirm connection */
		out.writeBytes("");
		out.writeUTF("");
	}
}