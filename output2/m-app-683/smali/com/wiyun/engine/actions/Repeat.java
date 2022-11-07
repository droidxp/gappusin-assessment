public class com.wiyun.engine.actions.Repeat extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "Repeat.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.Repeat ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 41 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.Repeat ( ) {
		 /* .locals 0 */
		 /* .param p1, "action" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
		 /* .param p2, "times" # I */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 26 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Repeat;->nativeInit(Lcom/wiyun/engine/actions/FiniteTimeAction;I)V */
		 /* .line 27 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.Repeat .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Repeat from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 36 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Repeat; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Repeat;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Repeat make ( com.wiyun.engine.actions.FiniteTimeAction p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "action" # Lcom/wiyun/engine/actions/FiniteTimeAction; */
/* .param p1, "times" # I */
/* .prologue */
/* .line 16 */
/* new-instance v0, Lcom/wiyun/engine/actions/Repeat; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/Repeat;-><init>(Lcom/wiyun/engine/actions/FiniteTimeAction;I)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.FiniteTimeAction p0, Integer p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 47 */
/* new-instance v0, Lcom/wiyun/engine/actions/Repeat; */
v1 = (( com.wiyun.engine.actions.Repeat ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Repeat;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Repeat;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.Repeat ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Repeat;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 52 */
/* new-instance v0, Lcom/wiyun/engine/actions/Repeat; */
v1 = (( com.wiyun.engine.actions.Repeat ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Repeat;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Repeat;-><init>(I)V */
} // .end method
