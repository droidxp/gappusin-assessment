public class com.wiyun.engine.box2d.dynamics.joints.MouseJoint extends com.wiyun.engine.box2d.dynamics.joints.Joint {
	 /* .source "MouseJoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.MouseJoint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>()V */
		 /* .line 11 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.MouseJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>(I)V */
		 /* .line 15 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.Joint from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.box2d.dynamics.joints.MouseJoint .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.MouseJoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 7 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/MouseJoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/joints/MouseJoint;-><init>(I)V */
} // .end method
private native void nativeGetTarget ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
/* # virtual methods */
public native Float getDampingRatio ( ) {
} // .end method
public native Float getFrequency ( ) {
} // .end method
public native Float getMaxForce ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getTarget ( ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 25 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/MouseJoint;->nativeGetTarget(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 26 */
} // .end method
public native void setDampingRatio ( Float p0 ) {
} // .end method
public native void setFrequency ( Float p0 ) {
} // .end method
public native void setMaxForce ( Float p0 ) {
} // .end method
public native void setTarget ( Float p0, Float p1 ) {
} // .end method
public void setTarget ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 20 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.box2d.dynamics.joints.MouseJoint ) p0 ).setTarget ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/box2d/dynamics/joints/MouseJoint;->setTarget(FF)V
/* .line 21 */
return;
} // .end method
