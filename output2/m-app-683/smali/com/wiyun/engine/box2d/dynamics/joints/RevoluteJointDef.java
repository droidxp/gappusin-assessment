public class com.wiyun.engine.box2d.dynamics.joints.RevoluteJointDef extends com.wiyun.engine.box2d.dynamics.joints.JointDef {
	 /* .source "RevoluteJointDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.RevoluteJointDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>()V */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/RevoluteJointDef;->nativeNew()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.RevoluteJointDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>(I)V */
		 /* .line 19 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.RevoluteJointDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/RevoluteJointDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/joints/RevoluteJointDef;-><init>()V */
	 } // .end method
	 private native void nativeGetLocalAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeGetLocalAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeNew ( ) {
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint getLocalAnchorA ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 53 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 54 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/RevoluteJointDef;->nativeGetLocalAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 55 */
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAnchorB ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 66 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 67 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/RevoluteJointDef;->nativeGetLocalAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 68 */
	 } // .end method
	 public native Float getLowerAngle ( ) {
	 } // .end method
	 public native Float getMaxMotorTorque ( ) {
	 } // .end method
	 public native Float getMotorSpeed ( ) {
	 } // .end method
	 public native Float getReferenceAngle ( ) {
	 } // .end method
	 public native Float getUpperAngle ( ) {
	 } // .end method
	 public native void initialize ( com.wiyun.engine.box2d.dynamics.Body p0, com.wiyun.engine.box2d.dynamics.Body p1, Float p2, Float p3 ) {
	 } // .end method
	 public native Boolean isEnableLimit ( ) {
	 } // .end method
	 public native Boolean isEnableMotor ( ) {
	 } // .end method
	 public native void setEnableLimit ( Boolean p0 ) {
	 } // .end method
	 public native void setEnableMotor ( Boolean p0 ) {
	 } // .end method
	 public native void setLocalAnchorA ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setLocalAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 public native void setLocalAnchorB ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setLocalAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 public native void setLowerAngle ( Float p0 ) {
	 } // .end method
	 public native void setMaxMotorTorque ( Float p0 ) {
	 } // .end method
	 public native void setMotorSpeed ( Float p0 ) {
	 } // .end method
	 public native void setReferenceAngle ( Float p0 ) {
	 } // .end method
	 public native void setUpperAngle ( Float p0 ) {
	 } // .end method
