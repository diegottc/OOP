package statePattern;

import java.nio.channels.SocketChannel;

public interface State{
	SocketChannel processState();
}