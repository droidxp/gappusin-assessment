public class com.wiyun.engine.box2d.dynamics.joints.WheelJoint extends com.wiyun.engine.box2d.dynamics.joints.Joint {
	 /* .source "WheelJoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.WheelJoint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>()V */
		 /* .line 11 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.WheelJoint ( ) {
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
		 com.wiyun.engine.box2d.dynamics.joints.WheelJoint .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.WheelJoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 7 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/WheelJoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/joints/WheelJoint;-><init>(I)V */
} // .end method
private native void nativeGetLocalAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetLocalAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetLocalAxisA ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
/* # virtual methods */
public native void enableMotor ( Boolean p0 ) {
} // .end method
public native Float getJointSpeed ( ) {
} // .end method
public native Float getJointTranslation ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getLocalAnchorA ( ) {
/* .locals 1 */
/* .prologue */
/* .line 23 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 24 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/WheelJoint;->nativeGetLocalAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 25 */
} // .end method
public com.wiyun.engine.types.WYPoint getLocalAnchorB ( ) {
/* .locals 1 */
/* .prologue */
/* .line 36 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 37 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/WheelJoint;->nativeGetLocalAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 38 */
} // .end method
public com.wiyun.engine.types.WYPoint getLocalAxisA ( ) {
/* .locals 1 */
/* .prologue */
/* .line 47 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 48 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/WheelJoint;->nativeGetLocalAxisA(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 49 */
} // .end method
public native Float getMaxMotorTorque ( ) {
} // .end method
public native Float getMotorSpeed ( ) {
} // .end method
public native Float getMotorTorque ( Float p0 ) {
} // .end method
public native Float getSpringDampingRatio ( ) {
} // .end method
public native Float getSpringFrequencyHz ( ) {
} // .end method
public native Boolean isMotorEnabled ( ) {
} // .end method
public native void setMaxMotorTorque ( Float p0 ) {
} // .end method
public native void setMotorSpeed ( Float p0 ) {
} // .end method
public native void setSpringDampingRatio ( Float p0 ) {
} // .end method
public native void setSpringFrequencyHz ( Float p0 ) {
} // .end method
