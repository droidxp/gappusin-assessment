public class com.wiyun.engine.actions.Shake extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "Shake.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.Shake ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "radius" # F */
		 /* .prologue */
		 /* .line 29 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 30 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Shake;->nativeInit(FF)V */
		 /* .line 31 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.Shake ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 39 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.Shake .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Shake from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Shake; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Shake;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Shake make ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "radius" # F */
/* .prologue */
/* .line 26 */
/* new-instance v0, Lcom/wiyun/engine/actions/Shake; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/Shake;-><init>(FF)V */
} // .end method
private native void nativeInit ( Float p0, Float p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 45 */
/* new-instance v0, Lcom/wiyun/engine/actions/Shake; */
v1 = (( com.wiyun.engine.actions.Shake ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Shake;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Shake;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.Shake ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Shake;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 50 */
/* new-instance v0, Lcom/wiyun/engine/actions/Shake; */
v1 = (( com.wiyun.engine.actions.Shake ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Shake;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Shake;-><init>(I)V */
} // .end method
