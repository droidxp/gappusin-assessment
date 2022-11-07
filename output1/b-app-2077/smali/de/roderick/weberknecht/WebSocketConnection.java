public class de.roderick.weberknecht.WebSocketConnection implements de.roderick.weberknecht.WebSocket {
	 /* .source "WebSocketConnection.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private volatile Boolean connected;
	 private de.roderick.weberknecht.WebSocketEventHandler eventHandler;
	 private de.roderick.weberknecht.WebSocketHandshake handshake;
	 private java.io.InputStream input;
	 private java.io.PrintStream output;
	 private java.io.OutputStream outputBin;
	 private de.roderick.weberknecht.WebSocketReceiver receiver;
	 private java.net.Socket socket;
	 private java.net.URI url;
	 /* # direct methods */
	 public de.roderick.weberknecht.WebSocketConnection ( ) {
		 /* .locals 1 */
		 /* .param p1, "url" # Ljava/net/URI; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lde/roderick/weberknecht/WebSocketException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 58 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0}, Lde/roderick/weberknecht/WebSocketConnection;-><init>(Ljava/net/URI;Ljava/lang/String;)V */
	 /* .line 59 */
	 return;
} // .end method
public de.roderick.weberknecht.WebSocketConnection ( ) {
	 /* .locals 2 */
	 /* .param p1, "url" # Ljava/net/URI; */
	 /* .param p2, "protocol" # Ljava/lang/String; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lde/roderick/weberknecht/WebSocketException; */
	 /* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 61 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 44 */
this.url = v1;
/* .line 45 */
this.eventHandler = v1;
/* .line 47 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lde/roderick/weberknecht/WebSocketConnection;->connected:Z */
/* .line 49 */
this.socket = v1;
/* .line 50 */
this.input = v1;
/* .line 51 */
this.output = v1;
/* .line 52 */
this.outputBin = v1;
/* .line 54 */
this.receiver = v1;
/* .line 55 */
this.handshake = v1;
/* .line 63 */
this.url = p1;
/* .line 64 */
/* new-instance v0, Lde/roderick/weberknecht/WebSocketHandshake; */
/* invoke-direct {v0, p1, p2}, Lde/roderick/weberknecht/WebSocketHandshake;-><init>(Ljava/net/URI;Ljava/lang/String;)V */
this.handshake = v0;
/* .line 65 */
return;
} // .end method
private void closeStreams ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 304 */
final String v1 = "ClosedStreams"; // const-string v1, "ClosedStreams"
final String v2 = "closeStreams"; // const-string v2, "closeStreams"
android.util.Log .d ( v1,v2 );
/* .line 307 */
try { // :try_start_0
v1 = this.input;
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* .line 308 */
v1 = this.output;
(( java.io.PrintStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/PrintStream;->close()V
/* .line 309 */
v1 = this.socket;
(( java.net.Socket ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/net/Socket;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 315 */
return;
/* .line 310 */
/* :catch_0 */
/* move-exception v0 */
/* .line 311 */
/* .local v0, "ioe":Ljava/io/IOException; */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* .line 312 */
/* new-instance v1, Lde/roderick/weberknecht/WebSocketException; */
/* .line 313 */
final String v2 = "error while closing websocket connection: "; // const-string v2, "error while closing websocket connection: "
/* .line 312 */
/* invoke-direct {v1, v2, v0}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
private java.net.Socket createSocket ( ) {
/* .locals 11 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
/* .prologue */
int v9 = -1; // const/4 v9, -0x1
/* .line 259 */
v8 = this.url;
(( java.net.URI ) v8 ).getScheme ( ); // invoke-virtual {v8}, Ljava/net/URI;->getScheme()Ljava/lang/String;
/* .line 260 */
/* .local v4, "scheme":Ljava/lang/String; */
v8 = this.url;
(( java.net.URI ) v8 ).getHost ( ); // invoke-virtual {v8}, Ljava/net/URI;->getHost()Ljava/lang/String;
/* .line 261 */
/* .local v1, "host":Ljava/lang/String; */
v8 = this.url;
v3 = (( java.net.URI ) v8 ).getPort ( ); // invoke-virtual {v8}, Ljava/net/URI;->getPort()I
/* .line 263 */
/* .local v3, "port":I */
int v5 = 0; // const/4 v5, 0x0
/* .line 265 */
/* .local v5, "socket":Ljava/net/Socket; */
if ( v4 != null) { // if-eqz v4, :cond_1
final String v8 = "ws"; // const-string v8, "ws"
v8 = (( java.lang.String ) v4 ).equals ( v8 ); // invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_1
	 /* .line 266 */
	 /* if-ne v3, v9, :cond_0 */
	 /* .line 267 */
	 /* const/16 v3, 0x50 */
	 /* .line 270 */
} // :cond_0
try { // :try_start_0
	 /* new-instance v6, Ljava/net/Socket; */
	 /* invoke-direct {v6, v1, v3}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V */
	 /* :try_end_0 */
	 /* .catch Ljava/net/UnknownHostException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .line 271 */
} // .end local v5 # "socket":Ljava/net/Socket;
/* .local v6, "socket":Ljava/net/Socket; */
int v8 = 1; // const/4 v8, 0x1
try { // :try_start_1
	 (( java.net.Socket ) v6 ).setKeepAlive ( v8 ); // invoke-virtual {v6, v8}, Ljava/net/Socket;->setKeepAlive(Z)V
	 /* .line 272 */
	 int v8 = 0; // const/4 v8, 0x0
	 (( java.net.Socket ) v6 ).setSoTimeout ( v8 ); // invoke-virtual {v6, v8}, Ljava/net/Socket;->setSoTimeout(I)V
	 /* :try_end_1 */
	 /* .catch Ljava/net/UnknownHostException; {:try_start_1 ..:try_end_1} :catch_5 */
	 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_4 */
	 /* move-object v5, v6 */
	 /* .line 300 */
} // .end local v6 # "socket":Ljava/net/Socket;
/* .restart local v5 # "socket":Ljava/net/Socket; */
} // :goto_0
/* .line 273 */
/* :catch_0 */
/* move-exception v7 */
/* .line 274 */
/* .local v7, "uhe":Ljava/net/UnknownHostException; */
} // :goto_1
(( java.net.UnknownHostException ) v7 ).printStackTrace ( ); // invoke-virtual {v7}, Ljava/net/UnknownHostException;->printStackTrace()V
/* .line 275 */
/* new-instance v8, Lde/roderick/weberknecht/WebSocketException; */
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "unknown host: "; // const-string v10, "unknown host: "
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v9 ).append ( v1 ); // invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v8, v9, v7}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v8 */
/* .line 276 */
} // .end local v7 # "uhe":Ljava/net/UnknownHostException;
/* :catch_1 */
/* move-exception v2 */
/* .line 277 */
/* .local v2, "ioe":Ljava/io/IOException; */
} // :goto_2
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
/* .line 278 */
/* new-instance v8, Lde/roderick/weberknecht/WebSocketException; */
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "error while creating socket to "; // const-string v10, "error while creating socket to "
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 279 */
v10 = this.url;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 278 */
/* invoke-direct {v8, v9, v2}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v8 */
/* .line 281 */
} // .end local v2 # "ioe":Ljava/io/IOException;
} // :cond_1
if ( v4 != null) { // if-eqz v4, :cond_3
final String v8 = "wss"; // const-string v8, "wss"
v8 = (( java.lang.String ) v4 ).equals ( v8 ); // invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_3
/* .line 282 */
/* if-ne v3, v9, :cond_2 */
/* .line 283 */
/* const/16 v3, 0x1bb */
/* .line 286 */
} // :cond_2
try { // :try_start_2
javax.net.ssl.SSLSocketFactory .getDefault ( );
/* .line 287 */
/* .local v0, "factory":Ljavax/net/SocketFactory; */
(( javax.net.SocketFactory ) v0 ).createSocket ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;
/* :try_end_2 */
/* .catch Ljava/net/UnknownHostException; {:try_start_2 ..:try_end_2} :catch_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_3 */
/* .line 288 */
} // .end local v0 # "factory":Ljavax/net/SocketFactory;
/* :catch_2 */
/* move-exception v7 */
/* .line 289 */
/* .restart local v7 # "uhe":Ljava/net/UnknownHostException; */
(( java.net.UnknownHostException ) v7 ).printStackTrace ( ); // invoke-virtual {v7}, Ljava/net/UnknownHostException;->printStackTrace()V
/* .line 290 */
/* new-instance v8, Lde/roderick/weberknecht/WebSocketException; */
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "unknown host: "; // const-string v10, "unknown host: "
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v9 ).append ( v1 ); // invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v8, v9, v7}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v8 */
/* .line 291 */
} // .end local v7 # "uhe":Ljava/net/UnknownHostException;
/* :catch_3 */
/* move-exception v2 */
/* .line 292 */
/* .restart local v2 # "ioe":Ljava/io/IOException; */
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
/* .line 293 */
/* new-instance v8, Lde/roderick/weberknecht/WebSocketException; */
/* .line 294 */
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "error while creating secure socket to "; // const-string v10, "error while creating secure socket to "
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v10 = this.url;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 293 */
/* invoke-direct {v8, v9, v2}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v8 */
/* .line 297 */
} // .end local v2 # "ioe":Ljava/io/IOException;
} // :cond_3
/* new-instance v8, Lde/roderick/weberknecht/WebSocketException; */
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "unsupported protocol: "; // const-string v10, "unsupported protocol: "
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v9 ).append ( v4 ); // invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v8, v9}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v8 */
/* .line 276 */
} // .end local v5 # "socket":Ljava/net/Socket;
/* .restart local v6 # "socket":Ljava/net/Socket; */
/* :catch_4 */
/* move-exception v2 */
/* move-object v5, v6 */
} // .end local v6 # "socket":Ljava/net/Socket;
/* .restart local v5 # "socket":Ljava/net/Socket; */
/* .line 273 */
} // .end local v5 # "socket":Ljava/net/Socket;
/* .restart local v6 # "socket":Ljava/net/Socket; */
/* :catch_5 */
/* move-exception v7 */
/* move-object v5, v6 */
} // .end local v6 # "socket":Ljava/net/Socket;
/* .restart local v5 # "socket":Ljava/net/Socket; */
/* goto/16 :goto_1 */
} // .end method
private synchronized void sendCloseHandshake ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 246 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget-boolean v0, p0, Lde/roderick/weberknecht/WebSocketConnection;->connected:Z */
/* if-nez v0, :cond_0 */
/* .line 247 */
/* new-instance v0, Lde/roderick/weberknecht/WebSocketException; */
/* .line 248 */
final String v1 = "error while sending close handshake: not connected"; // const-string v1, "error while sending close handshake: not connected"
/* .line 247 */
/* invoke-direct {v0, v1}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 246 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* .line 251 */
} // :cond_0
try { // :try_start_1
v0 = this.output;
/* const/16 v1, 0xff */
(( java.io.PrintStream ) v0 ).write ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->write(I)V
/* .line 252 */
v0 = this.output;
int v1 = 0; // const/4 v1, 0x0
(( java.io.PrintStream ) v0 ).write ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->write(I)V
/* .line 253 */
v0 = this.output;
(( java.io.PrintStream ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/PrintStream;->flush()V
/* .line 255 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lde/roderick/weberknecht/WebSocketConnection;->connected:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 256 */
/* monitor-exit p0 */
return;
} // .end method
/* # virtual methods */
public synchronized void close ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 228 */
/* monitor-enter p0 */
try { // :try_start_0
final String v0 = "Close"; // const-string v0, "Close"
final String v1 = "WebSocket try close!"; // const-string v1, "WebSocket try close!"
android.util.Log .d ( v0,v1 );
/* .line 230 */
/* iget-boolean v0, p0, Lde/roderick/weberknecht/WebSocketConnection;->connected:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
/* .line 243 */
} // :goto_0
/* monitor-exit p0 */
return;
/* .line 234 */
} // :cond_0
try { // :try_start_1
/* invoke-direct {p0}, Lde/roderick/weberknecht/WebSocketConnection;->sendCloseHandshake()V */
/* .line 236 */
v0 = this.receiver;
v0 = (( de.roderick.weberknecht.WebSocketReceiver ) v0 ).isRunning ( ); // invoke-virtual {v0}, Lde/roderick/weberknecht/WebSocketReceiver;->isRunning()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 237 */
v0 = this.receiver;
(( de.roderick.weberknecht.WebSocketReceiver ) v0 ).stopit ( ); // invoke-virtual {v0}, Lde/roderick/weberknecht/WebSocketReceiver;->stopit()V
/* .line 240 */
} // :cond_1
/* invoke-direct {p0}, Lde/roderick/weberknecht/WebSocketConnection;->closeStreams()V */
/* .line 242 */
v0 = this.eventHandler;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 228 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void connect ( ) {
/* .locals 17 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 77 */
try { // :try_start_0
/* move-object/from16 v0, p0 */
/* iget-boolean v14, v0, Lde/roderick/weberknecht/WebSocketConnection;->connected:Z */
if ( v14 != null) { // if-eqz v14, :cond_0
/* .line 78 */
/* new-instance v14, Lde/roderick/weberknecht/WebSocketException; */
final String v15 = "already connected"; // const-string v15, "already connected"
/* invoke-direct {v14, v15}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v14 */
/* :try_end_0 */
/* .catch Lde/roderick/weberknecht/WebSocketException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 140 */
/* :catch_0 */
/* move-exception v13 */
/* .line 141 */
/* .local v13, "wse":Lde/roderick/weberknecht/WebSocketException; */
(( de.roderick.weberknecht.WebSocketException ) v13 ).printStackTrace ( ); // invoke-virtual {v13}, Lde/roderick/weberknecht/WebSocketException;->printStackTrace()V
/* .line 142 */
/* throw v13 */
/* .line 81 */
} // .end local v13 # "wse":Lde/roderick/weberknecht/WebSocketException;
} // :cond_0
try { // :try_start_1
/* invoke-direct/range {p0 ..p0}, Lde/roderick/weberknecht/WebSocketConnection;->createSocket()Ljava/net/Socket; */
/* move-object/from16 v0, p0 */
this.socket = v14;
/* .line 82 */
/* move-object/from16 v0, p0 */
v14 = this.socket;
(( java.net.Socket ) v14 ).getInputStream ( ); // invoke-virtual {v14}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;
/* move-object/from16 v0, p0 */
this.input = v14;
/* .line 83 */
/* new-instance v14, Ljava/io/PrintStream; */
/* move-object/from16 v0, p0 */
v15 = this.socket;
(( java.net.Socket ) v15 ).getOutputStream ( ); // invoke-virtual {v15}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
/* invoke-direct {v14, v15}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V */
/* move-object/from16 v0, p0 */
this.output = v14;
/* .line 85 */
/* new-instance v14, Ljava/io/DataOutputStream; */
/* move-object/from16 v0, p0 */
v15 = this.socket;
(( java.net.Socket ) v15 ).getOutputStream ( ); // invoke-virtual {v15}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
/* invoke-direct {v14, v15}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* move-object/from16 v0, p0 */
this.outputBin = v14;
/* .line 87 */
/* move-object/from16 v0, p0 */
v14 = this.output;
/* move-object/from16 v0, p0 */
v15 = this.handshake;
(( de.roderick.weberknecht.WebSocketHandshake ) v15 ).getHandshake ( ); // invoke-virtual {v15}, Lde/roderick/weberknecht/WebSocketHandshake;->getHandshake()[B
(( java.io.PrintStream ) v14 ).write ( v15 ); // invoke-virtual {v14, v15}, Ljava/io/PrintStream;->write([B)V
/* .line 89 */
int v3 = 0; // const/4 v3, 0x0
/* .line 90 */
/* .local v3, "handshakeComplete":Z */
int v5 = 1; // const/4 v5, 0x1
/* .line 91 */
/* .local v5, "header":Z */
/* const/16 v9, 0x400 */
/* .line 92 */
/* .local v9, "len":I */
/* new-array v2, v9, [B */
/* .line 94 */
/* .local v2, "buffer":[B */
int v11 = 0; // const/4 v11, 0x0
/* .line 95 */
/* .local v11, "pos":I */
/* new-instance v4, Ljava/util/ArrayList; */
/* invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V */
/* .line 97 */
/* .local v4, "handshakeLines":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;" */
/* const/16 v14, 0x10 */
/* new-array v12, v14, [B */
/* .line 99 */
/* .local v12, "serverResponse":[B */
} // :cond_1
} // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 124 */
/* move-object/from16 v0, p0 */
v15 = this.handshake;
int v14 = 0; // const/4 v14, 0x0
(( java.util.ArrayList ) v4 ).get ( v14 ); // invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v14, Ljava/lang/String; */
(( de.roderick.weberknecht.WebSocketHandshake ) v15 ).verifyServerStatusLine ( v14 ); // invoke-virtual {v15, v14}, Lde/roderick/weberknecht/WebSocketHandshake;->verifyServerStatusLine(Ljava/lang/String;)V
/* .line 125 */
/* move-object/from16 v0, p0 */
v14 = this.handshake;
(( de.roderick.weberknecht.WebSocketHandshake ) v14 ).verifyServerResponse ( v12 ); // invoke-virtual {v14, v12}, Lde/roderick/weberknecht/WebSocketHandshake;->verifyServerResponse([B)V
/* .line 127 */
int v14 = 0; // const/4 v14, 0x0
(( java.util.ArrayList ) v4 ).remove ( v14 ); // invoke-virtual {v4, v14}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* .line 129 */
/* new-instance v6, Ljava/util/HashMap; */
/* invoke-direct {v6}, Ljava/util/HashMap;-><init>()V */
/* .line 130 */
/* .local v6, "headers":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;" */
(( java.util.ArrayList ) v4 ).iterator ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v15 = } // :goto_1
/* if-nez v15, :cond_5 */
/* .line 134 */
/* move-object/from16 v0, p0 */
v14 = this.handshake;
(( de.roderick.weberknecht.WebSocketHandshake ) v14 ).verifyServerHandshakeHeaders ( v6 ); // invoke-virtual {v14, v6}, Lde/roderick/weberknecht/WebSocketHandshake;->verifyServerHandshakeHeaders(Ljava/util/HashMap;)V
/* .line 136 */
/* new-instance v14, Lde/roderick/weberknecht/WebSocketReceiver; */
/* move-object/from16 v0, p0 */
v15 = this.input;
/* move-object/from16 v0, p0 */
/* invoke-direct {v14, v15, v0}, Lde/roderick/weberknecht/WebSocketReceiver;-><init>(Ljava/io/InputStream;Lde/roderick/weberknecht/WebSocketConnection;)V */
/* move-object/from16 v0, p0 */
this.receiver = v14;
/* .line 137 */
/* move-object/from16 v0, p0 */
v14 = this.receiver;
(( de.roderick.weberknecht.WebSocketReceiver ) v14 ).start ( ); // invoke-virtual {v14}, Lde/roderick/weberknecht/WebSocketReceiver;->start()V
/* .line 138 */
int v14 = 1; // const/4 v14, 0x1
/* move-object/from16 v0, p0 */
/* iput-boolean v14, v0, Lde/roderick/weberknecht/WebSocketConnection;->connected:Z */
/* .line 139 */
/* move-object/from16 v0, p0 */
v14 = this.eventHandler;
/* .line 147 */
return;
/* .line 100 */
} // .end local v6 # "headers":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
} // :cond_2
/* move-object/from16 v0, p0 */
v14 = this.input;
v1 = (( java.io.InputStream ) v14 ).read ( ); // invoke-virtual {v14}, Ljava/io/InputStream;->read()I
/* .line 101 */
/* .local v1, "b":I */
/* int-to-byte v14, v1 */
/* aput-byte v14, v2, v11 */
/* .line 102 */
/* add-int/lit8 v11, v11, 0x1 */
/* .line 104 */
/* if-nez v5, :cond_3 */
/* .line 105 */
/* add-int/lit8 v14, v11, -0x1 */
/* int-to-byte v15, v1 */
/* aput-byte v15, v12, v14 */
/* .line 106 */
/* const/16 v14, 0x10 */
/* if-ne v11, v14, :cond_1 */
/* .line 107 */
int v3 = 1; // const/4 v3, 0x1
/* .line 109 */
} // :cond_3
/* add-int/lit8 v14, v11, -0x1 */
/* aget-byte v14, v2, v14 */
/* const/16 v15, 0xa */
/* if-ne v14, v15, :cond_1 */
/* add-int/lit8 v14, v11, -0x2 */
/* aget-byte v14, v2, v14 */
/* const/16 v15, 0xd */
/* if-ne v14, v15, :cond_1 */
/* .line 110 */
/* new-instance v10, Ljava/lang/String; */
final String v14 = "UTF-8"; // const-string v14, "UTF-8"
/* invoke-direct {v10, v2, v14}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* .line 111 */
/* .local v10, "line":Ljava/lang/String; */
(( java.lang.String ) v10 ).trim ( ); // invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v15 = ""; // const-string v15, ""
v14 = (( java.lang.String ) v14 ).equals ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v14 != null) { // if-eqz v14, :cond_4
/* .line 112 */
int v5 = 0; // const/4 v5, 0x0
/* .line 117 */
} // :goto_2
/* new-array v2, v9, [B */
/* .line 118 */
int v11 = 0; // const/4 v11, 0x0
/* goto/16 :goto_0 */
/* .line 114 */
} // :cond_4
(( java.lang.String ) v10 ).trim ( ); // invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.util.ArrayList ) v4 ).add ( v14 ); // invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_1 */
/* .catch Lde/roderick/weberknecht/WebSocketException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 143 */
} // .end local v1 # "b":I
} // .end local v2 # "buffer":[B
} // .end local v3 # "handshakeComplete":Z
} // .end local v4 # "handshakeLines":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
} // .end local v5 # "header":Z
} // .end local v9 # "len":I
} // .end local v10 # "line":Ljava/lang/String;
} // .end local v11 # "pos":I
} // .end local v12 # "serverResponse":[B
/* :catch_1 */
/* move-exception v7 */
/* .line 144 */
/* .local v7, "ioe":Ljava/io/IOException; */
(( java.io.IOException ) v7 ).printStackTrace ( ); // invoke-virtual {v7}, Ljava/io/IOException;->printStackTrace()V
/* .line 145 */
/* new-instance v14, Lde/roderick/weberknecht/WebSocketException; */
/* new-instance v15, Ljava/lang/StringBuilder; */
final String v16 = "error while connecting: "; // const-string v16, "error while connecting: "
/* invoke-direct/range {v15 ..v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.io.IOException ) v7 ).getMessage ( ); // invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v15 ).toString ( ); // invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v14, v15, v7}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v14 */
/* .line 130 */
} // .end local v7 # "ioe":Ljava/io/IOException;
/* .restart local v2 # "buffer":[B */
/* .restart local v3 # "handshakeComplete":Z */
/* .restart local v4 # "handshakeLines":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;" */
/* .restart local v5 # "header":Z */
/* .restart local v6 # "headers":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;" */
/* .restart local v9 # "len":I */
/* .restart local v11 # "pos":I */
/* .restart local v12 # "serverResponse":[B */
} // :cond_5
try { // :try_start_2
/* check-cast v10, Ljava/lang/String; */
/* .line 131 */
/* .restart local v10 # "line":Ljava/lang/String; */
final String v15 = ": "; // const-string v15, ": "
/* const/16 v16, 0x2 */
/* move/from16 v0, v16 */
(( java.lang.String ) v10 ).split ( v15, v0 ); // invoke-virtual {v10, v15, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
/* .line 132 */
/* .local v8, "keyValue":[Ljava/lang/String; */
int v15 = 0; // const/4 v15, 0x0
/* aget-object v15, v8, v15 */
/* const/16 v16, 0x1 */
/* aget-object v16, v8, v16 */
/* move-object/from16 v0, v16 */
(( java.util.HashMap ) v6 ).put ( v15, v0 ); // invoke-virtual {v6, v15, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_2 */
/* .catch Lde/roderick/weberknecht/WebSocketException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
/* goto/16 :goto_1 */
} // .end method
public de.roderick.weberknecht.WebSocketEventHandler getEventHandler ( ) {
/* .locals 1 */
/* .prologue */
/* .line 72 */
v0 = this.eventHandler;
} // .end method
public void handleReceiverError ( ) {
/* .locals 2 */
/* .prologue */
/* .line 219 */
try { // :try_start_0
/* iget-boolean v1, p0, Lde/roderick/weberknecht/WebSocketConnection;->connected:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 220 */
(( de.roderick.weberknecht.WebSocketConnection ) p0 ).close ( ); // invoke-virtual {p0}, Lde/roderick/weberknecht/WebSocketConnection;->close()V
/* :try_end_0 */
/* .catch Lde/roderick/weberknecht/WebSocketException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 225 */
} // :cond_0
} // :goto_0
return;
/* .line 222 */
/* :catch_0 */
/* move-exception v0 */
/* .line 223 */
/* .local v0, "wse":Lde/roderick/weberknecht/WebSocketException; */
(( de.roderick.weberknecht.WebSocketException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Lde/roderick/weberknecht/WebSocketException;->printStackTrace()V
} // .end method
public Boolean isConnected ( ) {
/* .locals 1 */
/* .prologue */
/* .line 318 */
/* iget-boolean v0, p0, Lde/roderick/weberknecht/WebSocketConnection;->connected:Z */
} // .end method
public synchronized void send ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "data" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 155 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget-boolean v2, p0, Lde/roderick/weberknecht/WebSocketConnection;->connected:Z */
/* if-nez v2, :cond_0 */
/* .line 156 */
/* new-instance v2, Lde/roderick/weberknecht/WebSocketException; */
/* .line 157 */
final String v3 = "error while sending text data: not connected"; // const-string v3, "error while sending text data: not connected"
/* .line 156 */
/* invoke-direct {v2, v3}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 155 */
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit p0 */
/* throw v2 */
/* .line 160 */
} // :cond_0
try { // :try_start_1
v2 = this.output;
int v3 = 0; // const/4 v3, 0x0
(( java.io.PrintStream ) v2 ).write ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->write(I)V
/* .line 161 */
v2 = this.output;
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
(( java.lang.String ) p1 ).getBytes ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
(( java.io.PrintStream ) v2 ).write ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->write([B)V
/* .line 162 */
v2 = this.output;
/* const/16 v3, 0xff */
(( java.io.PrintStream ) v2 ).write ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->write(I)V
/* :try_end_1 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 171 */
/* monitor-exit p0 */
return;
/* .line 164 */
/* :catch_0 */
/* move-exception v1 */
/* .line 165 */
/* .local v1, "uee":Ljava/io/UnsupportedEncodingException; */
try { // :try_start_2
(( java.io.UnsupportedEncodingException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
/* .line 166 */
/* new-instance v2, Lde/roderick/weberknecht/WebSocketException; */
final String v3 = "error while sending text data: unsupported encoding"; // const-string v3, "error while sending text data: unsupported encoding"
/* invoke-direct {v2, v3, v1}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v2 */
/* .line 167 */
} // .end local v1 # "uee":Ljava/io/UnsupportedEncodingException;
/* :catch_1 */
/* move-exception v0 */
/* .line 168 */
/* .local v0, "ioe":Ljava/io/IOException; */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* .line 169 */
/* new-instance v2, Lde/roderick/weberknecht/WebSocketException; */
final String v3 = "error while sending text data"; // const-string v3, "error while sending text data"
/* invoke-direct {v2, v3, v0}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v2 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
public synchronized void send ( Object[] p0 ) {
/* .locals 4 */
/* .param p1, "data" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 180 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget-boolean v2, p0, Lde/roderick/weberknecht/WebSocketConnection;->connected:Z */
/* if-nez v2, :cond_0 */
/* .line 181 */
/* new-instance v2, Lde/roderick/weberknecht/WebSocketException; */
final String v3 = "error while sending text data: not connected"; // const-string v3, "error while sending text data: not connected"
/* invoke-direct {v2, v3}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 180 */
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit p0 */
/* throw v2 */
/* .line 185 */
} // :cond_0
try { // :try_start_1
v2 = this.outputBin;
int v3 = 2; // const/4 v3, 0x2
(( java.io.OutputStream ) v2 ).write ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V
/* .line 186 */
v2 = this.outputBin;
(( java.io.OutputStream ) v2 ).write ( p1 ); // invoke-virtual {v2, p1}, Ljava/io/OutputStream;->write([B)V
/* .line 187 */
v2 = this.outputBin;
/* const/16 v3, 0xff */
(( java.io.OutputStream ) v2 ).write ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V
/* :try_end_1 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 196 */
/* monitor-exit p0 */
return;
/* .line 189 */
/* :catch_0 */
/* move-exception v1 */
/* .line 190 */
/* .local v1, "uee":Ljava/io/UnsupportedEncodingException; */
try { // :try_start_2
(( java.io.UnsupportedEncodingException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
/* .line 191 */
/* new-instance v2, Lde/roderick/weberknecht/WebSocketException; */
final String v3 = "error while sending text data: unsupported encoding"; // const-string v3, "error while sending text data: unsupported encoding"
/* invoke-direct {v2, v3, v1}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v2 */
/* .line 192 */
} // .end local v1 # "uee":Ljava/io/UnsupportedEncodingException;
/* :catch_1 */
/* move-exception v0 */
/* .line 193 */
/* .local v0, "ioe":Ljava/io/IOException; */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* .line 194 */
/* new-instance v2, Lde/roderick/weberknecht/WebSocketException; */
final String v3 = "error while sending text data"; // const-string v3, "error while sending text data"
/* invoke-direct {v2, v3, v0}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v2 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
public void setEventHandler ( de.roderick.weberknecht.WebSocketEventHandler p0 ) {
/* .locals 0 */
/* .param p1, "eventHandler" # Lde/roderick/weberknecht/WebSocketEventHandler; */
/* .prologue */
/* .line 68 */
this.eventHandler = p1;
/* .line 69 */
return;
} // .end method
