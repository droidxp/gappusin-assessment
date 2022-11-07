public class com.wiyun.engine.actions.Animate extends com.wiyun.engine.actions.IntervalAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.Animate ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.Animate ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Animate;->nativeInit(Lcom/wiyun/engine/nodes/Animation;Z)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.Animate .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Animate from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Animate; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Animate;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Animate make ( com.wiyun.engine.nodes.Animation p0 ) {
/* .locals 2 */
/* if-nez p0, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Animate: argument Animation must be non-null"; // const-string v1, "Animate: argument Animation must be non-null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Animate; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/wiyun/engine/actions/Animate;-><init>(Lcom/wiyun/engine/nodes/Animation;Z)V */
} // .end method
public static com.wiyun.engine.actions.Animate make ( com.wiyun.engine.nodes.Animation p0, Boolean p1 ) {
/* .locals 2 */
/* if-nez p0, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Animate: argument Animation must be non-null"; // const-string v1, "Animate: argument Animation must be non-null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Animate; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/Animate;-><init>(Lcom/wiyun/engine/nodes/Animation;Z)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.nodes.Animation p0, Boolean p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/Animate; */
v1 = (( com.wiyun.engine.actions.Animate ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Animate;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Animate;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.Animate ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Animate;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/Animate; */
v1 = (( com.wiyun.engine.actions.Animate ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Animate;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Animate;-><init>(I)V */
} // .end method
