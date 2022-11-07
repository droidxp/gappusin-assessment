public class com.wiyun.engine.box2d.dynamics.contacts.Contact extends com.wiyun.engine.BaseObject {
	 /* .source "Contact.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.contacts.Contact ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 14 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.contacts.Contact ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 18 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.contacts.Contact from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 10 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/contacts/Contact; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/contacts/Contact;-><init>(I)V */
} // .end method
private native Integer nativeEvaluate ( com.wiyun.engine.box2d.common.Transform p0, com.wiyun.engine.box2d.common.Transform p1 ) {
} // .end method
private native Integer nativeGetFixtureA ( ) {
} // .end method
private native Integer nativeGetFixtureB ( ) {
} // .end method
private native Integer nativeGetManifold ( ) {
} // .end method
private native Integer nativeGetNext ( ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.box2d.collision.Manifold evaluate ( com.wiyun.engine.box2d.common.Transform p0, com.wiyun.engine.box2d.common.Transform p1 ) {
/* .locals 1 */
/* .param p1, "xfA" # Lcom/wiyun/engine/box2d/common/Transform; */
/* .param p2, "xfB" # Lcom/wiyun/engine/box2d/common/Transform; */
/* .prologue */
/* .line 96 */
v0 = /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/box2d/dynamics/contacts/Contact;->nativeEvaluate(Lcom/wiyun/engine/box2d/common/Transform;Lcom/wiyun/engine/box2d/common/Transform;)I */
com.wiyun.engine.box2d.collision.Manifold .from ( v0 );
} // .end method
public native Integer getChildIndexA ( ) {
} // .end method
public native Integer getChildIndexB ( ) {
} // .end method
public com.wiyun.engine.box2d.dynamics.Fixture getFixtureA ( ) {
/* .locals 1 */
/* .prologue */
/* .line 37 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/contacts/Contact;->nativeGetFixtureA()I */
com.wiyun.engine.box2d.dynamics.Fixture .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.Fixture getFixtureB ( ) {
/* .locals 1 */
/* .prologue */
/* .line 48 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/contacts/Contact;->nativeGetFixtureB()I */
com.wiyun.engine.box2d.dynamics.Fixture .from ( v0 );
} // .end method
public native Float getFriction ( ) {
} // .end method
public com.wiyun.engine.box2d.collision.Manifold getManifold ( ) {
/* .locals 1 */
/* .prologue */
/* .line 26 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/contacts/Contact;->nativeGetManifold()I */
com.wiyun.engine.box2d.collision.Manifold .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.contacts.Contact getNext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 76 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/contacts/Contact;->nativeGetNext()I */
com.wiyun.engine.box2d.dynamics.contacts.Contact .from ( v0 );
} // .end method
public native Float getRestitution ( ) {
} // .end method
public native Boolean isEnabled ( ) {
} // .end method
public native Boolean isTouching ( ) {
} // .end method
public native void resetFriction ( ) {
} // .end method
public native void resetRestitution ( ) {
} // .end method
public native void setEnabled ( Boolean p0 ) {
} // .end method
public native void setFriction ( Float p0 ) {
} // .end method
public native void setRestitution ( Float p0 ) {
} // .end method
