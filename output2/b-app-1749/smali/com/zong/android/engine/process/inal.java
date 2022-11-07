class inal implements android.content.ServiceConnection {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/zong/android/engine/process/ZongActivityProcess; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x12 */
/* name = "a" */
} // .end annotation
/* # instance fields */
private Integer a;
private com.zong.android.engine.process.ZongActivityProcess b; //synthetic
/* # direct methods */
public inal ( ) {
/* .locals 0 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* iput p2, p0, Lcom/zong/android/engine/process/ZongActivityProcess$a;->a:I */
return;
} // .end method
/* # virtual methods */
public final void onServiceConnected ( android.content.ComponentName p0, android.os.IBinder p1 ) {
/* .locals 3 */
v0 = this.b;
/* new-instance v1, Landroid/os/Messenger; */
/* invoke-direct {v1, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V */
this.b = v1;
com.zong.android.engine.process.ZongActivityProcess .i ( );
final String v1 = "Service LifeCycle Event: onServiceConnected"; // const-string v1, "Service LifeCycle Event: onServiceConnected"
zongfuscated.q .a ( v0,v1 );
v0 = this.b;
/* iget v1, p0, Lcom/zong/android/engine/process/ZongActivityProcess$a;->a:I */
v2 = this.b;
(( com.zong.android.engine.process.ZongActivityProcess ) v2 ).h ( ); // invoke-virtual {v2}, Lcom/zong/android/engine/process/ZongActivityProcess;->h()Lcom/zong/android/engine/activities/ZongPaymentRequest;
(( com.zong.android.engine.process.ZongActivityProcess ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/zong/android/engine/process/ZongActivityProcess;->a(ILjava/lang/Object;)V
return;
} // .end method
public final void onServiceDisconnected ( android.content.ComponentName p0 ) {
/* .locals 2 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
this.b = v1;
com.zong.android.engine.process.ZongActivityProcess .i ( );
final String v1 = "Service LifeCycle Event: onServiceDisconnected"; // const-string v1, "Service LifeCycle Event: onServiceDisconnected"
zongfuscated.q .a ( v0,v1 );
return;
} // .end method
