public class com.wiyun.engine.box2d.dynamics.Body extends com.wiyun.engine.BaseObject {
	 /* .source "Body.java" */
	 /* # static fields */
	 public static final Integer TYPE_DYNAMIC;
	 public static final Integer TYPE_KINEMATIC;
	 public static final Integer TYPE_STATIC;
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.Body ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 32 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.Body ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 35 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 36 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.Body from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 28 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/Body; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/Body;-><init>(I)V */
} // .end method
private native Integer nativeCreateFixture ( com.wiyun.engine.box2d.collision.Shape p0, Float p1 ) {
} // .end method
private native Integer nativeCreateFixture ( com.wiyun.engine.box2d.dynamics.FixtureDef p0 ) {
} // .end method
private native Integer nativeGetContactEdge ( ) {
} // .end method
private native Integer nativeGetFirstFixture ( ) {
} // .end method
private native Integer nativeGetFirstJointEdge ( ) {
} // .end method
private native void nativeGetLinearVelocity ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetLinearVelocityFromLocalPoint ( com.wiyun.engine.types.WYPoint p0, Float p1, Float p2 ) {
} // .end method
private native void nativeGetLinearVelocityFromWorldPoint ( com.wiyun.engine.types.WYPoint p0, Float p1, Float p2 ) {
} // .end method
private native void nativeGetLocalCenter ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetLocalPoint ( com.wiyun.engine.types.WYPoint p0, Float p1, Float p2 ) {
} // .end method
private native void nativeGetLocalVector ( com.wiyun.engine.types.WYPoint p0, Float p1, Float p2 ) {
} // .end method
private native void nativeGetMassData ( com.wiyun.engine.box2d.collision.MassData p0 ) {
} // .end method
private native Integer nativeGetNext ( ) {
} // .end method
private native void nativeGetPosition ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetTransform ( com.wiyun.engine.box2d.common.Transform p0 ) {
} // .end method
private native Integer nativeGetWorld ( ) {
} // .end method
private native void nativeGetWorldCenter ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetWorldPoint ( com.wiyun.engine.types.WYPoint p0, Float p1, Float p2 ) {
} // .end method
private native void nativeGetWorldVector ( com.wiyun.engine.types.WYPoint p0, Float p1, Float p2 ) {
} // .end method
/* # virtual methods */
public native void applyAngularImpulse ( Float p0 ) {
} // .end method
public native void applyForce ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
} // .end method
public native void applyForceToCenter ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
public native void applyLinearImpulse ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
} // .end method
public native void applyTorque ( Float p0 ) {
} // .end method
public com.wiyun.engine.box2d.dynamics.Fixture createFixture ( com.wiyun.engine.box2d.collision.Shape p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "shape" # Lcom/wiyun/engine/box2d/collision/Shape; */
/* .param p2, "density" # F */
/* .prologue */
/* .line 56 */
v0 = /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeCreateFixture(Lcom/wiyun/engine/box2d/collision/Shape;F)I */
com.wiyun.engine.box2d.dynamics.Fixture .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.Fixture createFixture ( com.wiyun.engine.box2d.dynamics.FixtureDef p0 ) {
/* .locals 1 */
/* .param p1, "fd" # Lcom/wiyun/engine/box2d/dynamics/FixtureDef; */
/* .prologue */
/* .line 45 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeCreateFixture(Lcom/wiyun/engine/box2d/dynamics/FixtureDef;)I */
com.wiyun.engine.box2d.dynamics.Fixture .from ( v0 );
} // .end method
public native void destroyFixture ( com.wiyun.engine.box2d.dynamics.Fixture p0 ) {
} // .end method
public native Float getAngle ( ) {
} // .end method
public native Float getAngularDamping ( ) {
} // .end method
public native Float getAngularVelocity ( ) {
} // .end method
public com.wiyun.engine.box2d.dynamics.contacts.ContactEdge getFirstContactEdge ( ) {
/* .locals 1 */
/* .prologue */
/* .line 559 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetContactEdge()I */
com.wiyun.engine.box2d.dynamics.contacts.ContactEdge .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.Fixture getFirstFixture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 537 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetFirstFixture()I */
com.wiyun.engine.box2d.dynamics.Fixture .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.joints.JointEdge getFirstJointEdge ( ) {
/* .locals 1 */
/* .prologue */
/* .line 548 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetFirstJointEdge()I */
com.wiyun.engine.box2d.dynamics.joints.JointEdge .from ( v0 );
} // .end method
public native Float getInertia ( ) {
} // .end method
public native Float getLinearDamping ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getLinearVelocity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 198 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 199 */
/* .local v0, "v":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetLinearVelocity(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 200 */
} // .end method
public com.wiyun.engine.types.WYPoint getLinearVelocityFromLocalPoint ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 449 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 450 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0, p1, p2}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetLinearVelocityFromLocalPoint(Lcom/wiyun/engine/types/WYPoint;FF)V */
/* .line 451 */
} // .end method
public com.wiyun.engine.types.WYPoint getLinearVelocityFromLocalPoint ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "localPoint" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 438 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.box2d.dynamics.Body ) p0 ).getLinearVelocityFromLocalPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/box2d/dynamics/Body;->getLinearVelocityFromLocalPoint(FF)Lcom/wiyun/engine/types/WYPoint;
} // .end method
public com.wiyun.engine.types.WYPoint getLinearVelocityFromWorldPoint ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 424 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 425 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0, p1, p2}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetLinearVelocityFromWorldPoint(Lcom/wiyun/engine/types/WYPoint;FF)V */
/* .line 426 */
} // .end method
public com.wiyun.engine.types.WYPoint getLinearVelocityFromWorldPoint ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "worldPoint" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 413 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.box2d.dynamics.Body ) p0 ).getLinearVelocityFromWorldPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/box2d/dynamics/Body;->getLinearVelocityFromWorldPoint(FF)Lcom/wiyun/engine/types/WYPoint;
} // .end method
public com.wiyun.engine.types.WYPoint getLocalCenter ( ) {
/* .locals 1 */
/* .prologue */
/* .line 251 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 252 */
/* .local v0, "c":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetLocalCenter(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 253 */
} // .end method
public com.wiyun.engine.types.WYPoint getLocalPoint ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 330 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 331 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0, p1, p2}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetLocalPoint(Lcom/wiyun/engine/types/WYPoint;FF)V */
/* .line 332 */
} // .end method
public com.wiyun.engine.types.WYPoint getLocalPoint ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "position" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 319 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.box2d.dynamics.Body ) p0 ).getLocalPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/box2d/dynamics/Body;->getLocalPoint(FF)Lcom/wiyun/engine/types/WYPoint;
} // .end method
public com.wiyun.engine.types.WYPoint getLocalVector ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 399 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 400 */
/* .local v0, "v":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0, p1, p2}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetLocalVector(Lcom/wiyun/engine/types/WYPoint;FF)V */
/* .line 401 */
} // .end method
public com.wiyun.engine.types.WYPoint getLocalVector ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "worldVector" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 388 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.box2d.dynamics.Body ) p0 ).getLocalVector ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/box2d/dynamics/Body;->getLocalVector(FF)Lcom/wiyun/engine/types/WYPoint;
} // .end method
public native Float getMass ( ) {
} // .end method
public com.wiyun.engine.box2d.collision.MassData getMassData ( ) {
/* .locals 1 */
/* .prologue */
/* .line 357 */
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/MassData; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/MassData;-><init>()V */
/* .line 358 */
/* .local v0, "d":Lcom/wiyun/engine/box2d/collision/MassData; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetMassData(Lcom/wiyun/engine/box2d/collision/MassData;)V */
/* .line 359 */
} // .end method
public com.wiyun.engine.box2d.dynamics.Body getNext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 307 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetNext()I */
com.wiyun.engine.box2d.dynamics.Body .from ( v0 );
} // .end method
public com.wiyun.engine.types.WYPoint getPosition ( ) {
/* .locals 1 */
/* .prologue */
/* .line 271 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 272 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetPosition(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 273 */
} // .end method
public com.wiyun.engine.box2d.common.Transform getTransform ( ) {
/* .locals 1 */
/* .prologue */
/* .line 211 */
com.wiyun.engine.box2d.common.Transform .make ( );
/* .line 212 */
/* .local v0, "t":Lcom/wiyun/engine/box2d/common/Transform; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetTransform(Lcom/wiyun/engine/box2d/common/Transform;)V */
/* .line 213 */
} // .end method
public native Integer getType ( ) {
} // .end method
public native java.lang.Object getUserData ( ) {
} // .end method
public com.wiyun.engine.box2d.dynamics.World getWorld ( ) {
/* .locals 1 */
/* .prologue */
/* .line 570 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetWorld()I */
com.wiyun.engine.box2d.dynamics.World .from ( v0 );
} // .end method
public com.wiyun.engine.types.WYPoint getWorldCenter ( ) {
/* .locals 1 */
/* .prologue */
/* .line 238 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 239 */
/* .local v0, "c":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetWorldCenter(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 240 */
} // .end method
public com.wiyun.engine.types.WYPoint getWorldPoint ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 168 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 169 */
/* .local v0, "ret":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0, p1, p2}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetWorldPoint(Lcom/wiyun/engine/types/WYPoint;FF)V */
/* .line 170 */
} // .end method
public com.wiyun.engine.types.WYPoint getWorldPoint ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 180 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.box2d.dynamics.Body ) p0 ).getWorldPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/box2d/dynamics/Body;->getWorldPoint(FF)Lcom/wiyun/engine/types/WYPoint;
} // .end method
public com.wiyun.engine.types.WYPoint getWorldVector ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 143 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 144 */
/* .local v0, "ret":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0, p1, p2}, Lcom/wiyun/engine/box2d/dynamics/Body;->nativeGetWorldVector(Lcom/wiyun/engine/types/WYPoint;FF)V */
/* .line 145 */
} // .end method
public com.wiyun.engine.types.WYPoint getWorldVector ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 155 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.box2d.dynamics.Body ) p0 ).getWorldVector ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/box2d/dynamics/Body;->getWorldVector(FF)Lcom/wiyun/engine/types/WYPoint;
} // .end method
public native Boolean isActive ( ) {
} // .end method
public native Boolean isAwake ( ) {
} // .end method
public native Boolean isBullet ( ) {
} // .end method
public native Boolean isFixedRotation ( ) {
} // .end method
public native Boolean isSleepingAllowed ( ) {
} // .end method
public native void resetMassData ( ) {
} // .end method
public native void setActive ( Boolean p0 ) {
} // .end method
public native void setAngularDamping ( Float p0 ) {
} // .end method
public native void setAngularVelocity ( Float p0 ) {
} // .end method
public native void setAwake ( Boolean p0 ) {
} // .end method
public native void setBullet ( Boolean p0 ) {
} // .end method
public native void setFixedRotation ( Boolean p0 ) {
} // .end method
public native void setLinearDamping ( Float p0 ) {
} // .end method
public native void setLinearVelocity ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
public native void setMassData ( com.wiyun.engine.box2d.collision.MassData p0 ) {
} // .end method
public native void setSleepingAllowed ( Boolean p0 ) {
} // .end method
public native void setTransform ( Float p0, Float p1, Float p2 ) {
} // .end method
public native void setType ( Integer p0 ) {
} // .end method
public native void setUserData ( java.lang.Object p0 ) {
} // .end method
