public abstract class com.zong.android.engine.process.ZongActivityProcess extends android.app.Activity {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/zong/android/engine/process/ZongActivityProcess$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String c;
/* # instance fields */
protected Integer a;
android.os.Messenger b;
private Boolean d;
private Integer e;
private Integer f;
private java.lang.String g;
private java.lang.String h;
private java.util.HashSet i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashSet", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private com.zong.android.engine.activities.ZongPaymentRequest j;
private zongfuscated.F k;
private final android.os.Handler l;
private android.os.Messenger m;
private Boolean n;
private android.content.ServiceConnection o;
/* # direct methods */
static com.zong.android.engine.process.ZongActivityProcess ( ) {
/* .locals 1 */
/* const-class v0, Lcom/zong/android/engine/process/ZongActivityProcess; */
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
return;
} // .end method
public com.zong.android.engine.process.ZongActivityProcess ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
/* iput v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->a:I */
/* iput v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->f:I */
/* new-instance v0, Landroid/os/Handler; */
/* new-instance v1, Lcom/zong/android/engine/process/b; */
/* invoke-direct {v1, p0}, Lcom/zong/android/engine/process/b;-><init>(Lcom/zong/android/engine/process/ZongActivityProcess;)V */
/* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V */
this.l = v0;
/* new-instance v0, Landroid/os/Messenger; */
v1 = this.l;
/* invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V */
this.m = v0;
this.b = v2;
this.o = v2;
return;
} // .end method
private void b ( Integer p0 ) {
/* .locals 3 */
v0 = com.zong.android.engine.process.ZongActivityProcess.c;
final String v1 = "LifeCycle Event: onStart"; // const-string v1, "LifeCycle Event: onStart"
zongfuscated.q .a ( v0,v1 );
/* iget-boolean v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->n:Z */
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/zong/android/engine/process/ZongActivityProcess$a; */
/* invoke-direct {v0, p0, p1}, Lcom/zong/android/engine/process/ZongActivityProcess$a;-><init>(Lcom/zong/android/engine/process/ZongActivityProcess;I)V */
this.o = v0;
/* new-instance v0, Landroid/content/Intent; */
/* const-class v1, Lcom/zong/android/engine/process/ZongServiceProcess; */
/* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
v1 = this.o;
int v2 = 1; // const/4 v2, 0x1
v0 = (( com.zong.android.engine.process.ZongActivityProcess ) p0 ).bindService ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/zong/android/engine/process/ZongActivityProcess;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
/* iput-boolean v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->n:Z */
} // :cond_0
return;
} // .end method
static java.lang.String i ( ) { //synthethic
/* .locals 1 */
v0 = com.zong.android.engine.process.ZongActivityProcess.c;
} // .end method
/* # virtual methods */
protected final com.zong.android.engine.activities.ZongPricePointsElement a ( com.zong.android.engine.activities.ZongPaymentRequest p0 ) {
/* .locals 2 */
(( com.zong.android.engine.activities.ZongPaymentRequest ) p1 ).getPricepointsList ( ); // invoke-virtual {p1}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getPricepointsList()Ljava/util/ArrayList;
/* iget v1, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->f:I */
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/zong/android/engine/activities/ZongPricePointsElement; */
} // .end method
protected final java.lang.String a ( java.lang.String p0 ) {
/* .locals 2 */
v0 = this.k;
(( zongfuscated.F ) v0 ).f ( ); // invoke-virtual {v0}, Lzongfuscated/F;->f()Landroid/content/ContentValues;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( android.content.ContentValues ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
(( android.content.ContentValues ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* move-object p1, v0 */
} // :cond_0
} // .end method
protected final void a ( ) {
/* .locals 2 */
/* const/16 v0, 0x9 */
int v1 = 0; // const/4 v1, 0x0
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/zong/android/engine/process/ZongActivityProcess;->a(ILjava/lang/Object;)V
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->f:I */
return;
} // .end method
protected final void a ( Integer p0, java.lang.Object p1 ) {
/* .locals 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-nez p2, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
	 android.os.Message .obtain ( v0,p1 );
} // :goto_0
v1 = this.m;
this.replyTo = v1;
v1 = this.b;
(( android.os.Messenger ) v1 ).send ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
} // :cond_0
} // :goto_1
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
android.os.Message .obtain ( v0,p1,p2 );
/* :try_end_0 */
/* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public void a ( Float p0 ) {
/* .locals 3 */
this.k = p1;
(( zongfuscated.F ) p1 ).d ( ); // invoke-virtual {p1}, Lzongfuscated/F;->d()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.i = v0;
/* new-instance v0, Ljava/util/StringTokenizer; */
(( zongfuscated.F ) p1 ).d ( ); // invoke-virtual {p1}, Lzongfuscated/F;->d()Ljava/lang/String;
final String v2 = "|"; // const-string v2, "|"
/* invoke-direct {v0, v1, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // :goto_0
v1 = (( java.util.StringTokenizer ) v0 ).hasMoreTokens ( ); // invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
/* if-nez v1, :cond_1 */
} // :cond_0
return;
} // :cond_1
(( java.util.StringTokenizer ) v0 ).nextToken ( ); // invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
v2 = this.i;
(( java.util.HashSet ) v2 ).add ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
v0 = (( zongfuscated.b ) p1 ).a ( ); // invoke-virtual {p1}, Lzongfuscated/b;->a()Z
/* iput-boolean v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->d:Z */
v0 = (( zongfuscated.b ) p1 ).b ( ); // invoke-virtual {p1}, Lzongfuscated/b;->b()I
/* iput v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->e:I */
/* iget-boolean v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->d:Z */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->e:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
(( zongfuscated.b ) p1 ).e ( ); // invoke-virtual {p1}, Lzongfuscated/b;->e()Ljava/lang/String;
this.g = v0;
(( zongfuscated.b ) p1 ).d ( ); // invoke-virtual {p1}, Lzongfuscated/b;->d()Ljava/lang/String;
this.h = v0;
} // :cond_0
} // :goto_0
return;
} // :cond_1
final String v0 = "error.UNKNOWED"; // const-string v0, "error.UNKNOWED"
this.g = v0;
final String v0 = ""; // const-string v0, ""
this.h = v0;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
return;
} // .end method
protected void b ( ) {
/* .locals 4 */
/* const/16 v0, 0x8 */
/* new-instance v1, Lzongfuscated/l; */
/* invoke-direct {v1}, Lzongfuscated/l;-><init>()V */
v2 = this.j;
(( zongfuscated.l ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lzongfuscated/l;->a(Lcom/zong/android/engine/activities/ZongPaymentRequest;)V
v2 = this.j;
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lcom/zong/android/engine/process/ZongActivityProcess;->a(Lcom/zong/android/engine/activities/ZongPaymentRequest;)Lcom/zong/android/engine/activities/ZongPricePointsElement;
(( com.zong.android.engine.activities.ZongPricePointsElement ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/zong/android/engine/activities/ZongPricePointsElement;->a()Ljava/lang/String;
(( com.zong.android.engine.activities.ZongPricePointsElement ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/zong/android/engine/activities/ZongPricePointsElement;->b()Ljava/lang/String;
(( zongfuscated.l ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lzongfuscated/l;->a(Ljava/lang/String;)V
(( zongfuscated.l ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Lzongfuscated/l;->b(Ljava/lang/String;)V
v2 = com.zong.android.engine.process.ZongActivityProcess.c;
v3 = this.j;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v3 ).toString ( ); // invoke-virtual {v3}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->toString()Ljava/lang/String;
zongfuscated.q .a ( v2,v3 );
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/zong/android/engine/process/ZongActivityProcess;->a(ILjava/lang/Object;)V
v0 = com.zong.android.engine.process.ZongActivityProcess.c;
final String v1 = "Excute Payment"; // const-string v1, "Excute Payment"
zongfuscated.q .a ( v0,v1 );
return;
} // .end method
public final void b ( com.zong.android.engine.activities.ZongPaymentRequest p0 ) {
/* .locals 0 */
this.j = p1;
return;
} // .end method
protected final void b ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->d:Z */
int v0 = 2; // const/4 v0, 0x2
/* iput v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->e:I */
final String v0 = "User"; // const-string v0, "User"
this.g = v0;
this.h = p1;
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/process/ZongActivityProcess;->c()V
return;
} // .end method
protected final void c ( ) {
/* .locals 3 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
/* iget-boolean v1, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->d:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "com.zong.intent.SelectPricePointIndex"; // const-string v1, "com.zong.intent.SelectPricePointIndex"
/* iget v2, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->f:I */
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v1 = "com.zong.intent.RequestObject"; // const-string v1, "com.zong.intent.RequestObject"
v2 = this.j;
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
int v1 = -1; // const/4 v1, -0x1
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).setResult ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/zong/android/engine/process/ZongActivityProcess;->setResult(ILandroid/content/Intent;)V
} // :goto_0
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/process/ZongActivityProcess;->finish()V
return;
} // :cond_0
final String v1 = "com.zong.intent.error.Code"; // const-string v1, "com.zong.intent.error.Code"
v2 = this.g;
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "com.zong.intent.error.label"; // const-string v1, "com.zong.intent.error.label"
v2 = this.h;
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* iget v1, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->e:I */
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).setResult ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/zong/android/engine/process/ZongActivityProcess;->setResult(ILandroid/content/Intent;)V
} // .end method
public void d ( ) {
/* .locals 0 */
return;
} // .end method
public final Boolean e ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->d:Z */
} // .end method
public final Integer f ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->e:I */
} // .end method
public final zongfuscated.F g ( ) {
/* .locals 1 */
v0 = this.k;
} // .end method
public final com.zong.android.engine.activities.ZongPaymentRequest h ( ) {
/* .locals 1 */
v0 = this.j;
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
v0 = com.zong.android.engine.process.ZongActivityProcess.c;
final String v1 = "LifeCycle Event: onConfigurationChanged"; // const-string v1, "LifeCycle Event: onConfigurationChanged"
zongfuscated.q .a ( v0,v1 );
return;
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
v0 = com.zong.android.engine.process.ZongActivityProcess.c;
final String v1 = "LifeCycle Event: onCreate"; // const-string v1, "LifeCycle Event: onCreate"
zongfuscated.q .a ( v0,v1 );
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->n:Z */
return;
} // .end method
protected void onDestroy ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
v0 = com.zong.android.engine.process.ZongActivityProcess.c;
final String v1 = "LifeCycle Event: onDestroy"; // const-string v1, "LifeCycle Event: onDestroy"
zongfuscated.q .a ( v0,v1 );
/* iget-boolean v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 4; // const/4 v0, 0x4
int v1 = 0; // const/4 v1, 0x0
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/zong/android/engine/process/ZongActivityProcess;->a(ILjava/lang/Object;)V
v0 = this.o;
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).unbindService ( v0 ); // invoke-virtual {p0, v0}, Lcom/zong/android/engine/process/ZongActivityProcess;->unbindService(Landroid/content/ServiceConnection;)V
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->n:Z */
} // :cond_0
return;
} // .end method
protected void onPause ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
v0 = com.zong.android.engine.process.ZongActivityProcess.c;
final String v1 = "LifeCycle Event: onPause"; // const-string v1, "LifeCycle Event: onPause"
zongfuscated.q .a ( v0,v1 );
int v0 = 5; // const/4 v0, 0x5
int v1 = 0; // const/4 v1, 0x0
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/zong/android/engine/process/ZongActivityProcess;->a(ILjava/lang/Object;)V
return;
} // .end method
protected void onRestart ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/app/Activity;->onRestart()V */
v0 = com.zong.android.engine.process.ZongActivityProcess.c;
final String v1 = "LifeCycle Event: onRestart"; // const-string v1, "LifeCycle Event: onRestart"
zongfuscated.q .a ( v0,v1 );
int v0 = 7; // const/4 v0, 0x7
int v1 = 0; // const/4 v1, 0x0
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/zong/android/engine/process/ZongActivityProcess;->a(ILjava/lang/Object;)V
return;
} // .end method
protected void onResume ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
v0 = com.zong.android.engine.process.ZongActivityProcess.c;
final String v1 = "LifeCycle Event: onResume"; // const-string v1, "LifeCycle Event: onResume"
zongfuscated.q .a ( v0,v1 );
int v0 = 6; // const/4 v0, 0x6
int v1 = 0; // const/4 v1, 0x0
(( com.zong.android.engine.process.ZongActivityProcess ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/zong/android/engine/process/ZongActivityProcess;->a(ILjava/lang/Object;)V
return;
} // .end method
protected void onStart ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/app/Activity;->onStart()V */
v0 = com.zong.android.engine.process.ZongActivityProcess.c;
final String v1 = "LifeCycle Event: onStart"; // const-string v1, "LifeCycle Event: onStart"
zongfuscated.q .a ( v0,v1 );
/* iget v0, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->a:I */
/* packed-switch v0, :pswitch_data_0 */
} // :goto_0
return;
/* :pswitch_0 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/process/ZongActivityProcess;->b(I)V */
/* :pswitch_1 */
int v0 = 3; // const/4 v0, 0x3
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/process/ZongActivityProcess;->b(I)V */
/* :pswitch_2 */
int v0 = 2; // const/4 v0, 0x2
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/process/ZongActivityProcess;->b(I)V */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
