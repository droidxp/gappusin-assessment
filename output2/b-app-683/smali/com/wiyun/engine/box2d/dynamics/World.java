public class com.wiyun.engine.box2d.dynamics.World extends com.wiyun.engine.BaseObject {
	 /* .source "World.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/box2d/dynamics/World$IContactListener;, */
	 /* Lcom/wiyun/engine/box2d/dynamics/World$IDestructionListener;, */
	 /* Lcom/wiyun/engine/box2d/dynamics/World$IQueryCallback;, */
	 /* Lcom/wiyun/engine/box2d/dynamics/World$IRayCastCallback; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.box2d.dynamics.World ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 118 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
	 /* .line 119 */
	 return;
} // .end method
protected com.wiyun.engine.box2d.dynamics.World ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 122 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
	 /* .line 123 */
	 return;
} // .end method
public static com.wiyun.engine.box2d.dynamics.World from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 115 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/World; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/World;-><init>(I)V */
} // .end method
private native Integer nativeCreateBody ( com.wiyun.engine.box2d.dynamics.BodyDef p0 ) {
} // .end method
private native Integer nativeGetFirstBody ( ) {
} // .end method
private native Integer nativeGetFirstContact ( ) {
} // .end method
private native Integer nativeGetFirstJoint ( ) {
} // .end method
private native void nativeGetGravity ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
/* # virtual methods */
public native void clearForces ( ) {
} // .end method
public com.wiyun.engine.box2d.dynamics.Body createBody ( com.wiyun.engine.box2d.dynamics.BodyDef p0 ) {
/* .locals 1 */
/* .param p1, "bd" # Lcom/wiyun/engine/box2d/dynamics/BodyDef; */
/* .prologue */
/* .line 147 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/World;->nativeCreateBody(Lcom/wiyun/engine/box2d/dynamics/BodyDef;)I */
com.wiyun.engine.box2d.dynamics.Body .from ( v0 );
} // .end method
public native Integer createController ( com.wiyun.engine.box2d.controllers.ControllerDef p0 ) {
} // .end method
public native Integer createJoint ( com.wiyun.engine.box2d.dynamics.joints.JointDef p0 ) {
} // .end method
public native void destroyBody ( com.wiyun.engine.box2d.dynamics.Body p0 ) {
} // .end method
public native void destroyController ( com.wiyun.engine.box2d.controllers.Controller p0 ) {
} // .end method
public native void destroyJoint ( com.wiyun.engine.box2d.dynamics.joints.Joint p0 ) {
} // .end method
public native Boolean getAllowSleeping ( ) {
} // .end method
public native Boolean getAutoClearForces ( ) {
} // .end method
public native Integer getBodyCount ( ) {
} // .end method
public native Integer getContactCount ( ) {
} // .end method
public com.wiyun.engine.box2d.dynamics.Body getFirstBody ( ) {
/* .locals 1 */
/* .prologue */
/* .line 213 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/World;->nativeGetFirstBody()I */
com.wiyun.engine.box2d.dynamics.Body .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.contacts.Contact getFirstContact ( ) {
/* .locals 1 */
/* .prologue */
/* .line 260 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/World;->nativeGetFirstContact()I */
com.wiyun.engine.box2d.dynamics.contacts.Contact .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.joints.Joint getFirstJoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 249 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/World;->nativeGetFirstJoint()I */
com.wiyun.engine.box2d.dynamics.joints.Joint .from ( v0 );
} // .end method
public com.wiyun.engine.types.WYPoint getGravity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 314 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 315 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/World;->nativeGetGravity(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 316 */
} // .end method
public native Integer getJointCount ( ) {
} // .end method
public native Integer getProxyCount ( ) {
} // .end method
public native Boolean getSubStepping ( ) {
} // .end method
public native Boolean getWarmStarting ( ) {
} // .end method
public native Boolean isLocked ( ) {
} // .end method
public native void queryAABB ( com.wiyun.engine.box2d.dynamics.World$IQueryCallback p0, Float p1, Float p2, Float p3, Float p4 ) {
} // .end method
public native void rayCast ( com.wiyun.engine.box2d.dynamics.World$IRayCastCallback p0, Float p1, Float p2, Float p3, Float p4 ) {
} // .end method
public native void setAllowSleeping ( Boolean p0 ) {
} // .end method
public native void setAutoClearForces ( Boolean p0 ) {
} // .end method
public native void setContactListener ( com.wiyun.engine.box2d.dynamics.World$IContactListener p0 ) {
} // .end method
public native void setContinuousPhysics ( Boolean p0 ) {
} // .end method
public native void setDestructionListener ( com.wiyun.engine.box2d.dynamics.World$IDestructionListener p0 ) {
} // .end method
public native void setGravity ( Float p0, Float p1 ) {
} // .end method
public native void setNoSolidDraw ( Boolean p0 ) {
} // .end method
public native void setSubStepping ( Boolean p0 ) {
} // .end method
public native void setWarmStarting ( Boolean p0 ) {
} // .end method
public native void step ( Float p0, Integer p1, Integer p2 ) {
} // .end method
