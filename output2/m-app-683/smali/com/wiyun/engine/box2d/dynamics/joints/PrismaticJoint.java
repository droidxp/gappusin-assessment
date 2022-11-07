public class com.wiyun.engine.box2d.dynamics.joints.PrismaticJoint extends com.wiyun.engine.box2d.dynamics.joints.Joint {
	 /* .source "PrismaticJoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.PrismaticJoint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>()V */
		 /* .line 12 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.PrismaticJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>(I)V */
		 /* .line 16 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.Joint from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.box2d.dynamics.joints.PrismaticJoint .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.PrismaticJoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/PrismaticJoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/joints/PrismaticJoint;-><init>(I)V */
} // .end method
private native void nativeGetLocalAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetLocalAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetLocalAxisA ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
/* # virtual methods */
public native void enableLimit ( Boolean p0 ) {
} // .end method
public native void enableMotor ( Boolean p0 ) {
} // .end method
public native Float getJointSpeed ( ) {
} // .end method
public native Float getJointTranslation ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getLocalAnchorA ( ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 25 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PrismaticJoint;->nativeGetLocalAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 26 */
} // .end method
public com.wiyun.engine.types.WYPoint getLocalAnchorB ( ) {
/* .locals 1 */
/* .prologue */
/* .line 37 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 38 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PrismaticJoint;->nativeGetLocalAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 39 */
} // .end method
public com.wiyun.engine.types.WYPoint getLocalAxisA ( ) {
/* .locals 1 */
/* .prologue */
/* .line 48 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 49 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PrismaticJoint;->nativeGetLocalAxisA(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 50 */
} // .end method
public native Float getLowerLimit ( ) {
} // .end method
public native Float getMaxMotorForce ( ) {
} // .end method
public native Float getMotorForce ( Float p0 ) {
} // .end method
public native Float getMotorSpeed ( ) {
} // .end method
public native Float getReferenceAngle ( ) {
} // .end method
public native Float getUpperLimit ( ) {
} // .end method
public native Boolean isLimitEnabled ( ) {
} // .end method
public native Boolean isMotorEnabled ( ) {
} // .end method
public native void setLimits ( Float p0, Float p1 ) {
} // .end method
public native void setMaxMotorForce ( Float p0 ) {
} // .end method
public native void setMotorSpeed ( Float p0 ) {
} // .end method
