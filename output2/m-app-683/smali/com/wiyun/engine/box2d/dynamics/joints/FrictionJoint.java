public class com.wiyun.engine.box2d.dynamics.joints.FrictionJoint extends com.wiyun.engine.box2d.dynamics.joints.Joint {
	 /* .source "FrictionJoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.FrictionJoint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>()V */
		 /* .line 12 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.FrictionJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>(I)V */
		 /* .line 16 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.FrictionJoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/FrictionJoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/joints/FrictionJoint;-><init>(I)V */
} // .end method
public static com.wiyun.engine.box2d.dynamics.joints.Joint from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.box2d.dynamics.joints.FrictionJoint .from ( p0 );
} // .end method
private native void nativeGetLocalAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetLocalAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPoint getLocalAnchorA ( ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 25 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/FrictionJoint;->nativeGetLocalAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 26 */
} // .end method
public com.wiyun.engine.types.WYPoint getLocalAnchorB ( ) {
/* .locals 1 */
/* .prologue */
/* .line 37 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 38 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/FrictionJoint;->nativeGetLocalAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 39 */
} // .end method
public native Float getMaxForce ( ) {
} // .end method
public native Float getMaxTorque ( ) {
} // .end method
public native void setMaxForce ( Float p0 ) {
} // .end method
public native void setMaxTorque ( Float p0 ) {
} // .end method
