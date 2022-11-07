class com.wiyun.engine.nodes.Director$4$1 implements android.content.DialogInterface$OnClickListener {
	 /* .source "Director.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/nodes/Director$4;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.wiyun.engine.nodes.Director$4 this$1; //synthetic
private final Integer val$okSelectorPointer; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes.Director$4$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
/* iput p2, p0, Lcom/wiyun/engine/nodes/Director$4$1;->val$okSelectorPointer:I */
/* .line 510 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 512 */
com.wiyun.engine.nodes.Director .getInstance ( );
/* new-instance v1, Lcom/wiyun/engine/nodes/Director$4$1$1; */
/* iget v2, p0, Lcom/wiyun/engine/nodes/Director$4$1;->val$okSelectorPointer:I */
/* invoke-direct {v1, p0, v2}, Lcom/wiyun/engine/nodes/Director$4$1$1;-><init>(Lcom/wiyun/engine/nodes/Director$4$1;I)V */
(( com.wiyun.engine.nodes.Director ) v0 ).runOnGLThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Director;->runOnGLThread(Ljava/lang/Runnable;)V
/* .line 518 */
return;
} // .end method
