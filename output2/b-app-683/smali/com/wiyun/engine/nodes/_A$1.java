class com.wiyun.engine.nodes._A$1 extends java.lang.Thread {
	 /* .source "_A.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/nodes/_A;->s(Landroid/content/Context;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private final android.content.Context a; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes._A$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.a = p1;
/* .line 182 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 11 */
/* .prologue */
/* .line 185 */
/* const/16 v5, 0xa */
android.os.Process .setThreadPriority ( v5 );
/* .line 186 */
android.os.Looper .prepare ( );
/* .line 190 */
v5 = this.a;
com.wiyun.engine.nodes.f .a ( v5 );
/* .line 191 */
com.wiyun.engine.nodes.d .a ( );
/* .line 194 */
/* sget-boolean v5, Lcom/wiyun/engine/nodes/_A;->a:Z */
if ( v5 != null) { // if-eqz v5, :cond_0
	 /* .line 253 */
} // :goto_0
return;
/* .line 198 */
} // :cond_0
com.wiyun.engine.nodes._A .a ( );
/* .line 202 */
/* .local v1, "client":Lorg/apache/http/impl/client/DefaultHttpClient; */
try { // :try_start_0
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v5 = "http://d.wiyun.com/wiengine/r"; // const-string v5, "http://d.wiyun.com/wiengine/r"
/* invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 205 */
/* .local v0, "buf":Ljava/lang/StringBuilder; */
/* const/16 v5, 0x3f */
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 206 */
final String v6 = "u"; // const-string v6, "u"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 207 */
final String v6 = "="; // const-string v6, "="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 208 */
com.wiyun.engine.nodes._A .b ( );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 211 */
final String v5 = "c"; // const-string v5, "c"
v6 = this.a;
com.wiyun.engine.nodes._A .a ( v6 );
com.wiyun.engine.nodes._A .a ( v0,v5,v6 );
/* .line 214 */
final String v5 = "pkg"; // const-string v5, "pkg"
v6 = this.a;
(( android.content.Context ) v6 ).getPackageName ( ); // invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
com.wiyun.engine.nodes._A .a ( v0,v5,v6 );
/* .line 217 */
final String v5 = "l"; // const-string v5, "l"
java.util.Locale .getDefault ( );
(( java.util.Locale ) v6 ).getLanguage ( ); // invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
com.wiyun.engine.nodes._A .a ( v0,v5,v6 );
/* .line 220 */
final String v6 = "o"; // const-string v6, "o"
v5 = com.wiyun.engine.nodes._A .c ( );
if ( v5 != null) { // if-eqz v5, :cond_2
	 final String v5 = "Android Emulator"; // const-string v5, "Android Emulator"
} // :goto_1
com.wiyun.engine.nodes._A .a ( v0,v6,v5 );
/* .line 223 */
final String v5 = "v"; // const-string v5, "v"
v6 = android.os.Build$VERSION.RELEASE;
com.wiyun.engine.nodes._A .a ( v0,v5,v6 );
/* .line 226 */
final String v5 = "ev"; // const-string v5, "ev"
com.wiyun.engine.nodes.Director .getVersion ( );
com.wiyun.engine.nodes._A .a ( v0,v5,v6 );
/* .line 229 */
final String v5 = "b"; // const-string v5, "b"
v6 = android.os.Build.BRAND;
com.wiyun.engine.nodes._A .a ( v0,v5,v6 );
/* .line 232 */
final String v5 = "m"; // const-string v5, "m"
v6 = android.os.Build.MODEL;
com.wiyun.engine.nodes._A .a ( v0,v5,v6 );
/* .line 235 */
v5 = this.a;
(( android.content.Context ) v5 ).getResources ( ); // invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v5 ).getDisplayMetrics ( ); // invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 236 */
/* .local v2, "dm":Landroid/util/DisplayMetrics; */
final String v5 = "d"; // const-string v5, "d"
final String v6 = "%dx%dx%d"; // const-string v6, "%dx%dx%d"
int v7 = 3; // const/4 v7, 0x3
/* new-array v7, v7, [Ljava/lang/Object; */
int v8 = 0; // const/4 v8, 0x0
/* iget v9, v2, Landroid/util/DisplayMetrics;->widthPixels:I */
java.lang.Integer .valueOf ( v9 );
/* aput-object v9, v7, v8 */
int v8 = 1; // const/4 v8, 0x1
/* iget v9, v2, Landroid/util/DisplayMetrics;->heightPixels:I */
java.lang.Integer .valueOf ( v9 );
/* aput-object v9, v7, v8 */
int v8 = 2; // const/4 v8, 0x2
/* iget v9, v2, Landroid/util/DisplayMetrics;->density:F */
/* const/high16 v10, 0x43200000 # 160.0f */
/* mul-float/2addr v9, v10 */
/* float-to-int v9, v9 */
java.lang.Integer .valueOf ( v9 );
/* aput-object v9, v7, v8 */
java.lang.String .format ( v6,v7 );
com.wiyun.engine.nodes._A .a ( v0,v5,v6 );
/* .line 239 */
/* new-instance v3, Lorg/apache/http/client/methods/HttpGet; */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.wiyun.engine.nodes._A .a ( v5 );
/* invoke-direct {v3, v5}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 242 */
/* .local v3, "method":Lorg/apache/http/client/methods/HttpGet; */
(( org.apache.http.impl.client.DefaultHttpClient ) v1 ).execute ( v3 ); // invoke-virtual {v1, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
/* .line 243 */
v5 = /* .local v4, "resp":Lorg/apache/http/HttpResponse; */
/* const/16 v6, 0x12c */
/* if-ge v5, v6, :cond_1 */
/* .line 244 */
int v5 = 1; // const/4 v5, 0x1
com.wiyun.engine.nodes._A.a = (v5!= 0);
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
/* .line 247 */
} // :cond_1
(( org.apache.http.impl.client.DefaultHttpClient ) v1 ).getConnectionManager ( ); // invoke-virtual {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
/* .line 249 */
/* const-class v6, Lcom/wiyun/engine/nodes/_A; */
/* monitor-enter v6 */
/* .line 250 */
int v5 = 0; // const/4 v5, 0x0
try { // :try_start_1
com.wiyun.engine.nodes._A .a ( v5 );
/* .line 249 */
/* monitor-exit v6 */
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception v5 */
/* monitor-exit v6 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v5 */
/* .line 220 */
} // .end local v2 # "dm":Landroid/util/DisplayMetrics;
} // .end local v3 # "method":Lorg/apache/http/client/methods/HttpGet;
} // .end local v4 # "resp":Lorg/apache/http/HttpResponse;
} // :cond_2
try { // :try_start_2
final String v5 = "Android"; // const-string v5, "Android"
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
/* goto/16 :goto_1 */
/* .line 245 */
} // .end local v0 # "buf":Ljava/lang/StringBuilder;
/* :catch_0 */
/* move-exception v5 */
/* .line 247 */
(( org.apache.http.impl.client.DefaultHttpClient ) v1 ).getConnectionManager ( ); // invoke-virtual {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
/* .line 249 */
/* const-class v6, Lcom/wiyun/engine/nodes/_A; */
/* monitor-enter v6 */
/* .line 250 */
int v5 = 0; // const/4 v5, 0x0
try { // :try_start_3
com.wiyun.engine.nodes._A .a ( v5 );
/* .line 249 */
/* monitor-exit v6 */
/* goto/16 :goto_0 */
/* :catchall_1 */
/* move-exception v5 */
/* monitor-exit v6 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* throw v5 */
/* .line 246 */
/* :catchall_2 */
/* move-exception v5 */
/* .line 247 */
(( org.apache.http.impl.client.DefaultHttpClient ) v1 ).getConnectionManager ( ); // invoke-virtual {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
/* .line 249 */
/* const-class v6, Lcom/wiyun/engine/nodes/_A; */
/* monitor-enter v6 */
/* .line 250 */
int v7 = 0; // const/4 v7, 0x0
try { // :try_start_4
com.wiyun.engine.nodes._A .a ( v7 );
/* .line 249 */
/* monitor-exit v6 */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_3 */
/* .line 252 */
/* throw v5 */
/* .line 249 */
/* :catchall_3 */
/* move-exception v5 */
try { // :try_start_5
/* monitor-exit v6 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_3 */
/* throw v5 */
} // .end method
