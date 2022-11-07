public class com.wiyun.engine.actions.Hypotrochoid extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "Hypotrochoid.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.Hypotrochoid ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "config" # Lcom/wiyun/engine/types/WYHypotrochoidConfig; */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 41 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Hypotrochoid;->nativeInit(FLcom/wiyun/engine/types/WYHypotrochoidConfig;)V */
		 /* .line 42 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.Hypotrochoid ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 49 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 50 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.Hypotrochoid .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Hypotrochoid from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 45 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Hypotrochoid; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Hypotrochoid;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Hypotrochoid make ( Float p0, com.wiyun.engine.types.WYHypotrochoidConfig p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "c" # Lcom/wiyun/engine/types/WYHypotrochoidConfig; */
/* .prologue */
/* .line 37 */
/* new-instance v0, Lcom/wiyun/engine/actions/Hypotrochoid; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/Hypotrochoid;-><init>(FLcom/wiyun/engine/types/WYHypotrochoidConfig;)V */
} // .end method
private native void nativeGetPinPoint ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.types.WYHypotrochoidConfig p1 ) {
} // .end method
/* # virtual methods */
public native void clearPinPoint ( ) {
} // .end method
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 56 */
/* new-instance v0, Lcom/wiyun/engine/actions/Hypotrochoid; */
v1 = (( com.wiyun.engine.actions.Hypotrochoid ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Hypotrochoid;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Hypotrochoid;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.Hypotrochoid ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Hypotrochoid;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public native Float getPinAngleDelta ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getPinPoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 124 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 125 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/Hypotrochoid;->nativeGetPinPoint(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 126 */
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 1 */
/* .prologue */
/* .line 61 */
int v0 = 0; // const/4 v0, 0x0
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
/* .line 94 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.actions.Hypotrochoid ) p0 ).setPinPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/actions/Hypotrochoid;->setPinPoint(FF)V
/* .line 95 */
return;
} // .end method
