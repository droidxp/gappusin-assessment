public class com.wiyun.engine.box2d.dynamics.joints.RopeJointDef extends com.wiyun.engine.box2d.dynamics.joints.JointDef {
	 /* .source "RopeJointDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.RopeJointDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>()V */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/RopeJointDef;->nativeNew()V */
		 /* .line 12 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.RopeJointDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>(I)V */
		 /* .line 18 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.RopeJointDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 7 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/RopeJointDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/joints/RopeJointDef;-><init>()V */
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
		 /* .line 36 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 37 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/RopeJointDef;->nativeGetLocalAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 38 */
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAnchorB ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 49 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 50 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/RopeJointDef;->nativeGetLocalAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 51 */
	 } // .end method
	 public native Float getMaxLength ( ) {
	 } // .end method
	 public native void setLocalAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 public native void setLocalAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 public native void setMaxLength ( Float p0 ) {
	 } // .end method
