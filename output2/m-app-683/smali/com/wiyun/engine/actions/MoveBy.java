public class com.wiyun.engine.actions.MoveBy extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "MoveBy.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.MoveBy ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "x" # F */
		 /* .param p3, "y" # F */
		 /* .prologue */
		 /* .line 35 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 36 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/actions/MoveBy;->nativeInit(FFF)V */
		 /* .line 37 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.MoveBy ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 46 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 47 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.MoveBy .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.MoveBy from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 42 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/MoveBy; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/MoveBy;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.MoveBy make ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 32 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveBy; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/actions/MoveBy;-><init>(FFF)V */
} // .end method
private native void nativeGetPinPoint ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeInit ( Float p0, Float p1, Float p2 ) {
} // .end method
/* # virtual methods */
public native void clearPinPoint ( ) {
} // .end method
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 51 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveBy; */
v1 = (( com.wiyun.engine.actions.MoveBy ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveBy;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveBy;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.MoveBy ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveBy;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public native Float getPinAngleDelta ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getPinPoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 101 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 102 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/MoveBy;->nativeGetPinPoint(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 103 */
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 56 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveBy; */
v1 = (( com.wiyun.engine.actions.MoveBy ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveBy;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveBy;-><init>(I)V */
} // .end method
public native void setPinAngleDelta ( Float p0 ) {
} // .end method
public native void setPinPoint ( Float p0, Float p1 ) {
} // .end method
public void setPinPoint ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 71 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.actions.MoveBy ) p0 ).setPinPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/actions/MoveBy;->setPinPoint(FF)V
/* .line 72 */
return;
} // .end method
