class de.hellowins.UnityApiHttpRequest {
	 /* .source "UnityApiHttpRequest.java" */
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
	 static de.hellowins.UnityApiHttpRequest ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 34 */
		 final String v0 = "v1"; // const-string v0, "v1"
		 return;
	 } // .end method
	 de.hellowins.UnityApiHttpRequest ( ) {
		 /* .locals 3 */
		 /* .param p1, "sessionCookie" # Ljava/lang/String; */
		 /* .param p2, "host" # Ljava/lang/String; */
		 /* .param p3, "logData" # Lde/hellowins/LogData; */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 56 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 41 */
		 this.content = v2;
		 /* .line 43 */
		 /* iput-boolean v1, p0, Lde/hellowins/UnityApiHttpRequest;->error:Z */
		 /* .line 45 */
		 final String v0 = "http://api.test.hellowins.com:5555/api/"; // const-string v0, "http://api.test.hellowins.com:5555/api/"
		 this.host = v0;
		 /* .line 47 */
		 this.url = v2;
		 /* .line 50 */
		 final String v0 = ""; // const-string v0, ""
		 this.requestParams = v0;
		 /* .line 51 */
		 /* new-array v0, v1, [B */
		 this.requestParamsByte = v0;
		 /* .line 52 */
		 final String v0 = ""; // const-string v0, ""
		 this.sessionCookie = v0;
		 /* .line 58 */
		 this.sessionCookie = p1;
		 /* .line 59 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( p2 );
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 v1 = de.hellowins.UnityApiHttpRequest.apiVersion;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 this.host = v0;
		 /* .line 60 */
		 this.logData = p3;
		 /* .line 61 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "ApiHttpRequest "; // const-string v1, "ApiHttpRequest "
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( de.hellowins.LogData ) p3 ).addLog ( v0 ); // invoke-virtual {p3, v0}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
		 /* .line 63 */
		 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
		 /* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
		 this.httpclient = v0;
		 /* .line 64 */
		 v0 = this.httpclient;
		 (( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
		 this.params = v0;
		 /* .line 65 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void doFinishGame ( java.lang.String p0, de.hellowins.ApiHttpRequestHandler p1 ) {
		 /* .locals 2 */
		 /* .param p1, "challengeID" # Ljava/lang/String; */
		 /* .param p2, "responder" # Lde/hellowins/ApiHttpRequestHandler; */
		 /* .prologue */
		 /* .line 164 */
		 this.callback = p2;
		 /* .line 165 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "/challenge/finish/"; // const-string v1, "/challenge/finish/"
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 this.url = v0;
		 /* .line 166 */
		 final String v0 = "GET"; // const-string v0, "GET"
		 this.method = v0;
		 /* .line 168 */
		 (( de.hellowins.UnityApiHttpRequest ) p0 ).execute ( ); // invoke-virtual {p0}, Lde/hellowins/UnityApiHttpRequest;->execute()V
		 /* .line 169 */
		 return;
	 } // .end method
	 public void doGetUser ( de.hellowins.ApiHttpRequestHandler p0 ) {
		 /* .locals 1 */
		 /* .param p1, "responder" # Lde/hellowins/ApiHttpRequestHandler; */
		 /* .prologue */
		 /* .line 172 */
		 this.callback = p1;
		 /* .line 173 */
		 final String v0 = "/player/me"; // const-string v0, "/player/me"
		 this.url = v0;
		 /* .line 174 */
		 final String v0 = "GET"; // const-string v0, "GET"
		 this.method = v0;
		 /* .line 176 */
		 (( de.hellowins.UnityApiHttpRequest ) p0 ).execute ( ); // invoke-virtual {p0}, Lde/hellowins/UnityApiHttpRequest;->execute()V
		 /* .line 177 */
		 return;
	 } // .end method
	 public void doSendHighScore ( java.lang.String p0, java.lang.String p1, de.hellowins.ApiHttpRequestHandler p2 ) {
		 /* .locals 2 */
		 /* .param p1, "challengeID" # Ljava/lang/String; */
		 /* .param p2, "points" # Ljava/lang/String; */
		 /* .param p3, "responder" # Lde/hellowins/ApiHttpRequestHandler; */
		 /* .prologue */
		 /* .line 154 */
		 this.callback = p3;
		 /* .line 155 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "/challenge/score/"; // const-string v1, "/challenge/score/"
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 this.url = v0;
		 /* .line 156 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "{\"data\":"; // const-string v1, "{\"data\":"
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = "}"; // const-string v1, "}"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 this.requestParams = v0;
		 /* .line 158 */
		 final String v0 = "PUT"; // const-string v0, "PUT"
		 this.method = v0;
		 /* .line 160 */
		 (( de.hellowins.UnityApiHttpRequest ) p0 ).execute ( ); // invoke-virtual {p0}, Lde/hellowins/UnityApiHttpRequest;->execute()V
		 /* .line 161 */
		 return;
	 } // .end method
	 public void doStartGame ( java.lang.String p0, de.hellowins.ApiHttpRequestHandler p1 ) {
		 /* .locals 2 */
		 /* .param p1, "challengeID" # Ljava/lang/String; */
		 /* .param p2, "responder" # Lde/hellowins/ApiHttpRequestHandler; */
		 /* .prologue */
		 /* .line 139 */
		 this.callback = p2;
		 /* .line 140 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "/challenge/start/"; // const-string v1, "/challenge/start/"
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 this.url = v0;
		 /* .line 141 */
		 final String v0 = ""; // const-string v0, ""
		 this.requestParams = v0;
		 /* .line 142 */
		 final String v0 = "GET"; // const-string v0, "GET"
		 this.method = v0;
		 /* .line 144 */
		 (( de.hellowins.UnityApiHttpRequest ) p0 ).execute ( ); // invoke-virtual {p0}, Lde/hellowins/UnityApiHttpRequest;->execute()V
		 /* .line 145 */
		 return;
	 } // .end method
	 protected void execute ( ) {
		 /* .locals 9 */
		 /* .prologue */
		 int v8 = 1; // const/4 v8, 0x1
		 /* .line 71 */
		 try { // :try_start_0
			 v5 = this.logData;
			 final String v6 = "Hellowins SDK ApiHttpRequest execute"; // const-string v6, "Hellowins SDK ApiHttpRequest execute"
			 (( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
			 /* .line 75 */
			 v5 = this.method;
			 final String v6 = "PUT"; // const-string v6, "PUT"
			 v5 = 			 (( java.lang.String ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v5 != null) { // if-eqz v5, :cond_3
				 /* .line 76 */
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
				 /* .line 77 */
				 /* new-instance v2, Lorg/apache/http/client/methods/HttpPut; */
				 /* new-instance v5, Ljava/lang/StringBuilder; */
				 v6 = this.host;
				 java.lang.String .valueOf ( v6 );
				 /* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 v6 = this.url;
				 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 /* invoke-direct {v2, v5}, Lorg/apache/http/client/methods/HttpPut;-><init>(Ljava/lang/String;)V */
				 /* .line 79 */
				 /* .local v2, "httpPut":Lorg/apache/http/client/methods/HttpPut; */
				 v5 = this.sessionCookie;
				 v5 = 				 (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
				 /* if-lez v5, :cond_0 */
				 /* .line 80 */
				 final String v5 = "Cookie"; // const-string v5, "Cookie"
				 v6 = this.sessionCookie;
				 (( org.apache.http.client.methods.HttpPut ) v2 ).addHeader ( v5, v6 ); // invoke-virtual {v2, v5, v6}, Lorg/apache/http/client/methods/HttpPut;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
				 /* .line 82 */
			 } // :cond_0
			 v5 = this.requestParamsByte;
			 /* array-length v5, v5 */
			 /* if-lez v5, :cond_2 */
			 /* .line 83 */
			 /* new-instance v5, Lorg/apache/http/entity/ByteArrayEntity; */
			 v6 = this.requestParamsByte;
			 /* invoke-direct {v5, v6}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V */
			 (( org.apache.http.client.methods.HttpPut ) v2 ).setEntity ( v5 ); // invoke-virtual {v2, v5}, Lorg/apache/http/client/methods/HttpPut;->setEntity(Lorg/apache/http/HttpEntity;)V
			 /* .line 88 */
		 } // :goto_0
		 v5 = this.httpclient;
		 (( org.apache.http.impl.client.DefaultHttpClient ) v5 ).execute ( v2 ); // invoke-virtual {v5, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
		 this.response = v5;
		 /* .line 101 */
	 } // .end local v2 # "httpPut":Lorg/apache/http/client/methods/HttpPut;
} // :cond_1
} // :goto_1
v5 = this.response;
/* .line 103 */
/* .local v4, "statusLine":Lorg/apache/http/StatusLine; */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "Request Status: "; // const-string v7, "Request Status: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
v5 = /* .line 105 */
/* const/16 v6, 0xc8 */
/* if-ne v5, v6, :cond_5 */
/* .line 106 */
/* new-instance v3, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 107 */
/* .local v3, "out":Ljava/io/ByteArrayOutputStream; */
v5 = this.response;
/* .line 108 */
(( java.io.ByteArrayOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 109 */
(( java.io.ByteArrayOutputStream ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
this.content = v5;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 125 */
} // .end local v3 # "out":Ljava/io/ByteArrayOutputStream;
} // .end local v4 # "statusLine":Lorg/apache/http/StatusLine;
} // :goto_2
/* iget-boolean v5, p0, Lde/hellowins/UnityApiHttpRequest;->error:Z */
if ( v5 != null) { // if-eqz v5, :cond_6
/* .line 126 */
v5 = this.callback;
v6 = this.content;
/* .line 132 */
} // :goto_3
return;
/* .line 85 */
/* .restart local v2 # "httpPut":Lorg/apache/http/client/methods/HttpPut; */
} // :cond_2
try { // :try_start_1
/* new-instance v5, Lorg/apache/http/entity/StringEntity; */
v6 = this.requestParams;
/* invoke-direct {v5, v6}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V */
(( org.apache.http.client.methods.HttpPut ) v2 ).setEntity ( v5 ); // invoke-virtual {v2, v5}, Lorg/apache/http/client/methods/HttpPut;->setEntity(Lorg/apache/http/HttpEntity;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 117 */
} // .end local v2 # "httpPut":Lorg/apache/http/client/methods/HttpPut;
/* :catch_0 */
/* move-exception v0 */
/* .line 118 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* .line 120 */
v5 = this.logData;
(( de.hellowins.LogData ) v5 ).logException ( v0 ); // invoke-virtual {v5, v0}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
/* .line 122 */
/* iput-boolean v8, p0, Lde/hellowins/UnityApiHttpRequest;->error:Z */
/* .line 89 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_3
try { // :try_start_2
v5 = this.method;
final String v6 = "GET"; // const-string v6, "GET"
v5 = (( java.lang.String ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 90 */
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
/* .line 91 */
/* new-instance v1, Lorg/apache/http/client/methods/HttpGet; */
/* new-instance v5, Ljava/lang/StringBuilder; */
v6 = this.host;
java.lang.String .valueOf ( v6 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v6 = this.url;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v5}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 93 */
/* .local v1, "httpGet":Lorg/apache/http/client/methods/HttpGet; */
v5 = this.sessionCookie;
v5 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* if-lez v5, :cond_4 */
/* .line 94 */
final String v5 = "Cookie"; // const-string v5, "Cookie"
v6 = this.sessionCookie;
(( org.apache.http.client.methods.HttpGet ) v1 ).addHeader ( v5, v6 ); // invoke-virtual {v1, v5, v6}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
/* .line 96 */
} // :cond_4
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "GET aborted: "; // const-string v7, "GET aborted: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = (( org.apache.http.client.methods.HttpGet ) v1 ).isAborted ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpGet;->isAborted()Z
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 97 */
v5 = this.httpclient;
(( org.apache.http.impl.client.DefaultHttpClient ) v5 ).execute ( v1 ); // invoke-virtual {v5, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
this.response = v5;
/* .line 98 */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "GET aborted: "; // const-string v7, "GET aborted: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = (( org.apache.http.client.methods.HttpGet ) v1 ).isAborted ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpGet;->isAborted()Z
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* goto/16 :goto_1 */
/* .line 113 */
} // .end local v1 # "httpGet":Lorg/apache/http/client/methods/HttpGet;
/* .restart local v4 # "statusLine":Lorg/apache/http/StatusLine; */
} // :cond_5
v5 = this.response;
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* .line 114 */
int v5 = 1; // const/4 v5, 0x1
/* iput-boolean v5, p0, Lde/hellowins/UnityApiHttpRequest;->error:Z */
/* .line 115 */
this.content = v5;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* goto/16 :goto_2 */
/* .line 128 */
} // .end local v4 # "statusLine":Lorg/apache/http/StatusLine;
} // :cond_6
v5 = this.callback;
v6 = this.content;
/* goto/16 :goto_3 */
} // .end method
protected void onPostExecute ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "content" # Ljava/lang/String; */
/* .prologue */
/* .line 180 */
/* iget-boolean v0, p0, Lde/hellowins/UnityApiHttpRequest;->error:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 181 */
v0 = this.callback;
/* .line 185 */
} // :goto_0
return;
/* .line 183 */
} // :cond_0
v0 = this.callback;
} // .end method
