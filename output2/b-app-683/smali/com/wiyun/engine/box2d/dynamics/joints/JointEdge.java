public class com.wiyun.engine.box2d.dynamics.joints.JointEdge extends com.wiyun.engine.BaseObject {
	 /* .source "JointEdge.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.JointEdge ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 12 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.JointEdge ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 16 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.JointEdge from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/JointEdge; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointEdge;-><init>(I)V */
} // .end method
/* # virtual methods */
public Integer getJoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 23 */
v0 = (( com.wiyun.engine.box2d.dynamics.joints.JointEdge ) p0 ).nativeGetJoint ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointEdge;->nativeGetJoint()I
} // .end method
public com.wiyun.engine.box2d.dynamics.joints.JointEdge getNextJointEdge ( ) {
/* .locals 1 */
/* .prologue */
/* .line 31 */
v0 = (( com.wiyun.engine.box2d.dynamics.joints.JointEdge ) p0 ).nativeGetNext ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointEdge;->nativeGetNext()I
com.wiyun.engine.box2d.dynamics.joints.JointEdge .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.Body getOther ( ) {
/* .locals 1 */
/* .prologue */
/* .line 19 */
v0 = (( com.wiyun.engine.box2d.dynamics.joints.JointEdge ) p0 ).nativeGetOther ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointEdge;->nativeGetOther()I
com.wiyun.engine.box2d.dynamics.Body .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.joints.JointEdge getPrevJointEdge ( ) {
/* .locals 1 */
/* .prologue */
/* .line 27 */
v0 = (( com.wiyun.engine.box2d.dynamics.joints.JointEdge ) p0 ).nativeGetPrev ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/JointEdge;->nativeGetPrev()I
com.wiyun.engine.box2d.dynamics.joints.JointEdge .from ( v0 );
} // .end method
public native Integer nativeGetJoint ( ) {
} // .end method
public native Integer nativeGetNext ( ) {
} // .end method
public native Integer nativeGetOther ( ) {
} // .end method
public native Integer nativeGetPrev ( ) {
} // .end method
