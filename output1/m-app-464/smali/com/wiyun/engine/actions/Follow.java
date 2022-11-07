public class com.wiyun.engine.actions.Follow extends com.wiyun.engine.actions.Action {
	 /* # direct methods */
	 private com.wiyun.engine.actions.Follow ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/Action;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.Follow ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/Action;-><init>()V */
		 /* invoke-direct/range {p0 ..p5}, Lcom/wiyun/engine/actions/Follow;->nativeInit(Lcom/wiyun/engine/nodes/Node;IIII)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.Follow .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Follow from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Follow; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Follow;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Follow make ( com.wiyun.engine.nodes.Node p0 ) {
/* .locals 6 */
int v2 = 0; // const/4 v2, 0x0
/* new-instance v0, Lcom/wiyun/engine/actions/Follow; */
/* move-object v1, p0 */
/* move v3, v2 */
/* move v4, v2 */
/* move v5, v2 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/Follow;-><init>(Lcom/wiyun/engine/nodes/Node;IIII)V */
} // .end method
public static com.wiyun.engine.actions.Follow make ( com.wiyun.engine.nodes.Node p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 6 */
/* new-instance v0, Lcom/wiyun/engine/actions/Follow; */
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/Follow;-><init>(Lcom/wiyun/engine/nodes/Node;IIII)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.nodes.Node p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
} // .end method
