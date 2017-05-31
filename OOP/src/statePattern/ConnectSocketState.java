package statePattern;

import java.io.IOException;
import java.net.*;
import java.nio.channels.SocketChannel;

public class ConnectSocketState implements State{
	SocketChannel socketChannel;
	
	public ConnectSocketState(SocketChannel socketChannel){
		this.socketChannel=socketChannel;
	}
	
	public SocketChannel processState(){
		try {
			int port = 21;
			InetAddress host = InetAddress.getByName("192.168.0.1");
			SocketAddress adress = new InetSocketAddress(host, port);
			socketChannel = SocketChannel.open(adress);
			socketChannel.configureBlocking(true);
			System.out.println("Abriendo conexión");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return socketChannel;
	}
}