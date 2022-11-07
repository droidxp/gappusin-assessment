public abstract class com.umeng.analytics.d implements com.umeng.analytics.i implements com.umeng.analytics.onlineconfig.c {
	 /* .source "PolicyManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/umeng/analytics/d$a;, */
	 /* Lcom/umeng/analytics/d$b; */
	 /* } */
} // .end annotation
/* # instance fields */
private final com.umeng.analytics.a a;
private final java.lang.Object b;
private final android.os.Handler c;
protected final com.umeng.analytics.c d;
protected final com.umeng.analytics.a.f e;
protected final Integer f;
protected final Integer g;
protected final Integer h;
protected final Integer i;
protected final Integer j;
java.lang.String k;
java.lang.String l;
private final java.lang.String m;
private final java.lang.String n;
private Integer o;
private Long p;
private Long q;
private Long r;
private Boolean s;
/* # direct methods */
public com.umeng.analytics.d ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 int v3 = 0; // const/4 v3, 0x0
	 /* const-wide/16 v1, -0x1 */
	 /* .line 74 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 46 */
	 /* new-instance v0, Lcom/umeng/analytics/a; */
	 /* invoke-direct {v0}, Lcom/umeng/analytics/a;-><init>()V */
	 this.a = v0;
	 /* .line 48 */
	 /* new-instance v0, Ljava/lang/Object; */
	 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
	 this.b = v0;
	 /* .line 51 */
	 /* new-instance v0, Lcom/umeng/analytics/c; */
	 /* invoke-direct {v0}, Lcom/umeng/analytics/c;-><init>()V */
	 this.d = v0;
	 /* .line 52 */
	 /* new-instance v0, Lcom/umeng/analytics/a/f; */
	 /* invoke-direct {v0}, Lcom/umeng/analytics/a/f;-><init>()V */
	 this.e = v0;
	 /* .line 54 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput v0, p0, Lcom/umeng/analytics/d;->f:I */
	 /* .line 55 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* iput v0, p0, Lcom/umeng/analytics/d;->g:I */
	 /* .line 56 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* iput v0, p0, Lcom/umeng/analytics/d;->h:I */
	 /* .line 58 */
	 int v0 = 4; // const/4 v0, 0x4
	 /* iput v0, p0, Lcom/umeng/analytics/d;->i:I */
	 /* .line 59 */
	 int v0 = 5; // const/4 v0, 0x5
	 /* iput v0, p0, Lcom/umeng/analytics/d;->j:I */
	 /* .line 61 */
	 final String v0 = "body"; // const-string v0, "body"
	 this.m = v0;
	 /* .line 62 */
	 final String v0 = "header"; // const-string v0, "header"
	 this.n = v0;
	 /* .line 64 */
	 int v0 = -1; // const/4 v0, -0x1
	 /* iput v0, p0, Lcom/umeng/analytics/d;->o:I */
	 /* .line 65 */
	 /* iput-wide v1, p0, Lcom/umeng/analytics/d;->p:J */
	 /* .line 66 */
	 /* iput-wide v1, p0, Lcom/umeng/analytics/d;->q:J */
	 /* .line 67 */
	 /* iput-wide v1, p0, Lcom/umeng/analytics/d;->r:J */
	 /* .line 69 */
	 this.k = v3;
	 /* .line 70 */
	 this.l = v3;
	 /* .line 72 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/umeng/analytics/d;->s:Z */
	 /* .line 76 */
	 /* new-instance v0, Landroid/os/HandlerThread; */
	 final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
	 /* invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V */
	 /* .line 77 */
	 (( android.os.HandlerThread ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
	 /* .line 78 */
	 /* new-instance v1, Landroid/os/Handler; */
	 (( android.os.HandlerThread ) v0 ).getLooper ( ); // invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
	 /* invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
	 this.c = v1;
	 /* .line 79 */
	 return;
} // .end method
static java.lang.Object a ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 48 */
	 v0 = this.b;
} // .end method
private java.lang.String a ( android.content.Context p0, org.json.JSONObject p1, java.lang.String p2 ) {
	 /* .locals 8 */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 335 */
	 /* new-instance v1, Lorg/apache/http/client/methods/HttpPost; */
	 /* invoke-direct {v1, p3}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
	 /* .line 336 */
	 /* new-instance v2, Lorg/apache/http/params/BasicHttpParams; */
	 /* invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
	 /* .line 337 */
	 /* const/16 v3, 0x2710 */
	 org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v2,v3 );
	 /* .line 338 */
	 /* const/16 v3, 0x7530 */
	 org.apache.http.params.HttpConnectionParams .setSoTimeout ( v2,v3 );
	 /* .line 339 */
	 /* new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient; */
	 /* invoke-direct {v3, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V */
	 /* .line 342 */
	 final String v2 = "X-Umeng-Sdk"; // const-string v2, "X-Umeng-Sdk"
	 /* invoke-direct {p0, p1}, Lcom/umeng/analytics/d;->c(Landroid/content/Context;)Ljava/lang/String; */
	 (( org.apache.http.client.methods.HttpPost ) v1 ).addHeader ( v2, v4 ); // invoke-virtual {v1, v2, v4}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 345 */
	 try { // :try_start_0
		 com.umeng.analytics.h .a ( p1 );
		 /* .line 346 */
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 347 */
			 /* new-instance v4, Lorg/apache/http/HttpHost; */
			 /* const/16 v5, 0x50 */
			 /* invoke-direct {v4, v2, v5}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V */
			 /* .line 348 */
			 /* .line 349 */
			 final String v5 = "http.route.default-proxy"; // const-string v5, "http.route.default-proxy"
			 /* .line 348 */
			 /* .line 352 */
		 } // :cond_0
		 (( org.json.JSONObject ) p2 ).toString ( ); // invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
		 /* .line 354 */
		 final String v4 = "MobclickAgent"; // const-string v4, "MobclickAgent"
		 com.umeng.common.Log .a ( v4,v2 );
		 /* .line 356 */
		 /* sget-boolean v4, Lcom/umeng/analytics/g;->t:Z */
		 if ( v4 != null) { // if-eqz v4, :cond_2
			 /* .line 357 */
			 /* new-instance v4, Ljava/lang/StringBuilder; */
			 final String v5 = "content="; // const-string v5, "content="
			 /* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 358 */
			 final String v4 = "utf-8"; // const-string v4, "utf-8"
			 com.umeng.common.util.f .a ( v2,v4 );
			 /* .line 359 */
			 final String v4 = "Content-Encoding"; // const-string v4, "Content-Encoding"
			 final String v5 = "deflate"; // const-string v5, "deflate"
			 (( org.apache.http.client.methods.HttpPost ) v1 ).addHeader ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
			 /* .line 360 */
			 /* new-instance v4, Lorg/apache/http/entity/InputStreamEntity; */
			 /* .line 361 */
			 /* new-instance v5, Ljava/io/ByteArrayInputStream; */
			 /* invoke-direct {v5, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
			 /* .line 362 */
			 /* int-to-long v6, v2 */
			 /* .line 360 */
			 /* invoke-direct {v4, v5, v6, v7}, Lorg/apache/http/entity/InputStreamEntity;-><init>(Ljava/io/InputStream;J)V */
			 /* .line 363 */
			 (( org.apache.http.client.methods.HttpPost ) v1 ).setEntity ( v4 ); // invoke-virtual {v1, v4}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
			 /* .line 372 */
		 } // :goto_0
		 /* new-instance v2, Ljava/util/Date; */
		 /* invoke-direct {v2}, Ljava/util/Date;-><init>()V */
		 /* .line 373 */
		 /* .line 374 */
		 /* new-instance v3, Ljava/util/Date; */
		 /* invoke-direct {v3}, Ljava/util/Date;-><init>()V */
		 /* .line 375 */
		 (( java.util.Date ) v3 ).getTime ( ); // invoke-virtual {v3}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v3 */
		 (( java.util.Date ) v2 ).getTime ( ); // invoke-virtual {v2}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v5 */
		 /* sub-long v2, v3, v5 */
		 /* iput-wide v2, p0, Lcom/umeng/analytics/d;->r:J */
		 v2 = 		 /* .line 377 */
		 /* const/16 v3, 0xc8 */
		 /* if-ne v2, v3, :cond_1 */
		 /* .line 378 */
		 final String v2 = "MobclickAgent"; // const-string v2, "MobclickAgent"
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 final String v4 = "Sent message to "; // const-string v4, "Sent message to "
		 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v3 ).append ( p3 ); // invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.umeng.common.Log .a ( v2,v3 );
		 /* .line 380 */
		 /* .line 382 */
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 383 */
			 /* .line 384 */
			 /* invoke-direct {p0, v1}, Lcom/umeng/analytics/d;->a(Ljava/io/InputStream;)Ljava/lang/String; */
			 /* .line 400 */
		 } // :cond_1
	 } // :goto_1
	 /* .line 365 */
} // :cond_2
/* new-instance v4, Ljava/util/ArrayList; */
/* .line 366 */
int v5 = 1; // const/4 v5, 0x1
/* .line 365 */
/* invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 367 */
/* new-instance v5, Lorg/apache/http/message/BasicNameValuePair; */
final String v6 = "content"; // const-string v6, "content"
/* invoke-direct {v5, v6, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 368 */
/* new-instance v2, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
/* .line 369 */
final String v5 = "UTF-8"; // const-string v5, "UTF-8"
/* invoke-direct {v2, v4, v5}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V */
/* .line 368 */
(( org.apache.http.client.methods.HttpPost ) v1 ).setEntity ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
/* :try_end_0 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 393 */
/* :catch_0 */
/* move-exception v1 */
/* .line 395 */
final String v2 = "MobclickAgent"; // const-string v2, "MobclickAgent"
/* .line 396 */
final String v3 = "ClientProtocolException,Failed to send message."; // const-string v3, "ClientProtocolException,Failed to send message."
/* .line 395 */
com.umeng.common.Log .b ( v2,v3,v1 );
/* .line 398 */
/* :catch_1 */
/* move-exception v1 */
/* .line 399 */
final String v2 = "MobclickAgent"; // const-string v2, "MobclickAgent"
final String v3 = "IOException,Failed to send message."; // const-string v3, "IOException,Failed to send message."
com.umeng.common.Log .b ( v2,v3,v1 );
} // .end method
private java.lang.String a ( java.io.InputStream p0 ) {
/* .locals 5 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 308 */
/* new-instance v1, Ljava/io/BufferedReader; */
/* new-instance v2, Ljava/io/InputStreamReader; */
/* invoke-direct {v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
/* const/16 v3, 0x40 */
/* invoke-direct {v1, v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V */
/* .line 309 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 313 */
} // :goto_0
try { // :try_start_0
(( java.io.BufferedReader ) v1 ).readLine ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v3, :cond_0 */
/* .line 322 */
try { // :try_start_1
	 (( java.io.InputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->close()V
	 /* :try_end_1 */
	 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_3 */
	 /* .line 330 */
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_1
/* .line 314 */
} // :cond_0
try { // :try_start_2
/* new-instance v4, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v3 );
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "\n"; // const-string v3, "\n"
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 316 */
/* :catch_0 */
/* move-exception v1 */
/* .line 317 */
try { // :try_start_3
	 final String v2 = "MobclickAgent"; // const-string v2, "MobclickAgent"
	 /* .line 318 */
	 final String v3 = "Caught IOException in convertStreamToString()"; // const-string v3, "Caught IOException in convertStreamToString()"
	 /* .line 317 */
	 com.umeng.common.Log .b ( v2,v3,v1 );
	 /* :try_end_3 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
	 /* .line 322 */
	 try { // :try_start_4
		 (( java.io.InputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->close()V
		 /* :try_end_4 */
		 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_1 */
		 /* .line 323 */
		 /* :catch_1 */
		 /* move-exception v1 */
		 /* .line 324 */
		 final String v2 = "MobclickAgent"; // const-string v2, "MobclickAgent"
		 /* .line 325 */
		 final String v3 = "Caught IOException in convertStreamToString()"; // const-string v3, "Caught IOException in convertStreamToString()"
		 /* .line 324 */
		 com.umeng.common.Log .b ( v2,v3,v1 );
		 /* .line 320 */
		 /* :catchall_0 */
		 /* move-exception v1 */
		 /* .line 322 */
		 try { // :try_start_5
			 (( java.io.InputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->close()V
			 /* :try_end_5 */
			 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
			 /* .line 329 */
			 /* throw v1 */
			 /* .line 323 */
			 /* :catch_2 */
			 /* move-exception v1 */
			 /* .line 324 */
			 final String v2 = "MobclickAgent"; // const-string v2, "MobclickAgent"
			 /* .line 325 */
			 final String v3 = "Caught IOException in convertStreamToString()"; // const-string v3, "Caught IOException in convertStreamToString()"
			 /* .line 324 */
			 com.umeng.common.Log .b ( v2,v3,v1 );
			 /* .line 323 */
			 /* :catch_3 */
			 /* move-exception v1 */
			 /* .line 324 */
			 final String v2 = "MobclickAgent"; // const-string v2, "MobclickAgent"
			 /* .line 325 */
			 final String v3 = "Caught IOException in convertStreamToString()"; // const-string v3, "Caught IOException in convertStreamToString()"
			 /* .line 324 */
			 com.umeng.common.Log .b ( v2,v3,v1 );
		 } // .end method
		 private void a ( android.content.Context p0 ) {
			 /* .locals 4 */
			 /* .prologue */
			 /* .line 110 */
			 /* iget v0, p0, Lcom/umeng/analytics/d;->o:I */
			 int v1 = -1; // const/4 v1, -0x1
			 /* if-eq v0, v1, :cond_1 */
			 /* .line 124 */
		 } // :cond_0
	 } // :goto_0
	 return;
	 /* .line 114 */
} // :cond_1
com.umeng.analytics.j .i ( p1 );
/* .line 116 */
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v0, v1 */
/* iput v1, p0, Lcom/umeng/analytics/d;->o:I */
/* .line 117 */
int v1 = 1; // const/4 v1, 0x1
/* aget v0, v0, v1 */
/* int-to-long v0, v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/d;->p:J */
/* .line 119 */
/* iget v0, p0, Lcom/umeng/analytics/d;->o:I */
int v1 = 4; // const/4 v1, 0x4
/* if-eq v0, v1, :cond_2 */
/* iget v0, p0, Lcom/umeng/analytics/d;->o:I */
int v1 = 6; // const/4 v1, 0x6
/* if-ne v0, v1, :cond_0 */
/* .line 120 */
} // :cond_2
com.umeng.analytics.j .e ( p1 );
/* .line 122 */
final String v1 = "last_report_time"; // const-string v1, "last_report_time"
/* const-wide/16 v2, -0x1 */
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/d;->q:J */
} // .end method
static void a ( Object p0, android.content.Context p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 227 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/d;->d(Landroid/content/Context;)V */
return;
} // .end method
private void b ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 133 */
/* iget v0, p0, Lcom/umeng/analytics/d;->o:I */
int v1 = 6; // const/4 v1, 0x6
/* if-eq v0, v1, :cond_0 */
/* iget v0, p0, Lcom/umeng/analytics/d;->o:I */
int v1 = 4; // const/4 v1, 0x4
/* if-ne v0, v1, :cond_1 */
/* .line 135 */
} // :cond_0
com.umeng.analytics.j .e ( p1 );
/* .line 137 */
final String v1 = "last_report_time"; // const-string v1, "last_report_time"
/* iget-wide v2, p0, Lcom/umeng/analytics/d;->q:J */
/* .line 140 */
} // :cond_1
/* iget-wide v0, p0, Lcom/umeng/analytics/d;->r:J */
/* const-wide/16 v2, -0x1 */
/* cmp-long v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 141 */
v0 = this.e;
/* iget-wide v1, p0, Lcom/umeng/analytics/d;->r:J */
/* iput-wide v1, v0, Lcom/umeng/analytics/a/f;->f:J */
/* .line 143 */
com.umeng.analytics.j .c ( p1 );
/* .line 144 */
final String v1 = "req_time"; // const-string v1, "req_time"
/* iget-wide v2, p0, Lcom/umeng/analytics/d;->r:J */
/* .line 147 */
} // :cond_2
return;
} // .end method
private java.lang.String c ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 192 */
v0 = this.e;
v0 = (( com.umeng.analytics.a.f ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/a/f;->b()Z
/* if-nez v0, :cond_0 */
/* .line 193 */
v0 = this.e;
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
v3 = this.l;
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
v3 = this.k;
/* aput-object v3, v1, v2 */
(( com.umeng.analytics.a.f ) v0 ).b ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/umeng/analytics/a/f;->b(Landroid/content/Context;[Ljava/lang/String;)V
/* .line 196 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 197 */
v0 = this.e;
v0 = this.w;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 198 */
final String v0 = "/"; // const-string v0, "/"
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 199 */
v0 = this.e;
v0 = this.x;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 200 */
final String v0 = " "; // const-string v0, " "
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 203 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 204 */
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
(( android.content.pm.PackageManager ) v2 ).getApplicationLabel ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 205 */
final String v2 = "/"; // const-string v2, "/"
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 206 */
v2 = this.e;
v2 = this.t;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 207 */
final String v2 = " "; // const-string v2, " "
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 208 */
v2 = this.e;
v2 = this.g;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 209 */
final String v2 = "/"; // const-string v2, "/"
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 210 */
v2 = this.e;
v2 = this.i;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 212 */
final String v2 = " "; // const-string v2, " "
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 213 */
v2 = this.e;
v2 = this.d;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 215 */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
final String v2 = "UTF-8"; // const-string v2, "UTF-8"
java.net.URLEncoder .encode ( v0,v2 );
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 220 */
} // :goto_0
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 216 */
/* :catch_0 */
/* move-exception v0 */
/* .line 217 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
private void d ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 229 */
(( com.umeng.analytics.d ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/analytics/d;->g(Landroid/content/Context;)Lorg/json/JSONObject;
/* .line 231 */
if ( v2 != null) { // if-eqz v2, :cond_0
final String v0 = "body"; // const-string v0, "body"
v0 = (( org.json.JSONObject ) v2 ).isNull ( v0 ); // invoke-virtual {v2, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 257 */
} // :cond_0
} // :goto_0
return;
/* .line 235 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 236 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
v3 = com.umeng.analytics.g.r;
/* array-length v3, v3 */
/* if-lt v0, v3, :cond_3 */
/* .line 245 */
} // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 246 */
com.umeng.analytics.j .j ( p1 );
/* .line 247 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "send applog succeed :"; // const-string v3, "send applog succeed :"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .a ( v0,v1 );
/* .line 256 */
} // :goto_2
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/d;->b(Landroid/content/Context;)V */
/* .line 238 */
} // :cond_3
v1 = com.umeng.analytics.g.r;
/* aget-object v1, v1, v0 */
/* invoke-direct {p0, p1, v2, v1}, Lcom/umeng/analytics/d;->a(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String; */
/* .line 239 */
/* if-nez v1, :cond_2 */
/* .line 236 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 250 */
} // :cond_4
/* const-wide/16 v0, -0x1 */
/* iput-wide v0, p0, Lcom/umeng/analytics/d;->q:J */
/* .line 252 */
com.umeng.common.b .d ( p1 );
com.umeng.analytics.j .b ( p1,v2,v0 );
/* .line 253 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "send applog failed"; // const-string v1, "send applog failed"
com.umeng.common.Log .a ( v0,v1 );
} // .end method
/* # virtual methods */
public void a ( Integer p0, Long p1 ) {
/* .locals 0 */
/* .prologue */
/* .line 459 */
/* iput p1, p0, Lcom/umeng/analytics/d;->o:I */
/* .line 460 */
/* iput-wide p2, p0, Lcom/umeng/analytics/d;->p:J */
/* .line 461 */
return;
} // .end method
public synchronized void a ( android.content.Context p0, Integer p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 86 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget-boolean v0, p0, Lcom/umeng/analytics/d;->s:Z */
/* if-nez v0, :cond_0 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p2, v0, :cond_0 */
/* .line 87 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/d;->a(Landroid/content/Context;)V */
/* .line 88 */
(( com.umeng.analytics.d ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/analytics/d;->f(Landroid/content/Context;)V
/* .line 90 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/umeng/analytics/d;->s:Z */
/* .line 93 */
} // :cond_0
int v0 = 5; // const/4 v0, 0x5
/* if-ne p2, v0, :cond_2 */
/* .line 94 */
v0 = this.d;
(( com.umeng.analytics.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/c;->a(Landroid/content/Context;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 107 */
} // :cond_1
} // :goto_0
/* monitor-exit p0 */
return;
/* .line 98 */
} // :cond_2
try { // :try_start_1
v0 = (( com.umeng.analytics.d ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/d;->b(Landroid/content/Context;I)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 100 */
v0 = this.c;
/* new-instance v1, Lcom/umeng/analytics/d$b; */
/* invoke-direct {v1, p0, p1}, Lcom/umeng/analytics/d$b;-><init>(Lcom/umeng/analytics/d;Landroid/content/Context;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 103 */
} // :cond_3
v0 = this.d;
v0 = (( com.umeng.analytics.c ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/c;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 105 */
v0 = this.c;
/* new-instance v1, Lcom/umeng/analytics/d$a; */
/* invoke-direct {v1, p0, p1}, Lcom/umeng/analytics/d$a;-><init>(Lcom/umeng/analytics/d;Landroid/content/Context;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 86 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
Boolean b ( android.content.Context p0, Integer p1 ) {
/* .locals 6 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* .line 150 */
v2 = com.umeng.common.b .n ( p1 );
/* if-nez v2, :cond_1 */
/* .line 187 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
/* .line 154 */
} // :cond_1
/* packed-switch p2, :pswitch_data_0 */
/* .line 160 */
} // :cond_2
/* :pswitch_1 */
/* iget v2, p0, Lcom/umeng/analytics/d;->o:I */
/* if-nez v2, :cond_3 */
/* move v0, v1 */
/* .line 162 */
/* .line 156 */
/* :pswitch_2 */
/* iget v2, p0, Lcom/umeng/analytics/d;->o:I */
/* if-ne v2, v1, :cond_2 */
/* move v0, v1 */
/* .line 157 */
/* .line 163 */
} // :cond_3
/* iget v2, p0, Lcom/umeng/analytics/d;->o:I */
int v3 = 6; // const/4 v3, 0x6
/* if-ne v2, v3, :cond_4 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* iget-wide v4, p0, Lcom/umeng/analytics/d;->q:J */
/* sub-long/2addr v2, v4 */
/* iget-wide v4, p0, Lcom/umeng/analytics/d;->p:J */
/* cmp-long v2, v2, v4 */
/* if-lez v2, :cond_4 */
/* .line 165 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* iput-wide v2, p0, Lcom/umeng/analytics/d;->q:J */
/* move v0, v1 */
/* .line 167 */
/* .line 168 */
} // :cond_4
/* iget v2, p0, Lcom/umeng/analytics/d;->o:I */
int v3 = 4; // const/4 v3, 0x4
/* if-ne v2, v3, :cond_5 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* iget-wide v4, p0, Lcom/umeng/analytics/d;->q:J */
/* sub-long/2addr v2, v4 */
/* sget-wide v4, Lcom/umeng/analytics/g;->g:J */
/* cmp-long v2, v2, v4 */
/* if-lez v2, :cond_5 */
/* .line 170 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* iput-wide v2, p0, Lcom/umeng/analytics/d;->q:J */
/* move v0, v1 */
/* .line 172 */
/* .line 173 */
} // :cond_5
/* iget v2, p0, Lcom/umeng/analytics/d;->o:I */
int v3 = 5; // const/4 v3, 0x5
/* if-ne v2, v3, :cond_0 */
v2 = com.umeng.common.b .l ( p1 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* move v0, v1 */
/* .line 174 */
/* :pswitch_3 */
/* move v0, v1 */
/* .line 179 */
/* .line 154 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_3 */
/* :pswitch_0 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public void e ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 82 */
int v0 = 1; // const/4 v0, 0x1
(( com.umeng.analytics.d ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/umeng/analytics/d;->a(Landroid/content/Context;I)V
/* .line 83 */
return;
} // .end method
public void f ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 127 */
v0 = this.a;
(( com.umeng.analytics.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/a;->a(Landroid/content/Context;)V
/* .line 128 */
v0 = this.a;
(( com.umeng.analytics.a ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/umeng/analytics/a;->a(Lcom/umeng/analytics/i;)V
/* .line 129 */
return;
} // .end method
org.json.JSONObject g ( android.content.Context p0 ) {
/* .locals 6 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 261 */
/* new-instance v1, Lorg/json/JSONObject; */
/* invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V */
/* .line 265 */
try { // :try_start_0
v2 = this.e;
v2 = (( com.umeng.analytics.a.f ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/umeng/analytics/a/f;->b()Z
/* if-nez v2, :cond_0 */
/* .line 266 */
v2 = this.e;
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [Ljava/lang/String; */
int v4 = 0; // const/4 v4, 0x0
v5 = this.l;
/* aput-object v5, v3, v4 */
int v4 = 1; // const/4 v4, 0x1
v5 = this.k;
/* aput-object v5, v3, v4 */
(( com.umeng.analytics.a.f ) v2 ).b ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Lcom/umeng/analytics/a/f;->b(Landroid/content/Context;[Ljava/lang/String;)V
/* .line 269 */
} // :cond_0
v2 = this.e;
v2 = (( com.umeng.analytics.a.f ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/umeng/analytics/a/f;->a()Z
/* if-nez v2, :cond_1 */
/* .line 270 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "protocol Header need Appkey or Device ID ,Please check AndroidManifest.xml "; // const-string v2, "protocol Header need Appkey or Device ID ,Please check AndroidManifest.xml "
com.umeng.common.Log .b ( v1,v2 );
/* .line 304 */
} // :goto_0
/* .line 274 */
} // :cond_1
v2 = this.d;
(( com.umeng.analytics.c ) v2 ).b ( p1 ); // invoke-virtual {v2, p1}, Lcom/umeng/analytics/c;->b(Landroid/content/Context;)V
/* .line 276 */
v2 = this.d;
v2 = (( com.umeng.analytics.c ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/umeng/analytics/c;->a()I
/* if-gtz v2, :cond_2 */
/* .line 277 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "no message to send"; // const-string v2, "no message to send"
com.umeng.common.Log .c ( v1,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Error; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 296 */
/* :catch_0 */
/* move-exception v1 */
/* .line 297 */
final String v2 = "MobclickAgent"; // const-string v2, "MobclickAgent"
final String v3 = ""; // const-string v3, ""
com.umeng.common.Log .b ( v2,v3,v1 );
/* .line 298 */
com.umeng.analytics.j .j ( p1 );
/* .line 281 */
} // :cond_2
try { // :try_start_1
v2 = this.d;
v2 = (( com.umeng.analytics.c ) v2 ).c ( ); // invoke-virtual {v2}, Lcom/umeng/analytics/c;->c()Z
/* if-nez v2, :cond_3 */
/* .line 282 */
/* new-instance v1, Ljava/lang/Exception; */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "protocol Body has invalid field: "; // const-string v3, "protocol Body has invalid field: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.d;
(( com.umeng.analytics.c ) v3 ).d ( ); // invoke-virtual {v3}, Lcom/umeng/analytics/c;->d()Lorg/json/JSONObject;
(( org.json.JSONObject ) v3 ).toString ( ); // invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/lang/Error; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 299 */
/* :catch_1 */
/* move-exception v1 */
/* .line 300 */
final String v2 = "MobclickAgent"; // const-string v2, "MobclickAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Error:"; // const-string v4, "Error:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Error ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Error;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .b ( v2,v1 );
/* .line 301 */
com.umeng.analytics.j .j ( p1 );
/* .line 285 */
} // :cond_3
try { // :try_start_2
final String v2 = "header"; // const-string v2, "header"
/* new-instance v3, Lcom/umeng/analytics/e; */
/* invoke-direct {v3, p0}, Lcom/umeng/analytics/e;-><init>(Lcom/umeng/analytics/d;)V */
(( org.json.JSONObject ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 290 */
final String v2 = "body"; // const-string v2, "body"
v3 = this.d;
(( com.umeng.analytics.c ) v3 ).d ( ); // invoke-virtual {v3}, Lcom/umeng/analytics/c;->d()Lorg/json/JSONObject;
(( org.json.JSONObject ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 292 */
v2 = this.d;
(( com.umeng.analytics.c ) v2 ).e ( ); // invoke-virtual {v2}, Lcom/umeng/analytics/c;->e()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catch Ljava/lang/Error; {:try_start_2 ..:try_end_2} :catch_1 */
/* move-object v0, v1 */
/* .line 294 */
/* goto/16 :goto_0 */
} // .end method
