public class inal implements android.location.LocationListener {
	 /* # interfaces */
	 /* # static fields */
	 static java.lang.String a;
	 private static final java.lang.String b;
	 private static volatile java.lang.String c;
	 private static volatile java.lang.String d;
	 private static volatile java.lang.String e;
	 private static volatile java.lang.String f;
	 private static volatile java.lang.String g;
	 private static volatile java.lang.String h;
	 private static volatile java.lang.String i;
	 private static final com.flurry.android.FlurryAgent j;
	 private static Long k;
	 private static Boolean l;
	 private static Boolean m;
	 private static Boolean n;
	 private static Boolean o;
	 private static android.location.Criteria p;
	 private static Boolean q;
	 private static com.flurry.android.AppCircle r;
	 /* # instance fields */
	 private java.lang.String A;
	 private java.lang.String B;
	 private Boolean C;
	 private java.util.List D;
	 private android.location.LocationManager E;
	 private java.lang.String F;
	 private Boolean G;
	 private Long H;
	 private java.util.List I;
	 private Long J;
	 private Long K;
	 private Long L;
	 private java.lang.String M;
	 private java.lang.String N;
	 private Object O;
	 private java.lang.String P;
	 private Object Q;
	 private java.lang.Long R;
	 private Integer S;
	 private android.location.Location T;
	 private java.util.Map U;
	 private java.util.List V;
	 private Boolean W;
	 private Integer X;
	 private java.util.List Y;
	 private Integer Z;
	 private com.flurry.android.u aa;
	 private final android.os.Handler s;
	 private java.io.File t;
	 private java.io.File u;
	 private volatile Boolean v;
	 private volatile Boolean w;
	 private Long x;
	 private java.util.Map y;
	 private java.lang.String z;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 5 */
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [Ljava/lang/String; */
		 final String v1 = "9774d56d682e549c"; // const-string v1, "9774d56d682e549c"
		 /* aput-object v1, v0, v2 */
		 final String v1 = "dead00beef"; // const-string v1, "dead00beef"
		 /* aput-object v1, v0, v4 */
		 final String v0 = "http://data.flurry.com/aap.do"; // const-string v0, "http://data.flurry.com/aap.do"
		 final String v0 = "https://data.flurry.com/aap.do"; // const-string v0, "https://data.flurry.com/aap.do"
		 final String v0 = "http://ad.flurry.com/getCanvas.do"; // const-string v0, "http://ad.flurry.com/getCanvas.do"
		 final String v0 = "http://ad.flurry.com/getAndroidApp.do"; // const-string v0, "http://ad.flurry.com/getAndroidApp.do"
		 /* new-instance v0, Lcom/flurry/android/FlurryAgent; */
		 /* invoke-direct {v0}, Lcom/flurry/android/FlurryAgent;-><init>()V */
		 /* const-wide/16 v0, 0x2710 */
		 /* sput-wide v0, Lcom/flurry/android/FlurryAgent;->k:J */
		 com.flurry.android.FlurryAgent.l = (v4!= 0);
		 com.flurry.android.FlurryAgent.m = (v2!= 0);
		 com.flurry.android.FlurryAgent.n = (v2!= 0);
		 com.flurry.android.FlurryAgent.o = (v4!= 0);
		 com.flurry.android.FlurryAgent.q = (v2!= 0);
		 /* new-instance v0, Lcom/flurry/android/AppCircle; */
		 /* invoke-direct {v0}, Lcom/flurry/android/AppCircle;-><init>()V */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = -1; // const/4 v2, -0x1
		 final String v1 = ""; // const-string v1, ""
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.u = v0;
		 /* iput-boolean v3, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
		 /* iput-boolean v3, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
		 /* new-instance v0, Ljava/util/WeakHashMap; */
		 /* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
		 this.y = v0;
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->C:Z */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.I = v0;
		 final String v0 = ""; // const-string v0, ""
		 this.M = v1;
		 final String v0 = ""; // const-string v0, ""
		 this.N = v1;
		 /* iput-byte v2, p0, Lcom/flurry/android/FlurryAgent;->O:B */
		 final String v0 = ""; // const-string v0, ""
		 this.P = v1;
		 /* iput-byte v2, p0, Lcom/flurry/android/FlurryAgent;->Q:B */
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 this.U = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.V = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.Y = v0;
		 /* new-instance v0, Lcom/flurry/android/u; */
		 /* invoke-direct {v0}, Lcom/flurry/android/u;-><init>()V */
		 this.aa = v0;
		 /* new-instance v0, Landroid/os/HandlerThread; */
		 final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
		 /* invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V */
		 (( android.os.HandlerThread ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
		 /* new-instance v1, Landroid/os/Handler; */
		 (( android.os.HandlerThread ) v0 ).getLooper ( ); // invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
		 /* invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 this.s = v1;
		 return;
	 } // .end method
	 private static Double a ( Double p0 ) {
		 /* .locals 4 */
		 /* const-wide v2, 0x408f400000000000L # 1000.0 */
		 /* mul-double v0, p0, v2 */
		 java.lang.Math .round ( v0,v1 );
		 /* move-result-wide v0 */
		 /* long-to-double v0, v0 */
		 /* div-double/2addr v0, v2 */
		 /* return-wide v0 */
	 } // .end method
	 private static org.apache.http.client.HttpClient a ( org.apache.http.params.HttpParams p0 ) {
		 /* .locals 6 */
		 try { // :try_start_0
			 java.security.KeyStore .getDefaultType ( );
			 java.security.KeyStore .getInstance ( v0 );
			 int v1 = 0; // const/4 v1, 0x0
			 int v2 = 0; // const/4 v2, 0x0
			 (( java.security.KeyStore ) v0 ).load ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
			 /* new-instance v1, Lcom/flurry/android/ai; */
			 /* invoke-direct {v1, v0}, Lcom/flurry/android/ai;-><init>(Ljava/security/KeyStore;)V */
			 /* new-instance v0, Lorg/apache/http/conn/scheme/SchemeRegistry; */
			 /* invoke-direct {v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V */
			 /* new-instance v2, Lorg/apache/http/conn/scheme/Scheme; */
			 final String v3 = "http"; // const-string v3, "http"
			 org.apache.http.conn.scheme.PlainSocketFactory .getSocketFactory ( );
			 /* const/16 v5, 0x50 */
			 /* invoke-direct {v2, v3, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
			 (( org.apache.http.conn.scheme.SchemeRegistry ) v0 ).register ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
			 /* new-instance v2, Lorg/apache/http/conn/scheme/Scheme; */
			 final String v3 = "https"; // const-string v3, "https"
			 /* const/16 v4, 0x1bb */
			 /* invoke-direct {v2, v3, v1, v4}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
			 (( org.apache.http.conn.scheme.SchemeRegistry ) v0 ).register ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
			 /* new-instance v1, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager; */
			 /* invoke-direct {v1, p0, v0}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V */
			 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
			 /* invoke-direct {v0, v1, p0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
		 /* invoke-direct {v0, p0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V */
	 } // .end method
	 public static void a ( android.content.Context p0 ) {
		 /* .locals 3 */
		 /* if-nez p0, :cond_0 */
		 /* new-instance v0, Ljava/lang/NullPointerException; */
		 final String v1 = "Null context"; // const-string v1, "Null context"
		 /* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 try { // :try_start_0
		 v0 = com.flurry.android.FlurryAgent.j;
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, p0, v1}, Lcom/flurry/android/FlurryAgent;->a(Landroid/content/Context;Z)V */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :goto_0
	 return;
	 /* :catch_0 */
	 /* move-exception v0 */
	 final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
	 final String v2 = ""; // const-string v2, ""
	 com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
public static void a ( android.content.Context p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 /* if-nez p0, :cond_0 */
	 /* new-instance v0, Ljava/lang/NullPointerException; */
	 final String v1 = "Null context"; // const-string v1, "Null context"
	 /* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
	 v0 = 	 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
	 /* if-nez v0, :cond_2 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Api key not specified"; // const-string v1, "Api key not specified"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.j;
/* invoke-direct {v0, p0, p1}, Lcom/flurry/android/FlurryAgent;->b(Landroid/content/Context;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
private synchronized void a ( android.content.Context p0, Boolean p1 ) {
/* .locals 5 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
if ( p1 != null) { // if-eqz p1, :cond_0
try { // :try_start_0
	 v0 = this.y;
	 /* check-cast v0, Landroid/content/Context; */
	 /* if-nez v0, :cond_0 */
	 final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
	 final String v1 = "onEndSession called without context from corresponding onStartSession"; // const-string v1, "onEndSession called without context from corresponding onStartSession"
	 com.flurry.android.ah .d ( v0,v1 );
} // :cond_0
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
	 v0 = 	 v0 = this.y;
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
		 final String v1 = "Ending session"; // const-string v1, "Ending session"
		 com.flurry.android.ah .a ( v0,v1 );
		 /* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->j()V */
		 /* if-nez p1, :cond_4 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 (( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 v2 = this.A;
		 v2 = 		 (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v2, :cond_1 */
		 final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v4 = "onEndSession called from different application package, expected: "; // const-string v4, "onEndSession called from different application package, expected: "
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v4 = this.A;
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v4 = " actual: "; // const-string v4, " actual: "
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.flurry.android.ah .b ( v2,v1 );
	 } // :cond_1
	 android.os.SystemClock .elapsedRealtime ( );
	 /* move-result-wide v1 */
	 /* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->x:J */
	 /* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->K:J */
	 /* sub-long/2addr v1, v3 */
	 /* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->L:J */
	 v1 = this.F;
	 /* if-nez v1, :cond_2 */
	 final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
	 final String v2 = "Not creating report because of bad Android ID or generated ID is null"; // const-string v2, "Not creating report because of bad Android ID or generated ID is null"
	 com.flurry.android.ah .b ( v1,v2 );
} // :cond_2
/* new-instance v1, Lcom/flurry/android/b; */
/* invoke-direct {v1, p0, p2, v0}, Lcom/flurry/android/b;-><init>(Lcom/flurry/android/FlurryAgent;ZLandroid/content/Context;)V */
/* invoke-direct {p0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/Runnable;)V */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_3
/* monitor-exit p0 */
return;
} // :cond_4
try { // :try_start_1
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
static void a ( com.flurry.android.FlurryAgent p0, android.content.Context p1 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/flurry/android/FlurryAgent;->b(Landroid/content/Context;)V */
return;
} // .end method
static void a ( com.flurry.android.FlurryAgent p0, android.content.Context p1, Boolean p2 ) { //synthethic
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
if ( p2 != null) { // if-eqz p2, :cond_0
try { // :try_start_0
	 /* invoke-direct {p0, p1}, Lcom/flurry/android/FlurryAgent;->e(Landroid/content/Context;)Landroid/location/Location; */
} // :cond_0
/* monitor-enter p0 */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
try { // :try_start_1
	 this.T = v0;
	 /* monitor-exit p0 */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 try { // :try_start_2
		 /* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = this.aa;
			 (( com.flurry.android.u ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->b()V
		 } // :cond_1
		 int v0 = 1; // const/4 v0, 0x1
		 /* invoke-direct {p0, v0}, Lcom/flurry/android/FlurryAgent;->b(Z)V */
		 /* :try_end_2 */
		 /* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
	 } // :goto_0
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 try { // :try_start_3
		 /* monitor-exit p0 */
		 /* :try_end_3 */
		 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
		 try { // :try_start_4
			 /* throw v0 */
			 /* :try_end_4 */
			 /* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
			 final String v2 = ""; // const-string v2, ""
			 com.flurry.android.ah .b ( v1,v2,v0 );
		 } // .end method
		 private void a ( java.io.DataInputStream p0 ) {
			 /* .locals 14 */
			 int v12 = 0; // const/4 v12, 0x0
			 final String v13 = "FlurryAgent"; // const-string v13, "FlurryAgent"
			 /* new-instance v1, Ljava/util/HashMap; */
			 /* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
			 /* new-instance v4, Ljava/util/HashMap; */
			 /* invoke-direct {v4}, Ljava/util/HashMap;-><init>()V */
			 /* new-instance v5, Ljava/util/HashMap; */
			 /* invoke-direct {v5}, Ljava/util/HashMap;-><init>()V */
			 /* new-instance v2, Ljava/util/HashMap; */
			 /* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
			 /* new-instance v3, Ljava/util/HashMap; */
			 /* invoke-direct {v3}, Ljava/util/HashMap;-><init>()V */
			 /* new-instance v6, Ljava/util/HashMap; */
			 /* invoke-direct {v6}, Ljava/util/HashMap;-><init>()V */
		 } // :cond_0
		 v7 = 		 (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
		 v0 = 		 (( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
		 /* packed-switch v7, :pswitch_data_0 */
		 /* :pswitch_0 */
		 final String v8 = "FlurryAgent"; // const-string v8, "FlurryAgent"
		 /* new-instance v8, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v9 = "Unknown chunkType: "; // const-string v9, "Unknown chunkType: "
		 (( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.flurry.android.ah .a ( v13,v8 );
		 (( java.io.DataInputStream ) p1 ).skipBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->skipBytes(I)I
	 } // :cond_1
} // :goto_0
/* :pswitch_1 */
/* const/16 v0, 0x108 */
/* if-ne v7, v0, :cond_0 */
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
	 v0 = if ( v0 != null) { // if-eqz v0, :cond_3
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
		 final String v0 = "No ads from server"; // const-string v0, "No ads from server"
		 com.flurry.android.ah .a ( v13,v0 );
	 } // :cond_2
	 v0 = this.aa;
	 /* invoke-virtual/range {v0 ..v6}, Lcom/flurry/android/u;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V */
} // :cond_3
return;
/* :pswitch_2 */
(( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
/* :pswitch_3 */
v0 = (( java.io.DataInputStream ) p1 ).readByte ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B
v8 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* new-array v9, v8, [Lcom/flurry/android/v; */
/* move v10, v12 */
} // :goto_1
/* if-ge v10, v8, :cond_4 */
/* new-instance v11, Lcom/flurry/android/v; */
/* invoke-direct {v11, p1}, Lcom/flurry/android/v;-><init>(Ljava/io/DataInput;)V */
/* aput-object v11, v9, v10 */
/* add-int/lit8 v10, v10, 0x1 */
} // :cond_4
java.lang.Byte .valueOf ( v0 );
/* :pswitch_4 */
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* move v8, v12 */
} // :goto_2
/* if-ge v8, v0, :cond_1 */
/* new-instance v9, Lcom/flurry/android/AdImage; */
/* invoke-direct {v9, p1}, Lcom/flurry/android/AdImage;-><init>(Ljava/io/DataInput;)V */
/* iget-wide v10, v9, Lcom/flurry/android/AdImage;->a:J */
java.lang.Long .valueOf ( v10,v11 );
/* add-int/lit8 v8, v8, 0x1 */
/* :pswitch_5 */
v0 = (( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
/* move v8, v12 */
} // :goto_3
/* if-ge v8, v0, :cond_1 */
/* new-instance v9, Lcom/flurry/android/e; */
/* invoke-direct {v9, p1}, Lcom/flurry/android/e;-><init>(Ljava/io/DataInput;)V */
v10 = this.a;
final String v10 = "FlurryAgent"; // const-string v10, "FlurryAgent"
/* new-instance v10, Ljava/lang/StringBuilder; */
/* invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V */
final String v11 = "Parsed hook: "; // const-string v11, "Parsed hook: "
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).append ( v9 ); // invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v13,v9 );
/* add-int/lit8 v8, v8, 0x1 */
/* :pswitch_6 */
(( java.io.DataInputStream ) p1 ).skipBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->skipBytes(I)I
/* goto/16 :goto_0 */
/* :pswitch_7 */
v0 = (( java.io.DataInputStream ) p1 ).readByte ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B
/* move v8, v12 */
} // :goto_4
/* if-ge v8, v0, :cond_1 */
/* new-instance v9, Lcom/flurry/android/c; */
/* invoke-direct {v9, p1}, Lcom/flurry/android/c;-><init>(Ljava/io/DataInput;)V */
/* iget-byte v10, v9, Lcom/flurry/android/c;->a:B */
java.lang.Byte .valueOf ( v10 );
/* add-int/lit8 v8, v8, 0x1 */
/* :pswitch_8 */
v8 = (( java.io.DataInputStream ) p1 ).readByte ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B
/* move v9, v12 */
} // :goto_5
/* if-ge v9, v8, :cond_1 */
v0 = (( java.io.DataInputStream ) p1 ).readByte ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B
java.lang.Byte .valueOf ( v0 );
/* check-cast v0, Lcom/flurry/android/c; */
if ( v0 != null) { // if-eqz v0, :cond_5
(( com.flurry.android.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/flurry/android/c;->a(Ljava/io/DataInput;)V
} // :cond_5
/* add-int/lit8 v0, v9, 0x1 */
/* move v9, v0 */
/* :pswitch_9 */
v0 = (( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
/* move v8, v12 */
} // :goto_6
/* if-ge v8, v0, :cond_1 */
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v9 */
v11 = (( java.io.DataInputStream ) p1 ).readShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readShort()S
java.lang.Short .valueOf ( v11 );
java.lang.Long .valueOf ( v9,v10 );
/* add-int/lit8 v8, v8, 0x1 */
/* :pswitch_a */
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v8 */
java.lang.Long .valueOf ( v8,v9 );
/* check-cast v0, Lcom/flurry/android/al; */
/* if-nez v0, :cond_6 */
/* new-instance v0, Lcom/flurry/android/al; */
/* invoke-direct {v0}, Lcom/flurry/android/al;-><init>()V */
} // :cond_6
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
this.a = v10;
v10 = (( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
/* iput v10, v0, Lcom/flurry/android/al;->c:I */
java.lang.Long .valueOf ( v8,v9 );
/* goto/16 :goto_0 */
/* :pswitch_b */
(( java.io.DataInputStream ) p1 ).skipBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->skipBytes(I)I
/* goto/16 :goto_0 */
/* :pswitch_c */
(( java.io.DataInputStream ) p1 ).skipBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->skipBytes(I)I
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x102 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_7 */
/* :pswitch_0 */
/* :pswitch_9 */
/* :pswitch_b */
/* :pswitch_6 */
/* :pswitch_8 */
/* :pswitch_a */
/* :pswitch_c */
} // .end packed-switch
} // .end method
private void a ( java.lang.Runnable p0 ) {
/* .locals 1 */
v0 = this.s;
(( android.os.Handler ) v0 ).post ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
public static void a ( java.lang.String p0 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.j;
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to log event: "; // const-string v3, "Failed to log event: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
private synchronized void a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 4 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.Y;
/* if-nez v0, :cond_0 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onError called before onStartSession.Error: "; // const-string v2, "onError called before onStartSession.Error: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v0,v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_1
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->S:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->S:I */
v0 = v0 = this.Y;
/* const/16 v1, 0xa */
/* if-ge v0, v1, :cond_1 */
/* new-instance v0, Lcom/flurry/android/aa; */
/* invoke-direct {v0}, Lcom/flurry/android/aa;-><init>()V */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* iput-wide v1, v0, Lcom/flurry/android/aa;->a:J */
/* const/16 v1, 0xff */
com.flurry.android.r .a ( p1,v1 );
this.b = v1;
/* const/16 v1, 0x200 */
com.flurry.android.r .a ( p2,v1 );
this.c = v1;
/* const/16 v1, 0xff */
com.flurry.android.r .a ( p3,v1 );
this.d = v1;
v1 = this.Y;
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Error logged: "; // const-string v3, "Error logged: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.b;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_1
try { // :try_start_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Max errors logged.No more errors logged."; // const-string v1, "Max errors logged.No more errors logged."
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
private synchronized void a ( java.lang.String p0, Boolean p1 ) {
/* .locals 7 */
/* const/16 v6, 0x3e80 */
final String v0 = "Event count incremented: "; // const-string v0, "Event count incremented: "
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.V;
/* if-nez v0, :cond_1 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onEvent called before onStartSession.Event: "; // const-string v2, "onEvent called before onStartSession.Event: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v0,v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_1
try { // :try_start_1
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->K:J */
/* sub-long v3, v0, v2 */
/* const/16 v0, 0xff */
com.flurry.android.r .a ( p1,v0 );
v0 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.U;
/* check-cast v0, Lcom/flurry/android/g; */
/* if-nez v0, :cond_4 */
v0 = v0 = this.U;
/* const/16 v2, 0x64 */
/* if-ge v0, v2, :cond_3 */
/* new-instance v0, Lcom/flurry/android/g; */
/* invoke-direct {v0}, Lcom/flurry/android/g;-><init>()V */
int v2 = 1; // const/4 v2, 0x1
/* iput v2, v0, Lcom/flurry/android/g;->a:I */
v2 = this.U;
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Event count incremented: "; // const-string v5, "Event count incremented: "
(( java.lang.StringBuilder ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v2 );
} // :cond_2
} // :goto_1
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = v0 = this.V;
/* const/16 v2, 0xc8 */
/* if-ge v0, v2, :cond_7 */
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->X:I */
/* if-ge v0, v6, :cond_7 */
v0 = java.util.Collections .emptyMap ( );
/* const/16 v5, 0xa */
/* if-le v0, v5, :cond_5 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
v0 = com.flurry.android.ah .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "MaxEventParams exceeded: "; // const-string v3, "MaxEventParams exceeded: "
v2 = (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_3
try { // :try_start_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
v0 = com.flurry.android.ah .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Too many different events.Event not counted: "; // const-string v5, "Too many different events.Event not counted: "
(( java.lang.StringBuilder ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v2 );
} // :cond_4
/* iget v2, v0, Lcom/flurry/android/g;->a:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, v0, Lcom/flurry/android/g;->a:I */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Event count incremented: "; // const-string v5, "Event count incremented: "
(( java.lang.StringBuilder ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v2 );
/* goto/16 :goto_1 */
} // :cond_5
/* new-instance v0, Lcom/flurry/android/i; */
/* move v5, p2 */
/* invoke-direct/range {v0 ..v5}, Lcom/flurry/android/i;-><init>(Ljava/lang/String;Ljava/util/Map;JZ)V */
(( com.flurry.android.i ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/flurry/android/i;->a()[B
/* array-length v2, v2 */
/* iget v3, p0, Lcom/flurry/android/FlurryAgent;->X:I */
/* add-int/2addr v2, v3 */
/* if-gt v2, v6, :cond_6 */
v2 = this.V;
/* iget v2, p0, Lcom/flurry/android/FlurryAgent;->X:I */
(( com.flurry.android.i ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/flurry/android/i;->a()[B
/* array-length v0, v0 */
/* add-int/2addr v0, v2 */
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->X:I */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Logged event: "; // const-string v3, "Logged event: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v1 );
/* goto/16 :goto_0 */
} // :cond_6
/* const/16 v0, 0x3e80 */
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->X:I */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->W:Z */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Event Log size exceeded.No more event details logged."; // const-string v1, "Event Log size exceeded.No more event details logged."
com.flurry.android.ah .a ( v0,v1 );
/* goto/16 :goto_0 */
} // :cond_7
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->W:Z */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* goto/16 :goto_0 */
} // .end method
protected static Boolean a ( ) {
/* .locals 1 */
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->o:Z */
} // .end method
static Boolean a ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
} // .end method
private static Boolean a ( java.io.File p0 ) {
/* .locals 4 */
(( java.io.File ) p0 ).getParentFile ( ); // invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;
v1 = (( java.io.File ) v0 ).mkdirs ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
/* if-nez v1, :cond_0 */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unable to create persistent dir: "; // const-string v3, "Unable to create persistent dir: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v1,v0 );
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
private Boolean a ( Object[] p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
com.flurry.android.FlurryAgent .h ( );
/* if-nez v0, :cond_1 */
/* move v0, v4 */
} // :cond_0
} // :goto_0
} // :cond_1
try { // :try_start_0
/* invoke-direct {p0, p1, v0}, Lcom/flurry/android/FlurryAgent;->a([BLjava/lang/String;)Z */
/* :try_end_0 */
v0 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
/* if-nez v0, :cond_0 */
v1 = com.flurry.android.FlurryAgent.c;
/* if-nez v1, :cond_0 */
/* sget-boolean v1, Lcom/flurry/android/FlurryAgent;->m:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* sget-boolean v1, Lcom/flurry/android/FlurryAgent;->n:Z */
/* if-nez v1, :cond_0 */
v1 = com.flurry.android.FlurryAgent.j;
/* monitor-enter v1 */
int v2 = 1; // const/4 v2, 0x1
try { // :try_start_1
com.flurry.android.FlurryAgent.n = (v2!= 0);
com.flurry.android.FlurryAgent .h ( );
/* if-nez v2, :cond_2 */
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* move v0, v4 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Sending report exception: "; // const-string v3, "Sending report exception: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v0 );
/* move v0, v4 */
} // :cond_2
try { // :try_start_2
/* monitor-exit v1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
try { // :try_start_3
/* invoke-direct {p0, p1, v2}, Lcom/flurry/android/FlurryAgent;->a([BLjava/lang/String;)Z */
/* :try_end_3 */
v0 = /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_4
/* monitor-exit v1 */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* throw v0 */
/* :catch_1 */
/* move-exception v1 */
} // .end method
private Boolean a ( Object[] p0, java.lang.String p1 ) {
/* .locals 6 */
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v0 = "local"; // const-string v0, "local"
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v0, v5 */
} // :goto_0
} // :cond_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Sending report to: "; // const-string v1, "Sending report to: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v2,v0 );
/* new-instance v0, Lorg/apache/http/entity/ByteArrayEntity; */
/* invoke-direct {v0, p1}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V */
final String v1 = "application/octet-stream"; // const-string v1, "application/octet-stream"
(( org.apache.http.entity.ByteArrayEntity ) v0 ).setContentType ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/http/entity/ByteArrayEntity;->setContentType(Ljava/lang/String;)V
/* new-instance v1, Lorg/apache/http/client/methods/HttpPost; */
/* invoke-direct {v1, p2}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
(( org.apache.http.client.methods.HttpPost ) v1 ).setEntity ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
/* new-instance v0, Lorg/apache/http/params/BasicHttpParams; */
/* invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
/* const/16 v2, 0x2710 */
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v0,v2 );
/* const/16 v2, 0x3a98 */
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v0,v2 );
(( org.apache.http.client.methods.HttpPost ) v1 ).getParams ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;
final String v3 = "http.protocol.expect-continue"; // const-string v3, "http.protocol.expect-continue"
v1 = com.flurry.android.FlurryAgent .a ( v0 );
/* monitor-enter p0 */
/* const/16 v2, 0xc8 */
/* if-ne v1, v2, :cond_2 */
try { // :try_start_0
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Report successful"; // const-string v2, "Report successful"
com.flurry.android.ah .a ( v1,v2 );
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
v1 = this.I;
v2 = this.D;
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Processing report response"; // const-string v2, "Processing report response"
com.flurry.android.ah .a ( v1,v2 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* move-result-wide v1 */
/* const-wide/16 v3, 0x0 */
/* cmp-long v1, v1, v3 */
if ( v1 != null) { // if-eqz v1, :cond_1
try { // :try_start_1
/* new-instance v2, Ljava/io/DataInputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* invoke-direct {p0, v2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/io/DataInputStream;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
try { // :try_start_2
/* move v0, v5 */
} // :goto_1
int v1 = 0; // const/4 v1, 0x0
this.D = v1;
/* monitor-exit p0 */
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw v0 */
/* :catchall_1 */
/* move-exception v1 */
try { // :try_start_3
/* throw v1 */
} // :cond_1
/* move v0, v5 */
} // :cond_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Report failed.HTTP response: "; // const-string v3, "Report failed.HTTP response: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* move v0, v4 */
} // .end method
private synchronized a ( Boolean p0 ) {
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
int v6 = 0; // const/4 v6, 0x0
/* monitor-enter p0 */
try { // :try_start_0
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* new-instance v2, Ljava/io/DataOutputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
/* const/16 v0, 0xf */
try { // :try_start_1
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
} // :goto_0
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.aa;
(( com.flurry.android.u ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->d()J
/* move-result-wide v3 */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.aa;
v3 = (( com.flurry.android.u ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->e()Ljava/util/Set;
(( java.io.DataOutputStream ) v2 ).writeShort ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v4 */
int v0 = 1; // const/4 v0, 0x1
(( java.io.DataOutputStream ) v2 ).writeByte ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
(( java.io.DataOutputStream ) v2 ).writeLong ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_2
try { // :try_start_2
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when generating report"; // const-string v3, "Error when generating report"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
try { // :try_start_3
com.flurry.android.r .a ( v1 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* move-object v0, v7 */
} // :goto_3
/* monitor-exit p0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_4
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_4
try { // :try_start_5
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_1
/* const-wide/16 v3, 0x0 */
try { // :try_start_6
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
} // :cond_2
int v0 = 3; // const/4 v0, 0x3
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* const/16 v0, 0x79 */
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.z;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.B;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.F;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->H:J */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->J:J */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
int v0 = 6; // const/4 v0, 0x6
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
final String v0 = "device.model"; // const-string v0, "device.model"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.MODEL;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.brand"; // const-string v0, "build.brand"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.BRAND;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.id"; // const-string v0, "build.id"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.ID;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "version.release"; // const-string v0, "version.release"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build$VERSION.RELEASE;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.device"; // const-string v0, "build.device"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.DEVICE;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.product"; // const-string v0, "build.product"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.PRODUCT;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v3 = v0 = this.I;
(( java.io.DataOutputStream ) v2 ).writeShort ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
/* move v4, v6 */
} // :goto_5
/* if-ge v4, v3, :cond_3 */
v0 = this.I;
/* check-cast v0, [B */
(( java.io.DataOutputStream ) v2 ).write ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
} // :cond_3
/* new-instance v0, Ljava/util/ArrayList; */
v3 = this.I;
/* invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
this.D = v0;
(( java.io.DataOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_6 */
/* .catch Ljava/lang/Throwable; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
try { // :try_start_7
com.flurry.android.r .a ( v2 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* goto/16 :goto_3 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v7 */
/* goto/16 :goto_4 */
/* :catchall_3 */
/* move-exception v0 */
/* goto/16 :goto_4 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v1, v7 */
/* goto/16 :goto_2 */
} // .end method
static com.flurry.android.u b ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.j;
v0 = this.aa;
} // .end method
private synchronized void b ( android.content.Context p0 ) {
/* .locals 9 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0, p1}, Lcom/flurry/android/FlurryAgent;->c(Landroid/content/Context;)Ljava/lang/String; */
this.F = v0;
v0 = this.u;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_6
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "loading persistent data: "; // const-string v2, "loading persistent data: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.u;
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .c ( v0,v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
/* new-instance v1, Ljava/io/FileInputStream; */
v2 = this.u;
/* invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* new-instance v2, Ljava/io/DataInputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
try { // :try_start_2
v0 = (( java.io.DataInputStream ) v2 ).readUnsignedShort ( ); // invoke-virtual {v2}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* const v1, 0xb5fa */
/* if-ne v0, v1, :cond_4 */
/* invoke-direct {p0, v2}, Lcom/flurry/android/FlurryAgent;->b(Ljava/io/DataInputStream;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
} // :goto_0
try { // :try_start_3
com.flurry.android.r .a ( v2 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
} // :goto_1
try { // :try_start_4
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
/* if-nez v0, :cond_0 */
v0 = this.u;
v0 = (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
if ( v0 != null) { // if-eqz v0, :cond_5
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Deleted persistence file"; // const-string v1, "Deleted persistence file"
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_1 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
} // :cond_0
} // :goto_2
try { // :try_start_5
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->J:J */
/* iput-wide v0, p0, Lcom/flurry/android/FlurryAgent;->H:J */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
} // :cond_1
v0 = this.F;
/* if-nez v0, :cond_2 */
java.lang.Math .random ( );
/* move-result-wide v0 */
java.lang.Double .doubleToLongBits ( v0,v1 );
/* move-result-wide v0 */
/* const-wide/16 v2, 0x25 */
java.lang.System .nanoTime ( );
/* move-result-wide v4 */
v6 = this.z;
v6 = (( java.lang.String ) v6 ).hashCode ( ); // invoke-virtual {v6}, Ljava/lang/String;->hashCode()I
/* mul-int/lit8 v6, v6, 0x25 */
/* int-to-long v6, v6 */
/* add-long/2addr v4, v6 */
/* mul-long/2addr v2, v4 */
/* add-long/2addr v0, v2 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "ID"; // const-string v3, "ID"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v3, 0x10 */
java.lang.Long .toString ( v0,v1,v3 );
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.F = v0;
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Generated id"; // const-string v1, "Generated id"
com.flurry.android.ah .c ( v0,v1 );
} // :cond_2
v0 = this.aa;
v1 = this.F;
(( com.flurry.android.u ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/flurry/android/u;->a(Ljava/lang/String;)V
v0 = this.F;
final String v1 = "AND"; // const-string v1, "AND"
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_3 */
v0 = this.t;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v0, :cond_3 */
v0 = this.F;
/* invoke-direct {p0, p1, v0}, Lcom/flurry/android/FlurryAgent;->c(Landroid/content/Context;Ljava/lang/String;)V */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
} // :cond_3
/* monitor-exit p0 */
return;
} // :cond_4
try { // :try_start_6
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Unexpected file type"; // const-string v1, "Unexpected file type"
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_6 */
/* .catch Ljava/lang/Throwable; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
/* goto/16 :goto_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_3
try { // :try_start_7
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when loading persistent file"; // const-string v3, "Error when loading persistent file"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_3 */
try { // :try_start_8
com.flurry.android.r .a ( v1 );
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
/* goto/16 :goto_1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* :catchall_1 */
/* move-exception v1 */
/* move-object v8, v1 */
/* move-object v1, v0 */
/* move-object v0, v8 */
} // :goto_4
try { // :try_start_9
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_9 */
/* .catchall {:try_start_9 ..:try_end_9} :catchall_0 */
} // :cond_5
try { // :try_start_a
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Cannot delete persistence file"; // const-string v1, "Cannot delete persistence file"
com.flurry.android.ah .b ( v0,v1 );
/* :try_end_a */
/* .catch Ljava/lang/Throwable; {:try_start_a ..:try_end_a} :catch_1 */
/* .catchall {:try_start_a ..:try_end_a} :catchall_0 */
/* goto/16 :goto_2 */
/* :catch_1 */
/* move-exception v0 */
try { // :try_start_b
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
/* goto/16 :goto_2 */
} // :cond_6
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Agent cache file doesn\'t exist."; // const-string v1, "Agent cache file doesn\'t exist."
com.flurry.android.ah .c ( v0,v1 );
/* :try_end_b */
/* .catchall {:try_start_b ..:try_end_b} :catchall_0 */
/* goto/16 :goto_2 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v2 */
/* :catchall_3 */
/* move-exception v0 */
/* :catch_2 */
/* move-exception v1 */
/* move-object v8, v1 */
/* move-object v1, v0 */
/* move-object v0, v8 */
} // .end method
private synchronized void b ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 8 */
int v7 = 1; // const/4 v7, 0x1
final String v0 = " and "; // const-string v0, " and "
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.z;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.z;
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onStartSession called with different api keys: "; // const-string v2, "onStartSession called with different api keys: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.z;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " and "; // const-string v2, " and "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v0,v1 );
} // :cond_0
v0 = this.y;
/* check-cast v0, Landroid/content/Context; */
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context"; // const-string v1, "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context"
com.flurry.android.ah .d ( v0,v1 );
} // :cond_1
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* if-nez v0, :cond_8 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Initializing Flurry session"; // const-string v1, "Initializing Flurry session"
com.flurry.android.ah .a ( v0,v1 );
this.z = p2;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = ".flurryagent."; // const-string v1, ".flurryagent."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.z;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const/16 v2, 0x10 */
java.lang.Integer .toString ( v1,v2 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.u = v0;
final String v0 = ".flurryb."; // const-string v0, ".flurryb."
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.t = v0;
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* new-instance v0, Lcom/flurry/android/FlurryAgent$FlurryDefaultExceptionHandler; */
/* invoke-direct {v0}, Lcom/flurry/android/FlurryAgent$FlurryDefaultExceptionHandler;-><init>()V */
java.lang.Thread .setDefaultUncaughtExceptionHandler ( v0 );
} // :cond_2
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
v1 = this.B;
/* if-nez v1, :cond_3 */
com.flurry.android.FlurryAgent .d ( v0 );
this.B = v1;
} // :cond_3
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
v2 = this.A;
if ( v2 != null) { // if-eqz v2, :cond_4
v2 = this.A;
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_4 */
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "onStartSession called from different application packages: "; // const-string v4, "onStartSession called from different application packages: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.A;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " and "; // const-string v4, " and "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v2,v3 );
} // :cond_4
this.A = v1;
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->x:J */
/* sub-long v3, v1, v3 */
/* sget-wide v5, Lcom/flurry/android/FlurryAgent;->k:J */
/* cmp-long v3, v3, v5 */
/* if-lez v3, :cond_b */
final String v3 = "FlurryAgent"; // const-string v3, "FlurryAgent"
final String v4 = "New session"; // const-string v4, "New session"
com.flurry.android.ah .a ( v3,v4 );
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* iput-wide v3, p0, Lcom/flurry/android/FlurryAgent;->J:J */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->K:J */
/* const-wide/16 v1, -0x1 */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->L:J */
final String v1 = ""; // const-string v1, ""
this.P = v1;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->S:I */
int v1 = 0; // const/4 v1, 0x0
this.T = v1;
java.util.TimeZone .getDefault ( );
(( java.util.TimeZone ) v1 ).getID ( ); // invoke-virtual {v1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;
this.N = v1;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v2 ).getLanguage ( ); // invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "_"; // const-string v2, "_"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.util.Locale .getDefault ( );
(( java.util.Locale ) v2 ).getCountry ( ); // invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.M = v1;
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
this.U = v1;
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.V = v1;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->W:Z */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.Y = v1;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->X:I */
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->Z:I */
/* sget-boolean v1, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v1 != null) { // if-eqz v1, :cond_6
v1 = this.aa;
v1 = (( com.flurry.android.u ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/flurry/android/u;->a()Z
/* if-nez v1, :cond_5 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Initializing AppCircle"; // const-string v2, "Initializing AppCircle"
com.flurry.android.ah .a ( v1,v2 );
/* new-instance v1, Lcom/flurry/android/a; */
/* invoke-direct {v1}, Lcom/flurry/android/a;-><init>()V */
v2 = this.z;
this.a = v2;
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->H:J */
/* iput-wide v2, v1, Lcom/flurry/android/a;->b:J */
v2 = com.flurry.android.FlurryAgent.f;
if ( v2 != null) { // if-eqz v2, :cond_9
v2 = com.flurry.android.FlurryAgent.f;
} // :goto_0
this.c = v2;
v2 = com.flurry.android.FlurryAgent.h;
if ( v2 != null) { // if-eqz v2, :cond_a
v2 = com.flurry.android.FlurryAgent.h;
} // :goto_1
this.d = v2;
v2 = this.s;
this.e = v2;
v2 = this.aa;
(( com.flurry.android.u ) v2 ).a ( p1, v1 ); // invoke-virtual {v2, p1, v1}, Lcom/flurry/android/u;->a(Landroid/content/Context;Lcom/flurry/android/a;)V
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "AppCircle initialized"; // const-string v2, "AppCircle initialized"
com.flurry.android.ah .a ( v1,v2 );
} // :cond_5
v1 = this.aa;
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->J:J */
/* iget-wide v4, p0, Lcom/flurry/android/FlurryAgent;->K:J */
(( com.flurry.android.u ) v1 ).a ( v2, v3, v4, v5 ); // invoke-virtual {v1, v2, v3, v4, v5}, Lcom/flurry/android/u;->a(JJ)V
} // :cond_6
/* iget-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->C:Z */
/* new-instance v2, Lcom/flurry/android/d; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/flurry/android/d;-><init>(Lcom/flurry/android/FlurryAgent;Landroid/content/Context;Z)V */
/* invoke-direct {p0, v2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/Runnable;)V */
} // :cond_7
} // :goto_2
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_8
/* monitor-exit p0 */
return;
} // :cond_9
try { // :try_start_1
v2 = com.flurry.android.FlurryAgent.g;
} // :cond_a
v2 = com.flurry.android.FlurryAgent.i;
} // :cond_b
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Continuing previous session"; // const-string v1, "Continuing previous session"
com.flurry.android.ah .a ( v0,v1 );
v0 = v0 = this.I;
/* if-nez v0, :cond_7 */
v0 = this.I;
v1 = v1 = this.I;
/* sub-int/2addr v1, v7 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
static void b ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->g()V */
return;
} // .end method
private synchronized void b ( java.io.DataInputStream p0 ) {
/* .locals 5 */
int v1 = 2; // const/4 v1, 0x2
int v4 = 0; // const/4 v4, 0x0
final String v0 = "Unknown agent file version: "; // const-string v0, "Unknown agent file version: "
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* if-le v0, v1, :cond_0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unknown agent file version: "; // const-string v3, "Unknown agent file version: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v1,v2 );
/* new-instance v1, Ljava/io/IOException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unknown agent file version: "; // const-string v3, "Unknown agent file version: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_0
/* if-lt v0, v1, :cond_4 */
try { // :try_start_1
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Loading API key: "; // const-string v3, "Loading API key: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.z;
com.flurry.android.FlurryAgent .f ( v3 );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v2 );
v1 = this.z;
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
v1 = this.F;
/* if-nez v1, :cond_1 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Loading phoneId: "; // const-string v3, "Loading phoneId: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v2 );
} // :cond_1
this.F = v0;
v0 = (( java.io.DataInputStream ) p1 ).readBoolean ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readBoolean()Z
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/flurry/android/FlurryAgent;->H:J */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Loading session reports"; // const-string v1, "Loading session reports"
com.flurry.android.ah .a ( v0,v1 );
/* move v0, v4 */
} // :goto_0
v1 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
if ( v1 != null) { // if-eqz v1, :cond_2
/* new-array v1, v1, [B */
(( java.io.DataInputStream ) p1 ).readFully ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/DataInputStream;->readFully([B)V
v2 = this.I;
int v3 = 0; // const/4 v3, 0x0
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Session report added: "; // const-string v3, "Session report added: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v0, v0, 0x1 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v2 );
} // :cond_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Persistent file loaded"; // const-string v1, "Persistent file loaded"
com.flurry.android.ah .a ( v0,v1 );
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_1
/* monitor-exit p0 */
return;
} // :cond_3
try { // :try_start_2
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Api keys do not match, old: "; // const-string v3, "Api keys do not match, old: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.flurry.android.FlurryAgent .f ( v0 );
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", new: "; // const-string v2, ", new: "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.z;
com.flurry.android.FlurryAgent .f ( v2 );
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v0 );
} // :cond_4
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Deleting old file version: "; // const-string v3, "Deleting old file version: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .d ( v1,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
public static void b ( java.lang.String p0 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.j;
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, p0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to log event: "; // const-string v3, "Failed to log event: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
private void b ( Boolean p0 ) {
/* .locals 5 */
final String v4 = ""; // const-string v4, ""
final String v3 = "FlurryAgent"; // const-string v3, "FlurryAgent"
try { // :try_start_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "generating report"; // const-string v1, "generating report"
com.flurry.android.ah .a ( v0,v1 );
/* invoke-direct {p0, p1}, Lcom/flurry/android/FlurryAgent;->a(Z)[B */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = /* invoke-direct {p0, v0}, Lcom/flurry/android/FlurryAgent;->a([B)Z */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Done sending "; // const-string v2, "Done sending "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v2, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
final String v2 = "initial "; // const-string v2, "initial "
} // :goto_0
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "agent report"; // const-string v2, "agent report"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v1 );
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->i()V */
} // :cond_0
} // :goto_1
return;
} // :cond_1
final String v2 = ""; // const-string v2, ""
/* move-object v2, v4 */
} // :cond_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Error generating report"; // const-string v1, "Error generating report"
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v1 = ""; // const-string v1, ""
com.flurry.android.ah .a ( v3,v4,v0 );
/* :catch_1 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v1 = ""; // const-string v1, ""
com.flurry.android.ah .b ( v3,v4,v0 );
} // .end method
static java.lang.String c ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.j;
v0 = this.z;
} // .end method
private java.lang.String c ( android.content.Context p0 ) {
/* .locals 8 */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
v0 = this.F;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.F;
} // :goto_0
} // :cond_0
(( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v1 = "android_id"; // const-string v1, "android_id"
android.provider.Settings$System .getString ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v1, :cond_1 */
final String v1 = "null"; // const-string v1, "null"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_1
/* move v1, v5 */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_5
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "AND"; // const-string v2, "AND"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_2
v1 = com.flurry.android.FlurryAgent.b;
/* array-length v2, v1 */
/* move v3, v5 */
} // :goto_2
/* if-ge v3, v2, :cond_4 */
/* aget-object v4, v1, v3 */
v4 = (( java.lang.String ) v0 ).equals ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* move v1, v5 */
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
int v1 = 1; // const/4 v1, 0x1
} // :cond_5
final String v0 = ".flurryb."; // const-string v0, ".flurryb."
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_6
try { // :try_start_0
/* new-instance v1, Ljava/io/FileInputStream; */
/* invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* new-instance v0, Ljava/io/DataInputStream; */
/* invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
try { // :try_start_1
(( java.io.DataInputStream ) v0 ).readInt ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I
(( java.io.DataInputStream ) v0 ).readUTF ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
com.flurry.android.r .a ( v0 );
/* move-object v0, v1 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v6 */
} // :goto_3
try { // :try_start_2
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when loading b file"; // const-string v3, "Error when loading b file"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
com.flurry.android.r .a ( v1 );
/* move-object v0, v6 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v6 */
} // :goto_4
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :catchall_1 */
/* move-exception v1 */
/* move-object v7, v1 */
/* move-object v1, v0 */
/* move-object v0, v7 */
/* :catchall_2 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v1 */
/* move-object v7, v1 */
/* move-object v1, v0 */
/* move-object v0, v7 */
} // :cond_6
/* move-object v0, v6 */
/* goto/16 :goto_0 */
} // .end method
private synchronized void c ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 5 */
/* monitor-enter p0 */
try { // :try_start_0
final String v0 = ".flurryb."; // const-string v0, ".flurryb."
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.t = v0;
v0 = this.t;
com.flurry.android.FlurryAgent .a ( v0 );
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
/* new-instance v1, Ljava/io/FileOutputStream; */
v2 = this.t;
/* invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* new-instance v2, Ljava/io/DataOutputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_2
(( java.io.DataOutputStream ) v2 ).writeInt ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
(( java.io.DataOutputStream ) v2 ).writeUTF ( p2 ); // invoke-virtual {v2, p2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
try { // :try_start_3
com.flurry.android.r .a ( v2 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* :catch_0 */
/* move-exception v1 */
/* move-object v4, v1 */
/* move-object v1, v0 */
/* move-object v0, v4 */
} // :goto_1
try { // :try_start_4
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when saving b file"; // const-string v3, "Error when saving b file"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_3 */
try { // :try_start_5
com.flurry.android.r .a ( v1 );
/* :catchall_1 */
/* move-exception v1 */
/* move-object v4, v1 */
/* move-object v1, v0 */
/* move-object v0, v4 */
} // :goto_2
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v2 */
/* :catchall_3 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v1, v2 */
} // .end method
static void c ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->i()V */
return;
} // .end method
public static void c ( java.lang.String p0 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.j;
/* invoke-direct {v0, p0}, Lcom/flurry/android/FlurryAgent;->e(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to signify the end of event: "; // const-string v3, "Failed to signify the end of event: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
static com.flurry.android.FlurryAgent d ( ) { //synthethic
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.j;
} // .end method
private static java.lang.String d ( android.content.Context p0 ) {
/* .locals 3 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
v1 = this.versionName;
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = this.versionName;
} // :goto_0
} // :cond_0
/* iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
if ( v1 != null) { // if-eqz v1, :cond_1
/* iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
java.lang.Integer .toString ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
} // :cond_1
final String v0 = "Unknown"; // const-string v0, "Unknown"
} // .end method
static void d ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
try { // :try_start_0
/* monitor-enter p0 */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
try { // :try_start_1
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->x:J */
/* sub-long/2addr v0, v2 */
/* iget-boolean v2, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* if-nez v2, :cond_1 */
/* sget-wide v2, Lcom/flurry/android/FlurryAgent;->k:J */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_1 */
v0 = v0 = this.I;
/* if-lez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_2
/* invoke-direct {p0, v0}, Lcom/flurry/android/FlurryAgent;->b(Z)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
} // :cond_0
} // :goto_1
return;
} // :cond_1
/* move v0, v4 */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_3
/* monitor-exit p0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
try { // :try_start_4
/* throw v0 */
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
public static void d ( java.lang.String p0 ) {
/* .locals 3 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.j;
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
static Long e ( ) { //synthethic
/* .locals 2 */
/* sget-wide v0, Lcom/flurry/android/FlurryAgent;->k:J */
/* return-wide v0 */
} // .end method
private android.location.Location e ( android.content.Context p0 ) {
/* .locals 7 */
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
v0 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
v0 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_3 */
} // :cond_0
final String v0 = "location"; // const-string v0, "location"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/location/LocationManager; */
/* monitor-enter p0 */
try { // :try_start_0
v1 = this.E;
/* if-nez v1, :cond_2 */
this.E = v0;
} // :goto_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
v1 = com.flurry.android.FlurryAgent.p;
/* if-nez v1, :cond_1 */
/* new-instance v1, Landroid/location/Criteria; */
/* invoke-direct {v1}, Landroid/location/Criteria;-><init>()V */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
(( android.location.LocationManager ) v0 ).getBestProvider ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_3
/* const-wide/16 v2, 0x0 */
int v4 = 0; // const/4 v4, 0x0
android.os.Looper .getMainLooper ( );
/* move-object v5, p0 */
/* invoke-virtual/range {v0 ..v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V */
(( android.location.LocationManager ) v0 ).getLastKnownLocation ( v1 ); // invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
} // :goto_1
} // :cond_2
try { // :try_start_1
v0 = this.E;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // .end method
static android.os.Handler e ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 1 */
v0 = this.s;
} // .end method
private synchronized void e ( java.lang.String p0 ) {
/* .locals 5 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.V;
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Lcom/flurry/android/i; */
v2 = (( com.flurry.android.i ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/flurry/android/i;->a(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->K:J */
/* sub-long/2addr v1, v3 */
(( com.flurry.android.i ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/flurry/android/i;->a(J)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_1
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
static com.flurry.android.u f ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 1 */
v0 = this.aa;
} // .end method
private static java.lang.String f ( java.lang.String p0 ) {
/* .locals 4 */
int v3 = 4; // const/4 v3, 0x4
if ( p0 != null) { // if-eqz p0, :cond_1
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-le v0, v3, :cond_1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
v2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* sub-int/2addr v2, v3 */
/* if-ge v1, v2, :cond_0 */
/* const/16 v2, 0x2a */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* sub-int/2addr v1, v3 */
(( java.lang.String ) p0 ).substring ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_1
} // :cond_1
/* move-object v0, p0 */
} // .end method
static Boolean f ( ) { //synthethic
/* .locals 1 */
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
} // .end method
private synchronized void g ( ) {
/* .locals 7 */
final String v4 = ""; // const-string v4, ""
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
/* new-instance v2, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* new-instance v3, Ljava/io/DataOutputStream; */
/* invoke-direct {v3, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_1
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.B;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->J:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->L:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* const-wide/16 v0, 0x0 */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.M;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.N;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-byte v0, p0, Lcom/flurry/android/FlurryAgent;->O:B */
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
v0 = this.P;
/* if-nez v0, :cond_0 */
final String v0 = ""; // const-string v0, ""
/* move-object v0, v4 */
} // :goto_0
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.T;
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
} // :goto_1
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->Z:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
int v0 = -1; // const/4 v0, -0x1
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
int v0 = -1; // const/4 v0, -0x1
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
/* iget-byte v0, p0, Lcom/flurry/android/FlurryAgent;->Q:B */
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
v0 = this.R;
/* if-nez v0, :cond_2 */
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
} // :goto_2
v0 = v0 = this.U;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.U;
v0 = } // :goto_3
if ( v0 != null) { // if-eqz v0, :cond_3
/* check-cast v0, Ljava/util/Map$Entry; */
/* check-cast v1, Ljava/lang/String; */
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* check-cast v0, Lcom/flurry/android/g; */
/* iget v0, v0, Lcom/flurry/android/g;->a:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v3 */
} // :goto_4
try { // :try_start_2
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
try { // :try_start_3
com.flurry.android.r .a ( v1 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
} // :goto_5
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_4
v0 = this.P;
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
v0 = this.T;
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v0 */
com.flurry.android.FlurryAgent .a ( v0,v1 );
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeDouble ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeDouble(D)V
v0 = this.T;
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v0 */
com.flurry.android.FlurryAgent .a ( v0,v1 );
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeDouble ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeDouble(D)V
v0 = this.T;
v0 = (( android.location.Location ) v0 ).getAccuracy ( ); // invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F
(( java.io.DataOutputStream ) v3 ).writeFloat ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeFloat(F)V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* goto/16 :goto_1 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v3 */
} // :goto_6
try { // :try_start_5
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_6
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
v0 = this.R;
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* goto/16 :goto_2 */
} // :cond_3
v0 = v0 = this.V;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.V;
v0 = } // :goto_7
if ( v0 != null) { // if-eqz v0, :cond_4
/* check-cast v0, Lcom/flurry/android/i; */
(( com.flurry.android.i ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/flurry/android/i;->a()[B
(( java.io.DataOutputStream ) v3 ).write ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->write([B)V
} // :cond_4
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->W:Z */
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->S:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
v0 = v0 = this.Y;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.Y;
v0 = } // :goto_8
if ( v0 != null) { // if-eqz v0, :cond_5
/* check-cast v0, Lcom/flurry/android/aa; */
/* iget-wide v4, v0, Lcom/flurry/android/aa;->a:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
v4 = this.b;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v4 = this.c;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.d;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
} // :cond_5
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = this.aa;
v1 = (( com.flurry.android.u ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->f()Ljava/util/List;
(( java.io.DataOutputStream ) v3 ).writeShort ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = } // :goto_9
if ( v0 != null) { // if-eqz v0, :cond_7
/* check-cast v0, Lcom/flurry/android/p; */
(( com.flurry.android.p ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/flurry/android/p;->a(Ljava/io/DataOutput;)V
} // :cond_6
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
} // :cond_7
v0 = this.I;
(( java.io.ByteArrayOutputStream ) v2 ).toByteArray ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
try { // :try_start_7
com.flurry.android.r .a ( v3 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* goto/16 :goto_5 */
/* :catchall_2 */
/* move-exception v1 */
/* move-object v6, v1 */
/* move-object v1, v0 */
/* move-object v0, v6 */
/* goto/16 :goto_6 */
/* :catchall_3 */
/* move-exception v0 */
/* goto/16 :goto_6 */
/* :catch_1 */
/* move-exception v1 */
/* move-object v6, v1 */
/* move-object v1, v0 */
/* move-object v0, v6 */
/* goto/16 :goto_4 */
} // .end method
private static java.lang.String h ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.c;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.flurry.android.FlurryAgent.c;
} // :goto_0
} // :cond_0
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = com.flurry.android.FlurryAgent.d;
} // :cond_1
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = com.flurry.android.FlurryAgent.e;
} // :cond_2
v0 = com.flurry.android.FlurryAgent.d;
} // .end method
private synchronized void i ( ) {
/* .locals 6 */
int v2 = 0; // const/4 v2, 0x0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.u;
com.flurry.android.FlurryAgent .a ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
com.flurry.android.r .a ( v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_2
/* new-instance v0, Ljava/io/FileOutputStream; */
v1 = this.u;
/* invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* new-instance v1, Ljava/io/DataOutputStream; */
/* invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* const v0, 0xb5fa */
try { // :try_start_3
(( java.io.DataOutputStream ) v1 ).writeShort ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
int v0 = 2; // const/4 v0, 0x2
(( java.io.DataOutputStream ) v1 ).writeShort ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.z;
(( java.io.DataOutputStream ) v1 ).writeUTF ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.F;
(( java.io.DataOutputStream ) v1 ).writeUTF ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
(( java.io.DataOutputStream ) v1 ).writeBoolean ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->H:J */
(( java.io.DataOutputStream ) v1 ).writeLong ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = v0 = this.I;
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
/* move v2, v0 */
} // :goto_1
/* if-ltz v2, :cond_1 */
v0 = this.I;
/* check-cast v0, [B */
/* array-length v3, v0 */
/* add-int/lit8 v4, v3, 0x2 */
v5 = (( java.io.DataOutputStream ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/io/DataOutputStream;->size()I
/* add-int/2addr v4, v5 */
/* const v5, 0xc350 */
/* if-le v4, v5, :cond_2 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "discarded sessions: "; // const-string v4, "discarded sessions: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v2 );
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v1 ).writeShort ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* :try_end_3 */
/* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
try { // :try_start_4
com.flurry.android.r .a ( v1 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_2
try { // :try_start_5
(( java.io.DataOutputStream ) v1 ).writeShort ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
(( java.io.DataOutputStream ) v1 ).write ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->write([B)V
/* :try_end_5 */
/* .catch Ljava/lang/Throwable; {:try_start_5 ..:try_end_5} :catch_1 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_2 */
/* add-int/lit8 v0, v2, -0x1 */
/* move v2, v0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_2
try { // :try_start_6
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
try { // :try_start_7
com.flurry.android.r .a ( v1 );
/* goto/16 :goto_0 */
/* :catchall_1 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_3
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
/* :catchall_2 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
} // .end method
private synchronized void j ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.E;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.E;
(( android.location.LocationManager ) v0 ).removeUpdates ( p0 ); // invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
/* # virtual methods */
final void a ( java.lang.Throwable p0 ) {
/* .locals 5 */
final String v4 = ""; // const-string v4, ""
(( java.lang.Throwable ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
final String v0 = ""; // const-string v0, ""
(( java.lang.Throwable ) p1 ).getStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
if ( v0 != null) { // if-eqz v0, :cond_1
/* array-length v1, v0 */
/* if-lez v1, :cond_1 */
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StackTraceElement ) v0 ).getClassName ( ); // invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "."; // const-string v3, "."
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StackTraceElement ) v0 ).getMethodName ( ); // invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ":"; // const-string v3, ":"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = (( java.lang.StackTraceElement ) v0 ).getLineNumber ( ); // invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = " ("; // const-string v2, " ("
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_0
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Class;->toString()Ljava/lang/String;
final String v2 = "uncaught"; // const-string v2, "uncaught"
try { // :try_start_0
v3 = com.flurry.android.FlurryAgent.j;
/* invoke-direct {v3, v2, v0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
v0 = this.y;
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, v0, v1}, Lcom/flurry/android/FlurryAgent;->a(Landroid/content/Context;Z)V */
return;
} // :cond_1
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_2
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v4,v0 );
} // :cond_2
/* move-object v0, v4 */
} // .end method
public synchronized final void onLocationChanged ( android.location.Location p0 ) {
/* .locals 3 */
/* monitor-enter p0 */
try { // :try_start_0
this.T = p1;
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->j()V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
return;
/* :catch_0 */
/* move-exception v0 */
try { // :try_start_1
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final void onProviderDisabled ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public final void onProviderEnabled ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public final void onStatusChanged ( java.lang.String p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 0 */
return;
} // .end method
