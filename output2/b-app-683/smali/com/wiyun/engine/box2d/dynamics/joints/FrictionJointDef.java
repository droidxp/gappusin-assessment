public class com.wiyun.engine.box2d.dynamics.joints.FrictionJointDef extends com.wiyun.engine.box2d.dynamics.joints.JointDef {
	 /* .source "FrictionJointDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.FrictionJointDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>()V */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/FrictionJointDef;->nativeNew()V */
		 /* .line 12 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.FrictionJointDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>(I)V */
		 /* .line 18 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.FrictionJointDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 7 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/FrictionJointDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/joints/FrictionJointDef;-><init>()V */
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
		 /* .line 70 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 71 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/FrictionJointDef;->nativeGetLocalAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 72 */
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAnchorB ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 83 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 84 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/FrictionJointDef;->nativeGetLocalAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 85 */
	 } // .end method
	 public native Float getMaxForce ( ) {
	 } // .end method
	 public native Float getMaxTorque ( ) {
	 } // .end method
	 public native void setLocalAnchorA ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setLocalAnchorB ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setMaxForce ( Float p0 ) {
	 } // .end method
	 public native void setMaxTorque ( Float p0 ) {
	 } // .end method
