public class de.hellowins.ApiWebSocket extends android.os.AsyncTask {
	 /* .source "ApiWebSocket.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/AsyncTask", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Void;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
private java.lang.String challengeId;
de.hellowins.ApiWebSocketHandler handler;
private java.lang.String host;
private java.lang.String key;
de.hellowins.LogData logData;
private java.lang.String uid;
de.roderick.weberknecht.WebSocket websocket;
/* # direct methods */
 de.hellowins.ApiWebSocket ( ) {
	 /* .locals 0 */
	 /* .param p1, "host" # Ljava/lang/String; */
	 /* .param p2, "uid" # Ljava/lang/String; */
	 /* .param p3, "key" # Ljava/lang/String; */
	 /* .param p4, "challengeId" # Ljava/lang/String; */
	 /* .param p5, "handler" # Lde/hellowins/ApiWebSocketHandler; */
	 /* .param p6, "logData" # Lde/hellowins/LogData; */
	 /* .prologue */
	 /* .line 29 */
	 /* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
	 /* .line 30 */
	 this.host = p1;
	 /* .line 31 */
	 this.uid = p2;
	 /* .line 32 */
	 this.key = p3;
	 /* .line 33 */
	 this.challengeId = p4;
	 /* .line 35 */
	 this.handler = p5;
	 /* .line 36 */
	 this.logData = p6;
	 /* .line 37 */
	 return;
} // .end method
/* # virtual methods */
public void close ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 43 */
	 v0 = 	 v0 = this.websocket;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 45 */
		 try { // :try_start_0
			 v0 = this.websocket;
			 /* :try_end_0 */
			 /* .catch Lde/roderick/weberknecht/WebSocketException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 50 */
		 } // :cond_0
	 } // :goto_0
	 return;
	 /* .line 46 */
	 /* :catch_0 */
	 /* move-exception v0 */
} // .end method
protected java.lang.Object doInBackground ( java.lang.Object...p0 ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1 */
	 /* check-cast p1, [Ljava/lang/String; */
	 (( de.hellowins.ApiWebSocket ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lde/hellowins/ApiWebSocket;->doInBackground([Ljava/lang/String;)Ljava/lang/String;
} // .end method
protected java.lang.String doInBackground ( java.lang.String...p0 ) {
	 /* .locals 5 */
	 /* .param p1, "params" # [Ljava/lang/String; */
	 /* .prologue */
	 /* .line 59 */
	 v2 = this.logData;
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 final String v4 = "WebSocket: "; // const-string v4, "WebSocket: "
	 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v4 = this.host;
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( de.hellowins.LogData ) v2 ).addLog ( v3 ); // invoke-virtual {v2, v3}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
	 /* .line 63 */
	 try { // :try_start_0
		 /* new-instance v1, Ljava/net/URI; */
		 v2 = this.host;
		 /* invoke-direct {v1, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V */
		 /* .line 64 */
		 /* .local v1, "uri":Ljava/net/URI; */
		 /* new-instance v2, Lde/roderick/weberknecht/WebSocketConnection; */
		 /* invoke-direct {v2, v1}, Lde/roderick/weberknecht/WebSocketConnection;-><init>(Ljava/net/URI;)V */
		 this.websocket = v2;
		 /* .line 66 */
		 v2 = this.websocket;
		 /* new-instance v3, Lde/hellowins/ApiWebSocket$1; */
		 /* invoke-direct {v3, p0}, Lde/hellowins/ApiWebSocket$1;-><init>(Lde/hellowins/ApiWebSocket;)V */
		 /* .line 82 */
		 v2 = this.logData;
		 final String v3 = "WebSocket: connecting"; // const-string v3, "WebSocket: connecting"
		 (( de.hellowins.LogData ) v2 ).addLog ( v3 ); // invoke-virtual {v2, v3}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
		 /* .line 83 */
		 v2 = this.websocket;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 91 */
	 } // .end local v1 # "uri":Ljava/net/URI;
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
/* .line 85 */
/* :catch_0 */
/* move-exception v0 */
/* .line 86 */
/* .local v0, "e":Ljava/lang/Exception; */
v2 = this.logData;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "WebSocket: "; // const-string v4, "WebSocket: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v2 ).addLog ( v3 ); // invoke-virtual {v2, v3}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 88 */
(( de.hellowins.ApiWebSocket ) p0 ).handleClose ( ); // invoke-virtual {p0}, Lde/hellowins/ApiWebSocket;->handleClose()V
} // .end method
protected void handleClose ( ) {
/* .locals 2 */
/* .prologue */
/* .line 113 */
v0 = this.logData;
final String v1 = "WebSocket: handleClose"; // const-string v1, "WebSocket: handleClose"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 114 */
v0 = this.handler;
/* .line 115 */
return;
} // .end method
protected void handleMessage ( de.roderick.weberknecht.WebSocketMessage p0 ) {
/* .locals 1 */
/* .param p1, "message" # Lde/roderick/weberknecht/WebSocketMessage; */
/* .prologue */
/* .line 107 */
v0 = this.handler;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 108 */
	 v0 = this.handler;
	 /* .line 110 */
} // :cond_0
return;
} // .end method
public Boolean isConnected ( ) {
/* .locals 1 */
/* .prologue */
/* .line 54 */
v0 = v0 = this.websocket;
} // .end method
public void sendAccept ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "signal" # Ljava/lang/String; */
/* .prologue */
/* .line 123 */
try { // :try_start_0
	 v1 = this.websocket;
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 final String v3 = "{ \"action\": \"acknowledge\", \"data\": { \"signal\": \""; // const-string v3, "{ \"action\": \"acknowledge\", \"data\": { \"signal\": \""
	 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v3 = "\" }}"; // const-string v3, "\" }}"
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* :try_end_0 */
	 /* .catch Lde/roderick/weberknecht/WebSocketException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 128 */
} // :goto_0
return;
/* .line 124 */
/* :catch_0 */
/* move-exception v0 */
/* .line 125 */
/* .local v0, "e":Lde/roderick/weberknecht/WebSocketException; */
v1 = this.logData;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "WebSocket: "; // const-string v3, "WebSocket: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( de.roderick.weberknecht.WebSocketException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Lde/roderick/weberknecht/WebSocketException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v1 ).addLog ( v2 ); // invoke-virtual {v1, v2}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 126 */
(( de.hellowins.ApiWebSocket ) p0 ).handleClose ( ); // invoke-virtual {p0}, Lde/hellowins/ApiWebSocket;->handleClose()V
} // .end method
public void sendListen ( ) {
/* .locals 5 */
/* .prologue */
/* .line 131 */
v2 = this.logData;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "WebSocket: Send Listen "; // const-string v4, "WebSocket: Send Listen "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = this.challengeId;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v2 ).addLog ( v3 ); // invoke-virtual {v2, v3}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 133 */
try { // :try_start_0
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 final String v3 = "{ \"action\": \"listen\", \"data\": { \"challenges\": [\""; // const-string v3, "{ \"action\": \"listen\", \"data\": { \"challenges\": [\""
	 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v3 = this.challengeId;
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v3 = "\"] }}"; // const-string v3, "\"] }}"
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 134 */
	 /* .local v1, "sd":Ljava/lang/String; */
	 v2 = this.websocket;
	 /* :try_end_0 */
	 /* .catch Lde/roderick/weberknecht/WebSocketException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 139 */
} // .end local v1 # "sd":Ljava/lang/String;
} // :goto_0
return;
/* .line 135 */
/* :catch_0 */
/* move-exception v0 */
/* .line 136 */
/* .local v0, "e":Lde/roderick/weberknecht/WebSocketException; */
v2 = this.logData;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "WebSocket: "; // const-string v4, "WebSocket: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( de.roderick.weberknecht.WebSocketException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Lde/roderick/weberknecht/WebSocketException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v2 ).addLog ( v3 ); // invoke-virtual {v2, v3}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 137 */
(( de.hellowins.ApiWebSocket ) p0 ).handleClose ( ); // invoke-virtual {p0}, Lde/hellowins/ApiWebSocket;->handleClose()V
} // .end method
protected void sendOneTimeKey ( ) {
/* .locals 5 */
/* .prologue */
/* .line 141 */
v2 = this.logData;
final String v3 = "WebSocket: Send sendOneTimeKey"; // const-string v3, "WebSocket: Send sendOneTimeKey"
(( de.hellowins.LogData ) v2 ).addLog ( v3 ); // invoke-virtual {v2, v3}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 143 */
try { // :try_start_0
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "{ \"action\": \"handshake\", \"data\": { \"email\": \""; // const-string v3, "{ \"action\": \"handshake\", \"data\": { \"email\": \""
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.uid;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "\", \"type\" : \"player\", \"otk\": \""; // const-string v3, "\", \"type\" : \"player\", \"otk\": \""
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.key;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "\" }}"; // const-string v3, "\" }}"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 144 */
/* .local v1, "sd":Ljava/lang/String; */
v2 = this.websocket;
/* :try_end_0 */
/* .catch Lde/roderick/weberknecht/WebSocketException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 149 */
} // .end local v1 # "sd":Ljava/lang/String;
} // :goto_0
return;
/* .line 145 */
/* :catch_0 */
/* move-exception v0 */
/* .line 146 */
/* .local v0, "e":Lde/roderick/weberknecht/WebSocketException; */
v2 = this.logData;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "WebSocket: "; // const-string v4, "WebSocket: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( de.roderick.weberknecht.WebSocketException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Lde/roderick/weberknecht/WebSocketException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v2 ).addLog ( v3 ); // invoke-virtual {v2, v3}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 147 */
(( de.hellowins.ApiWebSocket ) p0 ).handleClose ( ); // invoke-virtual {p0}, Lde/hellowins/ApiWebSocket;->handleClose()V
} // .end method
public void sendPoints ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "data" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 99 */
v0 = this.logData;
final String v1 = "WebSocket: send points"; // const-string v1, "WebSocket: send points"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 100 */
v0 = this.websocket;
/* .line 101 */
return;
} // .end method
