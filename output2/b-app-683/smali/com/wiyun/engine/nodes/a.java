class com.wiyun.engine.nodes.a extends android.content.BroadcastReceiver {
	 /* .source "_A.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/wiyun/engine/nodes/d; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # direct methods */
 com.wiyun.engine.nodes.a ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1801 */
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
/* .line 1 */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 2 */
/* .param p1, "ctx" # Landroid/content/Context; */
/* .param p2, "intent" # Landroid/content/Intent; */
/* .prologue */
/* .line 1804 */
/* new-instance v0, Lcom/wiyun/engine/nodes/a$1; */
/* invoke-direct {v0, p0, p2}, Lcom/wiyun/engine/nodes/a$1;-><init>(Lcom/wiyun/engine/nodes/a;Landroid/content/Intent;)V */
/* .line 1814 */
/* .local v0, "t":Ljava/lang/Thread; */
int v1 = 1; // const/4 v1, 0x1
(( java.lang.Thread ) v0 ).setDaemon ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V
/* .line 1815 */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 1816 */
return;
} // .end method
