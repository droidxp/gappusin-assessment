public class com.wiyun.engine.box2d.dynamics.joints.RopeJoint extends com.wiyun.engine.box2d.dynamics.joints.Joint {
	 /* .source "RopeJoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.RopeJoint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>()V */
		 /* .line 11 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.RopeJoint ( ) {
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
		 com.wiyun.engine.box2d.dynamics.joints.RopeJoint .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.RopeJoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 7 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/RopeJoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/joints/RopeJoint;-><init>(I)V */
} // .end method
private native void nativeGetLocalAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetLocalAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
/* # virtual methods */
public native Float getLength ( ) {
} // .end method
public native Integer getLimitState ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getLocalAnchorA ( ) {
/* .locals 1 */
/* .prologue */
/* .line 23 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 24 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/RopeJoint;->nativeGetLocalAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 25 */
} // .end method
public com.wiyun.engine.types.WYPoint getLocalAnchorB ( ) {
/* .locals 1 */
/* .prologue */
/* .line 36 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 37 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/RopeJoint;->nativeGetLocalAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 38 */
} // .end method
public native Float getMaxLength ( ) {
} // .end method
public native void setMaxLength ( Float p0 ) {
} // .end method
