package statePattern;

import java.io.IOException;
import java.nio.channels.SocketChannel;

public class CloseSocketState implements State{
	 SocketChannel socketChannel;
	
	 public CloseSocketState(SocketChannel socketChannel){
		 this.socketChannel=socketChannel;
	 }
	 
	 public SocketChannel processState(){
	 	try {
	 		socketChannel.close();
	 		System.out.println("Cerrando conexión");
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return socketChannel;
	 }
}