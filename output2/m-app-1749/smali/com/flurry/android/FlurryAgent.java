public class com.flurry.android.FlurryAgent implements android.location.LocationListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 private static volatile java.lang.String a;
	 private static final com.flurry.android.FlurryAgent b;
	 private static Long c;
	 private static Long d;
	 private static Boolean e;
	 private static Boolean f;
	 private static Boolean g;
	 private static android.location.Criteria h;
	 private static volatile java.lang.String kInsecureReportUrl;
	 private static volatile java.lang.String kSecureReportUrl;
	 /* # instance fields */
	 private Long A;
	 private java.lang.String B;
	 private Integer C;
	 private android.location.Location D;
	 private java.util.Map E;
	 private java.util.List F;
	 private Boolean G;
	 private Integer H;
	 private java.util.List I;
	 private Integer J;
	 private final android.os.Handler i;
	 private java.io.File j;
	 private Boolean k;
	 private Boolean l;
	 private Long m;
	 private java.util.Map n;
	 private java.lang.String o;
	 private java.lang.String p;
	 private java.lang.String q;
	 private Boolean r;
	 private java.util.List s;
	 private android.location.LocationManager t;
	 private java.lang.String u;
	 private Boolean v;
	 private Long w;
	 private java.util.List x;
	 private Long y;
	 private Long z;
	 /* # direct methods */
	 static com.flurry.android.FlurryAgent ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 /* .line 29 */
		 /* .line 30 */
		 final String v0 = "http://data.flurry.com/aar.do"; // const-string v0, "http://data.flurry.com/aar.do"
		 /* .line 31 */
		 final String v0 = "https://data.flurry.com/aar.do"; // const-string v0, "https://data.flurry.com/aar.do"
		 /* .line 53 */
		 /* new-instance v0, Lcom/flurry/android/FlurryAgent; */
		 /* invoke-direct {v0}, Lcom/flurry/android/FlurryAgent;-><init>()V */
		 /* .line 55 */
		 /* const-wide/16 v0, 0x2710 */
		 /* sput-wide v0, Lcom/flurry/android/FlurryAgent;->c:J */
		 /* .line 56 */
		 /* const-wide/16 v0, 0x4e20 */
		 /* sput-wide v0, Lcom/flurry/android/FlurryAgent;->d:J */
		 /* .line 57 */
		 com.flurry.android.FlurryAgent.e = (v2!= 0);
		 /* .line 59 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.flurry.android.FlurryAgent.f = (v0!= 0);
		 /* .line 63 */
		 com.flurry.android.FlurryAgent.g = (v2!= 0);
		 /* .line 64 */
		 return;
	 } // .end method
	 private com.flurry.android.FlurryAgent ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 151 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 68 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.j = v0;
		 /* .line 71 */
		 /* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->k:Z */
		 /* .line 72 */
		 /* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->l:Z */
		 /* .line 74 */
		 /* new-instance v0, Ljava/util/WeakHashMap; */
		 /* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
		 this.n = v0;
		 /* .line 78 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->r:Z */
		 /* .line 86 */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.x = v0;
		 /* .line 152 */
		 /* new-instance v0, Landroid/os/HandlerThread; */
		 final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
		 /* invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V */
		 /* .line 153 */
		 (( android.os.HandlerThread ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
		 /* .line 154 */
		 /* new-instance v1, Landroid/os/Handler; */
		 (( android.os.HandlerThread ) v0 ).getLooper ( ); // invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
		 /* invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 this.i = v1;
		 /* .line 155 */
		 return;
	 } // .end method
	 private static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* const/16 v1, 0xff */
		 /* .line 677 */
		 /* if-nez p0, :cond_1 */
		 /* .line 679 */
		 final String p0 = ""; // const-string p0, ""
		 /* .line 687 */
	 } // :cond_0
} // :goto_0
/* .line 681 */
} // :cond_1
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-le v0, v1, :cond_0 */
/* .line 687 */
int v0 = 0; // const/4 v0, 0x0
(( java.lang.String ) p0 ).substring ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
private synchronized void a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 8 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 352 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.o;
	 v0 = 	 (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v0, :cond_0 */
	 /* .line 354 */
	 final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v3 = "onStartSession called with different api keys: "; // const-string v3, "onStartSession called with different api keys: "
	 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v3 = this.o;
	 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v3 = " and "; // const-string v3, " and "
	 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.flurry.android.Flog .b ( v0,v1 );
	 /* .line 357 */
} // :cond_0
v0 = this.n;
/* check-cast v0, Landroid/content/Context; */
/* .line 358 */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 360 */
	 final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
	 final String v1 = "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context"; // const-string v1, "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context"
	 com.flurry.android.Flog .c ( v0,v1 );
	 /* .line 362 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->k:Z */
/* if-nez v0, :cond_8 */
/* .line 364 */
this.o = p2;
/* .line 365 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = ".flurryagent."; // const-string v1, ".flurryagent."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.o;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const/16 v3, 0x10 */
java.lang.Integer .toString ( v1,v3 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.j = v0;
/* .line 366 */
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 368 */
	 /* new-instance v0, Lcom/flurry/android/d; */
	 /* invoke-direct {v0}, Lcom/flurry/android/d;-><init>()V */
	 java.lang.Thread .setDefaultUncaughtExceptionHandler ( v0 );
	 /* .line 371 */
} // :cond_2
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 372 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->k:Z */
/* .line 374 */
v0 = this.q;
/* if-nez v0, :cond_3 */
/* .line 376 */
com.flurry.android.FlurryAgent .b ( v3 );
this.q = v0;
/* .line 378 */
} // :cond_3
(( android.content.Context ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 379 */
v1 = this.p;
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.p;
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_4 */
/* .line 381 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "onStartSession called from different application packages: "; // const-string v5, "onStartSession called from different application packages: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v5 = this.p;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = " and "; // const-string v5, " and "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.Flog .b ( v1,v4 );
/* .line 383 */
} // :cond_4
this.p = v0;
/* .line 385 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* .line 386 */
/* iget-wide v4, p0, Lcom/flurry/android/FlurryAgent;->m:J */
/* sub-long v4, v0, v4 */
/* sget-wide v6, Lcom/flurry/android/FlurryAgent;->c:J */
/* cmp-long v4, v4, v6 */
/* if-lez v4, :cond_a */
/* .line 388 */
final String v4 = "FlurryAgent"; // const-string v4, "FlurryAgent"
final String v5 = "Starting new session"; // const-string v5, "Starting new session"
com.flurry.android.Flog .a ( v4,v5 );
/* .line 391 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* iput-wide v4, p0, Lcom/flurry/android/FlurryAgent;->y:J */
/* .line 392 */
/* iput-wide v0, p0, Lcom/flurry/android/FlurryAgent;->z:J */
/* .line 393 */
/* const-wide/16 v0, -0x1 */
/* iput-wide v0, p0, Lcom/flurry/android/FlurryAgent;->A:J */
/* .line 394 */
final String v0 = ""; // const-string v0, ""
this.B = v0;
/* .line 395 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->C:I */
/* .line 396 */
int v0 = 0; // const/4 v0, 0x0
this.D = v0;
/* .line 397 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.E = v0;
/* .line 398 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.F = v0;
/* .line 399 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
/* .line 400 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.I = v0;
/* .line 401 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->H:I */
/* .line 402 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->J:I */
/* .line 404 */
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->l:Z */
/* if-nez v0, :cond_7 */
/* .line 406 */
v0 = this.j;
(( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_6
try { // :try_start_1
	 /* new-instance v0, Ljava/io/FileInputStream; */
	 v1 = this.j;
	 /* invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
	 /* new-instance v1, Ljava/io/DataInputStream; */
	 /* invoke-direct {v1, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
	 /* :try_end_1 */
	 /* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
	 try { // :try_start_2
		 v0 = 		 (( java.io.DataInputStream ) v1 ).readUnsignedShort ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I
		 /* const v2, 0xb5fa */
		 /* if-ne v0, v2, :cond_5 */
		 /* invoke-direct {p0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/io/DataInputStream;)V */
		 /* :try_end_2 */
		 /* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
	 } // :cond_5
	 try { // :try_start_3
		 com.flurry.android.FlurryAgent .a ( v1 );
		 /* :try_end_3 */
		 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
	 } // :goto_0
	 try { // :try_start_4
		 /* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->l:Z */
		 /* if-nez v0, :cond_6 */
		 v0 = this.j;
		 v0 = 		 (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
		 /* if-nez v0, :cond_6 */
		 final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
		 final String v1 = "Cannot delete persistence file"; // const-string v1, "Cannot delete persistence file"
		 com.flurry.android.Flog .b ( v0,v1 );
		 /* :try_end_4 */
		 /* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_1 */
		 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
	 } // :cond_6
} // :goto_1
try { // :try_start_5
	 /* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->l:Z */
	 /* if-nez v0, :cond_7 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
	 /* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->y:J */
	 /* iput-wide v0, p0, Lcom/flurry/android/FlurryAgent;->w:J */
	 (( android.content.Context ) v3 ).getContentResolver ( ); // invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
	 final String v1 = "android_id"; // const-string v1, "android_id"
	 android.provider.Settings$System .getString ( v0,v1 );
	 if ( v0 != null) { // if-eqz v0, :cond_9
		 v1 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 /* if-lez v1, :cond_9 */
		 final String v1 = "null"; // const-string v1, "null"
		 v1 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v1, :cond_9 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "AND"; // const-string v2, "AND"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // :goto_2
	 this.u = v0;
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->l:Z */
	 /* .line 409 */
} // :cond_7
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->r:Z */
/* .line 410 */
v1 = this.i;
/* new-instance v2, Lcom/flurry/android/c; */
/* invoke-direct {v2, p0, v3, v0}, Lcom/flurry/android/c;-><init>(Lcom/flurry/android/FlurryAgent;Landroid/content/Context;Z)V */
(( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 423 */
} // :cond_8
} // :goto_3
/* monitor-exit p0 */
return;
/* .line 406 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_4
try { // :try_start_6
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v4 = ""; // const-string v4, ""
com.flurry.android.Flog .b ( v2,v4,v0 );
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
try { // :try_start_7
com.flurry.android.FlurryAgent .a ( v1 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
/* .line 352 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* .line 406 */
/* :catchall_1 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_5
try { // :try_start_8
com.flurry.android.FlurryAgent .a ( v1 );
/* throw v0 */
/* :catch_1 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
} // :cond_9
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "ID"; // const-string v1, "ID"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* const/16 v4, 0x10 */
java.lang.Long .toString ( v1,v2,v4 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 417 */
} // :cond_a
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Continuing previous session"; // const-string v1, "Continuing previous session"
com.flurry.android.Flog .a ( v0,v1 );
/* .line 420 */
v0 = this.x;
v1 = v1 = this.x;
/* add-int/lit8 v1, v1, -0x1 */
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
/* .line 406 */
/* :catchall_2 */
/* move-exception v0 */
/* :catch_2 */
/* move-exception v0 */
} // .end method
private static void a ( java.io.Closeable p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1024 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1026 */
try { // :try_start_0
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1033 */
} // :cond_0
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
} // .end method
private synchronized void a ( java.io.DataInputStream p0 ) {
/* .locals 4 */
/* .prologue */
int v1 = 2; // const/4 v1, 0x2
/* .line 934 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* .line 936 */
/* if-le v0, v1, :cond_0 */
/* .line 938 */
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
/* .line 934 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* .line 941 */
} // :cond_0
/* if-lt v0, v1, :cond_2 */
/* .line 943 */
try { // :try_start_1
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
/* .line 944 */
v1 = this.o;
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 946 */
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
this.u = v0;
/* .line 947 */
v0 = (( java.io.DataInputStream ) p1 ).readBoolean ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readBoolean()Z
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* .line 948 */
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/flurry/android/FlurryAgent;->w:J */
/* .line 952 */
} // :goto_0
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* .line 953 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 955 */
/* new-array v0, v0, [B */
/* .line 958 */
(( java.io.DataInputStream ) p1 ).readFully ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->readFully([B)V
/* .line 959 */
v1 = this.x;
int v2 = 0; // const/4 v2, 0x0
/* .line 962 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->l:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 969 */
} // :cond_2
} // :goto_1
/* monitor-exit p0 */
return;
/* .line 966 */
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
v2 = this.o;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.Flog .a ( v1,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
private synchronized void a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 3 */
/* .prologue */
/* .line 657 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.I;
/* if-nez v0, :cond_1 */
/* .line 659 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onError called before onStartSession.Error: "; // const-string v2, "onError called before onStartSession.Error: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.Flog .b ( v0,v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 673 */
} // :cond_0
} // :goto_0
/* monitor-exit p0 */
return;
/* .line 663 */
} // :cond_1
try { // :try_start_1
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->C:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->C:I */
/* .line 664 */
v0 = v0 = this.I;
/* const/16 v1, 0xa */
/* if-ge v0, v1, :cond_0 */
/* .line 666 */
/* new-instance v0, Lcom/flurry/android/f; */
/* invoke-direct {v0}, Lcom/flurry/android/f;-><init>()V */
/* .line 667 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* iput-wide v1, v0, Lcom/flurry/android/f;->a:J */
/* .line 668 */
com.flurry.android.FlurryAgent .a ( p1 );
this.b = v1;
/* .line 669 */
com.flurry.android.FlurryAgent .a ( p2 );
this.c = v1;
/* .line 670 */
com.flurry.android.FlurryAgent .a ( p3 );
this.d = v1;
/* .line 671 */
v1 = this.I;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 657 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
private synchronized void a ( java.lang.String p0, java.util.Map p1 ) {
/* .locals 6 */
/* .prologue */
/* const/16 v5, 0x64 */
/* const/16 v4, 0x1f40 */
/* .line 561 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.F;
/* if-nez v0, :cond_1 */
/* .line 563 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onEvent called before onStartSession.Event: "; // const-string v2, "onEvent called before onStartSession.Event: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.Flog .b ( v0,v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 629 */
} // :cond_0
} // :goto_0
/* monitor-exit p0 */
return;
/* .line 567 */
} // :cond_1
try { // :try_start_1
com.flurry.android.FlurryAgent .a ( p1 );
/* .line 568 */
v0 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 572 */
v0 = this.E;
/* check-cast v0, Lcom/flurry/android/e; */
/* .line 573 */
/* if-nez v0, :cond_5 */
/* .line 575 */
v0 = v0 = this.E;
/* if-ge v0, v5, :cond_4 */
/* .line 577 */
/* new-instance v0, Lcom/flurry/android/e; */
/* invoke-direct {v0}, Lcom/flurry/android/e;-><init>()V */
/* .line 578 */
int v2 = 1; // const/4 v2, 0x1
/* iput v2, v0, Lcom/flurry/android/e;->a:I */
/* .line 579 */
v2 = this.E;
/* .line 594 */
} // :cond_2
} // :goto_1
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_8
v0 = v0 = this.F;
/* if-ge v0, v5, :cond_8 */
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->H:I */
/* if-ge v0, v4, :cond_8 */
/* .line 598 */
/* if-nez p2, :cond_3 */
/* .line 600 */
java.util.Collections .emptyMap ( );
/* .line 602 */
v0 = } // :cond_3
/* const/16 v2, 0xa */
/* if-le v0, v2, :cond_6 */
/* .line 604 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
v0 = com.flurry.android.Flog .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 606 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "MaxEventParams exceeded: "; // const-string v2, "MaxEventParams exceeded: "
v2 = (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.Flog .a ( v0,v1 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 561 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* .line 583 */
} // :cond_4
try { // :try_start_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
v0 = com.flurry.android.Flog .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 585 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "MaxEventIds exceeded: "; // const-string v3, "MaxEventIds exceeded: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.Flog .a ( v0,v2 );
/* .line 591 */
} // :cond_5
/* iget v2, v0, Lcom/flurry/android/e;->a:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, v0, Lcom/flurry/android/e;->a:I */
/* .line 611 */
} // :cond_6
com.flurry.android.FlurryAgent .b ( v1,p2 );
/* .line 612 */
/* array-length v1, v0 */
/* iget v2, p0, Lcom/flurry/android/FlurryAgent;->H:I */
/* add-int/2addr v1, v2 */
/* if-gt v1, v4, :cond_7 */
/* .line 614 */
v1 = this.F;
/* .line 615 */
/* iget v1, p0, Lcom/flurry/android/FlurryAgent;->H:I */
/* array-length v0, v0 */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->H:I */
/* goto/16 :goto_0 */
/* .line 620 */
} // :cond_7
/* const/16 v0, 0x1f40 */
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->H:I */
/* .line 621 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
/* goto/16 :goto_0 */
/* .line 627 */
} // :cond_8
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* goto/16 :goto_0 */
} // .end method
private Boolean a ( Object[] p0 ) {
/* .locals 2 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 759 */
v1 = com.flurry.android.FlurryAgent.a;
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = com.flurry.android.FlurryAgent.a;
/* .line 760 */
} // :goto_0
/* if-nez v1, :cond_2 */
/* .line 776 */
} // :cond_0
} // :goto_1
/* .line 759 */
} // :cond_1
v1 = com.flurry.android.FlurryAgent.kInsecureReportUrl;
/* .line 767 */
} // :cond_2
try { // :try_start_0
/* invoke-direct {p0, p1, v1}, Lcom/flurry/android/FlurryAgent;->a([BLjava/lang/String;)Z */
/* :try_end_0 */
v0 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 772 */
} // :goto_2
/* if-nez v0, :cond_0 */
v1 = com.flurry.android.FlurryAgent.a;
if ( v1 != null) { // if-eqz v1, :cond_0
/* :catch_0 */
/* move-exception v1 */
} // .end method
private Boolean a ( Object[] p0, java.lang.String p1 ) {
/* .locals 4 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 799 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Sending report to: "; // const-string v3, "Sending report to: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.Flog .a ( v1,v2 );
/* .line 801 */
int v1 = 0; // const/4 v1, 0x0
/* .line 802 */
/* new-instance v2, Lorg/apache/http/entity/ByteArrayEntity; */
/* invoke-direct {v2, p1}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V */
/* .line 803 */
final String v3 = "application/octet-stream"; // const-string v3, "application/octet-stream"
(( org.apache.http.entity.ByteArrayEntity ) v2 ).setContentType ( v3 ); // invoke-virtual {v2, v3}, Lorg/apache/http/entity/ByteArrayEntity;->setContentType(Ljava/lang/String;)V
/* .line 804 */
/* new-instance v3, Lorg/apache/http/client/methods/HttpPost; */
/* invoke-direct {v3, p2}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
/* .line 805 */
(( org.apache.http.client.methods.HttpPost ) v3 ).setEntity ( v2 ); // invoke-virtual {v3, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
/* .line 806 */
/* new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* .line 807 */
v2 = /* .line 808 */
/* .line 809 */
/* monitor-enter p0 */
/* .line 811 */
/* const/16 v3, 0xc8 */
/* if-ne v2, v3, :cond_0 */
/* .line 813 */
try { // :try_start_0
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Report successful"; // const-string v2, "Report successful"
com.flurry.android.Flog .a ( v1,v2 );
/* .line 814 */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* .line 815 */
v1 = this.x;
v2 = this.s;
/* .line 822 */
} // :goto_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 823 */
int v1 = 0; // const/4 v1, 0x0
this.s = v1;
/* .line 824 */
/* .line 820 */
} // :cond_0
try { // :try_start_1
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v2 = "Report failed"; // const-string v2, "Report failed"
com.flurry.android.Flog .a ( v0,v2 );
/* move v0, v1 */
/* .line 822 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // .end method
static com.flurry.android.FlurryAgent b ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 19 */
v0 = com.flurry.android.FlurryAgent.b;
} // .end method
private static java.lang.String b ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 1055 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 1056 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* .line 1057 */
v1 = this.versionName;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 1059 */
v0 = this.versionName;
/* .line 1070 */
} // :goto_0
/* .line 1061 */
} // :cond_0
/* iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 1063 */
/* iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
java.lang.Integer .toString ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1066 */
/* :catch_0 */
/* move-exception v0 */
/* .line 1068 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
/* .line 1070 */
} // :cond_1
final String v0 = "Unknown"; // const-string v0, "Unknown"
} // .end method
private synchronized void b ( android.content.Context p0, Boolean p1 ) {
/* .locals 5 */
/* .prologue */
/* .line 427 */
/* monitor-enter p0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 429 */
try { // :try_start_0
v0 = this.n;
/* check-cast v0, Landroid/content/Context; */
/* .line 430 */
/* if-nez v0, :cond_0 */
/* .line 432 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "onEndSession called without context from corresponding onStartSession"; // const-string v1, "onEndSession called without context from corresponding onStartSession"
com.flurry.android.Flog .c ( v0,v1 );
/* .line 435 */
} // :cond_0
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 437 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Ending session"; // const-string v1, "Ending session"
com.flurry.android.Flog .a ( v0,v1 );
/* .line 439 */
(( com.flurry.android.FlurryAgent ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/flurry/android/FlurryAgent;->a()V
/* .line 441 */
/* if-nez p1, :cond_3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 443 */
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 445 */
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 446 */
v2 = this.p;
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_1 */
/* .line 448 */
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "onEndSession called from different application package, expected: "; // const-string v4, "onEndSession called from different application package, expected: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.p;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " actual: "; // const-string v4, " actual: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.Flog .b ( v2,v1 );
/* .line 452 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->k:Z */
/* .line 453 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* .line 454 */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->m:J */
/* .line 456 */
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->z:J */
/* sub-long/2addr v1, v3 */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->A:J */
/* .line 457 */
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->c()V */
/* .line 459 */
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->g()V */
/* .line 460 */
/* if-nez p2, :cond_2 */
/* .line 461 */
v1 = this.i;
/* new-instance v2, Lcom/flurry/android/a; */
/* invoke-direct {v2, p0, v0}, Lcom/flurry/android/a;-><init>(Lcom/flurry/android/FlurryAgent;Landroid/content/Context;)V */
/* sget-wide v3, Lcom/flurry/android/FlurryAgent;->c:J */
(( android.os.Handler ) v1 ).postDelayed ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 467 */
} // :cond_2
/* monitor-exit p0 */
return;
/* .line 441 */
} // :cond_3
try { // :try_start_1
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 427 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
private static b ( java.lang.String p0, java.util.Map p1 ) {
/* .locals 6 */
/* .prologue */
/* .line 635 */
try { // :try_start_0
/* new-instance v3, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 636 */
/* new-instance v4, Ljava/io/DataOutputStream; */
/* invoke-direct {v4, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 638 */
(( java.io.DataOutputStream ) v4 ).writeUTF ( p0 ); // invoke-virtual {v4, p0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v1 = /* .line 639 */
(( java.io.DataOutputStream ) v4 ).writeShort ( v1 ); // invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 640 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* move-object v0, v1 */
/* check-cast v0, Ljava/util/Map$Entry; */
/* move-object v2, v0 */
/* .line 642 */
/* check-cast v1, Ljava/lang/String; */
com.flurry.android.FlurryAgent .a ( v1 );
(( java.io.DataOutputStream ) v4 ).writeUTF ( v1 ); // invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 643 */
/* check-cast v1, Ljava/lang/String; */
com.flurry.android.FlurryAgent .a ( v1 );
(( java.io.DataOutputStream ) v4 ).writeUTF ( v1 ); // invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 651 */
/* :catch_0 */
/* move-exception v1 */
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [B */
} // :goto_1
/* .line 645 */
} // :cond_0
try { // :try_start_1
(( java.io.DataOutputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V
/* .line 646 */
(( java.io.ByteArrayOutputStream ) v3 ).toByteArray ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
private android.location.Location c ( android.content.Context p0 ) {
/* .locals 7 */
/* .prologue */
/* .line 1075 */
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
v0 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
v0 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_4 */
/* .line 1078 */
} // :cond_0
final String v0 = "location"; // const-string v0, "location"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/location/LocationManager; */
/* .line 1080 */
/* monitor-enter p0 */
/* .line 1082 */
try { // :try_start_0
v1 = this.t;
/* if-nez v1, :cond_3 */
/* .line 1084 */
this.t = v0;
/* .line 1090 */
} // :goto_0
v1 = com.flurry.android.FlurryAgent.h;
/* .line 1091 */
/* if-nez v1, :cond_1 */
/* .line 1093 */
/* new-instance v1, Landroid/location/Criteria; */
/* invoke-direct {v1}, Landroid/location/Criteria;-><init>()V */
/* .line 1095 */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
(( android.location.LocationManager ) v0 ).getBestProvider ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;
/* .line 1096 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 1098 */
/* const-wide/16 v2, 0x0 */
int v4 = 0; // const/4 v4, 0x0
android.os.Looper .getMainLooper ( );
/* move-object v5, p0 */
/* invoke-virtual/range {v0 ..v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V */
/* .line 1099 */
v2 = this.i;
/* new-instance v3, Lcom/flurry/android/b; */
/* invoke-direct {v3, p0}, Lcom/flurry/android/b;-><init>(Lcom/flurry/android/FlurryAgent;)V */
/* sget-wide v4, Lcom/flurry/android/FlurryAgent;->d:J */
(( android.os.Handler ) v2 ).postDelayed ( v3, v4, v5 ); // invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 1104 */
} // :cond_2
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1105 */
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 1107 */
(( android.location.LocationManager ) v0 ).getLastKnownLocation ( v1 ); // invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
/* .line 1110 */
} // :goto_1
/* .line 1088 */
} // :cond_3
try { // :try_start_1
v0 = this.t;
/* .line 1104 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
/* .line 1110 */
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
} // .end method
private void c ( ) {
/* .locals 6 */
/* .prologue */
/* .line 497 */
try { // :try_start_0
/* new-instance v2, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 498 */
/* new-instance v3, Ljava/io/DataOutputStream; */
/* invoke-direct {v3, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 500 */
v0 = this.q;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 501 */
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->y:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* .line 502 */
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->A:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* .line 503 */
v0 = this.B;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 505 */
v0 = this.D;
/* if-nez v0, :cond_0 */
/* .line 507 */
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* .line 517 */
} // :goto_0
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->J:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
/* .line 518 */
int v0 = -1; // const/4 v0, -0x1
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
/* .line 520 */
v0 = v0 = this.E;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 521 */
v0 = this.E;
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 523 */
/* check-cast v1, Ljava/lang/String; */
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 524 */
/* check-cast v0, Lcom/flurry/android/e; */
/* iget v0, v0, Lcom/flurry/android/e;->a:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 548 */
/* :catch_0 */
/* move-exception v0 */
/* .line 550 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
/* .line 552 */
} // :goto_2
return;
/* .line 511 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_1
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* .line 512 */
v0 = this.D;
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeDouble ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeDouble(D)V
/* .line 513 */
v0 = this.D;
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeDouble ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeDouble(D)V
/* .line 514 */
v0 = this.D;
v0 = (( android.location.Location ) v0 ).getAccuracy ( ); // invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F
(( java.io.DataOutputStream ) v3 ).writeFloat ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeFloat(F)V
/* .line 527 */
} // :cond_1
v0 = v0 = this.F;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 528 */
v0 = this.F;
v0 = } // :goto_3
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, [B */
/* .line 530 */
(( java.io.DataOutputStream ) v3 ).write ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->write([B)V
/* .line 532 */
} // :cond_2
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* .line 534 */
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->C:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
/* .line 535 */
v0 = v0 = this.I;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 536 */
v0 = this.I;
v0 = } // :goto_4
if ( v0 != null) { // if-eqz v0, :cond_3
/* check-cast v0, Lcom/flurry/android/f; */
/* .line 538 */
/* iget-wide v4, v0, Lcom/flurry/android/f;->a:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
/* .line 539 */
v4 = this.b;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 540 */
v4 = this.c;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 541 */
v0 = this.d;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 544 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 546 */
v0 = this.x;
(( java.io.ByteArrayOutputStream ) v2 ).toByteArray ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_2 */
} // .end method
private synchronized void d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 556 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->J:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/flurry/android/FlurryAgent;->J:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 557 */
/* monitor-exit p0 */
return;
/* .line 556 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
private synchronized e ( ) {
/* .locals 6 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 695 */
/* monitor-enter p0 */
try { // :try_start_0
/* new-instance v2, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 696 */
/* new-instance v3, Ljava/io/DataOutputStream; */
/* invoke-direct {v3, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 698 */
/* const/16 v1, 0x8 */
(( java.io.DataOutputStream ) v3 ).writeShort ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 699 */
int v1 = 0; // const/4 v1, 0x0
(( java.io.DataOutputStream ) v3 ).writeShort ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 700 */
int v1 = 3; // const/4 v1, 0x3
(( java.io.DataOutputStream ) v3 ).writeShort ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 701 */
/* const/16 v1, 0x1e */
(( java.io.DataOutputStream ) v3 ).writeShort ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 702 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
(( java.io.DataOutputStream ) v3 ).writeLong ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
/* .line 703 */
v1 = this.o;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 704 */
v1 = this.q;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 705 */
v1 = this.u;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 706 */
/* iget-wide v4, p0, Lcom/flurry/android/FlurryAgent;->w:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
/* .line 707 */
/* iget-wide v4, p0, Lcom/flurry/android/FlurryAgent;->y:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
/* .line 710 */
int v1 = 4; // const/4 v1, 0x4
(( java.io.DataOutputStream ) v3 ).writeShort ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 711 */
final String v1 = "device.model"; // const-string v1, "device.model"
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 712 */
v1 = android.os.Build.MODEL;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 713 */
final String v1 = "build.brand"; // const-string v1, "build.brand"
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 714 */
v1 = android.os.Build.BRAND;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 715 */
final String v1 = "build.id"; // const-string v1, "build.id"
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 716 */
v1 = android.os.Build.ID;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 717 */
final String v1 = "version.release"; // const-string v1, "version.release"
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 718 */
v1 = android.os.Build$VERSION.RELEASE;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 720 */
v4 = v1 = this.x;
/* .line 721 */
(( java.io.DataOutputStream ) v3 ).writeShort ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeShort(I)V
/* move v1, v0 */
/* .line 722 */
} // :goto_0
/* if-ge v1, v4, :cond_0 */
/* .line 724 */
v0 = this.x;
/* check-cast v0, [B */
/* .line 725 */
(( java.io.DataOutputStream ) v3 ).write ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->write([B)V
/* .line 722 */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* .line 728 */
} // :cond_0
/* new-instance v0, Ljava/util/ArrayList; */
v1 = this.x;
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
this.s = v0;
/* .line 730 */
(( java.io.DataOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/DataOutputStream;->close()V
/* .line 731 */
(( java.io.ByteArrayOutputStream ) v2 ).toByteArray ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 736 */
} // :goto_1
/* monitor-exit p0 */
/* .line 733 */
/* :catch_0 */
/* move-exception v0 */
/* .line 735 */
try { // :try_start_1
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 736 */
int v0 = 0; // const/4 v0, 0x0
/* .line 695 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
private void f ( ) {
/* .locals 3 */
/* .prologue */
/* .line 831 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->e()[B */
/* .line 832 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 834 */
v0 = /* invoke-direct {p0, v0}, Lcom/flurry/android/FlurryAgent;->a([B)Z */
/* .line 835 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 838 */
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->g()V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 850 */
} // :cond_0
} // :goto_0
return;
/* .line 842 */
/* :catch_0 */
/* move-exception v0 */
/* .line 844 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .a ( v1,v2,v0 );
/* .line 846 */
/* :catch_1 */
/* move-exception v0 */
/* .line 848 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
} // .end method
private synchronized void g ( ) {
/* .locals 6 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 973 */
/* monitor-enter p0 */
/* .line 977 */
try { // :try_start_0
v0 = this.j;
(( java.io.File ) v0 ).getParentFile ( ); // invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;
/* .line 978 */
v2 = (( java.io.File ) v0 ).mkdirs ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
/* .line 979 */
/* if-nez v2, :cond_0 */
v2 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v2, :cond_0 */
/* .line 982 */
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Unable to create persistent dir: "; // const-string v4, "Unable to create persistent dir: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.Flog .b ( v2,v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 1016 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
com.flurry.android.FlurryAgent .a ( v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 1017 */
} // :goto_0
/* monitor-exit p0 */
return;
/* .line 985 */
} // :cond_0
try { // :try_start_2
/* new-instance v0, Ljava/io/FileOutputStream; */
v2 = this.j;
/* invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* .line 986 */
/* new-instance v2, Ljava/io/DataOutputStream; */
/* invoke-direct {v2, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 987 */
/* const v0, 0xb5fa */
try { // :try_start_3
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 988 */
int v0 = 2; // const/4 v0, 0x2
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 990 */
v0 = this.o;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 991 */
v0 = this.u;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* .line 992 */
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
(( java.io.DataOutputStream ) v2 ).writeBoolean ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* .line 993 */
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->w:J */
(( java.io.DataOutputStream ) v2 ).writeLong ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* .line 997 */
v0 = v0 = this.x;
/* add-int/lit8 v0, v0, -0x1 */
/* move v1, v0 */
} // :goto_1
/* if-ltz v1, :cond_1 */
/* .line 999 */
v0 = this.x;
/* check-cast v0, [B */
/* .line 1000 */
/* array-length v3, v0 */
/* .line 1001 */
/* add-int/lit8 v4, v3, 0x2 */
v5 = (( java.io.DataOutputStream ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/io/DataOutputStream;->size()I
/* add-int/2addr v4, v5 */
/* const v5, 0xc350 */
/* if-gt v4, v5, :cond_1 */
/* .line 1003 */
(( java.io.DataOutputStream ) v2 ).writeShort ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
/* .line 1006 */
(( java.io.DataOutputStream ) v2 ).write ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V
/* .line 997 */
/* add-int/lit8 v0, v1, -0x1 */
/* move v1, v0 */
/* .line 1008 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* :try_end_3 */
/* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
/* .line 1016 */
try { // :try_start_4
com.flurry.android.FlurryAgent .a ( v2 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 973 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* .line 1010 */
/* :catch_0 */
/* move-exception v0 */
/* .line 1012 */
} // :goto_2
try { // :try_start_5
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.Flog .b ( v2,v3,v0 );
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* .line 1016 */
try { // :try_start_6
com.flurry.android.FlurryAgent .a ( v1 );
/* :catchall_1 */
/* move-exception v0 */
} // :goto_3
com.flurry.android.FlurryAgent .a ( v1 );
/* throw v0 */
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v2 */
/* .line 1010 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v1, v2 */
} // .end method
public static Boolean getForbidPlaintextFallback ( ) {
/* .locals 1 */
/* .prologue */
/* .line 289 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void onEndSession ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 180 */
/* if-nez p0, :cond_0 */
/* .line 182 */
/* new-instance v0, Ljava/lang/NullPointerException; */
final String v1 = "Null context"; // const-string v1, "Null context"
/* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 186 */
} // :cond_0
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.b;
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/flurry/android/FlurryAgent;->b(Landroid/content/Context;Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 192 */
} // :goto_0
return;
/* .line 188 */
/* :catch_0 */
/* move-exception v0 */
/* .line 190 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
} // .end method
public static void onError ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 3 */
/* .prologue */
/* .line 234 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.b;
/* invoke-direct {v0, p0, p1, p2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 240 */
} // :goto_0
return;
/* .line 236 */
/* :catch_0 */
/* move-exception v0 */
/* .line 238 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
} // .end method
public static void onEvent ( java.lang.String p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 210 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.b;
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/util/Map;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 216 */
} // :goto_0
return;
/* .line 212 */
/* :catch_0 */
/* move-exception v0 */
/* .line 214 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
} // .end method
public static void onEvent ( java.lang.String p0, java.util.Map p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 222 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.b;
/* invoke-direct {v0, p0, p1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/util/Map;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 228 */
} // :goto_0
return;
/* .line 224 */
/* :catch_0 */
/* move-exception v0 */
/* .line 226 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
} // .end method
public static void onPageView ( ) {
/* .locals 3 */
/* .prologue */
/* .line 198 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.b;
/* invoke-direct {v0}, Lcom/flurry/android/FlurryAgent;->d()V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 204 */
} // :goto_0
return;
/* .line 200 */
/* :catch_0 */
/* move-exception v0 */
/* .line 202 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
} // .end method
public static void onStartSession ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 159 */
/* if-nez p0, :cond_0 */
/* .line 161 */
/* new-instance v0, Ljava/lang/NullPointerException; */
final String v1 = "Null context"; // const-string v1, "Null context"
/* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 163 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-nez v0, :cond_2 */
/* .line 165 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Api key not specified"; // const-string v1, "Api key not specified"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 170 */
} // :cond_2
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.b;
/* invoke-direct {v0, p0, p1}, Lcom/flurry/android/FlurryAgent;->a(Landroid/content/Context;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 176 */
} // :goto_0
return;
/* .line 172 */
/* :catch_0 */
/* move-exception v0 */
/* .line 174 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
} // .end method
public static void setCaptureUncaughtExceptions ( Boolean p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 339 */
v1 = com.flurry.android.FlurryAgent.b;
/* monitor-enter v1 */
/* .line 341 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.b;
/* iget-boolean v0, v0, Lcom/flurry/android/FlurryAgent;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 343 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v2 = "Cannot setCaptureUncaughtExceptions after onSessionStart"; // const-string v2, "Cannot setCaptureUncaughtExceptions after onSessionStart"
com.flurry.android.Flog .b ( v0,v2 );
/* .line 344 */
/* monitor-exit v1 */
/* .line 347 */
} // :goto_0
return;
/* .line 346 */
} // :cond_0
com.flurry.android.FlurryAgent.g = (p0!= 0);
/* .line 347 */
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static void setContinueSessionMillis ( Long p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 307 */
v1 = com.flurry.android.FlurryAgent.b;
/* monitor-enter v1 */
/* .line 309 */
try { // :try_start_0
/* sput-wide p0, Lcom/flurry/android/FlurryAgent;->c:J */
/* .line 310 */
/* monitor-exit v1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static void setLocationCriteria ( android.location.Criteria p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 265 */
v1 = com.flurry.android.FlurryAgent.b;
/* monitor-enter v1 */
/* .line 267 */
try { // :try_start_0
/* .line 268 */
/* monitor-exit v1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static void setLocationFixTimeoutMillis ( Long p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 315 */
v1 = com.flurry.android.FlurryAgent.b;
/* monitor-enter v1 */
/* .line 317 */
try { // :try_start_0
/* sput-wide p0, Lcom/flurry/android/FlurryAgent;->d:J */
/* .line 318 */
/* monitor-exit v1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static void setLogEnabled ( Boolean p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 293 */
v1 = com.flurry.android.FlurryAgent.b;
/* monitor-enter v1 */
/* .line 295 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 297 */
try { // :try_start_0
com.flurry.android.Flog .enableLog ( );
/* .line 303 */
} // :goto_0
/* monitor-exit v1 */
return;
/* .line 301 */
} // :cond_0
com.flurry.android.Flog .disableLog ( );
/* .line 303 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static void setLogEvents ( Boolean p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 323 */
v1 = com.flurry.android.FlurryAgent.b;
/* monitor-enter v1 */
/* .line 325 */
try { // :try_start_0
com.flurry.android.FlurryAgent.e = (p0!= 0);
/* .line 326 */
/* monitor-exit v1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static void setReportLocation ( Boolean p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 257 */
v1 = com.flurry.android.FlurryAgent.b;
/* monitor-enter v1 */
/* .line 259 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.b;
int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v2, v0, Lcom/flurry/android/FlurryAgent;->r:Z */
/* .line 260 */
/* monitor-exit v1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static void setReportUrl ( java.lang.String p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 244 */
/* .line 245 */
return;
} // .end method
public static void setUserId ( java.lang.String p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 331 */
v1 = com.flurry.android.FlurryAgent.b;
/* monitor-enter v1 */
/* .line 333 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.b;
com.flurry.android.FlurryAgent .a ( p0 );
this.B = v2;
/* .line 334 */
/* monitor-exit v1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static void setVersionName ( java.lang.String p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 249 */
v1 = com.flurry.android.FlurryAgent.b;
/* monitor-enter v1 */
/* .line 251 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.b;
this.q = p0;
/* .line 252 */
/* monitor-exit v1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
/* # virtual methods */
synchronized final void a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1115 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1117 */
v0 = this.t;
(( android.location.LocationManager ) v0 ).removeUpdates ( p0 ); // invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1119 */
} // :cond_0
/* monitor-exit p0 */
return;
/* .line 1115 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
final void a ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 475 */
try { // :try_start_0
/* monitor-enter p0 */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 477 */
try { // :try_start_1
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->k:Z */
/* if-nez v0, :cond_1 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->m:J */
/* sub-long/2addr v0, v2 */
/* sget-wide v2, Lcom/flurry/android/FlurryAgent;->c:J */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_1 */
v0 = v0 = this.x;
/* if-lez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 480 */
} // :goto_0
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 481 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 483 */
try { // :try_start_2
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->f()V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 490 */
} // :cond_0
} // :goto_1
return;
/* .line 477 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 480 */
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
/* .line 486 */
/* :catch_0 */
/* move-exception v0 */
/* .line 488 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
} // .end method
final void a ( android.content.Context p0, Boolean p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 857 */
int v0 = 0; // const/4 v0, 0x0
/* .line 858 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 860 */
try { // :try_start_0
/* invoke-direct {p0, p1}, Lcom/flurry/android/FlurryAgent;->c(Landroid/content/Context;)Landroid/location/Location; */
/* .line 863 */
} // :cond_0
/* monitor-enter p0 */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 865 */
try { // :try_start_1
this.D = v0;
/* .line 866 */
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = v0 = this.x;
/* if-lez v0, :cond_3 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 867 */
} // :goto_0
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 868 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 870 */
try { // :try_start_2
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->f()V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 877 */
} // :cond_2
} // :goto_1
return;
/* .line 866 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* .line 867 */
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
/* .line 873 */
/* :catch_0 */
/* move-exception v0 */
/* .line 875 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
} // .end method
final void a ( java.lang.Throwable p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 143 */
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
/* .line 144 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Class;->toString()Ljava/lang/String;
/* .line 145 */
final String v2 = "uncaught"; // const-string v2, "uncaught"
com.flurry.android.FlurryAgent .onError ( v2,v0,v1 );
/* .line 146 */
v0 = this.n;
/* .line 147 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, v0, v1}, Lcom/flurry/android/FlurryAgent;->b(Landroid/content/Context;Z)V */
/* .line 148 */
return;
} // .end method
public synchronized void onLocationChanged ( android.location.Location p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 1126 */
/* monitor-enter p0 */
try { // :try_start_0
this.D = p1;
/* .line 1127 */
(( com.flurry.android.FlurryAgent ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/flurry/android/FlurryAgent;->a()V
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1133 */
} // :goto_0
/* monitor-exit p0 */
return;
/* .line 1129 */
/* :catch_0 */
/* move-exception v0 */
/* .line 1131 */
try { // :try_start_1
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.Flog .b ( v1,v2,v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 1126 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void onProviderDisabled ( java.lang.String p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 1139 */
return;
} // .end method
public void onProviderEnabled ( java.lang.String p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 1145 */
return;
} // .end method
public void onStatusChanged ( java.lang.String p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 0 */
/* .prologue */
/* .line 1151 */
return;
} // .end method
