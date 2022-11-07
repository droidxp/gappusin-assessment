public class com.wiyun.engine.actions.JumpTo extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "JumpTo.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.JumpTo ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "startX" # F */
		 /* .param p3, "startY" # F */
		 /* .param p4, "endX" # F */
		 /* .param p5, "endY" # F */
		 /* .param p6, "height" # F */
		 /* .param p7, "jumps" # I */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 41 */
		 /* invoke-direct/range {p0 ..p7}, Lcom/wiyun/engine/actions/JumpTo;->nativeInit(FFFFFFI)V */
		 /* .line 42 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.JumpTo ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 55 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 56 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.JumpTo .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.JumpTo from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 51 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/JumpTo; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/JumpTo;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.JumpTo make ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Integer p6 ) {
/* .locals 8 */
/* .param p0, "duration" # F */
/* .param p1, "startX" # F */
/* .param p2, "startY" # F */
/* .param p3, "endX" # F */
/* .param p4, "endY" # F */
/* .param p5, "height" # F */
/* .param p6, "jumps" # I */
/* .prologue */
/* .line 37 */
/* new-instance v0, Lcom/wiyun/engine/actions/JumpTo; */
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* move v7, p6 */
/* invoke-direct/range {v0 ..v7}, Lcom/wiyun/engine/actions/JumpTo;-><init>(FFFFFFI)V */
} // .end method
private native void nativeInit ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Integer p6 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 62 */
/* new-instance v0, Lcom/wiyun/engine/actions/JumpTo; */
v1 = (( com.wiyun.engine.actions.JumpTo ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/JumpTo;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/JumpTo;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.JumpTo ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/JumpTo;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 67 */
/* new-instance v0, Lcom/wiyun/engine/actions/JumpTo; */
v1 = (( com.wiyun.engine.actions.JumpTo ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/JumpTo;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/JumpTo;-><init>(I)V */
} // .end method
