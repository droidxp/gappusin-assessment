public class com.wiyun.engine.actions.ScaleTo extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "ScaleTo.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.ScaleTo ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "startScaleX" # F */
		 /* .param p3, "startScaleY" # F */
		 /* .param p4, "endScaleX" # F */
		 /* .param p5, "endScaleY" # F */
		 /* .prologue */
		 /* .line 54 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 55 */
		 /* invoke-direct/range {p0 ..p5}, Lcom/wiyun/engine/actions/ScaleTo;->nativeInit(FFFFF)V */
		 /* .line 56 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ScaleTo ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 65 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 66 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.ScaleTo .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ScaleTo from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 61 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ScaleTo; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ScaleTo;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ScaleTo make ( Float p0, Float p1, Float p2 ) {
/* .locals 6 */
/* .param p0, "duration" # F */
/* .param p1, "startScale" # F */
/* .param p2, "endScale" # F */
/* .prologue */
/* .line 28 */
/* new-instance v0, Lcom/wiyun/engine/actions/ScaleTo; */
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p1 */
/* move v4, p2 */
/* move v5, p2 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/ScaleTo;-><init>(FFFFF)V */
} // .end method
public static com.wiyun.engine.actions.ScaleTo make ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 6 */
/* .param p0, "duration" # F */
/* .param p1, "startScaleX" # F */
/* .param p2, "startScaleY" # F */
/* .param p3, "endScaleX" # F */
/* .param p4, "endScaleY" # F */
/* .prologue */
/* .line 51 */
/* new-instance v0, Lcom/wiyun/engine/actions/ScaleTo; */
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/ScaleTo;-><init>(FFFFF)V */
} // .end method
private native void nativeInit ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 70 */
/* new-instance v0, Lcom/wiyun/engine/actions/ScaleTo; */
v1 = (( com.wiyun.engine.actions.ScaleTo ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ScaleTo;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ScaleTo;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.ScaleTo ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ScaleTo;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 75 */
/* new-instance v0, Lcom/wiyun/engine/actions/ScaleTo; */
v1 = (( com.wiyun.engine.actions.ScaleTo ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ScaleTo;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ScaleTo;-><init>(I)V */
} // .end method
