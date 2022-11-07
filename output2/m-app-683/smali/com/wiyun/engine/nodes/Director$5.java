class com.wiyun.engine.nodes.Director$5 extends java.lang.Thread {
	 /* .source "Director.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/nodes/Director;->runThread(Ljava/lang/Runnable;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.wiyun.engine.nodes.Director this$0; //synthetic
private final java.lang.Runnable val$runnable; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes.Director$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$runnable = p2;
/* .line 909 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 911 */
v0 = this.val$runnable;
/* .line 912 */
v0 = this.this$0;
com.wiyun.engine.nodes.Director .access$0 ( v0 );
/* .line 913 */
return;
} // .end method
