public class com.wiyun.engine.box2d.controllers.GravityController extends com.wiyun.engine.box2d.controllers.Controller {
	 /* .source "GravityController.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.controllers.GravityController ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/Controller;-><init>()V */
		 /* .line 19 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.controllers.GravityController ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/controllers/Controller;-><init>(I)V */
		 /* .line 23 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.controllers.GravityController from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 14 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/controllers/GravityController; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/controllers/GravityController;-><init>(I)V */
} // .end method
/* # virtual methods */
public native Float getGravitationalConstant ( ) {
} // .end method
public native Boolean isProportionalToInvRadius ( ) {
} // .end method
public native void setGravitationalConstant ( Float p0 ) {
} // .end method
public native void setProportionalToInvRadius ( Boolean p0 ) {
} // .end method
