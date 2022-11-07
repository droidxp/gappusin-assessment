public class com.zong.android.engine.task.PaymentProcessorTask extends java.lang.Thread {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;, */
	 /* Lcom/zong/android/engine/task/PaymentProcessorTask$a;, */
	 /* Lcom/zong/android/engine/task/PaymentProcessorTask$Task; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String b;
/* # instance fields */
private Long A;
com.zong.android.engine.process.ZongServiceProcess a;
private Boolean c;
private java.lang.String d;
private java.lang.String e;
private java.lang.String f;
private zongfuscated.j g;
private Boolean h;
private Boolean i;
private java.lang.String j;
private java.lang.String k;
private java.lang.String l;
private java.lang.String m;
private java.lang.String n;
private java.lang.String o;
private zongfuscated.A p;
private zongfuscated.e q;
private java.util.concurrent.ExecutorService r;
private java.util.concurrent.Future s;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/Future", */
/* "<*>;" */
/* } */
} // .end annotation
} // .end field
private java.util.concurrent.LinkedBlockingQueue t;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/LinkedBlockingQueue", */
/* "<", */
/* "Lzongfuscated/h;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private final java.util.concurrent.CountDownLatch u;
private android.os.Handler v;
private android.os.Handler w;
private android.content.Context x;
private java.lang.String y;
private Integer z;
/* # direct methods */
static com.zong.android.engine.task.PaymentProcessorTask ( ) {
/* .locals 1 */
/* const-class v0, Lcom/zong/android/engine/task/PaymentProcessorTask; */
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
return;
} // .end method
public com.zong.android.engine.task.PaymentProcessorTask ( ) {
/* .locals 3 */
int v1 = 0; // const/4 v1, 0x0
final String v0 = "PaymentProcessorTask"; // const-string v0, "PaymentProcessorTask"
/* invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V */
this.s = v1;
this.v = v1;
this.w = v1;
final String v0 = ""; // const-string v0, ""
this.y = v0;
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->z:I */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->A:J */
this.a = p1;
(( com.zong.android.engine.process.ZongServiceProcess ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Lcom/zong/android/engine/process/ZongServiceProcess;->getApplicationContext()Landroid/content/Context;
this.x = v0;
/* new-instance v0, Lzongfuscated/j; */
/* invoke-direct {v0}, Lzongfuscated/j;-><init>()V */
this.g = v0;
v0 = this.x;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getCanonicalName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
this.f = v0;
v0 = this.g;
v1 = this.f;
v2 = this.x;
(( zongfuscated.j ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lzongfuscated/j;->a(Ljava/lang/String;Landroid/content/Context;)V
this.v = p2;
this.q = p3;
/* new-instance v0, Ljava/util/concurrent/CountDownLatch; */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V */
this.u = v0;
(( com.zong.android.engine.task.PaymentProcessorTask ) p0 ).start ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->start()V
return;
} // .end method
static java.util.concurrent.LinkedBlockingQueue a ( com.zong.android.engine.task.PaymentProcessorTask p0 ) { //synthethic
/* .locals 1 */
v0 = this.t;
} // .end method
private void a ( Integer p0 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v0, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->h:Z */
/* if-nez p1, :cond_0 */
} // :goto_0
/* new-instance v1, Lzongfuscated/b; */
/* invoke-direct {v1}, Lzongfuscated/b;-><init>()V */
(( zongfuscated.b ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lzongfuscated/b;->a(Z)V
(( zongfuscated.b ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lzongfuscated/b;->a(I)V
v0 = this.j;
(( zongfuscated.b ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lzongfuscated/b;->a(Ljava/lang/String;)V
v0 = this.o;
(( zongfuscated.b ) v1 ).f ( v0 ); // invoke-virtual {v1, v0}, Lzongfuscated/b;->f(Ljava/lang/String;)V
v0 = this.k;
(( zongfuscated.b ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Lzongfuscated/b;->b(Ljava/lang/String;)V
v0 = this.l;
(( zongfuscated.b ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Lzongfuscated/b;->c(Ljava/lang/String;)V
v0 = this.n;
(( zongfuscated.b ) v1 ).e ( v0 ); // invoke-virtual {v1, v0}, Lzongfuscated/b;->e(Ljava/lang/String;)V
v0 = this.m;
(( zongfuscated.b ) v1 ).d ( v0 ); // invoke-virtual {v1, v0}, Lzongfuscated/b;->d(Ljava/lang/String;)V
int v0 = 3; // const/4 v0, 0x3
/* invoke-direct {p0, v0, v1}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(ILjava/lang/Object;)V */
return;
} // :cond_0
/* move v0, v1 */
} // .end method
private void a ( Integer p0, java.lang.Object p1 ) {
/* .locals 2 */
v0 = this.v;
(( android.os.Handler ) v0 ).obtainMessage ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
v1 = this.v;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
return;
} // .end method
private void a ( android.os.Message p0, Long p1 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->h:Z */
/* if-nez v0, :cond_0 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v0, p2, v0 */
/* if-lez v0, :cond_1 */
v0 = this.w;
(( android.os.Handler ) v0 ).sendMessageDelayed ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.w;
(( android.os.Handler ) v0 ).sendMessage ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
} // .end method
static void a ( com.zong.android.engine.task.PaymentProcessorTask p0, android.os.Message p1 ) { //synthethic
/* .locals 10 */
int v2 = 1; // const/4 v2, 0x1
int v9 = 2; // const/4 v9, 0x2
int v3 = 0; // const/4 v3, 0x0
/* iget-boolean v0, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->h:Z */
/* if-nez v0, :cond_0 */
/* iget v0, p1, Landroid/os/Message;->what:I */
/* if-nez v0, :cond_1 */
(( android.os.Message ) p1 ).getData ( ); // invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
final String v1 = "originatingAddr"; // const-string v1, "originatingAddr"
(( android.os.Bundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v4 = "body"; // const-string v4, "body"
(( android.os.Bundle ) v0 ).getString ( v4 ); // invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
v4 = this.t;
/* new-instance v5, Lzongfuscated/h; */
/* invoke-direct {v5, v1, v0}, Lzongfuscated/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.concurrent.LinkedBlockingQueue ) v4 ).add ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/concurrent/LinkedBlockingQueue;->add(Ljava/lang/Object;)Z
v4 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v5 = "processPremiumSMS (shortcode, body)"; // const-string v5, "processPremiumSMS (shortcode, body)"
/* new-array v6, v9, [Ljava/lang/String; */
/* aput-object v1, v6, v3 */
/* aput-object v0, v6, v2 */
zongfuscated.q .a ( v4,v5,v6 );
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* iget v0, p1, Landroid/os/Message;->what:I */
/* if-ne v0, v9, :cond_2 */
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v1 = "processTimeout Action"; // const-string v1, "processTimeout Action"
zongfuscated.q .c ( v0,v1 );
/* invoke-direct {p0, v9}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
} // :cond_2
/* iget v0, p1, Landroid/os/Message;->what:I */
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_3 */
v0 = this.obj;
/* check-cast v0, Lzongfuscated/o; */
(( zongfuscated.o ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/o;->a()Lzongfuscated/C;
v4 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v5 = "Executing Scheduled Action"; // const-string v5, "Executing Scheduled Action"
/* new-array v6, v9, [Ljava/lang/String; */
(( zongfuscated.C ) v1 ).b ( ); // invoke-virtual {v1}, Lzongfuscated/C;->b()Ljava/lang/String;
/* aput-object v7, v6, v3 */
(( zongfuscated.C ) v1 ).c ( ); // invoke-virtual {v1}, Lzongfuscated/C;->c()Ljava/lang/String;
/* aput-object v1, v6, v2 */
zongfuscated.q .a ( v4,v5,v6 );
v1 = this.p;
int v2 = 0; // const/4 v2, 0x0
(( zongfuscated.A ) v1 ).a ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lzongfuscated/A;->a(Lzongfuscated/o;Ljava/util/HashMap;)V
} // :cond_3
/* iget v0, p1, Landroid/os/Message;->what:I */
int v1 = 4; // const/4 v1, 0x4
/* if-ne v0, v1, :cond_0 */
v0 = this.obj;
/* check-cast v0, Lzongfuscated/o; */
/* if-nez v0, :cond_4 */
/* invoke-direct {p0, v9}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
} // :cond_4
(( zongfuscated.o ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/o;->a()Lzongfuscated/C;
(( zongfuscated.C ) v1 ).a ( ); // invoke-virtual {v1}, Lzongfuscated/C;->a()Ljava/lang/String;
v1 = this.y;
v1 = (( java.lang.String ) v4 ).equals ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
java.lang.System .currentTimeMillis ( );
/* move-result-wide v5 */
/* iget-wide v7, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->A:J */
/* sub-long/2addr v5, v7 */
v1 = com.zong.android.engine.task.PaymentProcessorTask$Task.DELAY;
com.zong.android.engine.task.PaymentProcessorTask$Task .access$2 ( v1 );
/* move-result-wide v7 */
/* cmp-long v1, v5, v7 */
/* if-gez v1, :cond_6 */
/* move v1, v2 */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_5
/* iget v1, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->z:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->z:I */
v1 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v5 = "Thresold broken for action"; // const-string v5, "Thresold broken for action"
/* new-array v6, v9, [Ljava/lang/String; */
/* aput-object v4, v6, v3 */
/* iget v7, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->z:I */
java.lang.Integer .toString ( v7 );
/* aput-object v7, v6, v2 */
zongfuscated.q .a ( v1,v5,v6 );
/* iget v1, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->z:I */
/* const/16 v5, 0x14 */
/* if-le v1, v5, :cond_5 */
v1 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v5 = "Multi Action Threshold exhausted"; // const-string v5, "Multi Action Threshold exhausted"
zongfuscated.q .c ( v1,v5 );
/* invoke-direct {p0, v9}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
} // :cond_5
} // :goto_2
java.lang.System .currentTimeMillis ( );
/* move-result-wide v5 */
/* iput-wide v5, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->A:J */
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.WAIT;
v1 = (( com.zong.android.engine.task.PaymentProcessorTask$ActionType ) v1 ).match ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;->match(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_8
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(Lzongfuscated/o;)V */
/* goto/16 :goto_0 */
} // :cond_6
/* move v1, v3 */
} // :cond_7
this.y = v4;
/* iput v3, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->z:I */
} // :cond_8
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.SEND_KEYWORD;
v1 = (( com.zong.android.engine.task.PaymentProcessorTask$ActionType ) v1 ).match ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;->match(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_9
(( zongfuscated.o ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/o;->a()Lzongfuscated/C;
v4 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v5 = "processPhoneInfo Action"; // const-string v5, "processPhoneInfo Action"
/* new-array v6, v9, [Ljava/lang/String; */
(( zongfuscated.C ) v1 ).b ( ); // invoke-virtual {v1}, Lzongfuscated/C;->b()Ljava/lang/String;
/* aput-object v7, v6, v3 */
(( zongfuscated.C ) v1 ).c ( ); // invoke-virtual {v1}, Lzongfuscated/C;->c()Ljava/lang/String;
/* aput-object v1, v6, v2 */
zongfuscated.q .a ( v4,v5,v6 );
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
final String v4 = "mno"; // const-string v4, "mno"
v5 = this.d;
(( java.util.HashMap ) v1 ).put ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
v4 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v5 = "Sendig MNO to server"; // const-string v5, "Sendig MNO to server"
/* new-array v2, v2, [Ljava/lang/String; */
v6 = this.d;
/* aput-object v6, v2, v3 */
zongfuscated.q .a ( v4,v5,v2 );
v2 = this.p;
(( zongfuscated.A ) v2 ).a ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lzongfuscated/A;->a(Lzongfuscated/o;Ljava/util/HashMap;)V
/* goto/16 :goto_0 */
} // :cond_9
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.POLLING;
v1 = (( com.zong.android.engine.task.PaymentProcessorTask$ActionType ) v1 ).match ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;->match(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_a
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(Lzongfuscated/o;)V */
/* goto/16 :goto_0 */
} // :cond_a
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.ENTER_PINCODE;
v1 = (( com.zong.android.engine.task.PaymentProcessorTask$ActionType ) v1 ).match ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;->match(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_b
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->b(Lzongfuscated/o;)V */
/* goto/16 :goto_0 */
} // :cond_b
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.PROGRESS;
v1 = (( com.zong.android.engine.task.PaymentProcessorTask$ActionType ) v1 ).match ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;->match(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_c
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->d(Lzongfuscated/o;)V */
/* goto/16 :goto_0 */
} // :cond_c
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.SENDFLOW;
v1 = (( com.zong.android.engine.task.PaymentProcessorTask$ActionType ) v1 ).match ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;->match(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_d
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->c(Lzongfuscated/o;)V */
/* goto/16 :goto_0 */
} // :cond_d
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.SEND_PINCODE;
v1 = (( com.zong.android.engine.task.PaymentProcessorTask$ActionType ) v1 ).match ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;->match(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_e
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->e(Lzongfuscated/o;)V */
/* goto/16 :goto_0 */
} // :cond_e
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.COMPLETED_TX;
v1 = (( com.zong.android.engine.task.PaymentProcessorTask$ActionType ) v1 ).match ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;->match(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_f
(( zongfuscated.o ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/o;->a()Lzongfuscated/C;
v4 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v5 = "processCompleteTransaction Action"; // const-string v5, "processCompleteTransaction Action"
/* new-array v6, v9, [Ljava/lang/String; */
(( zongfuscated.C ) v1 ).b ( ); // invoke-virtual {v1}, Lzongfuscated/C;->b()Ljava/lang/String;
/* aput-object v7, v6, v3 */
(( zongfuscated.C ) v1 ).c ( ); // invoke-virtual {v1}, Lzongfuscated/C;->c()Ljava/lang/String;
/* aput-object v1, v6, v2 */
zongfuscated.q .a ( v4,v5,v6 );
(( zongfuscated.o ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/o;->b()Ljava/lang/String;
zongfuscated.o .b ( v1 );
(( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
this.j = v1;
v1 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v2 = "Completion exit enabled"; // const-string v2, "Completion exit enabled"
zongfuscated.q .a ( v1,v2 );
v1 = this.p;
(( zongfuscated.A ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lzongfuscated/A;->a(Lzongfuscated/o;)V
/* invoke-direct {p0, v3}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
/* goto/16 :goto_0 */
} // :cond_f
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.REDIRECT;
v1 = (( com.zong.android.engine.task.PaymentProcessorTask$ActionType ) v1 ).match ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;->match(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_10
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->f(Lzongfuscated/o;)V */
/* goto/16 :goto_0 */
} // :cond_10
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.ERROR;
v1 = (( com.zong.android.engine.task.PaymentProcessorTask$ActionType ) v1 ).match ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;->match(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->g(Lzongfuscated/o;)V */
/* goto/16 :goto_0 */
} // .end method
static void a ( com.zong.android.engine.task.PaymentProcessorTask p0, java.lang.String p1, java.lang.String p2 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1, p2}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(Ljava/lang/String;Ljava/lang/String;)V */
return;
} // .end method
private void a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 4 */
/* iget-boolean v0, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->c:Z */
/* if-nez v0, :cond_0 */
com.zong.android.engine.sms.a .a ( );
(( com.zong.android.engine.sms.a ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/zong/android/engine/sms/a;->a(Ljava/lang/String;Ljava/lang/String;)V
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v1 = "Sent shortcode / keyword to server"; // const-string v1, "Sent shortcode / keyword to server"
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p1, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* aput-object p2, v2, v3 */
zongfuscated.q .a ( v0,v1,v2 );
} // :cond_0
return;
} // .end method
private void a ( Object p0 ) {
/* .locals 8 */
int v7 = 2; // const/4 v7, 0x2
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
(( zongfuscated.o ) p1 ).a ( ); // invoke-virtual {p1}, Lzongfuscated/o;->a()Lzongfuscated/C;
v1 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v2 = "processPolling Action"; // const-string v2, "processPolling Action"
/* new-array v3, v7, [Ljava/lang/String; */
(( zongfuscated.C ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/C;->b()Ljava/lang/String;
/* aput-object v4, v3, v5 */
(( zongfuscated.C ) v0 ).c ( ); // invoke-virtual {v0}, Lzongfuscated/C;->c()Ljava/lang/String;
/* aput-object v4, v3, v6 */
zongfuscated.q .a ( v1,v2,v3 );
v1 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v2 = "processPolling Message"; // const-string v2, "processPolling Message"
/* new-array v3, v6, [Ljava/lang/String; */
(( zongfuscated.C ) v0 ).d ( ); // invoke-virtual {v0}, Lzongfuscated/C;->d()Ljava/lang/String;
/* aput-object v4, v3, v5 */
zongfuscated.q .a ( v1,v2,v3 );
/* new-instance v1, Lzongfuscated/p; */
(( zongfuscated.C ) v0 ).d ( ); // invoke-virtual {v0}, Lzongfuscated/C;->d()Ljava/lang/String;
/* invoke-direct {v1, v0}, Lzongfuscated/p;-><init>(Ljava/lang/String;)V */
/* invoke-direct {p0, v7, v1}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(ILjava/lang/Object;)V */
v0 = this.w;
int v1 = 3; // const/4 v1, 0x3
(( android.os.Handler ) v0 ).obtainMessage ( v1, v5, v5, p1 ); // invoke-virtual {v0, v1, v5, v5, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
v1 = com.zong.android.engine.task.PaymentProcessorTask$Task.DELAY;
(( com.zong.android.engine.task.PaymentProcessorTask$Task ) v1 ).getTime ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/task/PaymentProcessorTask$Task;->getTime()J
/* move-result-wide v1 */
/* invoke-direct {p0, v0, v1, v2}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(Landroid/os/Message;J)V */
return;
} // .end method
private void a ( Object p0, java.lang.String p1, Object p2 ) {
/* .locals 2 */
v0 = this.r;
/* new-instance v1, Lcom/zong/android/engine/task/PaymentProcessorTask$2; */
/* invoke-direct {v1, p0, p1, p2, p3}, Lcom/zong/android/engine/task/PaymentProcessorTask$2;-><init>(Lcom/zong/android/engine/task/PaymentProcessorTask;Lzongfuscated/u;Ljava/lang/String;Lzongfuscated/o;)V */
this.s = v0;
return;
} // .end method
private void b ( Object p0 ) {
/* .locals 12 */
int v0 = 0; // const/4 v0, 0x0
int v11 = 2; // const/4 v11, 0x2
int v10 = 1; // const/4 v10, 0x1
int v9 = 0; // const/4 v9, 0x0
(( zongfuscated.o ) p1 ).a ( ); // invoke-virtual {p1}, Lzongfuscated/o;->a()Lzongfuscated/C;
v2 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v3 = "processSendKeywordMessage Action"; // const-string v3, "processSendKeywordMessage Action"
/* new-array v4, v11, [Ljava/lang/String; */
(( zongfuscated.C ) v1 ).b ( ); // invoke-virtual {v1}, Lzongfuscated/C;->b()Ljava/lang/String;
/* aput-object v5, v4, v9 */
(( zongfuscated.C ) v1 ).c ( ); // invoke-virtual {v1}, Lzongfuscated/C;->c()Ljava/lang/String;
/* aput-object v5, v4, v10 */
zongfuscated.q .a ( v2,v3,v4 );
v2 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v3 = "processSendKeywordMessage Message"; // const-string v3, "processSendKeywordMessage Message"
/* new-array v4, v10, [Ljava/lang/String; */
(( zongfuscated.C ) v1 ).d ( ); // invoke-virtual {v1}, Lzongfuscated/C;->d()Ljava/lang/String;
/* aput-object v5, v4, v9 */
zongfuscated.q .a ( v2,v3,v4 );
/* new-instance v2, Lzongfuscated/p; */
(( zongfuscated.C ) v1 ).d ( ); // invoke-virtual {v1}, Lzongfuscated/C;->d()Ljava/lang/String;
/* invoke-direct {v2, v3}, Lzongfuscated/p;-><init>(Ljava/lang/String;)V */
/* invoke-direct {p0, v11, v2}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(ILjava/lang/Object;)V */
(( zongfuscated.C ) v1 ).e ( ); // invoke-virtual {v1}, Lzongfuscated/C;->e()Ljava/util/ArrayList;
if ( v1 != null) { // if-eqz v1, :cond_6
(( java.util.ArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* move-object v1, v0 */
/* move-object v2, v0 */
/* move-object v3, v0 */
/* move-object v4, v0 */
} // :cond_0
v0 = } // :goto_0
/* if-nez v0, :cond_1 */
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v5 = "processSendKeywordMessage Params "; // const-string v5, "processSendKeywordMessage Params "
int v6 = 4; // const/4 v6, 0x4
/* new-array v6, v6, [Ljava/lang/String; */
/* aput-object v4, v6, v9 */
/* aput-object v3, v6, v10 */
/* aput-object v2, v6, v11 */
int v7 = 3; // const/4 v7, 0x3
(( java.lang.Integer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;
/* aput-object v8, v6, v7 */
zongfuscated.q .a ( v0,v5,v6 );
} // :goto_1
/* invoke-direct {p0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->d()V */
if ( v4 != null) { // if-eqz v4, :cond_5
if ( v3 != null) { // if-eqz v3, :cond_5
if ( v2 != null) { // if-eqz v2, :cond_5
if ( v1 != null) { // if-eqz v1, :cond_5
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v5 = "processSendKeywordMessage"; // const-string v5, "processSendKeywordMessage"
/* new-array v6, v10, [Ljava/lang/String; */
final String v7 = "Sending Keyword SMS"; // const-string v7, "Sending Keyword SMS"
/* aput-object v7, v6, v9 */
zongfuscated.q .a ( v0,v5,v6 );
/* invoke-direct {p0, v4, v3}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v0, Lzongfuscated/a; */
/* invoke-direct {v0, v1, v2}, Lzongfuscated/a;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V */
final String v1 = "code"; // const-string v1, "code"
/* invoke-direct {p0, v0, v1, p1}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(Lzongfuscated/u;Ljava/lang/String;Lzongfuscated/o;)V */
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v1 = "Synchronizing on SMS for pincode code"; // const-string v1, "Synchronizing on SMS for pincode code"
zongfuscated.q .a ( v0,v1 );
} // :goto_2
return;
} // :cond_1
/* check-cast v0, Lzongfuscated/D; */
final String v6 = "shortcode"; // const-string v6, "shortcode"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v6 = (( java.lang.String ) v6 ).equalsIgnoreCase ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* move-object v4, v0 */
} // :cond_2
final String v6 = "keyword"; // const-string v6, "keyword"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v6 = (( java.lang.String ) v6 ).equalsIgnoreCase ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_3
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* move-object v3, v0 */
/* goto/16 :goto_0 */
} // :cond_3
final String v6 = "messageExpression"; // const-string v6, "messageExpression"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v6 = (( java.lang.String ) v6 ).equalsIgnoreCase ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_4
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* move-object v2, v0 */
/* goto/16 :goto_0 */
} // :cond_4
final String v6 = "groupId"; // const-string v6, "groupId"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v6 = (( java.lang.String ) v6 ).equalsIgnoreCase ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_0
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
java.lang.Integer .valueOf ( v0 );
/* move-object v1, v0 */
/* goto/16 :goto_0 */
} // :cond_5
/* invoke-direct {p0, v11}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
} // :cond_6
/* move-object v1, v0 */
/* move-object v2, v0 */
/* move-object v3, v0 */
/* move-object v4, v0 */
/* goto/16 :goto_1 */
} // .end method
static Boolean b ( com.zong.android.engine.task.PaymentProcessorTask p0 ) { //synthethic
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->c:Z */
} // .end method
static java.lang.String c ( ) { //synthethic
/* .locals 1 */
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
} // .end method
static java.lang.String c ( com.zong.android.engine.task.PaymentProcessorTask p0 ) { //synthethic
/* .locals 1 */
v0 = this.e;
} // .end method
private void c ( Object p0 ) {
/* .locals 9 */
int v0 = 0; // const/4 v0, 0x0
int v8 = 1; // const/4 v8, 0x1
int v7 = 2; // const/4 v7, 0x2
int v6 = 0; // const/4 v6, 0x0
(( zongfuscated.o ) p1 ).a ( ); // invoke-virtual {p1}, Lzongfuscated/o;->a()Lzongfuscated/C;
v2 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v3 = "processSendFlow Action"; // const-string v3, "processSendFlow Action"
/* new-array v4, v7, [Ljava/lang/String; */
(( zongfuscated.C ) v1 ).b ( ); // invoke-virtual {v1}, Lzongfuscated/C;->b()Ljava/lang/String;
/* aput-object v5, v4, v6 */
(( zongfuscated.C ) v1 ).c ( ); // invoke-virtual {v1}, Lzongfuscated/C;->c()Ljava/lang/String;
/* aput-object v5, v4, v8 */
zongfuscated.q .a ( v2,v3,v4 );
v2 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v3 = "processSendFlow Message"; // const-string v3, "processSendFlow Message"
/* new-array v4, v8, [Ljava/lang/String; */
(( zongfuscated.C ) v1 ).d ( ); // invoke-virtual {v1}, Lzongfuscated/C;->d()Ljava/lang/String;
/* aput-object v5, v4, v6 */
zongfuscated.q .a ( v2,v3,v4 );
/* new-instance v2, Lzongfuscated/p; */
(( zongfuscated.C ) v1 ).d ( ); // invoke-virtual {v1}, Lzongfuscated/C;->d()Ljava/lang/String;
/* invoke-direct {v2, v3}, Lzongfuscated/p;-><init>(Ljava/lang/String;)V */
/* invoke-direct {p0, v7, v2}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(ILjava/lang/Object;)V */
(( zongfuscated.C ) v1 ).e ( ); // invoke-virtual {v1}, Lzongfuscated/C;->e()Ljava/util/ArrayList;
if ( v1 != null) { // if-eqz v1, :cond_5
(( java.util.ArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* move-object v1, v0 */
/* move-object v2, v0 */
} // :cond_0
v0 = } // :goto_0
/* if-nez v0, :cond_2 */
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v3 = "processSendFlow Params "; // const-string v3, "processSendFlow Params "
/* new-array v4, v7, [Ljava/lang/String; */
/* aput-object v2, v4, v6 */
/* aput-object v1, v4, v8 */
zongfuscated.q .a ( v0,v3,v4 );
} // :goto_1
/* iget-boolean v0, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iput-boolean v6, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->i:Z */
/* invoke-direct {p0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->d()V */
if ( v2 != null) { // if-eqz v2, :cond_4
if ( v1 != null) { // if-eqz v1, :cond_4
v0 = this.r;
/* new-instance v3, Lcom/zong/android/engine/task/PaymentProcessorTask$3; */
/* invoke-direct {v3, p0, v2, v1}, Lcom/zong/android/engine/task/PaymentProcessorTask$3;-><init>(Lcom/zong/android/engine/task/PaymentProcessorTask;Ljava/lang/String;Ljava/lang/String;)V */
this.s = v0;
} // :cond_1
} // :goto_2
v0 = this.w;
int v1 = 3; // const/4 v1, 0x3
(( android.os.Handler ) v0 ).obtainMessage ( v1, v6, v6, p1 ); // invoke-virtual {v0, v1, v6, v6, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
v1 = com.zong.android.engine.task.PaymentProcessorTask$Task.DELAY;
(( com.zong.android.engine.task.PaymentProcessorTask$Task ) v1 ).getTime ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/task/PaymentProcessorTask$Task;->getTime()J
/* move-result-wide v1 */
/* invoke-direct {p0, v0, v1, v2}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(Landroid/os/Message;J)V */
return;
} // :cond_2
/* check-cast v0, Lzongfuscated/D; */
final String v4 = "shortcode"; // const-string v4, "shortcode"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v4 = (( java.lang.String ) v4 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* move-object v2, v0 */
} // :cond_3
final String v4 = "keyword"; // const-string v4, "keyword"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v4 = (( java.lang.String ) v4 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* move-object v1, v0 */
} // :cond_4
/* invoke-direct {p0, v7}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
} // :cond_5
/* move-object v1, v0 */
/* move-object v2, v0 */
} // .end method
static zongfuscated.A d ( com.zong.android.engine.task.PaymentProcessorTask p0 ) { //synthethic
/* .locals 1 */
v0 = this.p;
} // .end method
private void d ( ) {
/* .locals 5 */
/* iget-boolean v0, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
try { // :try_start_0
v0 = this.t;
/* new-instance v1, Lzongfuscated/h; */
/* invoke-direct {v1}, Lzongfuscated/h;-><init>()V */
(( java.util.concurrent.LinkedBlockingQueue ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v1 = "processSendPincode.isSimulationMode()"; // const-string v1, "processSendPincode.isSimulationMode()"
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
final String v4 = "Sending empty SMS Message"; // const-string v4, "Sending empty SMS Message"
/* aput-object v4, v2, v3 */
zongfuscated.q .a ( v0,v1,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
v1 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v2 = "Cannot insert into the Queue empty SMS Message"; // const-string v2, "Cannot insert into the Queue empty SMS Message"
zongfuscated.q .a ( v1,v2,v0 );
} // .end method
private void d ( Object p0 ) {
/* .locals 9 */
int v0 = 0; // const/4 v0, 0x0
int v8 = 1; // const/4 v8, 0x1
int v7 = 2; // const/4 v7, 0x2
int v6 = 0; // const/4 v6, 0x0
(( zongfuscated.o ) p1 ).a ( ); // invoke-virtual {p1}, Lzongfuscated/o;->a()Lzongfuscated/C;
v2 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v3 = "processCtaFlow Action"; // const-string v3, "processCtaFlow Action"
/* new-array v4, v7, [Ljava/lang/String; */
(( zongfuscated.C ) v1 ).b ( ); // invoke-virtual {v1}, Lzongfuscated/C;->b()Ljava/lang/String;
/* aput-object v5, v4, v6 */
(( zongfuscated.C ) v1 ).c ( ); // invoke-virtual {v1}, Lzongfuscated/C;->c()Ljava/lang/String;
/* aput-object v5, v4, v8 */
zongfuscated.q .a ( v2,v3,v4 );
v2 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v3 = "processCtaFlow Message"; // const-string v3, "processCtaFlow Message"
/* new-array v4, v8, [Ljava/lang/String; */
(( zongfuscated.C ) v1 ).d ( ); // invoke-virtual {v1}, Lzongfuscated/C;->d()Ljava/lang/String;
/* aput-object v5, v4, v6 */
zongfuscated.q .a ( v2,v3,v4 );
/* new-instance v2, Lzongfuscated/p; */
(( zongfuscated.C ) v1 ).d ( ); // invoke-virtual {v1}, Lzongfuscated/C;->d()Ljava/lang/String;
/* invoke-direct {v2, v3}, Lzongfuscated/p;-><init>(Ljava/lang/String;)V */
/* invoke-direct {p0, v7, v2}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(ILjava/lang/Object;)V */
(( zongfuscated.C ) v1 ).e ( ); // invoke-virtual {v1}, Lzongfuscated/C;->e()Ljava/util/ArrayList;
if ( v1 != null) { // if-eqz v1, :cond_5
(( java.util.ArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* move-object v1, v0 */
/* move-object v2, v0 */
} // :cond_0
v0 = } // :goto_0
/* if-nez v0, :cond_2 */
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v3 = "processCtaFlow Params "; // const-string v3, "processCtaFlow Params "
/* new-array v4, v7, [Ljava/lang/String; */
/* aput-object v2, v4, v6 */
/* aput-object v1, v4, v8 */
zongfuscated.q .a ( v0,v3,v4 );
} // :goto_1
/* iget-boolean v0, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iput-boolean v6, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->i:Z */
/* invoke-direct {p0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->d()V */
if ( v2 != null) { // if-eqz v2, :cond_4
if ( v1 != null) { // if-eqz v1, :cond_4
v0 = this.r;
/* new-instance v3, Lcom/zong/android/engine/task/PaymentProcessorTask$1; */
/* invoke-direct {v3, p0, v2, v1}, Lcom/zong/android/engine/task/PaymentProcessorTask$1;-><init>(Lcom/zong/android/engine/task/PaymentProcessorTask;Ljava/lang/String;Ljava/lang/String;)V */
this.s = v0;
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v1 = "Synchronizing on SMS arrival for Reply"; // const-string v1, "Synchronizing on SMS arrival for Reply"
zongfuscated.q .a ( v0,v1 );
} // :cond_1
} // :goto_2
v0 = this.w;
int v1 = 3; // const/4 v1, 0x3
(( android.os.Handler ) v0 ).obtainMessage ( v1, v6, v6, p1 ); // invoke-virtual {v0, v1, v6, v6, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
v1 = com.zong.android.engine.task.PaymentProcessorTask$Task.DELAY;
(( com.zong.android.engine.task.PaymentProcessorTask$Task ) v1 ).getTime ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/task/PaymentProcessorTask$Task;->getTime()J
/* move-result-wide v1 */
/* invoke-direct {p0, v0, v1, v2}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(Landroid/os/Message;J)V */
return;
} // :cond_2
/* check-cast v0, Lzongfuscated/D; */
final String v4 = "shortcode"; // const-string v4, "shortcode"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v4 = (( java.lang.String ) v4 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* move-object v2, v0 */
} // :cond_3
final String v4 = "keyword"; // const-string v4, "keyword"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v4 = (( java.lang.String ) v4 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* move-object v1, v0 */
} // :cond_4
/* invoke-direct {p0, v7}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
} // :cond_5
/* move-object v1, v0 */
/* move-object v2, v0 */
} // .end method
static void e ( com.zong.android.engine.task.PaymentProcessorTask p0 ) { //synthethic
/* .locals 1 */
int v0 = 2; // const/4 v0, 0x2
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
return;
} // .end method
private void e ( Object p0 ) {
/* .locals 10 */
int v9 = 1; // const/4 v9, 0x1
int v8 = 0; // const/4 v8, 0x0
int v0 = 0; // const/4 v0, 0x0
int v7 = 2; // const/4 v7, 0x2
(( zongfuscated.o ) p1 ).a ( ); // invoke-virtual {p1}, Lzongfuscated/o;->a()Lzongfuscated/C;
v2 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v3 = "processSendPincode Action"; // const-string v3, "processSendPincode Action"
/* new-array v4, v7, [Ljava/lang/String; */
(( zongfuscated.C ) v1 ).b ( ); // invoke-virtual {v1}, Lzongfuscated/C;->b()Ljava/lang/String;
/* aput-object v5, v4, v8 */
(( zongfuscated.C ) v1 ).c ( ); // invoke-virtual {v1}, Lzongfuscated/C;->c()Ljava/lang/String;
/* aput-object v5, v4, v9 */
zongfuscated.q .a ( v2,v3,v4 );
(( zongfuscated.C ) v1 ).e ( ); // invoke-virtual {v1}, Lzongfuscated/C;->e()Ljava/util/ArrayList;
if ( v1 != null) { // if-eqz v1, :cond_5
(( java.util.ArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* move-object v1, v0 */
/* move-object v2, v0 */
/* move-object v3, v0 */
} // :cond_0
v0 = } // :goto_0
/* if-nez v0, :cond_1 */
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v4 = "processSendPincode Params "; // const-string v4, "processSendPincode Params "
int v5 = 3; // const/4 v5, 0x3
/* new-array v5, v5, [Ljava/lang/String; */
/* aput-object v3, v5, v8 */
/* aput-object v2, v5, v9 */
(( java.lang.Integer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;
/* aput-object v3, v5, v7 */
zongfuscated.q .a ( v0,v4,v5 );
} // :goto_1
/* invoke-direct {p0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->d()V */
if ( v2 != null) { // if-eqz v2, :cond_4
if ( v1 != null) { // if-eqz v1, :cond_4
/* new-instance v0, Lzongfuscated/s; */
/* invoke-direct {v0, v1, v2}, Lzongfuscated/s;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V */
final String v1 = "pincode"; // const-string v1, "pincode"
/* invoke-direct {p0, v0, v1, p1}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(Lzongfuscated/u;Ljava/lang/String;Lzongfuscated/o;)V */
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v1 = "Synchronizing on SMS for pincode"; // const-string v1, "Synchronizing on SMS for pincode"
zongfuscated.q .a ( v0,v1 );
} // :goto_2
return;
} // :cond_1
/* check-cast v0, Lzongfuscated/D; */
final String v5 = "shortcode"; // const-string v5, "shortcode"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v5 = (( java.lang.String ) v5 ).equalsIgnoreCase ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v5 != null) { // if-eqz v5, :cond_2
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* move-object v3, v0 */
} // :cond_2
final String v5 = "messageExpression"; // const-string v5, "messageExpression"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v5 = (( java.lang.String ) v5 ).equalsIgnoreCase ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v5 != null) { // if-eqz v5, :cond_3
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* move-object v2, v0 */
} // :cond_3
final String v5 = "groupId"; // const-string v5, "groupId"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v5 = (( java.lang.String ) v5 ).equalsIgnoreCase ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v5 != null) { // if-eqz v5, :cond_0
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
java.lang.Integer .valueOf ( v0 );
/* move-object v1, v0 */
/* goto/16 :goto_0 */
} // :cond_4
/* invoke-direct {p0, v7}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
} // :cond_5
/* move-object v1, v0 */
/* move-object v2, v0 */
} // .end method
private void f ( Object p0 ) {
/* .locals 7 */
int v6 = 0; // const/4 v6, 0x0
(( zongfuscated.o ) p1 ).a ( ); // invoke-virtual {p1}, Lzongfuscated/o;->a()Lzongfuscated/C;
(( zongfuscated.C ) v0 ).e ( ); // invoke-virtual {v0}, Lzongfuscated/C;->e()Ljava/util/ArrayList;
if ( v0 != null) { // if-eqz v0, :cond_0
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_0
/* if-nez v0, :cond_1 */
} // :cond_0
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v1 = "Redirect exit enabled"; // const-string v1, "Redirect exit enabled"
zongfuscated.q .a ( v0,v1 );
/* invoke-direct {p0, v6}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
return;
} // :cond_1
/* check-cast v0, Lzongfuscated/D; */
v2 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v3 = "processRedirect Params "; // const-string v3, "processRedirect Params "
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [Ljava/lang/String; */
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
/* aput-object v5, v4, v6 */
int v5 = 1; // const/4 v5, 0x1
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
/* aput-object v0, v4, v5 */
zongfuscated.q .a ( v2,v3,v4 );
} // .end method
private void g ( Object p0 ) {
/* .locals 8 */
int v7 = 1; // const/4 v7, 0x1
(( zongfuscated.o ) p1 ).a ( ); // invoke-virtual {p1}, Lzongfuscated/o;->a()Lzongfuscated/C;
v1 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v2 = "processError Action"; // const-string v2, "processError Action"
zongfuscated.q .a ( v1,v2 );
(( zongfuscated.C ) v0 ).e ( ); // invoke-virtual {v0}, Lzongfuscated/C;->e()Ljava/util/ArrayList;
if ( v0 != null) { // if-eqz v0, :cond_0
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_0
/* if-nez v0, :cond_1 */
} // :cond_0
(( zongfuscated.o ) p1 ).b ( ); // invoke-virtual {p1}, Lzongfuscated/o;->b()Ljava/lang/String;
zongfuscated.o .b ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
this.j = v0;
/* invoke-direct {p0, v7}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
return;
} // :cond_1
/* check-cast v0, Lzongfuscated/D; */
final String v2 = "cause"; // const-string v2, "cause"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v2 );
(( java.lang.String ) v2 ).trim ( ); // invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
this.l = v2;
} // :cond_2
} // :goto_1
v2 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v3 = "processError Params "; // const-string v3, "processError Params "
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
/* aput-object v6, v4, v5 */
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
/* aput-object v0, v4, v7 */
zongfuscated.q .a ( v2,v3,v4 );
} // :cond_3
final String v2 = "details"; // const-string v2, "details"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v2 );
(( java.lang.String ) v2 ).trim ( ); // invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
this.n = v2;
} // :cond_4
final String v2 = "message"; // const-string v2, "message"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_5
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v2 );
(( java.lang.String ) v2 ).trim ( ); // invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
this.m = v2;
} // :cond_5
final String v2 = "label"; // const-string v2, "label"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_6
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v2 );
(( java.lang.String ) v2 ).trim ( ); // invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
this.k = v2;
} // :cond_6
final String v2 = "code"; // const-string v2, "code"
(( zongfuscated.D ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/D;->a()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
(( zongfuscated.D ) v0 ).b ( ); // invoke-virtual {v0}, Lzongfuscated/D;->b()Ljava/lang/String;
zongfuscated.o .b ( v2 );
(( java.lang.String ) v2 ).trim ( ); // invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
this.o = v2;
/* goto/16 :goto_1 */
} // .end method
/* # virtual methods */
public final android.os.Handler a ( ) {
/* .locals 1 */
try { // :try_start_0
v0 = this.u;
(( java.util.concurrent.CountDownLatch ) v0 ).await ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
v0 = this.w;
/* :catch_0 */
/* move-exception v0 */
} // .end method
public final void a ( Object p0 ) {
/* .locals 4 */
int v2 = 1; // const/4 v2, 0x1
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v1 = "Starting Pay Service"; // const-string v1, "Starting Pay Service"
zongfuscated.q .b ( v0,v1 );
v0 = this.g;
v1 = this.f;
(( zongfuscated.j ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lzongfuscated/j;->a(Ljava/lang/String;)Landroid/content/Context;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.v;
(( android.os.Handler ) v0 ).sendEmptyMessage ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->h:Z */
/* iput-boolean v2, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->i:Z */
int v0 = 0; // const/4 v0, 0x0
this.j = v0;
(( zongfuscated.l ) p1 ).a ( ); // invoke-virtual {p1}, Lzongfuscated/l;->a()Lcom/zong/android/engine/activities/ZongPaymentRequest;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getSimulationMode ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getSimulationMode()Ljava/lang/Boolean;
v1 = (( java.lang.Boolean ) v1 ).booleanValue ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
/* iput-boolean v1, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->c:Z */
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getMno ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getMno()Ljava/lang/String;
this.d = v1;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getPhoneNumber ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getPhoneNumber()Ljava/lang/String;
this.e = v1;
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
final String v2 = "purchaseKey"; // const-string v2, "purchaseKey"
(( zongfuscated.l ) p1 ).b ( ); // invoke-virtual {p1}, Lzongfuscated/l;->b()Ljava/lang/String;
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
final String v2 = "transactionRef"; // const-string v2, "transactionRef"
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getTransactionRef ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getTransactionRef()Ljava/lang/String;
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
final String v2 = "itemDesc"; // const-string v2, "itemDesc"
(( zongfuscated.l ) p1 ).c ( ); // invoke-virtual {p1}, Lzongfuscated/l;->c()Ljava/lang/String;
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
final String v2 = "msisdn"; // const-string v2, "msisdn"
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getPhoneNumber ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getPhoneNumber()Ljava/lang/String;
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
final String v2 = "lang"; // const-string v2, "lang"
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getLang ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getLang()Ljava/lang/String;
(( java.util.HashMap ) v1 ).put ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
v0 = this.p;
(( zongfuscated.A ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lzongfuscated/A;->a(Ljava/util/HashMap;)V
} // :goto_0
return;
} // :cond_0
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v1 = "processPayment failed due to missing context"; // const-string v1, "processPayment failed due to missing context"
zongfuscated.q .c ( v0,v1 );
int v0 = 2; // const/4 v0, 0x2
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(I)V */
} // .end method
public final void b ( ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
int v2 = 1; // const/4 v2, 0x1
v0 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v1 = "Stopping Payment Processor"; // const-string v1, "Stopping Payment Processor"
zongfuscated.q .a ( v0,v1 );
/* iput-boolean v2, p0, Lcom/zong/android/engine/task/PaymentProcessorTask;->h:Z */
v0 = this.w;
int v1 = 0; // const/4 v1, 0x0
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
v0 = this.w;
(( android.os.Handler ) v0 ).removeMessages ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
v0 = this.w;
int v1 = 2; // const/4 v1, 0x2
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
v0 = this.w;
int v1 = 3; // const/4 v1, 0x3
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
v0 = this.w;
int v1 = 4; // const/4 v1, 0x4
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
v0 = this.w;
(( android.os.Handler ) v0 ).getLooper ( ); // invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
(( android.os.Looper ) v0 ).quit ( ); // invoke-virtual {v0}, Landroid/os/Looper;->quit()V
this.w = v3;
v0 = this.p;
(( zongfuscated.A ) v0 ).a ( ); // invoke-virtual {v0}, Lzongfuscated/A;->a()V
v0 = this.s;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.s;
} // :cond_0
this.s = v3;
v0 = this.g;
v1 = this.f;
(( zongfuscated.j ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lzongfuscated/j;->b(Ljava/lang/String;)V
this.g = v3;
v0 = this.r;
v1 = com.zong.android.engine.task.PaymentProcessorTask.b;
final String v2 = "Pool Shutdown"; // const-string v2, "Pool Shutdown"
zongfuscated.q .a ( v1,v2 );
/* const-wide/16 v1, 0x2 */
try { // :try_start_0
v1 = v3 = java.util.concurrent.TimeUnit.SECONDS;
/* if-nez v1, :cond_1 */
/* const-wide/16 v1, 0x2 */
v1 = v3 = java.util.concurrent.TimeUnit.SECONDS;
/* if-nez v1, :cond_1 */
v1 = java.lang.System.err;
final String v2 = "Pool did not terminate"; // const-string v2, "Pool did not terminate"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_1
} // :goto_0
return;
/* :catch_0 */
/* move-exception v1 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
} // .end method
public void run ( ) {
/* .locals 4 */
android.os.Looper .prepare ( );
/* new-instance v0, Lcom/zong/android/engine/task/PaymentProcessorTask$4; */
/* invoke-direct {v0, p0}, Lcom/zong/android/engine/task/PaymentProcessorTask$4;-><init>(Lcom/zong/android/engine/task/PaymentProcessorTask;)V */
this.w = v0;
v0 = this.u;
(( java.util.concurrent.CountDownLatch ) v0 ).countDown ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
/* new-instance v0, Lcom/zong/android/engine/task/PaymentProcessorTask$a; */
/* invoke-direct {v0}, Lcom/zong/android/engine/task/PaymentProcessorTask$a;-><init>()V */
java.util.concurrent.Executors .newCachedThreadPool ( v0 );
this.r = v0;
/* new-instance v0, Lzongfuscated/A; */
v1 = this.r;
v2 = this.q;
(( com.zong.android.engine.task.PaymentProcessorTask ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a()Landroid/os/Handler;
/* invoke-direct {v0, v1, v2, v3}, Lzongfuscated/A;-><init>(Ljava/util/concurrent/ExecutorService;Lzongfuscated/e;Landroid/os/Handler;)V */
this.p = v0;
/* new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue; */
/* const/16 v1, 0x8 */
/* invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V */
this.t = v0;
android.os.Looper .loop ( );
return;
} // .end method
