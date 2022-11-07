class de.hellowins.ApiHttpRequest extends android.os.AsyncTask {
	 /* .source "ApiHttpRequest.java" */
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
/* # static fields */
private static final Integer REGISTRATION_TIMEOUT;
private static final Integer WAIT_TIMEOUT;
public static java.lang.String apiVersion;
/* # instance fields */
de.hellowins.ApiHttpRequestHandler callback;
private java.lang.String content;
private Boolean error;
protected java.lang.String host;
private final org.apache.http.impl.client.DefaultHttpClient httpclient;
de.hellowins.LogData logData;
java.lang.String method;
final org.apache.http.params.HttpParams params;
java.lang.String requestParams;
 requestParamsByte;
public java.lang.String rescontent;
org.apache.http.HttpResponse response;
java.lang.String sessionCookie;
java.lang.String url;
/* # direct methods */
static de.hellowins.ApiHttpRequest ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 29 */
	 final String v0 = "v1"; // const-string v0, "v1"
	 return;
} // .end method
 de.hellowins.ApiHttpRequest ( ) {
	 /* .locals 3 */
	 /* .param p1, "sessionCookie" # Ljava/lang/String; */
	 /* .param p2, "host" # Ljava/lang/String; */
	 /* .param p3, "logData" # Lde/hellowins/LogData; */
	 /* .prologue */
	 int v2 = 0; // const/4 v2, 0x0
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 51 */
	 /* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
	 /* .line 36 */
	 this.content = v2;
	 /* .line 38 */
	 /* iput-boolean v1, p0, Lde/hellowins/ApiHttpRequest;->error:Z */
	 /* .line 40 */
	 final String v0 = "http://api.test.hellowins.com:5555/api/"; // const-string v0, "http://api.test.hellowins.com:5555/api/"
	 this.host = v0;
	 /* .line 42 */
	 this.url = v2;
	 /* .line 45 */
	 final String v0 = ""; // const-string v0, ""
	 this.requestParams = v0;
	 /* .line 46 */
	 /* new-array v0, v1, [B */
	 this.requestParamsByte = v0;
	 /* .line 47 */
	 final String v0 = ""; // const-string v0, ""
	 this.sessionCookie = v0;
	 /* .line 53 */
	 this.sessionCookie = p1;
	 /* .line 54 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( p2 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v1 = de.hellowins.ApiHttpRequest.apiVersion;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 this.host = v0;
	 /* .line 55 */
	 this.logData = p3;
	 /* .line 56 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 final String v1 = "ApiHttpRequest "; // const-string v1, "ApiHttpRequest "
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( de.hellowins.LogData ) p3 ).addLog ( v0 ); // invoke-virtual {p3, v0}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
	 /* .line 58 */
	 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
	 /* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
	 this.httpclient = v0;
	 /* .line 59 */
	 v0 = this.httpclient;
	 (( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
	 this.params = v0;
	 /* .line 60 */
	 return;
} // .end method
/* # virtual methods */
public void doFinishGame ( java.lang.String p0, de.hellowins.ApiHttpRequestHandler p1 ) {
	 /* .locals 2 */
	 /* .param p1, "challengeID" # Ljava/lang/String; */
	 /* .param p2, "responder" # Lde/hellowins/ApiHttpRequestHandler; */
	 /* .prologue */
	 /* .line 152 */
	 this.callback = p2;
	 /* .line 153 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 final String v1 = "/challenge/finish/"; // const-string v1, "/challenge/finish/"
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 this.url = v0;
	 /* .line 154 */
	 final String v0 = "GET"; // const-string v0, "GET"
	 this.method = v0;
	 /* .line 156 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* new-array v0, v0, [Ljava/lang/String; */
	 (( de.hellowins.ApiHttpRequest ) p0 ).execute ( v0 ); // invoke-virtual {p0, v0}, Lde/hellowins/ApiHttpRequest;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
	 /* .line 157 */
	 return;
} // .end method
public void doGetUser ( de.hellowins.ApiHttpRequestHandler p0 ) {
	 /* .locals 1 */
	 /* .param p1, "responder" # Lde/hellowins/ApiHttpRequestHandler; */
	 /* .prologue */
	 /* .line 160 */
	 this.callback = p1;
	 /* .line 161 */
	 final String v0 = "/player/me"; // const-string v0, "/player/me"
	 this.url = v0;
	 /* .line 162 */
	 final String v0 = "GET"; // const-string v0, "GET"
	 this.method = v0;
	 /* .line 164 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* new-array v0, v0, [Ljava/lang/String; */
	 (( de.hellowins.ApiHttpRequest ) p0 ).execute ( v0 ); // invoke-virtual {p0, v0}, Lde/hellowins/ApiHttpRequest;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
	 /* .line 165 */
	 return;
} // .end method
protected java.lang.Object doInBackground ( java.lang.Object...p0 ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1 */
	 /* check-cast p1, [Ljava/lang/String; */
	 (( de.hellowins.ApiHttpRequest ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lde/hellowins/ApiHttpRequest;->doInBackground([Ljava/lang/String;)Ljava/lang/String;
} // .end method
protected java.lang.String doInBackground ( java.lang.String...p0 ) {
	 /* .locals 9 */
	 /* .param p1, "arg0" # [Ljava/lang/String; */
	 /* .prologue */
	 int v8 = 1; // const/4 v8, 0x1
	 /* .line 65 */
	 try { // :try_start_0
		 v5 = this.logData;
		 final String v6 = "Hellowins SDK ApiHttpRequest execute"; // const-string v6, "Hellowins SDK ApiHttpRequest execute"
		 (( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
		 /* .line 69 */
		 v5 = this.method;
		 final String v6 = "PUT"; // const-string v6, "PUT"
		 v5 = 		 (( java.lang.String ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v5 != null) { // if-eqz v5, :cond_3
			 /* .line 70 */
			 v5 = this.logData;
			 /* new-instance v6, Ljava/lang/StringBuilder; */
			 final String v7 = "PUT "; // const-string v7, "PUT "
			 /* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 v7 = this.host;
			 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v7 = this.url;
			 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
			 /* .line 71 */
			 /* new-instance v2, Lorg/apache/http/client/methods/HttpPut; */
			 /* new-instance v5, Ljava/lang/StringBuilder; */
			 v6 = this.host;
			 java.lang.String .valueOf ( v6 );
			 /* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 v6 = this.url;
			 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v2, v5}, Lorg/apache/http/client/methods/HttpPut;-><init>(Ljava/lang/String;)V */
			 /* .line 73 */
			 /* .local v2, "httpPut":Lorg/apache/http/client/methods/HttpPut; */
			 v5 = this.sessionCookie;
			 v5 = 			 (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
			 /* if-lez v5, :cond_0 */
			 /* .line 74 */
			 final String v5 = "Cookie"; // const-string v5, "Cookie"
			 v6 = this.sessionCookie;
			 (( org.apache.http.client.methods.HttpPut ) v2 ).addHeader ( v5, v6 ); // invoke-virtual {v2, v5, v6}, Lorg/apache/http/client/methods/HttpPut;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
			 /* .line 76 */
		 } // :cond_0
		 v5 = this.requestParamsByte;
		 /* array-length v5, v5 */
		 /* if-lez v5, :cond_2 */
		 /* .line 77 */
		 /* new-instance v5, Lorg/apache/http/entity/ByteArrayEntity; */
		 v6 = this.requestParamsByte;
		 /* invoke-direct {v5, v6}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V */
		 (( org.apache.http.client.methods.HttpPut ) v2 ).setEntity ( v5 ); // invoke-virtual {v2, v5}, Lorg/apache/http/client/methods/HttpPut;->setEntity(Lorg/apache/http/HttpEntity;)V
		 /* .line 82 */
	 } // :goto_0
	 v5 = this.httpclient;
	 (( org.apache.http.impl.client.DefaultHttpClient ) v5 ).execute ( v2 ); // invoke-virtual {v5, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
	 this.response = v5;
	 /* .line 95 */
} // .end local v2 # "httpPut":Lorg/apache/http/client/methods/HttpPut;
} // :cond_1
} // :goto_1
v5 = this.response;
/* .line 97 */
/* .local v4, "statusLine":Lorg/apache/http/StatusLine; */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "Request Status: "; // const-string v7, "Request Status: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
v5 = /* .line 99 */
/* const/16 v6, 0xc8 */
/* if-ne v5, v6, :cond_5 */
/* .line 100 */
/* new-instance v3, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 101 */
/* .local v3, "out":Ljava/io/ByteArrayOutputStream; */
v5 = this.response;
/* .line 102 */
(( java.io.ByteArrayOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 103 */
(( java.io.ByteArrayOutputStream ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
this.content = v5;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 119 */
} // .end local v3 # "out":Ljava/io/ByteArrayOutputStream;
} // .end local v4 # "statusLine":Lorg/apache/http/StatusLine;
} // :goto_2
v5 = this.content;
/* .line 79 */
/* .restart local v2 # "httpPut":Lorg/apache/http/client/methods/HttpPut; */
} // :cond_2
try { // :try_start_1
/* new-instance v5, Lorg/apache/http/entity/StringEntity; */
v6 = this.requestParams;
/* invoke-direct {v5, v6}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V */
(( org.apache.http.client.methods.HttpPut ) v2 ).setEntity ( v5 ); // invoke-virtual {v2, v5}, Lorg/apache/http/client/methods/HttpPut;->setEntity(Lorg/apache/http/HttpEntity;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 111 */
} // .end local v2 # "httpPut":Lorg/apache/http/client/methods/HttpPut;
/* :catch_0 */
/* move-exception v0 */
/* .line 112 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* .line 114 */
v5 = this.logData;
(( de.hellowins.LogData ) v5 ).logException ( v0 ); // invoke-virtual {v5, v0}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
/* .line 116 */
/* iput-boolean v8, p0, Lde/hellowins/ApiHttpRequest;->error:Z */
/* .line 83 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_3
try { // :try_start_2
v5 = this.method;
final String v6 = "GET"; // const-string v6, "GET"
v5 = (( java.lang.String ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 84 */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "GET "; // const-string v7, "GET "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = this.host;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = this.url;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 85 */
/* new-instance v1, Lorg/apache/http/client/methods/HttpGet; */
/* new-instance v5, Ljava/lang/StringBuilder; */
v6 = this.host;
java.lang.String .valueOf ( v6 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v6 = this.url;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v5}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 87 */
/* .local v1, "httpGet":Lorg/apache/http/client/methods/HttpGet; */
v5 = this.sessionCookie;
v5 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* if-lez v5, :cond_4 */
/* .line 88 */
final String v5 = "Cookie"; // const-string v5, "Cookie"
v6 = this.sessionCookie;
(( org.apache.http.client.methods.HttpGet ) v1 ).addHeader ( v5, v6 ); // invoke-virtual {v1, v5, v6}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
/* .line 90 */
} // :cond_4
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "GET aborted: "; // const-string v7, "GET aborted: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = (( org.apache.http.client.methods.HttpGet ) v1 ).isAborted ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpGet;->isAborted()Z
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 91 */
v5 = this.httpclient;
(( org.apache.http.impl.client.DefaultHttpClient ) v5 ).execute ( v1 ); // invoke-virtual {v5, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
this.response = v5;
/* .line 92 */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "GET aborted: "; // const-string v7, "GET aborted: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = (( org.apache.http.client.methods.HttpGet ) v1 ).isAborted ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpGet;->isAborted()Z
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* goto/16 :goto_1 */
/* .line 107 */
} // .end local v1 # "httpGet":Lorg/apache/http/client/methods/HttpGet;
/* .restart local v4 # "statusLine":Lorg/apache/http/StatusLine; */
} // :cond_5
v5 = this.response;
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* .line 108 */
int v5 = 1; // const/4 v5, 0x1
/* iput-boolean v5, p0, Lde/hellowins/ApiHttpRequest;->error:Z */
/* .line 109 */
this.content = v5;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* goto/16 :goto_2 */
} // .end method
public void doSendHighScore ( java.lang.String p0, java.lang.String p1, de.hellowins.ApiHttpRequestHandler p2 ) {
/* .locals 2 */
/* .param p1, "challengeID" # Ljava/lang/String; */
/* .param p2, "points" # Ljava/lang/String; */
/* .param p3, "responder" # Lde/hellowins/ApiHttpRequestHandler; */
/* .prologue */
/* .line 142 */
this.callback = p3;
/* .line 143 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "/challenge/score/"; // const-string v1, "/challenge/score/"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.url = v0;
/* .line 144 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "{\"data\":"; // const-string v1, "{\"data\":"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.requestParams = v0;
/* .line 146 */
final String v0 = "PUT"; // const-string v0, "PUT"
this.method = v0;
/* .line 148 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/String; */
(( de.hellowins.ApiHttpRequest ) p0 ).execute ( v0 ); // invoke-virtual {p0, v0}, Lde/hellowins/ApiHttpRequest;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* .line 149 */
return;
} // .end method
public void doStartGame ( java.lang.String p0, de.hellowins.ApiHttpRequestHandler p1 ) {
/* .locals 2 */
/* .param p1, "challengeID" # Ljava/lang/String; */
/* .param p2, "responder" # Lde/hellowins/ApiHttpRequestHandler; */
/* .prologue */
/* .line 127 */
this.callback = p2;
/* .line 128 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "/challenge/start/"; // const-string v1, "/challenge/start/"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.url = v0;
/* .line 129 */
final String v0 = ""; // const-string v0, ""
this.requestParams = v0;
/* .line 130 */
final String v0 = "GET"; // const-string v0, "GET"
this.method = v0;
/* .line 132 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/String; */
(( de.hellowins.ApiHttpRequest ) p0 ).execute ( v0 ); // invoke-virtual {p0, v0}, Lde/hellowins/ApiHttpRequest;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* .line 133 */
return;
} // .end method
protected void onPostExecute ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .prologue */
/* .line 1 */
/* check-cast p1, Ljava/lang/String; */
(( de.hellowins.ApiHttpRequest ) p0 ).onPostExecute ( p1 ); // invoke-virtual {p0, p1}, Lde/hellowins/ApiHttpRequest;->onPostExecute(Ljava/lang/String;)V
return;
} // .end method
protected void onPostExecute ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "content" # Ljava/lang/String; */
/* .prologue */
/* .line 168 */
/* iget-boolean v0, p0, Lde/hellowins/ApiHttpRequest;->error:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 169 */
v0 = this.callback;
/* .line 173 */
} // :goto_0
return;
/* .line 171 */
} // :cond_0
v0 = this.callback;
} // .end method
