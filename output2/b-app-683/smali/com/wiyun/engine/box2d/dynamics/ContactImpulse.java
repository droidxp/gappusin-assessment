public class com.wiyun.engine.box2d.dynamics.ContactImpulse extends com.wiyun.engine.BaseObject {
	 /* .source "ContactImpulse.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.ContactImpulse ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 11 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.ContactImpulse ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 15 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.ContactImpulse from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 7 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/ContactImpulse; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/ContactImpulse;-><init>(I)V */
} // .end method
/* # virtual methods */
public native Float getNormalImpulse ( Integer p0 ) {
} // .end method
public native Float getTangentImpulse ( Integer p0 ) {
} // .end method
