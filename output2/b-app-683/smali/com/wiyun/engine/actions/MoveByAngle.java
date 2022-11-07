public class com.wiyun.engine.actions.MoveByAngle extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "MoveByAngle.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.MoveByAngle ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "degree" # I */
		 /* .param p3, "velocity" # I */
		 /* .prologue */
		 /* .line 32 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 33 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/actions/MoveByAngle;->nativeInit(FII)V */
		 /* .line 34 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.MoveByAngle ( ) {
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
		 com.wiyun.engine.actions.MoveByAngle .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.MoveByAngle from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByAngle; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/MoveByAngle;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.MoveByAngle make ( Float p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "degree" # I */
/* .param p2, "velocity" # I */
/* .prologue */
/* .line 29 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByAngle; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/actions/MoveByAngle;-><init>(FII)V */
} // .end method
private native void nativeGetPinPoint ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public native void clearPinPoint ( ) {
} // .end method
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 48 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByAngle; */
v1 = (( com.wiyun.engine.actions.MoveByAngle ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveByAngle;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveByAngle;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.MoveByAngle ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveByAngle;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public native Float getPinAngleDelta ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getPinPoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 98 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 99 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/MoveByAngle;->nativeGetPinPoint(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 100 */
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 53 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByAngle; */
v1 = (( com.wiyun.engine.actions.MoveByAngle ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveByAngle;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveByAngle;-><init>(I)V */
} // .end method
public native void setPinAngleDelta ( Float p0 ) {
} // .end method
public native void setPinPoint ( Float p0, Float p1 ) {
} // .end method
public void setPinPoint ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 68 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.actions.MoveByAngle ) p0 ).setPinPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/actions/MoveByAngle;->setPinPoint(FF)V
/* .line 69 */
return;
} // .end method
