public class com.umeng.common.net.DownloadingService extends android.app.Service {
	 /* .source "DownloadingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/umeng/common/net/DownloadingService$a;, */
	 /* Lcom/umeng/common/net/DownloadingService$b;, */
	 /* Lcom/umeng/common/net/DownloadingService$c; */
	 /* } */
} // .end annotation
/* # static fields */
private static java.util.Map A;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Lcom/umeng/common/net/a$a;", */
/* "Landroid/os/Messenger;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static android.util.SparseArray B;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/SparseArray", */
/* "<", */
/* "Lcom/umeng/common/net/d$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static java.lang.Boolean D;
static final Integer a;
static final Integer b;
static final Integer c;
static final Integer d;
static final Integer e;
static final Integer f;
public static final Integer g;
public static final Integer h;
public static final Integer i;
public static final Integer j;
public static final Integer k;
static final Integer l;
static final java.lang.String m;
public static Boolean o;
private static final java.lang.String q;
private static final Long t;
private static final Long u;
private static final Long v;
private static final Integer w;
private static final Long z;
/* # instance fields */
private android.content.BroadcastReceiver C;
com.umeng.common.net.DownloadingService$a n;
final android.os.Messenger p;
private android.app.NotificationManager r;
private com.umeng.common.net.d s;
private android.content.Context x;
private android.os.Handler y;
/* # direct methods */
static com.umeng.common.net.DownloadingService ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 104 */
/* const-class v0, Lcom/umeng/common/net/DownloadingService; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
/* .line 147 */
com.umeng.common.net.DownloadingService.o = (v1!= 0);
/* .line 153 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 156 */
/* new-instance v0, Landroid/util/SparseArray; */
/* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
/* .line 887 */
java.lang.Boolean .valueOf ( v1 );
return;
} // .end method
public com.umeng.common.net.DownloadingService ( ) {
/* .locals 2 */
/* .prologue */
/* .line 103 */
/* invoke-direct {p0}, Landroid/app/Service;-><init>()V */
/* .line 107 */
/* new-instance v0, Lcom/umeng/common/net/d; */
/* invoke-direct {v0}, Lcom/umeng/common/net/d;-><init>()V */
this.s = v0;
/* .line 158 */
/* new-instance v0, Landroid/os/Messenger; */
/* new-instance v1, Lcom/umeng/common/net/DownloadingService$c; */
/* invoke-direct {v1, p0}, Lcom/umeng/common/net/DownloadingService$c;-><init>(Lcom/umeng/common/net/DownloadingService;)V */
/* invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V */
this.p = v0;
/* .line 103 */
return;
} // .end method
static com.umeng.common.net.d a ( com.umeng.common.net.DownloadingService p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 107 */
v0 = this.s;
} // .end method
static java.lang.String a ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 104 */
v0 = com.umeng.common.net.DownloadingService.q;
} // .end method
static void a ( com.umeng.common.net.DownloadingService p0, android.app.NotificationManager p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 106 */
this.r = p1;
return;
} // .end method
static void a ( com.umeng.common.net.DownloadingService p0, com.umeng.common.net.a$a p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 490 */
/* invoke-direct {p0, p1}, Lcom/umeng/common/net/DownloadingService;->a(Lcom/umeng/common/net/a$a;)V */
return;
} // .end method
static void a ( com.umeng.common.net.DownloadingService p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 889 */
/* invoke-direct {p0, p1}, Lcom/umeng/common/net/DownloadingService;->a(Ljava/lang/String;)V */
return;
} // .end method
private void a ( com.umeng.common.net.a$a p0 ) {
/* .locals 7 */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 491 */
v0 = com.umeng.common.net.DownloadingService.q;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "startDownload([mComponentName:"; // const-string v2, "startDownload([mComponentName:"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = this.a;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " mTitle:"; // const-string v2, " mTitle:"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 492 */
v2 = this.b;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " mUrl:"; // const-string v2, " mUrl:"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "])"; // const-string v2, "])"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 491 */
com.umeng.common.Log .c ( v0,v1 );
/* .line 494 */
v0 = this.s;
v4 = (( com.umeng.common.net.d ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/common/net/d;->a(Lcom/umeng/common/net/a$a;)I
/* .line 495 */
/* new-instance v0, Lcom/umeng/common/net/DownloadingService$b; */
(( com.umeng.common.net.DownloadingService ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/umeng/common/net/DownloadingService;->getApplicationContext()Landroid/content/Context;
/* .line 496 */
v6 = this.n;
/* move-object v1, p0 */
/* move-object v3, p1 */
/* .line 495 */
/* invoke-direct/range {v0 ..v6}, Lcom/umeng/common/net/DownloadingService$b;-><init>(Lcom/umeng/common/net/DownloadingService;Landroid/content/Context;Lcom/umeng/common/net/a$a;IILcom/umeng/common/net/DownloadingService$a;)V */
/* .line 498 */
/* new-instance v1, Lcom/umeng/common/net/d$a; */
/* invoke-direct {v1, p1, v4}, Lcom/umeng/common/net/d$a;-><init>(Lcom/umeng/common/net/a$a;I)V */
/* .line 499 */
v2 = com.umeng.common.net.DownloadingService.B;
(( com.umeng.common.net.d$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/umeng/common/net/d$a;->a(Landroid/util/SparseArray;)V
/* .line 500 */
this.a = v0;
/* .line 502 */
(( com.umeng.common.net.DownloadingService$b ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/umeng/common/net/DownloadingService$b;->start()V
/* .line 504 */
/* invoke-direct {p0}, Lcom/umeng/common/net/DownloadingService;->e()V */
/* .line 505 */
/* sget-boolean v0, Lcom/umeng/common/net/DownloadingService;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 506 */
} // :goto_0
v0 = com.umeng.common.net.DownloadingService.B;
v0 = (( android.util.SparseArray ) v0 ).size ( ); // invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
/* if-lt v5, v0, :cond_1 */
/* .line 511 */
} // :cond_0
return;
/* .line 507 */
} // :cond_1
v0 = com.umeng.common.net.DownloadingService.B;
(( android.util.SparseArray ) v0 ).valueAt ( v5 ); // invoke-virtual {v0, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/common/net/d$a; */
/* .line 508 */
v1 = com.umeng.common.net.DownloadingService.q;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Running task "; // const-string v3, "Running task "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v0 = this.e;
v0 = this.b;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .c ( v1,v0 );
/* .line 506 */
/* add-int/lit8 v5, v5, 0x1 */
} // .end method
static void a ( java.lang.Boolean p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 887 */
return;
} // .end method
private void a ( java.lang.String p0 ) {
/* .locals 5 */
/* .prologue */
/* .line 890 */
v1 = com.umeng.common.net.DownloadingService.D;
/* monitor-enter v1 */
/* .line 891 */
try { // :try_start_0
v0 = com.umeng.common.net.DownloadingService.D;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez v0, :cond_0 */
/* .line 892 */
v0 = com.umeng.common.net.DownloadingService.q;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "show single toast.["; // const-string v3, "show single toast.["
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "]"; // const-string v3, "]"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .c ( v0,v2 );
/* .line 893 */
int v0 = 1; // const/4 v0, 0x1
java.lang.Boolean .valueOf ( v0 );
/* .line 894 */
v0 = this.y;
/* new-instance v2, Lcom/umeng/common/net/i; */
/* invoke-direct {v2, p0, p1}, Lcom/umeng/common/net/i;-><init>(Lcom/umeng/common/net/DownloadingService;Ljava/lang/String;)V */
(( android.os.Handler ) v0 ).post ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 900 */
v0 = this.y;
/* new-instance v2, Lcom/umeng/common/net/j; */
/* invoke-direct {v2, p0}, Lcom/umeng/common/net/j;-><init>(Lcom/umeng/common/net/DownloadingService;)V */
/* .line 905 */
/* const-wide/16 v3, 0x4b0 */
/* .line 900 */
(( android.os.Handler ) v0 ).postDelayed ( v2, v3, v4 ); // invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 890 */
} // :cond_0
/* monitor-exit v1 */
/* .line 908 */
return;
/* .line 890 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
static android.content.Context b ( com.umeng.common.net.DownloadingService p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 144 */
v0 = this.x;
} // .end method
static java.util.Map b ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 153 */
v0 = com.umeng.common.net.DownloadingService.A;
} // .end method
static android.app.NotificationManager c ( com.umeng.common.net.DownloadingService p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 106 */
v0 = this.r;
} // .end method
static android.util.SparseArray c ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 156 */
v0 = com.umeng.common.net.DownloadingService.B;
} // .end method
static android.os.Handler d ( com.umeng.common.net.DownloadingService p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 145 */
v0 = this.y;
} // .end method
private void d ( ) {
/* .locals 2 */
/* .prologue */
/* .line 478 */
/* new-instance v0, Landroid/content/IntentFilter; */
final String v1 = "com.umeng.intent.DOWNLOAD"; // const-string v1, "com.umeng.intent.DOWNLOAD"
/* invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
/* .line 479 */
/* new-instance v1, Lcom/umeng/common/net/h; */
/* invoke-direct {v1, p0}, Lcom/umeng/common/net/h;-><init>(Lcom/umeng/common/net/DownloadingService;)V */
this.C = v1;
/* .line 487 */
v1 = this.C;
(( com.umeng.common.net.DownloadingService ) p0 ).registerReceiver ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/umeng/common/net/DownloadingService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 488 */
return;
} // .end method
private void e ( ) {
/* .locals 5 */
/* .prologue */
/* .line 925 */
/* sget-boolean v0, Lcom/umeng/common/net/DownloadingService;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 926 */
v0 = v0 = com.umeng.common.net.DownloadingService.A;
/* .line 927 */
v1 = com.umeng.common.net.DownloadingService.B;
v1 = (( android.util.SparseArray ) v1 ).size ( ); // invoke-virtual {v1}, Landroid/util/SparseArray;->size()I
/* .line 928 */
v2 = com.umeng.common.net.DownloadingService.q;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Client size ="; // const-string v4, "Client size ="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = " cacheSize = "; // const-string v4, " cacheSize = "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .a ( v2,v3 );
/* .line 929 */
/* if-eq v0, v1, :cond_0 */
/* .line 930 */
/* new-instance v2, Ljava/lang/RuntimeException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Client size ="; // const-string v4, "Client size ="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = " cacheSize = "; // const-string v3, " cacheSize = "
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* .line 933 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public android.os.IBinder onBind ( android.content.Intent p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 243 */
v0 = com.umeng.common.net.DownloadingService.q;
final String v1 = "onBind "; // const-string v1, "onBind "
com.umeng.common.Log .c ( v0,v1 );
/* .line 244 */
v0 = this.p;
(( android.os.Messenger ) v0 ).getBinder ( ); // invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;
} // .end method
public void onCreate ( ) {
/* .locals 2 */
/* .prologue */
/* .line 257 */
/* invoke-super {p0}, Landroid/app/Service;->onCreate()V */
/* .line 259 */
/* sget-boolean v0, Lcom/umeng/common/net/DownloadingService;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 260 */
int v0 = 1; // const/4 v0, 0x1
com.umeng.common.Log.LOG = (v0!= 0);
/* .line 261 */
android.os.Debug .waitForDebugger ( );
/* .line 263 */
} // :cond_0
v0 = com.umeng.common.net.DownloadingService.q;
final String v1 = "onCreate "; // const-string v1, "onCreate "
com.umeng.common.Log .c ( v0,v1 );
/* .line 264 */
final String v0 = "notification"; // const-string v0, "notification"
(( com.umeng.common.net.DownloadingService ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Lcom/umeng/common/net/DownloadingService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/NotificationManager; */
this.r = v0;
/* .line 265 */
this.x = p0;
/* .line 267 */
/* new-instance v0, Lcom/umeng/common/net/f; */
/* invoke-direct {v0, p0}, Lcom/umeng/common/net/f;-><init>(Lcom/umeng/common/net/DownloadingService;)V */
this.y = v0;
/* .line 354 */
/* new-instance v0, Lcom/umeng/common/net/g; */
/* invoke-direct {v0, p0}, Lcom/umeng/common/net/g;-><init>(Lcom/umeng/common/net/DownloadingService;)V */
this.n = v0;
/* .line 472 */
return;
} // .end method
public void onDestroy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 913 */
/* const v0, 0x3f480 */
/* .line 914 */
try { // :try_start_0
(( com.umeng.common.net.DownloadingService ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/umeng/common/net/DownloadingService;->getApplicationContext()Landroid/content/Context;
com.umeng.common.net.c .a ( v1 );
(( com.umeng.common.net.c ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/umeng/common/net/c;->a(I)V
/* .line 915 */
(( com.umeng.common.net.DownloadingService ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/umeng/common/net/DownloadingService;->getApplicationContext()Landroid/content/Context;
com.umeng.common.net.c .a ( v0 );
(( com.umeng.common.net.c ) v0 ).finalize ( ); // invoke-virtual {v0}, Lcom/umeng/common/net/c;->finalize()V
/* .line 916 */
v0 = this.C;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.C;
(( com.umeng.common.net.DownloadingService ) p0 ).unregisterReceiver ( v0 ); // invoke-virtual {p0, v0}, Lcom/umeng/common/net/DownloadingService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 920 */
} // :cond_0
} // :goto_0
/* invoke-super {p0}, Landroid/app/Service;->onDestroy()V */
/* .line 921 */
return;
/* .line 917 */
/* :catch_0 */
/* move-exception v0 */
/* .line 918 */
v1 = com.umeng.common.net.DownloadingService.q;
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.umeng.common.Log .b ( v1,v0 );
} // .end method
public void onStart ( android.content.Intent p0, Integer p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 250 */
v0 = com.umeng.common.net.DownloadingService.q;
final String v1 = "onStart "; // const-string v1, "onStart "
com.umeng.common.Log .c ( v0,v1 );
/* .line 251 */
v0 = this.s;
v1 = com.umeng.common.net.DownloadingService.B;
v2 = com.umeng.common.net.DownloadingService.A;
(( com.umeng.common.net.d ) v0 ).a ( p0, v1, v2, p1 ); // invoke-virtual {v0, p0, v1, v2, p1}, Lcom/umeng/common/net/d;->a(Lcom/umeng/common/net/DownloadingService;Landroid/util/SparseArray;Ljava/util/Map;Landroid/content/Intent;)Z
/* .line 252 */
/* invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V */
/* .line 253 */
return;
} // .end method
