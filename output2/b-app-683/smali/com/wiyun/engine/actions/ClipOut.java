public class com.wiyun.engine.actions.ClipOut extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "ClipOut.java" */
	 /* # static fields */
	 public static final Integer BOTTOM_TO_TOP;
	 public static final Integer LEFT_TO_RIGHT;
	 public static final Integer RIGHT_TO_LEFT;
	 public static final Integer TOP_TO_BOTTOM;
	 /* # direct methods */
	 protected com.wiyun.engine.actions.ClipOut ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "direction" # I */
		 /* .prologue */
		 /* .line 66 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 67 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/ClipOut;->nativeInit(FI)V */
		 /* .line 68 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ClipOut ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 75 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 76 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.ClipOut .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ClipOut from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 71 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ClipOut; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ClipOut;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ClipOut make ( Float p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "direction" # I */
/* .prologue */
/* .line 63 */
/* new-instance v0, Lcom/wiyun/engine/actions/ClipOut; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/ClipOut;-><init>(FI)V */
} // .end method
private native void nativeInit ( Float p0, Integer p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 82 */
/* new-instance v0, Lcom/wiyun/engine/actions/ClipOut; */
v1 = (( com.wiyun.engine.actions.ClipOut ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ClipOut;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ClipOut;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.ClipOut ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ClipOut;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 87 */
/* new-instance v0, Lcom/wiyun/engine/actions/ClipOut; */
v1 = (( com.wiyun.engine.actions.ClipOut ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ClipOut;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ClipOut;-><init>(I)V */
} // .end method
