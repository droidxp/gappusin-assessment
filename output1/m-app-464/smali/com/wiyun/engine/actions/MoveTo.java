public class com.wiyun.engine.actions.MoveTo extends com.wiyun.engine.actions.IntervalAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.MoveTo ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* invoke-direct/range {p0 ..p5}, Lcom/wiyun/engine/actions/MoveTo;->nativeInit(FFFFF)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.MoveTo ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.MoveTo .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.MoveTo from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/MoveTo; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/MoveTo;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.MoveTo make ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 6 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveTo; */
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/MoveTo;-><init>(FFFFF)V */
} // .end method
private native void nativeInit ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveTo; */
v1 = (( com.wiyun.engine.actions.MoveTo ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveTo;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveTo;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.MoveTo ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveTo;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveTo; */
v1 = (( com.wiyun.engine.actions.MoveTo ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveTo;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveTo;-><init>(I)V */
} // .end method
