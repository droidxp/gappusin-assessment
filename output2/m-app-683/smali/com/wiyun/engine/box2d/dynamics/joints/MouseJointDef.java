public class com.wiyun.engine.box2d.dynamics.joints.MouseJointDef extends com.wiyun.engine.box2d.dynamics.joints.JointDef {
	 /* .source "MouseJointDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.MouseJointDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>()V */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/MouseJointDef;->nativeNew()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.MouseJointDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>(I)V */
		 /* .line 19 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.MouseJointDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/MouseJointDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/joints/MouseJointDef;-><init>()V */
	 } // .end method
	 private native void nativeGetTarget ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeNew ( ) {
	 } // .end method
	 /* # virtual methods */
	 public native Float getDampingRatio ( ) {
	 } // .end method
	 public native Float getFrequencyHz ( ) {
	 } // .end method
	 public native Float getMaxForce ( ) {
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getTarget ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 33 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 34 */
		 /* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/MouseJointDef;->nativeGetTarget(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 35 */
	 } // .end method
	 public native void setDampingRatio ( Float p0 ) {
	 } // .end method
	 public native void setFrequencyHz ( Float p0 ) {
	 } // .end method
	 public native void setMaxForce ( Float p0 ) {
	 } // .end method
	 public native void setTarget ( Float p0, Float p1 ) {
	 } // .end method
