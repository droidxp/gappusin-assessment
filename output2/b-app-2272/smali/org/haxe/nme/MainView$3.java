class org.haxe.nme.MainView$3 extends java.util.TimerTask {
	 /* .source "MainView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/haxe/nme/MainView;->HandleResult(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.haxe.nme.MainView this$0; //synthetic
final org.haxe.nme.MainView val$me; //synthetic
final Integer val$tid; //synthetic
/* # direct methods */
 org.haxe.nme.MainView$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 203 */
this.this$0 = p1;
/* iput p2, p0, Lorg/haxe/nme/MainView$3;->val$tid:I */
this.val$me = p3;
/* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 205 */
/* iget v0, p0, Lorg/haxe/nme/MainView$3;->val$tid:I */
v1 = this.val$me;
/* iget v1, v1, Lorg/haxe/nme/MainView;->mTimerID:I */
/* if-ne v0, v1, :cond_0 */
/* .line 206 */
v0 = this.val$me;
(( org.haxe.nme.MainView ) v0 ).queuePoll ( ); // invoke-virtual {v0}, Lorg/haxe/nme/MainView;->queuePoll()V
/* .line 207 */
} // :cond_0
return;
} // .end method
