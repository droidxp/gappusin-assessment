class inal implements java.lang.Runnable {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/zong/android/engine/task/PaymentProcessorTask;->a(Lzongfuscated/u;Ljava/lang/String;Lzongfuscated/o;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private com.zong.android.engine.task.PaymentProcessorTask a; //synthetic
private final zongfuscated.u b; //synthetic
private final java.lang.String c; //synthetic
private final zongfuscated.o d; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
this.a = p1;
this.b = p2;
this.c = p3;
this.d = p4;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public final void run ( ) {
/* .locals 8 */
int v3 = 1; // const/4 v3, 0x1
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
	 com.zong.android.engine.task.PaymentProcessorTask .c ( );
	 final String v2 = "Waiting for SMS"; // const-string v2, "Waiting for SMS"
	 zongfuscated.q .a ( v1,v2 );
	 /* move v2, v0 */
} // :goto_0
/* if-nez v2, :cond_0 */
int v1 = 3; // const/4 v1, 0x3
/* if-lt v0, v1, :cond_2 */
} // :cond_0
/* if-nez v2, :cond_1 */
com.zong.android.engine.task.PaymentProcessorTask .c ( );
final String v1 = "PANIC ERROR NO VALID SMS(3) ARRIVED"; // const-string v1, "PANIC ERROR NO VALID SMS(3) ARRIVED"
zongfuscated.q .c ( v0,v1 );
v0 = this.a;
com.zong.android.engine.task.PaymentProcessorTask .e ( v0 );
} // :cond_1
com.zong.android.engine.task.PaymentProcessorTask .c ( );
final String v1 = "Found Valid SMS"; // const-string v1, "Found Valid SMS"
zongfuscated.q .a ( v0,v1 );
} // :goto_1
return;
} // :cond_2
/* add-int/lit8 v1, v0, 0x1 */
v0 = this.a;
com.zong.android.engine.task.PaymentProcessorTask .a ( v0 );
(( java.util.concurrent.LinkedBlockingQueue ) v0 ).take ( ); // invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;
/* check-cast v0, Lzongfuscated/h; */
v4 = this.b;
com.zong.android.engine.task.PaymentProcessorTask .c ( );
final String v4 = "Got a SMS in the Queue"; // const-string v4, "Got a SMS in the Queue"
zongfuscated.q .a ( v0,v4 );
v0 = this.b;
v4 = this.a;
v4 = com.zong.android.engine.task.PaymentProcessorTask .b ( v4 );
v5 = this.a;
com.zong.android.engine.task.PaymentProcessorTask .c ( v5 );
if ( v0 != null) { // if-eqz v0, :cond_4
v2 = this.a;
v2 = com.zong.android.engine.task.PaymentProcessorTask .b ( v2 );
/* if-nez v2, :cond_3 */
v2 = this.a;
v2 = this.a;
(( com.zong.android.engine.process.ZongServiceProcess ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/zong/android/engine/process/ZongServiceProcess;->a()V
} // :cond_3
/* new-instance v2, Ljava/util/HashMap; */
/* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
v4 = this.c;
(( java.util.HashMap ) v2 ).put ( v4, v0 ); // invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
com.zong.android.engine.task.PaymentProcessorTask .c ( );
final String v5 = "Parse pincode"; // const-string v5, "Parse pincode"
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
/* aput-object v0, v6, v7 */
zongfuscated.q .a ( v4,v5,v6 );
v0 = this.a;
com.zong.android.engine.task.PaymentProcessorTask .d ( v0 );
v4 = this.d;
(( zongfuscated.A ) v0 ).a ( v4, v2 ); // invoke-virtual {v0, v4, v2}, Lzongfuscated/A;->a(Lzongfuscated/o;Ljava/util/HashMap;)V
com.zong.android.engine.task.PaymentProcessorTask .c ( );
final String v2 = "Sent Exchange Message - DONE"; // const-string v2, "Sent Exchange Message - DONE"
zongfuscated.q .a ( v0,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move v0, v1 */
/* move v2, v3 */
/* goto/16 :goto_0 */
/* :catch_0 */
/* move-exception v0 */
com.zong.android.engine.task.PaymentProcessorTask .c ( );
final String v2 = "queue.take"; // const-string v2, "queue.take"
zongfuscated.q .a ( v1,v2,v0 );
} // :cond_4
/* move v0, v1 */
/* goto/16 :goto_0 */
} // .end method
 v1 = "SEND_PINCODE"; // const-string v1, "SEND_PINCODE"
int v2 = 6; // const/4 v2, 0x6
final String v3 = "send-pincode"; // const-string v3, "send-pincode"
/* invoke-direct {v0, v1, v2, v3}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* new-instance v0, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType; */
final String v1 = "COMPLETED_TX"; // const-string v1, "COMPLETED_TX"
int v2 = 7; // const/4 v2, 0x7
final String v3 = "complete-transaction"; // const-string v3, "complete-transaction"
/* invoke-direct {v0, v1, v2, v3}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* new-instance v0, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType; */
final String v1 = "REDIRECT"; // const-string v1, "REDIRECT"
/* const/16 v2, 0x8 */
final String v3 = "redirect_client"; // const-string v3, "redirect_client"
/* invoke-direct {v0, v1, v2, v3}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* new-instance v0, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType; */
final String v1 = "ERROR"; // const-string v1, "ERROR"
/* const/16 v2, 0x9 */
final String v3 = "show-error"; // const-string v3, "show-error"
/* invoke-direct {v0, v1, v2, v3}, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* const/16 v0, 0xa */
/* new-array v0, v0, [Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType; */
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.WAIT;
/* aput-object v1, v0, v4 */
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.SEND_KEYWORD;
/* aput-object v1, v0, v5 */
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.POLLING;
/* aput-object v1, v0, v6 */
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.ENTER_PINCODE;
/* aput-object v1, v0, v7 */
v1 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.PROGRESS;
/* aput-object v1, v0, v8 */
int v1 = 5; // const/4 v1, 0x5
v2 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.SENDFLOW;
/* aput-object v2, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
v2 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.SEND_PINCODE;
/* aput-object v2, v0, v1 */
int v1 = 7; // const/4 v1, 0x7
v2 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.COMPLETED_TX;
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x8 */
v2 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.REDIRECT;
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x9 */
v2 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.ERROR;
/* aput-object v2, v0, v1 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
this.tag = p3;
return;
} // .end method
public static com.zong.android.engine.task.PaymentProcessorTask$ActionType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* const-class v0, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType; */
} // .end method
public static com.zong.android.engine.task.PaymentProcessorTask$ActionType values ( ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = com.zong.android.engine.task.PaymentProcessorTask$ActionType.a;
/* array-length v1, v0 */
/* new-array v2, v1, [Lcom/zong/android/engine/task/PaymentProcessorTask$ActionType; */
java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
} // .end method
/* # virtual methods */
public final Boolean match ( java.lang.String p0 ) {
/* .locals 1 */
v0 = this.tag;
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
