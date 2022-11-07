public class inal implements android.location.LocationListener {
	 /* # interfaces */
	 /* # static fields */
	 private static volatile java.lang.String a;
	 private static volatile java.lang.String b;
	 private static volatile java.lang.String c;
	 private static volatile java.lang.String d;
	 private static volatile java.lang.String e;
	 private static final com.flurry.android.FlurryAgent f;
	 private static Long g;
	 private static Boolean h;
	 private static Boolean i;
	 private static Boolean j;
	 private static android.location.Criteria k;
	 private static volatile java.lang.String kInsecureReportUrl;
	 private static volatile java.lang.String kSecureReportUrl;
	 private static Boolean l;
	 private static com.flurry.android.AppCircle m;
	 /* # instance fields */
	 private Boolean A;
	 private Long B;
	 private java.util.List C;
	 private Long D;
	 private Long E;
	 private Long F;
	 private java.lang.String G;
	 private java.lang.String H;
	 private Object I;
	 private java.lang.String J;
	 private Object K;
	 private java.lang.Long L;
	 private Integer M;
	 private android.location.Location N;
	 private java.util.Map O;
	 private java.util.List P;
	 private Boolean Q;
	 private Integer R;
	 private java.util.List S;
	 private Integer T;
	 private com.flurry.android.n U;
	 private final android.os.Handler n;
	 private java.io.File o;
	 private Boolean p;
	 private Boolean q;
	 private Long r;
	 private java.util.Map s;
	 private java.lang.String t;
	 private java.lang.String u;
	 private java.lang.String v;
	 private Boolean w;
	 private java.util.List x;
	 private android.location.LocationManager y;
	 private java.lang.String z;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 5 */
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 final String v0 = "http://data.flurry.com/aap.do"; // const-string v0, "http://data.flurry.com/aap.do"
		 final String v0 = "https://data.flurry.com/aap.do"; // const-string v0, "https://data.flurry.com/aap.do"
		 final String v0 = "http://ad.flurry.com/getCanvas.do"; // const-string v0, "http://ad.flurry.com/getCanvas.do"
		 final String v0 = "http://ad.flurry.com/getAndroidApp.do"; // const-string v0, "http://ad.flurry.com/getAndroidApp.do"
		 /* new-instance v0, Lcom/flurry/android/FlurryAgent; */
		 /* invoke-direct {v0}, Lcom/flurry/android/FlurryAgent;-><init>()V */
		 /* const-wide/16 v0, 0x2710 */
		 /* sput-wide v0, Lcom/flurry/android/FlurryAgent;->g:J */
		 com.flurry.android.FlurryAgent.h = (v4!= 0);
		 com.flurry.android.FlurryAgent.i = (v3!= 0);
		 com.flurry.android.FlurryAgent.j = (v4!= 0);
		 com.flurry.android.FlurryAgent.l = (v3!= 0);
		 /* new-instance v0, Lcom/flurry/android/AppCircle; */
		 /* invoke-direct {v0}, Lcom/flurry/android/AppCircle;-><init>()V */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = -1; // const/4 v1, -0x1
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.o = v0;
		 /* iput-boolean v2, p0, Lcom/flurry/android/FlurryAgent;->p:Z */
		 /* iput-boolean v2, p0, Lcom/flurry/android/FlurryAgent;->q:Z */
		 /* new-instance v0, Ljava/util/WeakHashMap; */
		 /* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
		 this.s = v0;
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.C = v0;
		 final String v0 = ""; // const-string v0, ""
		 this.G = v0;
		 final String v0 = ""; // const-string v0, ""
		 this.H = v0;
		 /* iput-byte v1, p0, Lcom/flurry/android/FlurryAgent;->I:B */
		 /* iput-byte v1, p0, Lcom/flurry/android/FlurryAgent;->K:B */
		 /* new-instance v0, Landroid/os/HandlerThread; */
		 final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
		 /* invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V */
		 (( android.os.HandlerThread ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
		 /* new-instance v1, Landroid/os/Handler; */
		 (( android.os.HandlerThread ) v0 ).getLooper ( ); // invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
		 /* invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 this.n = v1;
		 return;
	 } // .end method
	 static android.view.View a ( android.content.Context p0, java.lang.String p1, Integer p2 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
		 /* if-nez v0, :cond_0 */
		 /* move-object v0, v3 */
	 } // :goto_0
} // :cond_0
try { // :try_start_0
	 v0 = com.flurry.android.FlurryAgent.f;
	 v0 = this.U;
	 (( com.flurry.android.n ) v0 ).a ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lcom/flurry/android/n;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/view/View;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
	 final String v2 = ""; // const-string v2, ""
	 com.flurry.android.z .b ( v1,v2,v0 );
	 /* move-object v0, v3 */
} // .end method
static com.flurry.android.Offer a ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
	 /* if-nez v0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = com.flurry.android.FlurryAgent.f;
v0 = this.U;
(( com.flurry.android.n ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/flurry/android/n;->a(Ljava/lang/String;)Lcom/flurry/android/Offer;
} // .end method
private static java.lang.String a ( android.content.Context p0 ) {
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
com.flurry.android.z .b ( v1,v2,v0 );
} // :cond_1
final String v0 = "Unknown"; // const-string v0, "Unknown"
} // .end method
static void a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = com.flurry.android.FlurryAgent.f;
v0 = this.U;
(( com.flurry.android.n ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/flurry/android/n;->a(Landroid/content/Context;Ljava/lang/String;)V
} // .end method
private synchronized void a ( android.content.Context p0, Boolean p1 ) {
/* .locals 5 */
/* monitor-enter p0 */
if ( p1 != null) { // if-eqz p1, :cond_0
try { // :try_start_0
v0 = this.s;
/* check-cast v0, Landroid/content/Context; */
/* if-nez v0, :cond_0 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "onEndSession called without context from corresponding onStartSession"; // const-string v1, "onEndSession called without context from corresponding onStartSession"
com.flurry.android.z .d ( v0,v1 );
} // :cond_0
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->p:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = v0 = this.s;
if ( v0 != null) { // if-eqz v0, :cond_3
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Ending session"; // const-string v1, "Ending session"
com.flurry.android.z .a ( v0,v1 );
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->h()V */
/* if-nez p1, :cond_4 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
v2 = this.u;
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_1 */
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "onEndSession called from different application package, expected: "; // const-string v4, "onEndSession called from different application package, expected: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.u;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " actual: "; // const-string v4, " actual: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.z .b ( v2,v1 );
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->p:Z */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->r:J */
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->E:J */
/* sub-long/2addr v1, v3 */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->F:J */
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->e()V */
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->g()V */
/* if-nez p2, :cond_2 */
v1 = this.n;
/* new-instance v2, Lcom/flurry/android/b; */
/* invoke-direct {v2, p0, v0}, Lcom/flurry/android/b;-><init>(Lcom/flurry/android/FlurryAgent;Landroid/content/Context;)V */
/* sget-wide v3, Lcom/flurry/android/FlurryAgent;->g:J */
(( android.os.Handler ) v1 ).postDelayed ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
} // :cond_2
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.U;
(( com.flurry.android.n ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/flurry/android/n;->b()V
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
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
try { // :try_start_0
/* monitor-enter p0 */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
try { // :try_start_1
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->p:Z */
/* if-nez v0, :cond_1 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->r:J */
/* sub-long/2addr v0, v2 */
/* sget-wide v2, Lcom/flurry/android/FlurryAgent;->g:J */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_1 */
v0 = v0 = this.C;
/* if-lez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_2
	 /* invoke-direct {p0, v0}, Lcom/flurry/android/FlurryAgent;->c(Z)V */
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
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
static void a ( com.flurry.android.FlurryAgent p0, android.content.Context p1, Boolean p2 ) { //synthethic
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
if ( p2 != null) { // if-eqz p2, :cond_0
	 try { // :try_start_0
		 /* invoke-direct {p0, p1}, Lcom/flurry/android/FlurryAgent;->b(Landroid/content/Context;)Landroid/location/Location; */
	 } // :cond_0
	 /* monitor-enter p0 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
	 try { // :try_start_1
		 this.N = v0;
		 /* monitor-exit p0 */
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 try { // :try_start_2
			 /* invoke-direct {p0, v0}, Lcom/flurry/android/FlurryAgent;->c(Z)V */
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
				 com.flurry.android.z .b ( v1,v2,v0 );
			 } // .end method
			 private void a ( java.io.DataInputStream p0 ) {
				 /* .locals 12 */
				 int v11 = 0; // const/4 v11, 0x0
				 /* new-instance v1, Ljava/util/HashMap; */
				 /* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
				 /* new-instance v2, Ljava/util/HashMap; */
				 /* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
				 /* new-instance v3, Ljava/util/HashMap; */
				 /* invoke-direct {v3}, Ljava/util/HashMap;-><init>()V */
				 /* new-instance v4, Ljava/util/HashMap; */
				 /* invoke-direct {v4}, Ljava/util/HashMap;-><init>()V */
				 /* new-instance v5, Ljava/util/HashMap; */
				 /* invoke-direct {v5}, Ljava/util/HashMap;-><init>()V */
			 } // :cond_0
			 v6 = 			 (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
			 v0 = 			 (( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
			 /* packed-switch v6, :pswitch_data_0 */
			 /* :pswitch_0 */
			 final String v7 = "FlurryAgent"; // const-string v7, "FlurryAgent"
			 /* new-instance v8, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v9 = "Unknown chunkType: "; // const-string v9, "Unknown chunkType: "
			 (( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.flurry.android.z .a ( v7,v8 );
			 (( java.io.DataInputStream ) p1 ).skipBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->skipBytes(I)I
		 } // :cond_1
	 } // :goto_0
	 /* :pswitch_1 */
	 /* const/16 v0, 0x108 */
	 /* if-ne v6, v0, :cond_0 */
	 /* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/flurry/android/FlurryAgent;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V */
	 } // :cond_2
	 return;
	 /* :pswitch_2 */
	 (( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
	 /* :pswitch_3 */
	 v0 = 	 (( java.io.DataInputStream ) p1 ).readByte ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B
	 v7 = 	 (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
	 /* new-array v8, v7, [Lcom/flurry/android/o; */
	 /* move v9, v11 */
} // :goto_1
/* if-ge v9, v7, :cond_3 */
/* new-instance v10, Lcom/flurry/android/o; */
/* invoke-direct {v10, p1}, Lcom/flurry/android/o;-><init>(Ljava/io/DataInput;)V */
/* aput-object v10, v8, v9 */
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_3
java.lang.Byte .valueOf ( v0 );
/* :pswitch_4 */
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* move v7, v11 */
} // :goto_2
/* if-ge v7, v0, :cond_1 */
/* new-instance v8, Lcom/flurry/android/AdImage; */
/* invoke-direct {v8, p1}, Lcom/flurry/android/AdImage;-><init>(Ljava/io/DataInput;)V */
/* iget-wide v9, v8, Lcom/flurry/android/AdImage;->a:J */
java.lang.Long .valueOf ( v9,v10 );
/* add-int/lit8 v7, v7, 0x1 */
/* :pswitch_5 */
v0 = (( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
/* move v7, v11 */
} // :goto_3
/* if-ge v7, v0, :cond_1 */
/* new-instance v8, Lcom/flurry/android/e; */
/* invoke-direct {v8, p1}, Lcom/flurry/android/e;-><init>(Ljava/io/DataInput;)V */
v9 = this.a;
/* add-int/lit8 v7, v7, 0x1 */
/* :pswitch_6 */
(( java.io.DataInputStream ) p1 ).skipBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->skipBytes(I)I
/* :pswitch_7 */
v0 = (( java.io.DataInputStream ) p1 ).readByte ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B
/* move v7, v11 */
} // :goto_4
/* if-ge v7, v0, :cond_1 */
/* new-instance v8, Lcom/flurry/android/c; */
/* invoke-direct {v8, p1}, Lcom/flurry/android/c;-><init>(Ljava/io/DataInput;)V */
/* iget-byte v9, v8, Lcom/flurry/android/c;->a:B */
java.lang.Byte .valueOf ( v9 );
/* add-int/lit8 v7, v7, 0x1 */
/* :pswitch_8 */
v7 = (( java.io.DataInputStream ) p1 ).readByte ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B
/* move v8, v11 */
} // :goto_5
/* if-ge v8, v7, :cond_1 */
v0 = (( java.io.DataInputStream ) p1 ).readByte ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B
java.lang.Byte .valueOf ( v0 );
/* check-cast v0, Lcom/flurry/android/c; */
if ( v0 != null) { // if-eqz v0, :cond_4
(( com.flurry.android.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/flurry/android/c;->a(Ljava/io/DataInput;)V
} // :cond_4
/* add-int/lit8 v0, v8, 0x1 */
/* move v8, v0 */
/* :pswitch_9 */
v0 = (( java.io.DataInputStream ) p1 ).readInt ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I
/* move v7, v11 */
} // :goto_6
/* if-ge v7, v0, :cond_1 */
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v8 */
v10 = (( java.io.DataInputStream ) p1 ).readShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readShort()S
java.lang.Short .valueOf ( v10 );
java.lang.Long .valueOf ( v8,v9 );
/* add-int/lit8 v7, v7, 0x1 */
/* :pswitch_a */
(( java.io.DataInputStream ) p1 ).skipBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->skipBytes(I)I
/* goto/16 :goto_0 */
/* :pswitch_b */
(( java.io.DataInputStream ) p1 ).skipBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->skipBytes(I)I
/* goto/16 :goto_0 */
/* :pswitch_c */
(( java.io.DataInputStream ) p1 ).skipBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->skipBytes(I)I
/* goto/16 :goto_0 */
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
private synchronized void a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 3 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.S;
/* if-nez v0, :cond_1 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onError called before onStartSession.Error: "; // const-string v2, "onError called before onStartSession.Error: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.z .b ( v0,v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_1
try { // :try_start_1
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->M:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->M:I */
v0 = v0 = this.S;
/* const/16 v1, 0xa */
/* if-ge v0, v1, :cond_0 */
/* new-instance v0, Lcom/flurry/android/u; */
/* invoke-direct {v0}, Lcom/flurry/android/u;-><init>()V */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* iput-wide v1, v0, Lcom/flurry/android/u;->a:J */
com.flurry.android.h .a ( p1 );
this.b = v1;
com.flurry.android.h .a ( p2 );
this.c = v1;
com.flurry.android.h .a ( p3 );
this.d = v1;
v1 = this.S;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
private synchronized void a ( java.lang.String p0, java.util.Map p1, Boolean p2 ) {
/* .locals 8 */
/* const/16 v7, 0x64 */
/* const/16 v6, 0x1f40 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.P;
/* if-nez v0, :cond_1 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onEvent called before onStartSession.Event: "; // const-string v2, "onEvent called before onStartSession.Event: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.z .b ( v0,v1 );
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
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->E:J */
/* sub-long v3, v0, v2 */
com.flurry.android.h .a ( p1 );
v0 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.O;
/* check-cast v0, Lcom/flurry/android/j; */
/* if-nez v0, :cond_4 */
v0 = v0 = this.O;
/* if-ge v0, v7, :cond_3 */
/* new-instance v0, Lcom/flurry/android/j; */
/* invoke-direct {v0}, Lcom/flurry/android/j;-><init>()V */
int v2 = 1; // const/4 v2, 0x1
/* iput v2, v0, Lcom/flurry/android/j;->a:I */
v2 = this.O;
} // :cond_2
} // :goto_1
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = v0 = this.P;
/* if-ge v0, v7, :cond_7 */
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->R:I */
/* if-ge v0, v6, :cond_7 */
/* if-nez p2, :cond_8 */
java.util.Collections .emptyMap ( );
/* move-object v2, v0 */
v0 = } // :goto_2
/* const/16 v5, 0xa */
/* if-le v0, v5, :cond_5 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
v0 = com.flurry.android.z .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "MaxEventParams exceeded: "; // const-string v3, "MaxEventParams exceeded: "
v2 = (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.z .a ( v0,v1 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_3
try { // :try_start_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
v0 = com.flurry.android.z .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "MaxEventIds exceeded: "; // const-string v5, "MaxEventIds exceeded: "
(( java.lang.StringBuilder ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.z .a ( v0,v2 );
} // :cond_4
/* iget v2, v0, Lcom/flurry/android/j;->a:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, v0, Lcom/flurry/android/j;->a:I */
} // :cond_5
/* new-instance v0, Lcom/flurry/android/m; */
/* move v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/flurry/android/m;-><init>(Ljava/lang/String;Ljava/util/Map;JZ)V */
(( com.flurry.android.m ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/flurry/android/m;->b()[B
/* array-length v1, v1 */
/* iget v2, p0, Lcom/flurry/android/FlurryAgent;->R:I */
/* add-int/2addr v1, v2 */
/* if-gt v1, v6, :cond_6 */
v1 = this.P;
/* iget v1, p0, Lcom/flurry/android/FlurryAgent;->R:I */
(( com.flurry.android.m ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/flurry/android/m;->b()[B
/* array-length v0, v0 */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->R:I */
/* goto/16 :goto_0 */
} // :cond_6
/* const/16 v0, 0x1f40 */
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->R:I */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->Q:Z */
/* goto/16 :goto_0 */
} // :cond_7
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->Q:Z */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* goto/16 :goto_0 */
} // :cond_8
/* move-object v2, p2 */
/* goto/16 :goto_2 */
} // .end method
private void a ( java.util.Map p0, java.util.Map p1, java.util.Map p2, java.util.Map p3, java.util.Map p4 ) {
/* .locals 8 */
v0 = this.U;
(( com.flurry.android.n ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lcom/flurry/android/n;->a(Ljava/util/Map;)V
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, [Lcom/flurry/android/o; */
/* array-length v2, v0 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_0 */
/* aget-object v4, v0, v3 */
if ( v4 != null) { // if-eqz v4, :cond_1
v5 = this.U;
v6 = this.f;
(( java.lang.Long ) v6 ).longValue ( ); // invoke-virtual {v6}, Ljava/lang/Long;->longValue()J
/* move-result-wide v6 */
(( com.flurry.android.n ) v5 ).a ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Lcom/flurry/android/n;->a(J)Lcom/flurry/android/AdImage;
if ( v5 != null) { // if-eqz v5, :cond_1
this.h = v5;
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
/* new-instance v3, Ljava/util/HashMap; */
/* invoke-direct {v3}, Ljava/util/HashMap;-><init>()V */
} // :cond_3
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_5
/* check-cast v0, Ljava/util/Map$Entry; */
/* check-cast v1, Lcom/flurry/android/e; */
/* iget-byte v2, v1, Lcom/flurry/android/e;->b:B */
java.lang.Byte .valueOf ( v2 );
/* check-cast v2, [Lcom/flurry/android/o; */
if ( v2 != null) { // if-eqz v2, :cond_4
(( java.util.HashMap ) v3 ).put ( v0, v2 ); // invoke-virtual {v3, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_4
/* iget-byte v0, v1, Lcom/flurry/android/e;->c:B */
java.lang.Byte .valueOf ( v0 );
/* check-cast v0, Lcom/flurry/android/c; */
if ( v0 != null) { // if-eqz v0, :cond_3
this.d = v0;
} // :cond_5
v0 = this.U;
(( com.flurry.android.n ) v0 ).a ( v3, p3, p4, p5 ); // invoke-virtual {v0, v3, p3, p4, p5}, Lcom/flurry/android/n;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
return;
} // .end method
static void a ( Boolean p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = com.flurry.android.FlurryAgent.f;
v0 = this.U;
(( com.flurry.android.n ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/flurry/android/n;->a(Z)V
} // .end method
static Boolean a ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.f;
v0 = this.U;
v0 = (( com.flurry.android.n ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/flurry/android/n;->g()Z
} // .end method
private Boolean a ( Object[] p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = com.flurry.android.FlurryAgent.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = com.flurry.android.FlurryAgent.a;
} // :goto_0
/* if-nez v0, :cond_2 */
/* move v0, v3 */
} // :cond_0
} // :goto_1
} // :cond_1
v0 = com.flurry.android.FlurryAgent.kInsecureReportUrl;
} // :cond_2
try { // :try_start_0
/* invoke-direct {p0, p1, v0}, Lcom/flurry/android/FlurryAgent;->a([BLjava/lang/String;)Z */
/* :try_end_0 */
v0 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_2
/* if-nez v0, :cond_0 */
v1 = com.flurry.android.FlurryAgent.a;
if ( v1 != null) { // if-eqz v1, :cond_0
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Sending report exception"; // const-string v2, "Sending report exception"
com.flurry.android.z .a ( v1,v2 );
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* move v0, v3 */
} // .end method
private Boolean a ( Object[] p0, java.lang.String p1 ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
final String v0 = "local"; // const-string v0, "local"
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v0, v5 */
} // :goto_0
} // :cond_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Sending report to: "; // const-string v2, "Sending report to: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.z .a ( v0,v1 );
int v0 = 0; // const/4 v0, 0x0
/* new-instance v1, Lorg/apache/http/entity/ByteArrayEntity; */
/* invoke-direct {v1, p1}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V */
final String v2 = "application/octet-stream"; // const-string v2, "application/octet-stream"
(( org.apache.http.entity.ByteArrayEntity ) v1 ).setContentType ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/http/entity/ByteArrayEntity;->setContentType(Ljava/lang/String;)V
/* new-instance v2, Lorg/apache/http/client/methods/HttpPost; */
/* invoke-direct {v2, p2}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
(( org.apache.http.client.methods.HttpPost ) v2 ).setEntity ( v1 ); // invoke-virtual {v2, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
/* new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient; */
v2 = /* invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* monitor-enter p0 */
/* const/16 v3, 0xc8 */
/* if-ne v2, v3, :cond_2 */
try { // :try_start_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v2 = "Report successful"; // const-string v2, "Report successful"
com.flurry.android.z .a ( v0,v2 );
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->A:Z */
v0 = this.C;
v2 = this.x;
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Report response: "; // const-string v3, "Report response: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.z .a ( v1,v2 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* move-result-wide v1 */
/* const-wide/16 v3, 0x0 */
/* cmp-long v1, v1, v3 */
if ( v1 != null) { // if-eqz v1, :cond_1
try { // :try_start_1
/* new-instance v2, Ljava/io/DataInputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* invoke-direct {p0, v2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/io/DataInputStream;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
try { // :try_start_2
/* move v0, v5 */
} // :goto_1
/* monitor-exit p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
int v1 = 0; // const/4 v1, 0x0
this.x = v1;
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception v1 */
try { // :try_start_3
/* throw v1 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* throw v0 */
} // :cond_1
/* move v0, v5 */
} // :cond_2
try { // :try_start_4
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Report failed"; // const-string v2, "Report failed"
com.flurry.android.z .a ( v1,v2 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
} // .end method
public static void addUserCookie ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = com.flurry.android.FlurryAgent.f;
v0 = this.U;
(( com.flurry.android.n ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/flurry/android/n;->a(Ljava/lang/String;Ljava/lang/String;)V
} // .end method
private android.location.Location b ( android.content.Context p0 ) {
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
v1 = this.y;
/* if-nez v1, :cond_2 */
this.y = v0;
} // :goto_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
v1 = com.flurry.android.FlurryAgent.k;
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
v0 = this.y;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // .end method
static com.flurry.android.n b ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.f;
v0 = this.U;
} // .end method
private synchronized void b ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 9 */
int v8 = 0; // const/4 v8, 0x0
int v7 = 1; // const/4 v7, 0x1
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.t;
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onStartSession called with different api keys: "; // const-string v2, "onStartSession called with different api keys: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.t;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " and "; // const-string v2, " and "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.z .b ( v0,v1 );
} // :cond_0
v0 = this.s;
/* check-cast v0, Landroid/content/Context; */
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context"; // const-string v1, "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context"
com.flurry.android.z .d ( v0,v1 );
} // :cond_1
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->p:Z */
/* if-nez v0, :cond_8 */
this.t = p2;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = ".flurryagent."; // const-string v1, ".flurryagent."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.t;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const/16 v2, 0x10 */
java.lang.Integer .toString ( v1,v2 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.o = v0;
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* new-instance v0, Lcom/flurry/android/f; */
/* invoke-direct {v0}, Lcom/flurry/android/f;-><init>()V */
java.lang.Thread .setDefaultUncaughtExceptionHandler ( v0 );
} // :cond_2
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->p:Z */
v1 = this.v;
/* if-nez v1, :cond_3 */
com.flurry.android.FlurryAgent .a ( v0 );
this.v = v1;
} // :cond_3
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
v2 = this.u;
if ( v2 != null) { // if-eqz v2, :cond_4
v2 = this.u;
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_4 */
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "onStartSession called from different application packages: "; // const-string v4, "onStartSession called from different application packages: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.u;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " and "; // const-string v4, " and "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.z .b ( v2,v3 );
} // :cond_4
this.u = v1;
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->r:J */
/* sub-long v3, v1, v3 */
/* sget-wide v5, Lcom/flurry/android/FlurryAgent;->g:J */
/* cmp-long v3, v3, v5 */
/* if-lez v3, :cond_b */
final String v3 = "FlurryAgent"; // const-string v3, "FlurryAgent"
final String v4 = "Starting new session"; // const-string v4, "Starting new session"
com.flurry.android.z .a ( v3,v4 );
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* iput-wide v3, p0, Lcom/flurry/android/FlurryAgent;->D:J */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->E:J */
/* const-wide/16 v1, -0x1 */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->F:J */
final String v1 = ""; // const-string v1, ""
this.J = v1;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->M:I */
int v1 = 0; // const/4 v1, 0x0
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
this.G = v1;
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
this.O = v1;
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.P = v1;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->Q:Z */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.S = v1;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->R:I */
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->T:I */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Got locale: "; // const-string v3, "Got locale: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.G;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.z .a ( v1,v2 );
/* iget-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->q:Z */
/* if-nez v1, :cond_7 */
v1 = this.o;
(( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
/* :try_end_0 */
v1 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_6
try { // :try_start_1
/* new-instance v1, Ljava/io/FileInputStream; */
v2 = this.o;
/* invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* new-instance v2, Ljava/io/DataInputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
try { // :try_start_2
v1 = (( java.io.DataInputStream ) v2 ).readUnsignedShort ( ); // invoke-virtual {v2}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* const v3, 0xb5fa */
/* if-ne v1, v3, :cond_5 */
/* invoke-direct {p0, v2}, Lcom/flurry/android/FlurryAgent;->b(Ljava/io/DataInputStream;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
} // :cond_5
try { // :try_start_3
com.flurry.android.h .a ( v2 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
} // :goto_0
try { // :try_start_4
/* iget-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->q:Z */
/* if-nez v1, :cond_6 */
v1 = this.o;
v1 = (( java.io.File ) v1 ).delete ( ); // invoke-virtual {v1}, Ljava/io/File;->delete()Z
/* if-nez v1, :cond_6 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Cannot delete persistence file"; // const-string v2, "Cannot delete persistence file"
com.flurry.android.z .b ( v1,v2 );
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_1 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
} // :cond_6
} // :goto_1
try { // :try_start_5
/* iget-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->q:Z */
/* if-nez v1, :cond_7 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->A:Z */
/* iget-wide v1, p0, Lcom/flurry/android/FlurryAgent;->D:J */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->B:J */
(( android.content.Context ) v0 ).getContentResolver ( ); // invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v2 = "android_id"; // const-string v2, "android_id"
android.provider.Settings$System .getString ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_9
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-lez v2, :cond_9 */
final String v2 = "null"; // const-string v2, "null"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_9 */
final String v2 = "9774d56d682e549c"; // const-string v2, "9774d56d682e549c"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_9 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "AND"; // const-string v3, "AND"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_2
this.z = v1;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->q:Z */
} // :cond_7
/* iget-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
v2 = this.n;
/* new-instance v3, Lcom/flurry/android/d; */
/* invoke-direct {v3, p0, v0, v1}, Lcom/flurry/android/d;-><init>(Lcom/flurry/android/FlurryAgent;Landroid/content/Context;Z)V */
(( android.os.Handler ) v2 ).post ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* new-instance v0, Lcom/flurry/android/a; */
/* invoke-direct {v0}, Lcom/flurry/android/a;-><init>()V */
v1 = this.t;
this.a = v1;
v1 = this.z;
this.b = v1;
/* iget-wide v1, p0, Lcom/flurry/android/FlurryAgent;->B:J */
/* iput-wide v1, v0, Lcom/flurry/android/a;->c:J */
/* iget-wide v1, p0, Lcom/flurry/android/FlurryAgent;->D:J */
/* iput-wide v1, v0, Lcom/flurry/android/a;->d:J */
/* iget-wide v1, p0, Lcom/flurry/android/FlurryAgent;->E:J */
/* iput-wide v1, v0, Lcom/flurry/android/a;->e:J */
v1 = com.flurry.android.FlurryAgent.b;
if ( v1 != null) { // if-eqz v1, :cond_a
v1 = com.flurry.android.FlurryAgent.b;
} // :goto_3
this.f = v1;
com.flurry.android.FlurryAgent .c ( );
this.g = v1;
v1 = this.n;
this.h = v1;
/* sget-boolean v1, Lcom/flurry/android/FlurryAgent;->l:Z */
if ( v1 != null) { // if-eqz v1, :cond_8
/* new-instance v1, Lcom/flurry/android/n; */
/* invoke-direct {v1, p1, v0}, Lcom/flurry/android/n;-><init>(Landroid/content/Context;Lcom/flurry/android/a;)V */
this.U = v1;
v0 = this.U;
(( com.flurry.android.n ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/flurry/android/n;->a()V
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
} // :cond_8
} // :goto_4
/* monitor-exit p0 */
return;
/* :catch_0 */
/* move-exception v1 */
/* move-object v2, v8 */
} // :goto_5
try { // :try_start_6
final String v3 = "FlurryAgent"; // const-string v3, "FlurryAgent"
final String v4 = ""; // const-string v4, ""
com.flurry.android.z .b ( v3,v4,v1 );
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
try { // :try_start_7
com.flurry.android.h .a ( v2 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* :catchall_1 */
/* move-exception v0 */
/* move-object v1, v8 */
} // :goto_6
try { // :try_start_8
com.flurry.android.h .a ( v1 );
/* throw v0 */
/* :catch_1 */
/* move-exception v1 */
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.z .b ( v2,v3,v1 );
/* goto/16 :goto_1 */
} // :cond_9
java.lang.Math .random ( );
/* move-result-wide v1 */
java.lang.Double .doubleToLongBits ( v1,v2 );
/* move-result-wide v1 */
/* const-wide/16 v3, 0x25 */
java.lang.System .nanoTime ( );
/* move-result-wide v5 */
v7 = this.t;
v7 = (( java.lang.String ) v7 ).hashCode ( ); // invoke-virtual {v7}, Ljava/lang/String;->hashCode()I
/* mul-int/lit8 v7, v7, 0x25 */
/* int-to-long v7, v7 */
/* add-long/2addr v5, v7 */
/* mul-long/2addr v3, v5 */
/* add-long/2addr v1, v3 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "ID"; // const-string v4, "ID"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v4, 0x10 */
java.lang.Long .toString ( v1,v2,v4 );
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* goto/16 :goto_2 */
} // :cond_a
v1 = com.flurry.android.FlurryAgent.c;
} // :cond_b
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Continuing previous session"; // const-string v1, "Continuing previous session"
com.flurry.android.z .a ( v0,v1 );
v0 = this.C;
v1 = v1 = this.C;
/* sub-int/2addr v1, v7 */
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v2 */
/* :catch_2 */
/* move-exception v1 */
} // .end method
private synchronized void b ( java.io.DataInputStream p0 ) {
/* .locals 4 */
int v1 = 2; // const/4 v1, 0x2
/* monitor-enter p0 */
try { // :try_start_0
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* if-le v0, v1, :cond_0 */
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
/* if-lt v0, v1, :cond_2 */
try { // :try_start_1
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
v1 = this.t;
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
this.z = v0;
v0 = (( java.io.DataInputStream ) p1 ).readBoolean ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readBoolean()Z
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->A:Z */
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/flurry/android/FlurryAgent;->B:J */
} // :goto_0
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
if ( v0 != null) { // if-eqz v0, :cond_1
/* new-array v0, v0, [B */
(( java.io.DataInputStream ) p1 ).readFully ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->readFully([B)V
v1 = this.C;
int v2 = 0; // const/4 v2, 0x0
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->q:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :cond_2
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
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", new: "; // const-string v2, ", new: "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.t;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.z .a ( v1,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
private synchronized void b ( java.lang.String p0 ) {
/* .locals 3 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.P;
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Lcom/flurry/android/m; */
v2 = (( com.flurry.android.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/flurry/android/m;->a(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
(( com.flurry.android.m ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/flurry/android/m;->a()V
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
private synchronized b ( Boolean p0 ) {
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
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
/* const/16 v0, 0xf */
try { // :try_start_1
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
} // :goto_0
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.U;
(( com.flurry.android.n ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/flurry/android/n;->c()J
/* move-result-wide v3 */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.U;
v3 = (( com.flurry.android.n ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/flurry/android/n;->d()Ljava/util/Set;
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
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_2
try { // :try_start_2
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.z .b ( v2,v3,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
try { // :try_start_3
com.flurry.android.h .a ( v1 );
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
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_4
try { // :try_start_5
com.flurry.android.h .a ( v1 );
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
/* const/16 v0, 0x6c */
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.t;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.v;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.z;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->B:J */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->D:J */
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
v3 = v0 = this.C;
(( java.io.DataOutputStream ) v2 ).writeShort ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
/* move v4, v6 */
} // :goto_5
/* if-ge v4, v3, :cond_3 */
v0 = this.C;
/* check-cast v0, [B */
(( java.io.DataOutputStream ) v2 ).write ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
} // :cond_3
/* new-instance v0, Ljava/util/ArrayList; */
v3 = this.C;
/* invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
this.x = v0;
(( java.io.DataOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
try { // :try_start_7
com.flurry.android.h .a ( v2 );
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
static java.lang.String c ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.d;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.flurry.android.FlurryAgent.d;
} // :goto_0
} // :cond_0
v0 = com.flurry.android.FlurryAgent.e;
} // .end method
private void c ( Boolean p0 ) {
/* .locals 3 */
try { // :try_start_0
/* invoke-direct {p0, p1}, Lcom/flurry/android/FlurryAgent;->b(Z)[B */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = /* invoke-direct {p0, v0}, Lcom/flurry/android/FlurryAgent;->a([B)Z */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Done sending agent report"; // const-string v1, "Done sending agent report"
com.flurry.android.z .a ( v0,v1 );
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->g()V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
} // :cond_0
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.z .a ( v1,v2,v0 );
/* :catch_1 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
public static void clearUserCookies ( ) {
/* .locals 1 */
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = com.flurry.android.FlurryAgent.f;
v0 = this.U;
(( com.flurry.android.n ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/flurry/android/n;->j()V
} // .end method
static com.flurry.android.FlurryAgent d ( ) { //synthethic
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.f;
} // .end method
private void e ( ) {
/* .locals 7 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
/* new-instance v2, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* new-instance v3, Ljava/io/DataOutputStream; */
/* invoke-direct {v3, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_1
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.v;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->D:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->F:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* const-wide/16 v0, 0x0 */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.G;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.H;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-byte v0, p0, Lcom/flurry/android/FlurryAgent;->I:B */
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
v0 = this.J;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.N;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
} // :goto_0
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->T:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
int v0 = -1; // const/4 v0, -0x1
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
int v0 = -1; // const/4 v0, -0x1
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
/* iget-byte v0, p0, Lcom/flurry/android/FlurryAgent;->K:B */
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
v0 = this.L;
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
} // :goto_1
v0 = v0 = this.O;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.O;
v0 = } // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, Ljava/util/Map$Entry; */
/* check-cast v1, Ljava/lang/String; */
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* check-cast v0, Lcom/flurry/android/j; */
/* iget v0, v0, Lcom/flurry/android/j;->a:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v3 */
} // :goto_3
try { // :try_start_2
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.z .b ( v2,v3,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
com.flurry.android.h .a ( v1 );
} // :goto_4
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_3
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
v0 = this.N;
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeDouble ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeDouble(D)V
v0 = this.N;
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeDouble ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeDouble(D)V
v0 = this.N;
v0 = (( android.location.Location ) v0 ).getAccuracy ( ); // invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F
(( java.io.DataOutputStream ) v3 ).writeFloat ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeFloat(F)V
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v3 */
} // :goto_5
com.flurry.android.h .a ( v1 );
/* throw v0 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_4
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
v0 = this.L;
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
} // :cond_2
v0 = v0 = this.P;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.P;
v0 = } // :goto_6
if ( v0 != null) { // if-eqz v0, :cond_3
/* check-cast v0, Lcom/flurry/android/m; */
(( com.flurry.android.m ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/flurry/android/m;->b()[B
(( java.io.DataOutputStream ) v3 ).write ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->write([B)V
} // :cond_3
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->Q:Z */
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->M:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
v0 = v0 = this.S;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.S;
v0 = } // :goto_7
if ( v0 != null) { // if-eqz v0, :cond_4
/* check-cast v0, Lcom/flurry/android/u; */
/* iget-wide v4, v0, Lcom/flurry/android/u;->a:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
v4 = this.b;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v4 = this.c;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.d;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
} // :cond_4
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.U;
v1 = (( com.flurry.android.n ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/flurry/android/n;->e()Ljava/util/List;
(( java.io.DataOutputStream ) v3 ).writeShort ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = } // :goto_8
if ( v0 != null) { // if-eqz v0, :cond_6
/* check-cast v0, Lcom/flurry/android/y; */
(( com.flurry.android.y ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/flurry/android/y;->a(Ljava/io/DataOutput;)V
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
} // :cond_6
v0 = this.C;
(( java.io.ByteArrayOutputStream ) v2 ).toByteArray ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
com.flurry.android.h .a ( v3 );
/* goto/16 :goto_4 */
/* :catchall_1 */
/* move-exception v1 */
/* move-object v6, v1 */
/* move-object v1, v0 */
/* move-object v0, v6 */
/* goto/16 :goto_5 */
/* :catchall_2 */
/* move-exception v0 */
/* goto/16 :goto_5 */
/* :catch_1 */
/* move-exception v1 */
/* move-object v6, v1 */
/* move-object v1, v0 */
/* move-object v0, v6 */
/* goto/16 :goto_3 */
} // .end method
public static void enableAppCircle ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
com.flurry.android.FlurryAgent.l = (v0!= 0);
return;
} // .end method
public static void endTimedEvent ( java.lang.String p0 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.f;
/* invoke-direct {v0, p0}, Lcom/flurry/android/FlurryAgent;->b(Ljava/lang/String;)V */
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
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
private synchronized void f ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->T:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->T:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
private synchronized void g ( ) {
/* .locals 6 */
int v4 = 0; // const/4 v4, 0x0
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.o;
(( java.io.File ) v0 ).getParentFile ( ); // invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;
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
com.flurry.android.z .b ( v1,v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
com.flurry.android.h .a ( v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_2
/* new-instance v0, Ljava/io/FileOutputStream; */
v1 = this.o;
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
v0 = this.t;
(( java.io.DataOutputStream ) v1 ).writeUTF ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.z;
(( java.io.DataOutputStream ) v1 ).writeUTF ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->A:Z */
(( java.io.DataOutputStream ) v1 ).writeBoolean ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->B:J */
(( java.io.DataOutputStream ) v1 ).writeLong ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = v0 = this.C;
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
/* move v2, v0 */
} // :goto_1
/* if-ltz v2, :cond_1 */
v0 = this.C;
/* check-cast v0, [B */
/* array-length v3, v0 */
/* add-int/lit8 v4, v3, 0x2 */
v5 = (( java.io.DataOutputStream ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/io/DataOutputStream;->size()I
/* add-int/2addr v4, v5 */
/* const v5, 0xc350 */
/* if-gt v4, v5, :cond_1 */
(( java.io.DataOutputStream ) v1 ).writeShort ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
(( java.io.DataOutputStream ) v1 ).write ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->write([B)V
/* add-int/lit8 v0, v2, -0x1 */
/* move v2, v0 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v1 ).writeShort ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* :try_end_3 */
/* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
try { // :try_start_4
com.flurry.android.h .a ( v1 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v4 */
} // :goto_2
try { // :try_start_5
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.z .b ( v2,v3,v0 );
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_2 */
try { // :try_start_6
com.flurry.android.h .a ( v1 );
/* :catchall_1 */
/* move-exception v0 */
/* move-object v1, v4 */
} // :goto_3
com.flurry.android.h .a ( v1 );
/* throw v0 */
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
/* :catchall_2 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
} // .end method
public static Integer getAgentVersion ( ) {
/* .locals 1 */
/* const/16 v0, 0x6c */
} // .end method
public static com.flurry.android.AppCircle getAppCircle ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.m;
} // .end method
public static Boolean getForbidPlaintextFallback ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
private synchronized void h ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.y;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.y;
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
public static void logEvent ( java.lang.String p0 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.f;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, p0, v1, v2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/util/Map;Z)V */
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
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
public static void logEvent ( java.lang.String p0, java.util.Map p1 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.f;
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, p1, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/util/Map;Z)V */
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
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
public static void logEvent ( java.lang.String p0, java.util.Map p1, Boolean p2 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.f;
/* invoke-direct {v0, p0, p1, p2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/util/Map;Z)V */
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
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
public static void logEvent ( java.lang.String p0, Boolean p1 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.f;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, p0, v1, v2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/util/Map;Z)V */
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
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
public static void onEndSession ( android.content.Context p0 ) {
/* .locals 3 */
/* if-nez p0, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
final String v1 = "Null context"; // const-string v1, "Null context"
/* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.f;
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
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
public static void onError ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 3 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.f;
/* invoke-direct {v0, p0, p1, p2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
public static void onEvent ( java.lang.String p0 ) {
/* .locals 3 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.f;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, p0, v1, v2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/util/Map;Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
public static void onEvent ( java.lang.String p0, java.util.Map p1 ) {
/* .locals 3 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.f;
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, p1, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/util/Map;Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
public static void onPageView ( ) {
/* .locals 3 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.f;
/* invoke-direct {v0}, Lcom/flurry/android/FlurryAgent;->f()V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
public static void onStartSession ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 3 */
/* if-nez p0, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
final String v1 = "Null context"; // const-string v1, "Null context"
/* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-nez v0, :cond_2 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Api key not specified"; // const-string v1, "Api key not specified"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.f;
/* invoke-direct {v0, p0, p1}, Lcom/flurry/android/FlurryAgent;->b(Landroid/content/Context;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.z .b ( v1,v2,v0 );
} // .end method
public static void setAge ( Integer p0 ) {
/* .locals 7 */
int v6 = 1; // const/4 v6, 0x1
/* if-lez p0, :cond_0 */
/* const/16 v0, 0x6e */
/* if-ge p0, v0, :cond_0 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* int-to-long v2, p0 */
/* const-wide v4, 0x7528ad000L */
/* mul-long/2addr v2, v4 */
/* sub-long/2addr v0, v2 */
/* new-instance v2, Ljava/util/Date; */
/* invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V */
v0 = (( java.util.Date ) v2 ).getYear ( ); // invoke-virtual {v2}, Ljava/util/Date;->getYear()I
/* new-instance v1, Ljava/util/Date; */
/* invoke-direct {v1, v0, v6, v6}, Ljava/util/Date;-><init>(III)V */
v0 = com.flurry.android.FlurryAgent.f;
(( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
this.L = v1;
} // :cond_0
return;
} // .end method
public static void setCanvasUrl ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public static void setCaptureUncaughtExceptions ( Boolean p0 ) {
/* .locals 3 */
v0 = com.flurry.android.FlurryAgent.f;
/* monitor-enter v0 */
try { // :try_start_0
v1 = com.flurry.android.FlurryAgent.f;
/* iget-boolean v1, v1, Lcom/flurry/android/FlurryAgent;->p:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Cannot setCaptureUncaughtExceptions after onSessionStart"; // const-string v2, "Cannot setCaptureUncaughtExceptions after onSessionStart"
com.flurry.android.z .b ( v1,v2 );
/* monitor-exit v0 */
} // :goto_0
return;
} // :cond_0
com.flurry.android.FlurryAgent.j = (p0!= 0);
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public static void setContinueSessionMillis ( Long p0 ) {
/* .locals 2 */
v0 = com.flurry.android.FlurryAgent.f;
/* monitor-enter v0 */
try { // :try_start_0
/* sput-wide p0, Lcom/flurry/android/FlurryAgent;->g:J */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public static void setDefaultNoAdsMessage ( java.lang.String p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->l:Z */
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
/* if-nez p0, :cond_1 */
final String v0 = ""; // const-string v0, ""
} // :goto_1
} // :cond_1
/* move-object v0, p0 */
} // .end method
public static void setGender ( Object p0 ) {
/* .locals 2 */
/* packed-switch p0, :pswitch_data_0 */
v0 = com.flurry.android.FlurryAgent.f;
int v1 = -1; // const/4 v1, -0x1
/* iput-byte v1, v0, Lcom/flurry/android/FlurryAgent;->K:B */
} // :goto_0
return;
/* :pswitch_0 */
v0 = com.flurry.android.FlurryAgent.f;
/* iput-byte p0, v0, Lcom/flurry/android/FlurryAgent;->K:B */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static void setGetAppUrl ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public static void setLocationCriteria ( android.location.Criteria p0 ) {
/* .locals 2 */
v0 = com.flurry.android.FlurryAgent.f;
/* monitor-enter v0 */
try { // :try_start_0
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public static void setLogEnabled ( Boolean p0 ) {
/* .locals 2 */
v0 = com.flurry.android.FlurryAgent.f;
/* monitor-enter v0 */
if ( p0 != null) { // if-eqz p0, :cond_0
try { // :try_start_0
com.flurry.android.z .b ( );
} // :goto_0
/* monitor-exit v0 */
return;
} // :cond_0
com.flurry.android.z .a ( );
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public static void setLogEvents ( Boolean p0 ) {
/* .locals 2 */
v0 = com.flurry.android.FlurryAgent.f;
/* monitor-enter v0 */
try { // :try_start_0
com.flurry.android.FlurryAgent.h = (p0!= 0);
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public static void setReportLocation ( Boolean p0 ) {
/* .locals 2 */
v0 = com.flurry.android.FlurryAgent.f;
/* monitor-enter v0 */
try { // :try_start_0
v1 = com.flurry.android.FlurryAgent.f;
/* iput-boolean p0, v1, Lcom/flurry/android/FlurryAgent;->w:Z */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public static void setReportUrl ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public static void setUserId ( java.lang.String p0 ) {
/* .locals 3 */
v0 = com.flurry.android.FlurryAgent.f;
/* monitor-enter v0 */
try { // :try_start_0
v1 = com.flurry.android.FlurryAgent.f;
com.flurry.android.h .a ( p0 );
this.J = v2;
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public static void setVersionName ( java.lang.String p0 ) {
/* .locals 2 */
v0 = com.flurry.android.FlurryAgent.f;
/* monitor-enter v0 */
try { // :try_start_0
v1 = com.flurry.android.FlurryAgent.f;
this.v = p0;
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
/* # virtual methods */
final void a ( java.lang.Throwable p0 ) {
/* .locals 3 */
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Class;->toString()Ljava/lang/String;
final String v2 = "uncaught"; // const-string v2, "uncaught"
com.flurry.android.FlurryAgent .onError ( v2,v0,v1 );
v0 = this.s;
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, v0, v1}, Lcom/flurry/android/FlurryAgent;->a(Landroid/content/Context;Z)V */
return;
} // .end method
public synchronized final void onLocationChanged ( android.location.Location p0 ) {
/* .locals 3 */
/* monitor-enter p0 */
try { // :try_start_0
this.N = p1;
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->h()V */
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
com.flurry.android.z .b ( v1,v2,v0 );
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
