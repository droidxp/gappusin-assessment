class com.wiyun.engine.nodes.a$1 extends java.lang.Thread {
	 /* .source "_A.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/nodes/a;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.wiyun.engine.nodes.a a; //synthetic
private final android.content.Intent b; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes.a$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.a = p1;
this.b = p2;
/* .line 1804 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1807 */
try { // :try_start_0
	 v0 = this.b;
	 com.wiyun.engine.nodes.d .a ( v0 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 1812 */
} // :goto_0
return;
/* .line 1808 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
