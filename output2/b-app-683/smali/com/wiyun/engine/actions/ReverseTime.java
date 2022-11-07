public class com.wiyun.engine.actions.ReverseTime extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "ReverseTime.java" */
	 /* # direct methods */
	 public com.wiyun.engine.actions.ReverseTime ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 39 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ReverseTime ( ) {
		 /* .locals 0 */
		 /* .param p1, "action" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 28 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ReverseTime;->nativeInit(Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
		 /* .line 29 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.ReverseTime .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ReverseTime from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ReverseTime; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ReverseTime;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ReverseTime make ( com.wiyun.engine.actions.FiniteTimeAction p0 ) {
/* .locals 1 */
/* .param p0, "action" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* .prologue */
/* .line 24 */
/* new-instance v0, Lcom/wiyun/engine/actions/ReverseTime; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ReverseTime;-><init>(Lcom/wiyun/engine/actions/FiniteTimeAction;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.FiniteTimeAction p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 43 */
/* new-instance v0, Lcom/wiyun/engine/actions/ReverseTime; */
v1 = (( com.wiyun.engine.actions.ReverseTime ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ReverseTime;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ReverseTime;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.ReverseTime ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ReverseTime;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 48 */
/* new-instance v0, Lcom/wiyun/engine/actions/ReverseTime; */
v1 = (( com.wiyun.engine.actions.ReverseTime ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ReverseTime;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ReverseTime;-><init>(I)V */
} // .end method
