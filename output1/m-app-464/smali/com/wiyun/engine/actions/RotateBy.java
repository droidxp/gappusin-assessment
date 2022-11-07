public class com.wiyun.engine.actions.RotateBy extends com.wiyun.engine.actions.IntervalAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.RotateBy ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/RotateBy;->nativeInit(FF)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.RotateBy ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.RotateBy .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.RotateBy from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/RotateBy; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/RotateBy;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.RotateBy make ( Float p0, Float p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/RotateBy; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/RotateBy;-><init>(FF)V */
} // .end method
private native void nativeInit ( Float p0, Float p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/RotateBy; */
v1 = (( com.wiyun.engine.actions.RotateBy ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/RotateBy;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/RotateBy;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.RotateBy ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/RotateBy;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/RotateBy; */
v1 = (( com.wiyun.engine.actions.RotateBy ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/RotateBy;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/RotateBy;-><init>(I)V */
} // .end method
