public class com.wiyun.engine.actions.MoveByPath extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "MoveByPath.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.MoveByPath ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/MoveByPath;->nativeInit()V */
		 /* .line 20 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.MoveByPath ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 29 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 30 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.MoveByPath .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.MoveByPath from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 25 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByPath; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/MoveByPath;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.MoveByPath make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 15 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByPath; */
/* invoke-direct {v0}, Lcom/wiyun/engine/actions/MoveByPath;-><init>()V */
} // .end method
private native void nativeGetPinPoint ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void addPoint ( Float p0, Float p1, Float p2 ) {
} // .end method
public native void clearPinPoint ( ) {
} // .end method
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 34 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByPath; */
v1 = (( com.wiyun.engine.actions.MoveByPath ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveByPath;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveByPath;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.MoveByPath ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveByPath;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public native Float getPinAngleDelta ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getPinPoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 135 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 136 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/MoveByPath;->nativeGetPinPoint(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 137 */
} // .end method
public native Integer getPointCount ( ) {
} // .end method
public native getPoints ( ) {
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 39 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByPath; */
v1 = (( com.wiyun.engine.actions.MoveByPath ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveByPath;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveByPath;-><init>(I)V */
} // .end method
public native void setAutoRotate ( Boolean p0, Float p1 ) {
} // .end method
public native void setPinAngleDelta ( Float p0 ) {
} // .end method
public native void setPinPoint ( Float p0, Float p1 ) {
} // .end method
public void setPinPoint ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 105 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.actions.MoveByPath ) p0 ).setPinPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/actions/MoveByPath;->setPinPoint(FF)V
/* .line 106 */
return;
} // .end method
