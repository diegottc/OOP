package statePattern;

import java.nio.channels.SocketChannel;

public class Main {
	public static void main(String args[]){
	 	try{
	 		System.out.println("inicio");
	 		State state;
	 		Context context = new Context();
	 		SocketChannel socketChannel = null;
	 		//-----------------------------\\
	 		//	 OPEN/LISTENING SOCKET	 \\
	 		//-----------------------------\\
	 		//First State:
	 		state = new ConnectSocketState(socketChannel);
	 		context.setState( state ); 
	 		socketChannel = context.request();
	 		//-----------------------------\\
	 		//		 CLOSE SOCKET 	 \\
	 		//-----------------------------\\
	 		//Second State:
	 		state = new CloseSocketState(socketChannel);
	 		context.setState( state ); 
	 		socketChannel = context.request();
	 	}catch( Exception e ) {
	 		e.printStackTrace();
	 	}
	 }
}