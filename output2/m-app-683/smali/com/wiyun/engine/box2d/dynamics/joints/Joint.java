public class com.wiyun.engine.box2d.dynamics.joints.Joint extends com.wiyun.engine.BaseObject {
	 /* .source "Joint.java" */
	 /* # static fields */
	 public static final Integer LIMIT_STATE_AT_LOWER;
	 public static final Integer LIMIT_STATE_AT_UPPER;
	 public static final Integer LIMIT_STATE_EQUAL;
	 public static final Integer LIMIT_STATE_INACTIVE;
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.joints.Joint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 19 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.joints.Joint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 23 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.joints.Joint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 15 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/joints/Joint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;-><init>(I)V */
} // .end method
private native void nativeGetAnchorA ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetAnchorB ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native Integer nativeGetBodyA ( ) {
} // .end method
private native Integer nativeGetBodyB ( ) {
} // .end method
private native void nativeGetReactionForce ( com.wiyun.engine.types.WYPoint p0, Float p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPoint getAnchorA ( ) {
/* .locals 1 */
/* .prologue */
/* .line 53 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 54 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;->nativeGetAnchorA(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 55 */
} // .end method
public com.wiyun.engine.types.WYPoint getAnchorB ( ) {
/* .locals 1 */
/* .prologue */
/* .line 66 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 67 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;->nativeGetAnchorB(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 68 */
} // .end method
public com.wiyun.engine.box2d.dynamics.Body getBodyA ( ) {
/* .locals 1 */
/* .prologue */
/* .line 31 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;->nativeGetBodyA()I */
com.wiyun.engine.box2d.dynamics.Body .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.Body getBodyB ( ) {
/* .locals 1 */
/* .prologue */
/* .line 42 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;->nativeGetBodyB()I */
com.wiyun.engine.box2d.dynamics.Body .from ( v0 );
} // .end method
public com.wiyun.engine.types.WYPoint getReactionForce ( Float p0 ) {
/* .locals 1 */
/* .param p1, "inv_dt" # F */
/* .prologue */
/* .line 79 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 80 */
/* .local v0, "a":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0, p1}, Lcom/wiyun/engine/box2d/dynamics/joints/Joint;->nativeGetReactionForce(Lcom/wiyun/engine/types/WYPoint;F)V */
/* .line 81 */
} // .end method
public native Float getReactionTorque ( Float p0 ) {
} // .end method
public native java.lang.Object getUserData ( ) {
} // .end method
public native void setUserData ( java.lang.Object p0 ) {
} // .end method
