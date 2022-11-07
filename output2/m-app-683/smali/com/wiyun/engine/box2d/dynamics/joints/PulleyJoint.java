public class com.wiyun.engine.box2d.dynamics.joints.PulleyJoint extends com.wiyun.engine.box2d.dynamics.joints.Joint {
	 /* .source "PulleyJoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.PulleyJoint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>()V */
		 /* .line 11 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.PulleyJoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>(I)V */
		 /* .line 15 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.Joint from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.box2d.dynamics.joints.PulleyJoint .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.PulleyJoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 7 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/PulleyJoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/joints/PulleyJoint;-><init>(I)V */
} // .end method
private native void nativeGetGroundAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetGroundAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPoint getGroundAnchorA ( ) {
/* .locals 1 */
/* .prologue */
/* .line 21 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 22 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PulleyJoint;->nativeGetGroundAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 23 */
} // .end method
public com.wiyun.engine.types.WYPoint getGroundAnchorB ( ) {
/* .locals 1 */
/* .prologue */
/* .line 32 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 33 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/PulleyJoint;->nativeGetGroundAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 34 */
} // .end method
public native Float getLengthA ( ) {
} // .end method
public native Float getLengthB ( ) {
} // .end method
public native Float getRatio ( ) {
} // .end method
