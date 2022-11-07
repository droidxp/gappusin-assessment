public class com.wiyun.engine.box2d.dynamics.joints.PulleyJointDef extends com.wiyun.engine.box2d.dynamics.joints.JointDef {
	 /* .source "PulleyJointDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.PulleyJointDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>()V */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/PulleyJointDef;->nativeNew()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.PulleyJointDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>(I)V */
		 /* .line 19 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.PulleyJointDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/PulleyJointDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PulleyJointDef;-><init>()V */
	 } // .end method
	 private native void nativeGetGroundAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeGetGroundAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeGetLocalAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeGetLocalAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeNew ( ) {
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint getGroundAnchorA ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 53 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 54 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PulleyJointDef;->nativeGetGroundAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 55 */
	 } // .end method
	 public native Float getLengthA ( ) {
	 } // .end method
	 public native Float getLengthB ( ) {
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAnchorA ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 77 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 78 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PulleyJointDef;->nativeGetLocalAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 79 */
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAnchorB ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 90 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 91 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PulleyJointDef;->nativeGetLocalAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 92 */
	 } // .end method
	 public native Float getRatio ( ) {
	 } // .end method
	 public native void initialize ( com.wiyun.engine.box2d.dynamics.Body p0, com.wiyun.engine.box2d.dynamics.Body p1, com.wiyun.engine.types.WYPoint p2, com.wiyun.engine.types.WYPoint p3, com.wiyun.engine.types.WYPoint p4, com.wiyun.engine.types.WYPoint p5, Float p6 ) {
	 } // .end method
	 public native void setGroundAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 public com.wiyun.engine.types.WYPoint setGroundAnchorB ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 64 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 65 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PulleyJointDef;->nativeGetGroundAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 66 */
	 } // .end method
	 public native void setGroundAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 public native void setLengthA ( Float p0 ) {
	 } // .end method
	 public native void setLengthB ( Float p0 ) {
	 } // .end method
	 public native void setLocalAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 public native void setLocalAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 public native void setRatio ( Float p0 ) {
	 } // .end method
