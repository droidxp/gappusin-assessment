public class com.wiyun.engine.actions.Lagrange extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "Lagrange.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.Lagrange ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "config" # Lcom/wiyun/engine/types/WYLagrangeConfig; */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 34 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Lagrange;->nativeInit(FLcom/wiyun/engine/types/WYLagrangeConfig;)V */
		 /* .line 35 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.Lagrange ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 42 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 43 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.Lagrange .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Lagrange from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 38 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Lagrange; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Lagrange;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Lagrange make ( Float p0, com.wiyun.engine.types.WYLagrangeConfig p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "config" # Lcom/wiyun/engine/types/WYLagrangeConfig; */
/* .prologue */
/* .line 30 */
/* new-instance v0, Lcom/wiyun/engine/actions/Lagrange; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/Lagrange;-><init>(FLcom/wiyun/engine/types/WYLagrangeConfig;)V */
} // .end method
private native void nativeGetPinPoint ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.types.WYLagrangeConfig p1 ) {
} // .end method
/* # virtual methods */
public native void clearPinPoint ( ) {
} // .end method
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 49 */
/* new-instance v0, Lcom/wiyun/engine/actions/Lagrange; */
v1 = (( com.wiyun.engine.actions.Lagrange ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Lagrange;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Lagrange;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.Lagrange ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Lagrange;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public native Float getPinAngleDelta ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getPinPoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 117 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 118 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/Lagrange;->nativeGetPinPoint(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 119 */
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 54 */
/* new-instance v0, Lcom/wiyun/engine/actions/Lagrange; */
v1 = (( com.wiyun.engine.actions.Lagrange ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Lagrange;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Lagrange;-><init>(I)V */
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
/* .line 87 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.actions.Lagrange ) p0 ).setPinPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/actions/Lagrange;->setPinPoint(FF)V
/* .line 88 */
return;
} // .end method
