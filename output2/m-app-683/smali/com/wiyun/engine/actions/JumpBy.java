public class com.wiyun.engine.actions.JumpBy extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "JumpBy.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.JumpBy ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "x" # F */
		 /* .param p3, "y" # F */
		 /* .param p4, "height" # F */
		 /* .param p5, "jumps" # I */
		 /* .prologue */
		 /* .line 36 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 37 */
		 /* invoke-direct/range {p0 ..p5}, Lcom/wiyun/engine/actions/JumpBy;->nativeInit(FFFFI)V */
		 /* .line 38 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.JumpBy ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 47 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 48 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.JumpBy .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.JumpBy from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 43 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/JumpBy; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/JumpBy;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.JumpBy make ( Float p0, Float p1, Float p2, Float p3, Integer p4 ) {
/* .locals 6 */
/* .param p0, "duration" # F */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .param p3, "height" # F */
/* .param p4, "jumps" # I */
/* .prologue */
/* .line 33 */
/* new-instance v0, Lcom/wiyun/engine/actions/JumpBy; */
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/JumpBy;-><init>(FFFFI)V */
} // .end method
private native void nativeInit ( Float p0, Float p1, Float p2, Float p3, Integer p4 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 52 */
/* new-instance v0, Lcom/wiyun/engine/actions/JumpBy; */
v1 = (( com.wiyun.engine.actions.JumpBy ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/JumpBy;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/JumpBy;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.JumpBy ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/JumpBy;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 57 */
/* new-instance v0, Lcom/wiyun/engine/actions/JumpBy; */
v1 = (( com.wiyun.engine.actions.JumpBy ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/JumpBy;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/JumpBy;-><init>(I)V */
} // .end method
