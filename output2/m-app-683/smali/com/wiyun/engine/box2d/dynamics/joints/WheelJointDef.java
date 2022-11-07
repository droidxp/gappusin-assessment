public class com.wiyun.engine.box2d.dynamics.joints.WheelJointDef extends com.wiyun.engine.box2d.dynamics.joints.JointDef {
	 /* .source "WheelJointDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.WheelJointDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>()V */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/WheelJointDef;->nativeNew()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.WheelJointDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>(I)V */
		 /* .line 19 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.WheelJointDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/WheelJointDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/joints/WheelJointDef;-><init>()V */
	 } // .end method
	 private native void nativeGetLocalAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeGetLocalAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeGetLocalAxisA ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeNew ( ) {
	 } // .end method
	 /* # virtual methods */
	 public native Float getDampingRatio ( ) {
	 } // .end method
	 public native Float getFrequency ( ) {
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAnchorA ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 80 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 81 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/WheelJointDef;->nativeGetLocalAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 82 */
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAnchorB ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 93 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 94 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/WheelJointDef;->nativeGetLocalAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 95 */
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAxisA ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 104 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 105 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/WheelJointDef;->nativeGetLocalAxisA(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 106 */
	 } // .end method
	 public native Float getMaxMotorTorque ( ) {
	 } // .end method
	 public native Float getMotorSpeed ( ) {
	 } // .end method
	 public native void initialize ( com.wiyun.engine.box2d.dynamics.Body p0, com.wiyun.engine.box2d.dynamics.Body p1, Float p2, Float p3, Float p4, Float p5 ) {
	 } // .end method
	 public native Boolean isEnableMotor ( ) {
	 } // .end method
	 public native void setDampingRatio ( Float p0 ) {
	 } // .end method
	 public native void setEnableMotor ( Boolean p0 ) {
	 } // .end method
	 public native void setFrequency ( Float p0 ) {
	 } // .end method
	 public native void setLocalAnchorA ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setLocalAnchorB ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setLocalAxisA ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setMaxMotorTorque ( Float p0 ) {
	 } // .end method
	 public native void setMotorSpeed ( Float p0 ) {
	 } // .end method
