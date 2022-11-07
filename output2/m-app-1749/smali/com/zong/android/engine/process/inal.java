class inal implements android.os.Handler$Callback {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/zong/android/engine/process/ZongServiceProcess; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private com.zong.android.engine.process.ZongServiceProcess a; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
private void a ( ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .a ( v0,v4 );
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.a;
	 com.zong.android.engine.process.ZongServiceProcess .b ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 com.zong.android.engine.process.ZongServiceProcess .b ( );
		 final String v1 = "Restoring Messaging to Client"; // const-string v1, "Restoring Messaging to Client"
		 int v2 = 1; // const/4 v2, 0x1
		 /* new-array v2, v2, [Ljava/lang/String; */
		 v3 = this.a;
		 com.zong.android.engine.process.ZongServiceProcess .b ( v3 );
		 /* iget v3, v3, Landroid/os/Message;->what:I */
		 java.lang.Integer .toString ( v3 );
		 /* aput-object v3, v2, v4 */
		 zongfuscated.q .a ( v0,v1,v2 );
		 try { // :try_start_0
			 v0 = this.a;
			 com.zong.android.engine.process.ZongServiceProcess .a ( v0 );
			 v1 = this.a;
			 com.zong.android.engine.process.ZongServiceProcess .b ( v1 );
			 (( android.os.Messenger ) v0 ).send ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
			 /* :try_end_0 */
			 /* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :cond_0
	 } // :goto_0
	 return;
	 /* :catch_0 */
	 /* move-exception v0 */
} // .end method
/* # virtual methods */
public final Boolean handleMessage ( android.os.Message p0 ) {
	 /* .locals 3 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* iget v0, p1, Landroid/os/Message;->what:I */
	 /* packed-switch v0, :pswitch_data_0 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .a ( v0,v2 );
v0 = this.a;
v1 = this.replyTo;
com.zong.android.engine.process.ZongServiceProcess .a ( v0,v1 );
v1 = this.a;
v0 = this.obj;
/* check-cast v0, Lcom/zong/android/engine/activities/ZongPaymentRequest; */
com.zong.android.engine.process.ZongServiceProcess .a ( v1,v0 );
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .c ( v0 );
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getDebugMode ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getDebugMode()Ljava/lang/Boolean;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
zongfuscated.q .a ( v0 );
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .d ( v0 );
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .e ( v0 );
/* :pswitch_1 */
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .a ( v0,v2 );
v0 = this.a;
v1 = this.replyTo;
com.zong.android.engine.process.ZongServiceProcess .a ( v0,v1 );
v1 = this.a;
v0 = this.obj;
/* check-cast v0, Lcom/zong/android/engine/activities/ZongPaymentRequest; */
com.zong.android.engine.process.ZongServiceProcess .a ( v1,v0 );
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .c ( v0 );
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getDebugMode ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getDebugMode()Ljava/lang/Boolean;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
zongfuscated.q .a ( v0 );
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .d ( v0 );
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .f ( v0 );
/* :pswitch_2 */
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .a ( v0,v2 );
v0 = this.a;
v1 = this.replyTo;
com.zong.android.engine.process.ZongServiceProcess .a ( v0,v1 );
v1 = this.a;
v0 = this.obj;
/* check-cast v0, Lcom/zong/android/engine/activities/ZongPaymentRequest; */
com.zong.android.engine.process.ZongServiceProcess .a ( v1,v0 );
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .c ( v0 );
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getDebugMode ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getDebugMode()Ljava/lang/Boolean;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
zongfuscated.q .a ( v0 );
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .d ( v0 );
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .g ( v0 );
/* goto/16 :goto_0 */
/* :pswitch_3 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
com.zong.android.engine.process.ZongServiceProcess .a ( v0,v1 );
/* goto/16 :goto_0 */
/* :pswitch_4 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
com.zong.android.engine.process.ZongServiceProcess .a ( v0,v1 );
/* goto/16 :goto_0 */
/* :pswitch_5 */
v0 = this.a;
v0 = com.zong.android.engine.process.ZongServiceProcess .h ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lcom/zong/android/engine/process/c;->a()V */
/* goto/16 :goto_0 */
/* :pswitch_6 */
/* invoke-direct {p0}, Lcom/zong/android/engine/process/c;->a()V */
/* goto/16 :goto_0 */
/* :pswitch_7 */
v0 = this.obj;
/* check-cast v0, Lzongfuscated/l; */
v1 = this.a;
com.zong.android.engine.process.ZongServiceProcess .i ( v1 );
(( com.zong.android.engine.task.PaymentProcessorTask ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask;->a(Lzongfuscated/l;)V
/* goto/16 :goto_0 */
/* :pswitch_8 */
v0 = this.a;
com.zong.android.engine.process.ZongServiceProcess .j ( v0 );
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_7 */
/* :pswitch_8 */
} // .end packed-switch
} // .end method
