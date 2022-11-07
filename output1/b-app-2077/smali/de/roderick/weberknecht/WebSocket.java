public abstract class de.roderick.weberknecht.WebSocket {
	 /* .source "WebSocket.java" */
	 /* # virtual methods */
	 public abstract void close ( ) {
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lde/roderick/weberknecht/WebSocketException; */
		 /* } */
	 } // .end annotation
} // .end method
public abstract void connect ( ) {
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lde/roderick/weberknecht/WebSocketException; */
	 /* } */
} // .end annotation
} // .end method
public abstract de.roderick.weberknecht.WebSocketEventHandler getEventHandler ( ) {
} // .end method
public abstract Boolean isConnected ( ) {
} // .end method
public abstract void send ( java.lang.String p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
} // .end method
public abstract void send ( Object[] p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
} // .end method
public abstract void setEventHandler ( de.roderick.weberknecht.WebSocketEventHandler p0 ) {
} // .end method
