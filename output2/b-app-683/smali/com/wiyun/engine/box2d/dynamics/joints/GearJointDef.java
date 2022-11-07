public class com.wiyun.engine.box2d.dynamics.joints.GearJointDef extends com.wiyun.engine.box2d.dynamics.joints.JointDef {
	 /* .source "GearJointDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.GearJointDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>()V */
		 /* .line 9 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/GearJointDef;->nativeNew()V */
		 /* .line 10 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.GearJointDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/JointDef;-><init>(I)V */
		 /* .line 16 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.GearJointDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 5 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/GearJointDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/joints/GearJointDef;-><init>()V */
	 } // .end method
	 private native void nativeNew ( ) {
	 } // .end method
	 /* # virtual methods */
	 public native Integer getJoint1 ( ) {
	 } // .end method
	 public native Integer getJoint2 ( ) {
	 } // .end method
	 public native Float getRatio ( ) {
	 } // .end method
	 public native void setJoint1 ( com.wiyun.engine.box2d.dynamics.joints.Joint p0 ) {
	 } // .end method
	 public native void setJoint2 ( com.wiyun.engine.box2d.dynamics.joints.Joint p0 ) {
	 } // .end method
	 public native void setRatio ( Float p0 ) {
	 } // .end method
