public class com.wiyun.engine.actions.Blink extends com.wiyun.engine.actions.IntervalAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.Blink ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Blink;->nativeInit(FI)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.Blink ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.Blink .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Blink from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Blink; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Blink;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Blink make ( Float p0, Integer p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/Blink; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/Blink;-><init>(FI)V */
} // .end method
private native void nativeInit ( Float p0, Integer p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/Blink; */
v1 = (( com.wiyun.engine.actions.Blink ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Blink;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Blink;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.Blink ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Blink;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/Blink; */
v1 = (( com.wiyun.engine.actions.Blink ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Blink;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Blink;-><init>(I)V */
} // .end method
