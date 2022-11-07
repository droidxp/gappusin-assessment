public class com.wiyun.engine.actions.MoveTo extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "MoveTo.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.MoveTo ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "startX" # F */
		 /* .param p3, "startY" # F */
		 /* .param p4, "endX" # F */
		 /* .param p5, "endY" # F */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 39 */
		 /* invoke-direct/range {p0 ..p5}, Lcom/wiyun/engine/actions/MoveTo;->nativeInit(FFFFF)V */
		 /* .line 40 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.MoveTo ( ) {
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
		 com.wiyun.engine.actions.MoveTo .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.MoveTo from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 43 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/MoveTo; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/MoveTo;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.MoveTo make ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 6 */
/* .param p0, "duration" # F */
/* .param p1, "startX" # F */
/* .param p2, "startY" # F */
/* .param p3, "endX" # F */
/* .param p4, "endY" # F */
/* .prologue */
/* .line 35 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveTo; */
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/MoveTo;-><init>(FFFFF)V */
} // .end method
private native void nativeGetPinPoint ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeInit ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
} // .end method
/* # virtual methods */
public native void clearPinPoint ( ) {
} // .end method
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 54 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveTo; */
v1 = (( com.wiyun.engine.actions.MoveTo ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveTo;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveTo;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.MoveTo ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveTo;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public native Float getPinAngleDelta ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getPinPoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 104 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 105 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/MoveTo;->nativeGetPinPoint(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 106 */
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 59 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveTo; */
v1 = (( com.wiyun.engine.actions.MoveTo ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveTo;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveTo;-><init>(I)V */
} // .end method
public native void setPinAngleDelta ( Float p0 ) {
} // .end method
public native void setPinPoint ( Float p0, Float p1 ) {
} // .end method
public void setPinPoint ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 74 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.actions.MoveTo ) p0 ).setPinPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/actions/MoveTo;->setPinPoint(FF)V
/* .line 75 */
return;
} // .end method
