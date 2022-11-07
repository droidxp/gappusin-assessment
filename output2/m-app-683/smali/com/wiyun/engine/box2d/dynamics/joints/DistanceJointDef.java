public class com.wiyun.engine.box2d.dynamics.joints.DistanceJointDef extends com.wiyun.engine.box2d.dynamics.joints.JointDef {
	 /* .source "DistanceJointDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.DistanceJointDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>()V */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/DistanceJointDef;->nativeNew()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.DistanceJointDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>(I)V */
		 /* .line 19 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.DistanceJointDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/DistanceJointDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/joints/DistanceJointDef;-><init>()V */
	 } // .end method
	 private native void nativeGetLocalAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeGetLocalAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeNew ( ) {
	 } // .end method
	 /* # virtual methods */
	 public native Float getDampingRatio ( ) {
	 } // .end method
	 public native Float getFrequencyHz ( ) {
	 } // .end method
	 public native Float getLength ( ) {
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAnchorA ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 73 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 74 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/DistanceJointDef;->nativeGetLocalAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 75 */
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getLocalAnchorB ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 86 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 87 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/DistanceJointDef;->nativeGetLocalAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 88 */
	 } // .end method
	 public native void initialize ( com.wiyun.engine.box2d.dynamics.Body p0, com.wiyun.engine.box2d.dynamics.Body p1, Float p2, Float p3, Float p4, Float p5 ) {
	 } // .end method
	 public native void setDampingRatio ( Float p0 ) {
	 } // .end method
	 public native void setFrequencyHz ( Float p0 ) {
	 } // .end method
	 public native void setLength ( Float p0 ) {
	 } // .end method
	 public native void setLocalAnchorA ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setLocalAnchorB ( Float p0, Float p1 ) {
	 } // .end method
