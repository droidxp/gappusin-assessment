class com.mobfox.video.sdk.TrackerService$1 implements java.lang.Runnable {
	 /* .source "TrackerService.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/TrackerService;->startTracking()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # direct methods */
 com.mobfox.video.sdk.TrackerService$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 139 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 1 */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 14 */
/* .prologue */
/* const/16 v13, 0x3a98 */
int v12 = 0; // const/4 v12, 0x0
int v11 = 3; // const/4 v11, 0x3
/* .line 143 */
com.mobfox.video.sdk.TrackerService .access$0 ( v12 );
/* .line 144 */
} // :goto_0
v7 = com.mobfox.video.sdk.TrackerService .access$1 ( );
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 214 */
com.mobfox.video.sdk.TrackerService .access$0 ( v12 );
/* .line 215 */
com.mobfox.video.sdk.TrackerService .access$7 ( v12 );
/* .line 216 */
int v7 = 0; // const/4 v7, 0x0
com.mobfox.video.sdk.TrackerService .access$8 ( v7 );
/* .line 217 */
return;
/* .line 146 */
} // :cond_0
com.mobfox.video.sdk.TrackerService .access$3 ( );
/* .line 147 */
/* .local v2, "event":Lcom/mobfox/video/sdk/TrackEvent; */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
v7 = android.util.Log .isLoggable ( v7,v11 );
if ( v7 != null) { // if-eqz v7, :cond_1
/* .line 148 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
/* .line 149 */
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "Sending tracking :"; // const-string v9, "Sending tracking :"
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v9 = this.url;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 150 */
final String v9 = " Time:"; // const-string v9, " Time:"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 151 */
/* iget-wide v9, v2, Lcom/mobfox/video/sdk/TrackEvent;->timestamp:J */
(( java.lang.StringBuilder ) v8 ).append ( v9, v10 ); // invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* .line 152 */
final String v9 = " Events left:"; // const-string v9, " Events left:"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 153 */
v9 = com.mobfox.video.sdk.TrackerService .access$4 ( );
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 149 */
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 148 */
android.util.Log .d ( v7,v8 );
/* .line 155 */
} // :cond_1
/* if-nez v2, :cond_4 */
/* .line 145 */
} // .end local v2 # "event":Lcom/mobfox/video/sdk/TrackEvent;
} // :cond_2
} // :goto_1
v7 = com.mobfox.video.sdk.TrackerService .access$2 ( );
if ( v7 != null) { // if-eqz v7, :cond_3
v7 = com.mobfox.video.sdk.TrackerService .access$1 ( );
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 200 */
} // :cond_3
v7 = com.mobfox.video.sdk.TrackerService .access$1 ( );
/* if-nez v7, :cond_8 */
v7 = com.mobfox.video.sdk.TrackerService .access$5 ( );
/* if-nez v7, :cond_8 */
/* .line 202 */
/* const-wide/16 v7, 0x7530 */
try { // :try_start_0
java.lang.Thread .sleep ( v7,v8 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
/* .line 206 */
} // :goto_2
com.mobfox.video.sdk.TrackerService .access$6 ( );
/* monitor-enter v8 */
/* .line 207 */
try { // :try_start_1
com.mobfox.video.sdk.TrackerService .access$4 ( );
com.mobfox.video.sdk.TrackerService .access$5 ( );
/* .line 208 */
com.mobfox.video.sdk.TrackerService .access$5 ( );
/* .line 206 */
/* monitor-exit v8 */
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception v7 */
/* monitor-exit v8 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v7 */
/* .line 157 */
/* .restart local v2 # "event":Lcom/mobfox/video/sdk/TrackEvent; */
} // :cond_4
int v6 = 0; // const/4 v6, 0x0
/* .line 159 */
/* .local v6, "u":Ljava/net/URL; */
try { // :try_start_2
/* new-instance v6, Ljava/net/URL; */
} // .end local v6 # "u":Ljava/net/URL;
v7 = this.url;
/* invoke-direct {v6, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* :try_end_2 */
/* .catch Ljava/net/MalformedURLException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 168 */
/* .restart local v6 # "u":Ljava/net/URL; */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
v7 = android.util.Log .isLoggable ( v7,v11 );
if ( v7 != null) { // if-eqz v7, :cond_5
/* .line 169 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
final String v8 = "Sending conversion Request"; // const-string v8, "Sending conversion Request"
android.util.Log .d ( v7,v8 );
/* .line 171 */
} // :cond_5
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
v7 = android.util.Log .isLoggable ( v7,v11 );
if ( v7 != null) { // if-eqz v7, :cond_6
/* .line 172 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
/* .line 173 */
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "Perform tracking HTTP Get Url: "; // const-string v9, "Perform tracking HTTP Get Url: "
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 174 */
v9 = this.url;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 173 */
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 172 */
android.util.Log .d ( v7,v8 );
/* .line 176 */
} // :cond_6
/* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* .line 178 */
/* .local v0, "client":Lorg/apache/http/impl/client/DefaultHttpClient; */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
/* .line 177 */
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v7,v13 );
/* .line 181 */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
/* .line 180 */
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v7,v13 );
/* .line 183 */
/* new-instance v3, Lorg/apache/http/client/methods/HttpGet; */
(( java.net.URL ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/net/URL;->toString()Ljava/lang/String;
/* invoke-direct {v3, v7}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 186 */
/* .local v3, "get":Lorg/apache/http/client/methods/HttpGet; */
try { // :try_start_3
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).execute ( v3 ); // invoke-virtual {v0, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
/* .line 187 */
/* .local v4, "response":Lorg/apache/http/HttpResponse; */
v7 = /* .line 188 */
/* const/16 v8, 0xc8 */
/* .line 187 */
/* if-eq v7, v8, :cond_7 */
/* .line 189 */
com.mobfox.video.sdk.TrackerService .requestRetry ( v2 );
/* :try_end_3 */
/* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_0 */
/* goto/16 :goto_1 */
/* .line 195 */
} // .end local v4 # "response":Lorg/apache/http/HttpResponse;
/* :catch_0 */
/* move-exception v5 */
/* .line 196 */
/* .local v5, "t":Ljava/lang/Throwable; */
com.mobfox.video.sdk.TrackerService .requestRetry ( v2 );
/* goto/16 :goto_1 */
/* .line 160 */
} // .end local v0 # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
} // .end local v3 # "get":Lorg/apache/http/client/methods/HttpGet;
} // .end local v5 # "t":Ljava/lang/Throwable;
} // .end local v6 # "u":Ljava/net/URL;
/* :catch_1 */
/* move-exception v1 */
/* .line 161 */
/* .local v1, "e":Ljava/net/MalformedURLException; */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
v7 = android.util.Log .isLoggable ( v7,v11 );
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 162 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "Wrong tracking url:"; // const-string v9, "Wrong tracking url:"
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 163 */
v9 = this.url;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 162 */
android.util.Log .d ( v7,v8 );
/* goto/16 :goto_1 */
/* .line 191 */
} // .end local v1 # "e":Ljava/net/MalformedURLException;
/* .restart local v0 # "client":Lorg/apache/http/impl/client/DefaultHttpClient; */
/* .restart local v3 # "get":Lorg/apache/http/client/methods/HttpGet; */
/* .restart local v4 # "response":Lorg/apache/http/HttpResponse; */
/* .restart local v6 # "u":Ljava/net/URL; */
} // :cond_7
try { // :try_start_4
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
int v8 = 3; // const/4 v8, 0x3
v7 = android.util.Log .isLoggable ( v7,v8 );
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 192 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
final String v8 = "Tracking OK"; // const-string v8, "Tracking OK"
android.util.Log .d ( v7,v8 );
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_0 */
/* goto/16 :goto_1 */
/* .line 211 */
} // .end local v0 # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
} // .end local v2 # "event":Lcom/mobfox/video/sdk/TrackEvent;
} // .end local v3 # "get":Lorg/apache/http/client/methods/HttpGet;
} // .end local v4 # "response":Lorg/apache/http/HttpResponse;
} // .end local v6 # "u":Ljava/net/URL;
} // :cond_8
int v7 = 1; // const/4 v7, 0x1
com.mobfox.video.sdk.TrackerService .access$0 ( v7 );
/* goto/16 :goto_0 */
/* .line 203 */
/* :catch_2 */
/* move-exception v7 */
/* goto/16 :goto_2 */
} // .end method
