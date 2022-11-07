public class com.wiyun.engine.actions.TintBy extends com.wiyun.engine.actions.IntervalAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.TintBy ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/actions/TintBy;->nativeInit(FIII)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.TintBy ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.TintBy .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.TintBy from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/TintBy; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/TintBy;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.TintBy make ( Float p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/TintBy; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/actions/TintBy;-><init>(FIII)V */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2, Integer p3 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/TintBy; */
v1 = (( com.wiyun.engine.actions.TintBy ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/TintBy;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/TintBy;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.TintBy ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/TintBy;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/TintBy; */
v1 = (( com.wiyun.engine.actions.TintBy ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/TintBy;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/TintBy;-><init>(I)V */
} // .end method
