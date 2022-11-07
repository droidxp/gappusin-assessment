public class de.roderick.weberknecht.WebSocketReceiver extends java.lang.Thread {
	 /* .source "WebSocketReceiver.java" */
	 /* # instance fields */
	 private de.roderick.weberknecht.WebSocketEventHandler eventHandler;
	 private java.io.InputStream input;
	 private volatile Boolean stop;
	 private de.roderick.weberknecht.WebSocketConnection websocket;
	 /* # direct methods */
	 public de.roderick.weberknecht.WebSocketReceiver ( ) {
		 /* .locals 1 */
		 /* .param p1, "input" # Ljava/io/InputStream; */
		 /* .param p2, "websocket" # Lde/roderick/weberknecht/WebSocketConnection; */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 37 */
		 /* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
		 /* .line 31 */
		 this.input = v0;
		 /* .line 32 */
		 this.websocket = v0;
		 /* .line 33 */
		 this.eventHandler = v0;
		 /* .line 35 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lde/roderick/weberknecht/WebSocketReceiver;->stop:Z */
		 /* .line 39 */
		 this.input = p1;
		 /* .line 40 */
		 this.websocket = p2;
		 /* .line 41 */
		 (( de.roderick.weberknecht.WebSocketConnection ) p2 ).getEventHandler ( ); // invoke-virtual {p2}, Lde/roderick/weberknecht/WebSocketConnection;->getEventHandler()Lde/roderick/weberknecht/WebSocketEventHandler;
		 this.eventHandler = v0;
		 /* .line 42 */
		 return;
	 } // .end method
	 private void handleError ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 90 */
		 (( de.roderick.weberknecht.WebSocketReceiver ) p0 ).stopit ( ); // invoke-virtual {p0}, Lde/roderick/weberknecht/WebSocketReceiver;->stopit()V
		 /* .line 91 */
		 v0 = this.websocket;
		 (( de.roderick.weberknecht.WebSocketConnection ) v0 ).handleReceiverError ( ); // invoke-virtual {v0}, Lde/roderick/weberknecht/WebSocketConnection;->handleReceiverError()V
		 /* .line 92 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean isRunning ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 84 */
		 /* iget-boolean v0, p0, Lde/roderick/weberknecht/WebSocketReceiver;->stop:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
	 } // :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
public void run ( ) {
	 /* .locals 7 */
	 /* .prologue */
	 /* .line 46 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 47 */
	 /* .local v1, "frameStart":Z */
	 /* new-instance v4, Ljava/util/ArrayList; */
	 /* invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V */
	 /* .line 49 */
	 /* .local v4, "messageBytes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Byte;>;" */
} // :cond_0
} // :goto_0
/* iget-boolean v5, p0, Lde/roderick/weberknecht/WebSocketReceiver;->stop:Z */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 73 */
return;
/* .line 51 */
} // :cond_1
try { // :try_start_0
v5 = this.input;
v0 = (( java.io.InputStream ) v5 ).read ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->read()I
/* .line 52 */
/* .local v0, "b":I */
/* if-nez v0, :cond_2 */
/* .line 53 */
int v1 = 1; // const/4 v1, 0x1
/* .line 54 */
/* .line 55 */
} // :cond_2
/* const/16 v5, 0xff */
/* if-ne v0, v5, :cond_3 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 56 */
int v1 = 0; // const/4 v1, 0x0
v5 = /* .line 57 */
/* new-array v5, v5, [Ljava/lang/Byte; */
/* check-cast v3, [Ljava/lang/Byte; */
/* .line 58 */
/* .local v3, "message":[Ljava/lang/Byte; */
v5 = this.eventHandler;
/* new-instance v6, Lde/roderick/weberknecht/WebSocketMessage; */
/* invoke-direct {v6, v3}, Lde/roderick/weberknecht/WebSocketMessage;-><init>([Ljava/lang/Byte;)V */
/* .line 59 */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 68 */
} // .end local v0 # "b":I
} // .end local v3 # "message":[Ljava/lang/Byte;
/* :catch_0 */
/* move-exception v2 */
/* .line 69 */
/* .local v2, "ioe":Ljava/io/IOException; */
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
/* .line 70 */
/* invoke-direct {p0}, Lde/roderick/weberknecht/WebSocketReceiver;->handleError()V */
/* .line 61 */
} // .end local v2 # "ioe":Ljava/io/IOException;
/* .restart local v0 # "b":I */
} // :cond_3
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 62 */
/* int-to-byte v5, v0 */
try { // :try_start_1
java.lang.Byte .valueOf ( v5 );
/* .line 64 */
} // :cond_4
int v5 = -1; // const/4 v5, -0x1
/* if-ne v0, v5, :cond_0 */
/* .line 65 */
/* invoke-direct {p0}, Lde/roderick/weberknecht/WebSocketReceiver;->handleError()V */
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
public void stopit ( ) {
/* .locals 1 */
/* .prologue */
/* .line 78 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lde/roderick/weberknecht/WebSocketReceiver;->stop:Z */
/* .line 79 */
return;
} // .end method
