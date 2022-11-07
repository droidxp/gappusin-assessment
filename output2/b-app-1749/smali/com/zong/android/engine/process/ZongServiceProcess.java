public class com.zong.android.engine.process.ZongServiceProcess extends android.app.Service {
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # instance fields */
	 private Boolean b;
	 private Boolean c;
	 private android.content.ContentValues d;
	 private java.util.HashMap e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/util/HashSet", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
private java.util.HashMap f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/HashSet", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
private com.zong.android.engine.sms.ZongSmsReceiver g;
private zongfuscated.e h;
private com.zong.android.engine.task.PaymentProcessorTask i;
private com.zong.android.engine.activities.ZongPaymentRequest j;
private java.lang.StringBuilder k;
private java.lang.StringBuilder l;
private Boolean m;
private android.os.Message n;
private android.os.Messenger o;
private android.os.Handler p;
private android.os.Messenger q;
private android.os.Handler r;
/* # direct methods */
static com.zong.android.engine.process.ZongServiceProcess ( ) {
/* .locals 1 */
/* const-class v0, Lcom/zong/android/engine/process/ZongServiceProcess; */
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
return;
} // .end method
public com.zong.android.engine.process.ZongServiceProcess ( ) {
/* .locals 2 */
/* invoke-direct {p0}, Landroid/app/Service;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
this.j = v0;
/* new-instance v0, Landroid/os/Handler; */
/* new-instance v1, Lcom/zong/android/engine/process/c; */
/* invoke-direct {v1, p0}, Lcom/zong/android/engine/process/c;-><init>(Lcom/zong/android/engine/process/ZongServiceProcess;)V */
/* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V */
this.p = v0;
/* new-instance v0, Landroid/os/Messenger; */
v1 = this.p;
/* invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V */
this.q = v0;
/* new-instance v0, Landroid/os/Handler; */
/* new-instance v1, Lcom/zong/android/engine/process/a; */
/* invoke-direct {v1, p0}, Lcom/zong/android/engine/process/a;-><init>(Lcom/zong/android/engine/process/ZongServiceProcess;)V */
/* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V */
this.r = v0;
return;
} // .end method
static android.os.Messenger a ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 1 */
v0 = this.o;
} // .end method
static void a ( android.content.ContentValues p0, java.lang.String p1 ) { //synthethic
/* .locals 4 */
v0 = zongfuscated.o .a ( p1 );
/* if-nez v0, :cond_0 */
/* new-instance v2, Ljava/util/StringTokenizer; */
final String v0 = "|"; // const-string v0, "|"
/* invoke-direct {v2, p1, v0}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // :goto_0
v0 = (( java.util.StringTokenizer ) v2 ).hasMoreElements ( ); // invoke-virtual {v2}, Ljava/util/StringTokenizer;->hasMoreElements()Z
/* if-nez v0, :cond_1 */
} // :cond_0
return;
} // :cond_1
/* new-instance v1, Ljava/util/StringTokenizer; */
(( java.util.StringTokenizer ) v2 ).nextElement ( ); // invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextElement()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
final String v3 = "="; // const-string v3, "="
/* invoke-direct {v1, v0, v3}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.StringTokenizer ) v1 ).nextElement ( ); // invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextElement()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
(( java.util.StringTokenizer ) v1 ).nextElement ( ); // invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextElement()Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
(( android.content.ContentValues ) p0 ).put ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
} // .end method
static void a ( com.zong.android.engine.process.ZongServiceProcess p0, android.content.ContentValues p1 ) { //synthethic
/* .locals 0 */
this.d = p1;
return;
} // .end method
static void a ( com.zong.android.engine.process.ZongServiceProcess p0, android.os.Message p1 ) { //synthethic
/* .locals 0 */
this.n = p1;
return;
} // .end method
static void a ( com.zong.android.engine.process.ZongServiceProcess p0, android.os.Messenger p1 ) { //synthethic
/* .locals 0 */
this.o = p1;
return;
} // .end method
static void a ( com.zong.android.engine.process.ZongServiceProcess p0, com.zong.android.engine.activities.ZongPaymentRequest p1 ) { //synthethic
/* .locals 0 */
this.j = p1;
return;
} // .end method
static void a ( com.zong.android.engine.process.ZongServiceProcess p0, java.util.HashMap p1 ) { //synthethic
/* .locals 0 */
this.e = p1;
return;
} // .end method
static void a ( com.zong.android.engine.process.ZongServiceProcess p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* iput-boolean p1, p0, Lcom/zong/android/engine/process/ZongServiceProcess;->m:Z */
return;
} // .end method
static void a ( java.util.HashMap p0, java.lang.String p1 ) { //synthethic
/* .locals 5 */
v0 = zongfuscated.o .a ( p1 );
/* if-nez v0, :cond_0 */
/* new-instance v2, Ljava/util/StringTokenizer; */
final String v0 = "|"; // const-string v0, "|"
/* invoke-direct {v2, p1, v0}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // :goto_0
v0 = (( java.util.StringTokenizer ) v2 ).hasMoreElements ( ); // invoke-virtual {v2}, Ljava/util/StringTokenizer;->hasMoreElements()Z
/* if-nez v0, :cond_1 */
} // :cond_0
return;
} // :cond_1
(( java.util.StringTokenizer ) v2 ).nextElement ( ); // invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextElement()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* new-instance v3, Ljava/util/HashSet; */
/* invoke-direct {v3}, Ljava/util/HashSet;-><init>()V */
/* new-instance v4, Ljava/util/StringTokenizer; */
final String v1 = ","; // const-string v1, ","
/* invoke-direct {v4, v0, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.StringTokenizer ) v4 ).nextElement ( ); // invoke-virtual {v4}, Ljava/util/StringTokenizer;->nextElement()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
} // :goto_1
v1 = (( java.util.StringTokenizer ) v4 ).hasMoreElements ( ); // invoke-virtual {v4}, Ljava/util/StringTokenizer;->hasMoreElements()Z
/* if-nez v1, :cond_2 */
(( java.util.HashMap ) p0 ).put ( v0, v3 ); // invoke-virtual {p0, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_2
(( java.util.StringTokenizer ) v4 ).nextElement ( ); // invoke-virtual {v4}, Ljava/util/StringTokenizer;->nextElement()Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
(( java.util.HashSet ) v3 ).add ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
} // .end method
static android.os.Message b ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 1 */
v0 = this.n;
} // .end method
static java.lang.String b ( ) { //synthethic
/* .locals 1 */
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
} // .end method
static void b ( com.zong.android.engine.process.ZongServiceProcess p0, java.util.HashMap p1 ) { //synthethic
/* .locals 0 */
this.f = p1;
return;
} // .end method
static void b ( com.zong.android.engine.process.ZongServiceProcess p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* iput-boolean p1, p0, Lcom/zong/android/engine/process/ZongServiceProcess;->c:Z */
return;
} // .end method
static com.zong.android.engine.activities.ZongPaymentRequest c ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 1 */
v0 = this.j;
} // .end method
private void c ( ) {
/* .locals 4 */
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "Starting Application"; // const-string v1, "Starting Application"
zongfuscated.q .a ( v0,v1 );
/* iget-boolean v0, p0, Lcom/zong/android/engine/process/ZongServiceProcess;->b:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/zong/android/engine/process/ZongServiceProcess;->b:Z */
/* new-instance v0, Lzongfuscated/e; */
v1 = this.j;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).getUrl ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getUrl()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lzongfuscated/e;-><init>(Ljava/lang/String;)V */
this.h = v0;
/* new-instance v0, Lcom/zong/android/engine/task/PaymentProcessorTask; */
v1 = this.r;
v2 = this.h;
/* invoke-direct {v0, p0, v1, v2}, Lcom/zong/android/engine/task/PaymentProcessorTask;-><init>(Lcom/zong/android/engine/process/ZongServiceProcess;Landroid/os/Handler;Lzongfuscated/e;)V */
this.i = v0;
/* new-instance v0, Lcom/zong/android/engine/sms/ZongSmsReceiver; */
v1 = this.i;
(( com.zong.android.engine.task.PaymentProcessorTask ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a()Landroid/os/Handler;
/* invoke-direct {v0, v1}, Lcom/zong/android/engine/sms/ZongSmsReceiver;-><init>(Landroid/os/Handler;)V */
this.g = v0;
v0 = this.g;
v1 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v2 = "Registring Handler"; // const-string v2, "Registring Handler"
zongfuscated.q .a ( v1,v2 );
(( com.zong.android.engine.process.ZongServiceProcess ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/process/ZongServiceProcess;->getApplicationContext()Landroid/content/Context;
if ( v1 != null) { // if-eqz v1, :cond_1
try { // :try_start_0
/* new-instance v2, Landroid/content/IntentFilter; */
/* invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V */
final String v3 = "android.provider.Telephony.SMS_RECEIVED"; // const-string v3, "android.provider.Telephony.SMS_RECEIVED"
(( android.content.IntentFilter ) v2 ).addAction ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* const/16 v3, 0x3e7 */
(( android.content.IntentFilter ) v2 ).setPriority ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->setPriority(I)V
(( android.content.Context ) v1 ).registerReceiver ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
v0 = zongfuscated.q .a ( );
if ( v0 != null) { // if-eqz v0, :cond_0
com.zong.android.engine.sms.a .a ( );
(( com.zong.android.engine.process.ZongServiceProcess ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/process/ZongServiceProcess;->getApplicationContext()Landroid/content/Context;
(( com.zong.android.engine.sms.a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/zong/android/engine/sms/a;->a(Landroid/content/Context;)V
} // :cond_0
return;
/* :catch_0 */
/* move-exception v0 */
v1 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v2 = "Failed to register SMS Receiver"; // const-string v2, "Failed to register SMS Receiver"
zongfuscated.q .a ( v1,v2,v0 );
} // :cond_1
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "Register failed due to missing context"; // const-string v1, "Register failed due to missing context"
zongfuscated.q .c ( v0,v1 );
} // .end method
static Boolean c ( com.zong.android.engine.process.ZongServiceProcess p0, java.util.HashMap p1 ) { //synthethic
/* .locals 6 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
v0 = this.j;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getCustomerKey ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCustomerKey()Ljava/lang/String;
v0 = (( java.util.HashMap ) p1 ).containsKey ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
final String v0 = "FORCE_ALL"; // const-string v0, "FORCE_ALL"
v0 = (( java.util.HashMap ) p1 ).containsKey ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_0
final String v0 = "FORCE_ALL"; // const-string v0, "FORCE_ALL"
v0 = (( java.util.HashMap ) p1 ).containsKey ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "FORCING DEBUG MODE ON FORCE ALL"; // const-string v1, "FORCING DEBUG MODE ON FORCE ALL"
zongfuscated.q .a ( v0,v1 );
/* move v0, v2 */
} // :goto_0
} // :cond_1
v0 = this.j;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getCustomerKey ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCustomerKey()Ljava/lang/String;
(( java.util.HashMap ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/HashSet; */
v3 = (( java.util.HashSet ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->size()I
/* if-lez v3, :cond_2 */
v3 = this.j;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v3 ).getPhoneNumber ( ); // invoke-virtual {v3}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getPhoneNumber()Ljava/lang/String;
v0 = (( java.util.HashSet ) v0 ).contains ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v3 = "FORCING DEBUG MODE ON MSISDN"; // const-string v3, "FORCING DEBUG MODE ON MSISDN"
/* new-array v4, v2, [Ljava/lang/String; */
v5 = this.j;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v5 ).getPhoneNumber ( ); // invoke-virtual {v5}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getPhoneNumber()Ljava/lang/String;
/* aput-object v5, v4, v1 */
zongfuscated.q .a ( v0,v3,v4 );
/* move v0, v2 */
} // :cond_2
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v3 = "FORCING DEBUG MODE ON CUSTOMER KEY"; // const-string v3, "FORCING DEBUG MODE ON CUSTOMER KEY"
/* new-array v4, v2, [Ljava/lang/String; */
v5 = this.j;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v5 ).getCustomerKey ( ); // invoke-virtual {v5}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCustomerKey()Ljava/lang/String;
/* aput-object v5, v4, v1 */
zongfuscated.q .a ( v0,v3,v4 );
/* move v0, v2 */
} // :cond_3
/* move v0, v1 */
} // .end method
private void d ( ) {
/* .locals 9 */
int v0 = 0; // const/4 v0, 0x0
int v2 = 1; // const/4 v2, 0x1
int v6 = 0; // const/4 v6, 0x0
this.k = v0;
this.l = v0;
v0 = this.j;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getPricepointsList ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getPricepointsList()Ljava/util/ArrayList;
v4 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
/* if-lez v4, :cond_0 */
v0 = this.j;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getCurrencyFormatter ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCurrencyFormatter()Ljava/text/NumberFormat;
/* new-instance v1, Ljava/lang/StringBuilder; */
(( java.util.ArrayList ) v3 ).get ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/zong/android/engine/activities/ZongPricePointsElement; */
(( com.zong.android.engine.activities.ZongPricePointsElement ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPricePointsElement;->c()Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
this.l = v1;
/* new-instance v1, Ljava/lang/StringBuilder; */
(( java.util.ArrayList ) v3 ).get ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/zong/android/engine/activities/ZongPricePointsElement; */
v0 = (( com.zong.android.engine.activities.ZongPricePointsElement ) v0 ).getAmount ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPricePointsElement;->getAmount()F
/* float-to-double v6, v0 */
(( java.text.NumberFormat ) v5 ).format ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
this.k = v1;
/* move v1, v2 */
} // :goto_0
/* if-lt v1, v4, :cond_1 */
} // :cond_0
/* new-instance v0, Lzongfuscated/F; */
/* invoke-direct {v0}, Lzongfuscated/F;-><init>()V */
v1 = this.l;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( zongfuscated.F ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lzongfuscated/F;->a(Ljava/lang/String;)V
v1 = this.k;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( zongfuscated.F ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lzongfuscated/F;->b(Ljava/lang/String;)V
v1 = this.h;
(( zongfuscated.F ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lzongfuscated/F;->a(Lzongfuscated/e;)V
/* new-instance v1, Ljava/lang/Thread; */
/* new-instance v3, Lcom/zong/android/engine/process/ZongServiceProcess$1; */
/* invoke-direct {v3, p0, v0}, Lcom/zong/android/engine/process/ZongServiceProcess$1;-><init>(Lcom/zong/android/engine/process/ZongServiceProcess;Lzongfuscated/F;)V */
/* invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
final String v0 = "HTML Page Loader"; // const-string v0, "HTML Page Loader"
(( java.lang.Thread ) v1 ).setName ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
(( java.lang.Thread ) v1 ).setDaemon ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Thread;->setDaemon(Z)V
(( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
return;
} // :cond_1
v0 = this.l;
final String v6 = "|"; // const-string v6, "|"
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.util.ArrayList ) v3 ).get ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/zong/android/engine/activities/ZongPricePointsElement; */
(( com.zong.android.engine.activities.ZongPricePointsElement ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPricePointsElement;->c()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.k;
final String v6 = "|"; // const-string v6, "|"
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.util.ArrayList ) v3 ).get ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/zong/android/engine/activities/ZongPricePointsElement; */
v0 = (( com.zong.android.engine.activities.ZongPricePointsElement ) v0 ).getAmount ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPricePointsElement;->getAmount()F
/* float-to-double v7, v0 */
(( java.text.NumberFormat ) v5 ).format ( v7, v8 ); // invoke-virtual {v5, v7, v8}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // .end method
static void d ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/zong/android/engine/process/ZongServiceProcess;->c()V */
return;
} // .end method
private void e ( ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "Stop Application"; // const-string v1, "Stop Application"
zongfuscated.q .a ( v0,v1 );
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/zong/android/engine/process/ZongServiceProcess;->b:Z */
v0 = this.i;
(( com.zong.android.engine.task.PaymentProcessorTask ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->b()V
v0 = this.g;
v1 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v2 = "Un-Registring Handler"; // const-string v2, "Un-Registring Handler"
zongfuscated.q .a ( v1,v2 );
if ( v0 != null) { // if-eqz v0, :cond_2
(( com.zong.android.engine.process.ZongServiceProcess ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/process/ZongServiceProcess;->getApplicationContext()Landroid/content/Context;
if ( v1 != null) { // if-eqz v1, :cond_1
try { // :try_start_0
(( android.content.Context ) v1 ).unregisterReceiver ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
v0 = zongfuscated.q .a ( );
if ( v0 != null) { // if-eqz v0, :cond_0
com.zong.android.engine.sms.a .a ( );
(( com.zong.android.engine.process.ZongServiceProcess ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/process/ZongServiceProcess;->getApplicationContext()Landroid/content/Context;
(( com.zong.android.engine.sms.a ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/zong/android/engine/sms/a;->b(Landroid/content/Context;)V
} // :cond_0
this.i = v3;
this.g = v3;
return;
/* :catch_0 */
/* move-exception v0 */
v1 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v2 = "Failed to un-register SMS Receiver"; // const-string v2, "Failed to un-register SMS Receiver"
zongfuscated.q .a ( v1,v2,v0 );
} // :cond_1
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "Un-Register failed due to missing context"; // const-string v1, "Un-Register failed due to missing context"
zongfuscated.q .c ( v0,v1 );
} // :cond_2
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "Un-Register failed no receiver registered"; // const-string v1, "Un-Register failed no receiver registered"
zongfuscated.q .a ( v0,v1 );
} // .end method
static void e ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/zong/android/engine/process/ZongServiceProcess;->d()V */
return;
} // .end method
static void f ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 4 */
/* new-instance v0, Lzongfuscated/F; */
/* invoke-direct {v0}, Lzongfuscated/F;-><init>()V */
v1 = this.r;
v2 = this.r;
int v3 = 4; // const/4 v3, 0x4
(( android.os.Handler ) v2 ).obtainMessage ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
return;
} // .end method
static void g ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/zong/android/engine/process/ZongServiceProcess;->d()V */
return;
} // .end method
static Boolean h ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/zong/android/engine/process/ZongServiceProcess;->m:Z */
} // .end method
static com.zong.android.engine.task.PaymentProcessorTask i ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 1 */
v0 = this.i;
} // .end method
static void j ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 2 */
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "Stop And Go Application"; // const-string v1, "Stop And Go Application"
zongfuscated.q .a ( v0,v1 );
/* invoke-direct {p0}, Lcom/zong/android/engine/process/ZongServiceProcess;->e()V */
/* invoke-direct {p0}, Lcom/zong/android/engine/process/ZongServiceProcess;->c()V */
return;
} // .end method
static zongfuscated.e k ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 1 */
v0 = this.h;
} // .end method
static android.content.ContentValues l ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 1 */
v0 = this.d;
} // .end method
static java.util.HashMap m ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 1 */
v0 = this.e;
} // .end method
static java.util.HashMap n ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 1 */
v0 = this.f;
} // .end method
static Boolean o ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/zong/android/engine/process/ZongServiceProcess;->c:Z */
} // .end method
static android.os.Handler p ( com.zong.android.engine.process.ZongServiceProcess p0 ) { //synthethic
/* .locals 1 */
v0 = this.r;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 2 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.g;
(( com.zong.android.engine.sms.ZongSmsReceiver ) v0 ).abortBroadcast ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/sms/ZongSmsReceiver;->abortBroadcast()V
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "Aborting SMS Broadcast"; // const-string v1, "Aborting SMS Broadcast"
zongfuscated.q .a ( v0,v1 );
} // :cond_0
return;
} // .end method
public android.os.IBinder onBind ( android.content.Intent p0 ) {
/* .locals 2 */
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "LifeCycle Event: onBind"; // const-string v1, "LifeCycle Event: onBind"
zongfuscated.q .a ( v0,v1 );
v0 = this.q;
(( android.os.Messenger ) v0 ).getBinder ( ); // invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;
} // .end method
public void onCreate ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/app/Service;->onCreate()V */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/zong/android/engine/process/ZongServiceProcess;->b:Z */
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "LifeCycle Event: onCreate"; // const-string v1, "LifeCycle Event: onCreate"
zongfuscated.q .a ( v0,v1 );
return;
} // .end method
public void onDestroy ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/app/Service;->onDestroy()V */
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "LifeCycle Event: onDestroy"; // const-string v1, "LifeCycle Event: onDestroy"
zongfuscated.q .a ( v0,v1 );
/* invoke-direct {p0}, Lcom/zong/android/engine/process/ZongServiceProcess;->e()V */
return;
} // .end method
public void onRebind ( android.content.Intent p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Landroid/app/Service;->onRebind(Landroid/content/Intent;)V */
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "LifeCycle Event: onRebind"; // const-string v1, "LifeCycle Event: onRebind"
zongfuscated.q .a ( v0,v1 );
return;
} // .end method
public Boolean onUnbind ( android.content.Intent p0 ) {
/* .locals 2 */
v0 = com.zong.android.engine.process.ZongServiceProcess.a;
final String v1 = "LifeCycle Event: onUnbind"; // const-string v1, "LifeCycle Event: onUnbind"
zongfuscated.q .a ( v0,v1 );
v0 = /* invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z */
} // .end method
