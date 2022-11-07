public class com.wiyun.engine.actions.TintTo extends com.wiyun.engine.actions.IntervalAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.TintTo ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* invoke-direct/range {p0 ..p7}, Lcom/wiyun/engine/actions/TintTo;->nativeInit(FIIIIII)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.TintTo ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.TintTo .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.TintTo from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/TintTo; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/TintTo;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.TintTo make ( Float p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
/* .locals 8 */
/* new-instance v0, Lcom/wiyun/engine/actions/TintTo; */
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* move v7, p6 */
/* invoke-direct/range {v0 ..v7}, Lcom/wiyun/engine/actions/TintTo;-><init>(FIIIIII)V */
} // .end method
public static com.wiyun.engine.actions.TintTo make ( Float p0, Integer p1, Integer p2, Integer p3, com.wiyun.engine.types.WYColor3B p4 ) {
/* .locals 8 */
/* new-instance v0, Lcom/wiyun/engine/actions/TintTo; */
/* iget v5, p4, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v6, p4, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v7, p4, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* invoke-direct/range {v0 ..v7}, Lcom/wiyun/engine/actions/TintTo;-><init>(FIIIIII)V */
} // .end method
public static com.wiyun.engine.actions.TintTo make ( Float p0, com.wiyun.engine.types.WYColor3B p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 8 */
/* new-instance v0, Lcom/wiyun/engine/actions/TintTo; */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v3, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v4, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* move v1, p0 */
/* move v5, p2 */
/* move v6, p3 */
/* move v7, p4 */
/* invoke-direct/range {v0 ..v7}, Lcom/wiyun/engine/actions/TintTo;-><init>(FIIIIII)V */
} // .end method
public static com.wiyun.engine.actions.TintTo make ( Float p0, com.wiyun.engine.types.WYColor3B p1, com.wiyun.engine.types.WYColor3B p2 ) {
/* .locals 8 */
/* new-instance v0, Lcom/wiyun/engine/actions/TintTo; */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v3, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v4, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* iget v5, p2, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v6, p2, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v7, p2, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* move v1, p0 */
/* invoke-direct/range {v0 ..v7}, Lcom/wiyun/engine/actions/TintTo;-><init>(FIIIIII)V */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/TintTo; */
v1 = (( com.wiyun.engine.actions.TintTo ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/TintTo;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/TintTo;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.TintTo ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/TintTo;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/TintTo; */
v1 = (( com.wiyun.engine.actions.TintTo ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/TintTo;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/TintTo;-><init>(I)V */
} // .end method
