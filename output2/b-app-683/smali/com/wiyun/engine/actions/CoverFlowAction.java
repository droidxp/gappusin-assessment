public class com.wiyun.engine.actions.CoverFlowAction extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "CoverFlowAction.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.CoverFlowAction ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.CoverFlowAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "targetCover" # Lcom/wiyun/engine/nodes/Cover; */
		 /* .prologue */
		 /* .line 46 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 47 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/CoverFlowAction;->nativeInit(FLcom/wiyun/engine/nodes/Cover;)V */
		 /* .line 48 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.CoverFlowAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 41 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 42 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.CoverFlowAction .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.CoverFlowAction from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 70 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/CoverFlowAction; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/CoverFlowAction;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.CoverFlowAction make ( Float p0, com.wiyun.engine.nodes.Cover p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "targetCover" # Lcom/wiyun/engine/nodes/Cover; */
/* .prologue */
/* .line 66 */
/* new-instance v0, Lcom/wiyun/engine/actions/CoverFlowAction; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/CoverFlowAction;-><init>(FLcom/wiyun/engine/nodes/Cover;)V */
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Cover p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 23 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "CoverFlowAction doesn\'t have reverse action"; // const-string v1, "CoverFlowAction doesn\'t have reverse action"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.CoverFlowAction ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/CoverFlowAction;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 35 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "CoverFlowAction doesn\'t have reverse action"; // const-string v1, "CoverFlowAction doesn\'t have reverse action"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
