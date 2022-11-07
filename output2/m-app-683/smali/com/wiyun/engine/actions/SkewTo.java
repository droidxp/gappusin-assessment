public class com.wiyun.engine.actions.SkewTo extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "SkewTo.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.SkewTo ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "startSkewX" # F */
		 /* .param p3, "endSkewX" # F */
		 /* .param p4, "startSkewY" # F */
		 /* .param p5, "endSkewY" # F */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 35 */
		 /* invoke-direct/range {p0 ..p5}, Lcom/wiyun/engine/actions/SkewTo;->nativeInit(FFFFF)V */
		 /* .line 36 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.SkewTo ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 43 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 44 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.SkewTo .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.SkewTo from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/SkewTo; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/SkewTo;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.SkewTo make ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 6 */
/* .param p0, "duration" # F */
/* .param p1, "startSkewX" # F */
/* .param p2, "endSkewX" # F */
/* .param p3, "startSkewY" # F */
/* .param p4, "endSkewY" # F */
/* .prologue */
/* .line 31 */
/* new-instance v0, Lcom/wiyun/engine/actions/SkewTo; */
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/SkewTo;-><init>(FFFFF)V */
} // .end method
private native void nativeInit ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 50 */
/* new-instance v0, Lcom/wiyun/engine/actions/SkewTo; */
v1 = (( com.wiyun.engine.actions.SkewTo ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/SkewTo;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/SkewTo;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.SkewTo ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/SkewTo;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 55 */
/* new-instance v0, Lcom/wiyun/engine/actions/SkewTo; */
v1 = (( com.wiyun.engine.actions.SkewTo ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/SkewTo;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/SkewTo;-><init>(I)V */
} // .end method
