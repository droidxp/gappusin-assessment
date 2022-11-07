class org.haxe.nme.MainView$5 implements java.lang.Runnable {
	 /* .source "MainView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/haxe/nme/MainView;->queuePoll()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.haxe.nme.MainView this$0; //synthetic
final org.haxe.nme.MainView val$me; //synthetic
/* # direct methods */
 org.haxe.nme.MainView$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 220 */
this.this$0 = p1;
this.val$me = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 220 */
v0 = this.val$me;
(( org.haxe.nme.MainView ) v0 ).onPoll ( ); // invoke-virtual {v0}, Lorg/haxe/nme/MainView;->onPoll()V
return;
} // .end method
