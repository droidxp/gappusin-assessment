public class com.wiyun.engine.box2d.dynamics.contacts.ContactEdge extends com.wiyun.engine.BaseObject {
	 /* .source "ContactEdge.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.contacts.ContactEdge ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 12 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.contacts.ContactEdge ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 16 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.contacts.ContactEdge from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/contacts/ContactEdge; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/contacts/ContactEdge;-><init>(I)V */
} // .end method
private native Integer nativeGetBody ( ) {
} // .end method
private native Integer nativeGetContact ( ) {
} // .end method
private native Integer nativeGetNext ( ) {
} // .end method
private native Integer nativeGetPrev ( ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.box2d.dynamics.Body getBody ( ) {
/* .locals 1 */
/* .prologue */
/* .line 19 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/contacts/ContactEdge;->nativeGetBody()I */
com.wiyun.engine.box2d.dynamics.Body .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.contacts.Contact getContact ( ) {
/* .locals 1 */
/* .prologue */
/* .line 25 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/contacts/ContactEdge;->nativeGetContact()I */
com.wiyun.engine.box2d.dynamics.contacts.Contact .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.contacts.ContactEdge getNext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 31 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/contacts/ContactEdge;->nativeGetNext()I */
com.wiyun.engine.box2d.dynamics.contacts.ContactEdge .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.dynamics.contacts.ContactEdge getPrev ( ) {
/* .locals 1 */
/* .prologue */
/* .line 37 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/contacts/ContactEdge;->nativeGetPrev()I */
com.wiyun.engine.box2d.dynamics.contacts.ContactEdge .from ( v0 );
} // .end method
