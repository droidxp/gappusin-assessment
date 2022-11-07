public class com.wiyun.engine.box2d.dynamics.joints.PrismaticJointDef extends com.wiyun.engine.box2d.dynamics.joints.JointDef {
	 /* .source "PrismaticJointDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.PrismaticJointDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>()V */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/PrismaticJointDef;->nativeNew()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.PrismaticJointDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>(I)V */
		 /* .line 19 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.PrismaticJointDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/PrismaticJointDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PrismaticJointDef;-><init>()V */
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
	 public com.wiyun.engine.types.WYPoint getLocalAnchorA ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 48 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 49 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PrismaticJointDef;->nativeGetLocalAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 50 */
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAnchorB ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 61 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 62 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PrismaticJointDef;->nativeGetLocalAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 63 */
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAxisA ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 72 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 73 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PrismaticJointDef;->nativeGetLocalAxisA(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 74 */
	 } // .end method
	 public native Float getLowerTranslation ( ) {
	 } // .end method
	 public native Float getMaxMotorForce ( ) {
	 } // .end method
	 public native Float getMotorSpeed ( ) {
	 } // .end method
	 public native Float getReferenceAngle ( ) {
	 } // .end method
	 public native Float getUpperTranslation ( ) {
	 } // .end method
	 public native void initialize ( com.wiyun.engine.box2d.dynamics.Body p0, com.wiyun.engine.box2d.dynamics.Body p1, Float p2, Float p3, Float p4, Float p5 ) {
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
	 public native void setLocalAnchorB ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setLocalAxisA ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setLowerTranslation ( Float p0 ) {
	 } // .end method
	 public native void setMaxMotorForce ( Float p0 ) {
	 } // .end method
	 public native void setMotorSpeed ( Float p0 ) {
	 } // .end method
	 public native void setReferenceAngle ( Float p0 ) {
	 } // .end method
	 public native void setUpperTranslation ( Float p0 ) {
	 } // .end method
