public class com.wiyun.engine.actions.ReverseTime extends com.wiyun.engine.actions.IntervalAction {
	 /* # direct methods */
	 public com.wiyun.engine.actions.ReverseTime ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.ReverseTime ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ReverseTime;->nativeInit(Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.ReverseTime .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ReverseTime from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ReverseTime; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ReverseTime;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ReverseTime make ( com.wiyun.engine.actions.FiniteTimeAction p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/ReverseTime; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ReverseTime;-><init>(Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.FiniteTimeAction p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ReverseTime; */
v1 = (( com.wiyun.engine.actions.ReverseTime ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ReverseTime;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ReverseTime;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.ReverseTime ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ReverseTime;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ReverseTime; */
v1 = (( com.wiyun.engine.actions.ReverseTime ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ReverseTime;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ReverseTime;-><init>(I)V */
} // .end method
