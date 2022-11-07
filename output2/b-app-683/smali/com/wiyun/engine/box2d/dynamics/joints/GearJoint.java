public class com.wiyun.engine.box2d.dynamics.joints.GearJoint extends com.wiyun.engine.box2d.dynamics.joints.Joint {
	 /* .source "GearJoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.GearJoint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>()V */
		 /* .line 9 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.GearJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>(I)V */
		 /* .line 13 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.GearJoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 5 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/GearJoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/joints/GearJoint;-><init>(I)V */
} // .end method
public static com.wiyun.engine.box2d.dynamics.joints.Joint from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.box2d.dynamics.joints.GearJoint .from ( p0 );
} // .end method
/* # virtual methods */
public native Integer getJoint1 ( ) {
} // .end method
public native Integer getJoint2 ( ) {
} // .end method
public native Float getRatio ( ) {
} // .end method
public native void setRatio ( Float p0 ) {
} // .end method
