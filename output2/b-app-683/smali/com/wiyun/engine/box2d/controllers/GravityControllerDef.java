public class com.wiyun.engine.box2d.controllers.GravityControllerDef extends com.wiyun.engine.box2d.controllers.ControllerDef {
	 /* .source "GravityControllerDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.controllers.GravityControllerDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/ControllerDef;-><init>()V */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/GravityControllerDef;->nativeInit()V */
		 /* .line 19 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.controllers.GravityControllerDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/controllers/GravityControllerDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/controllers/GravityControllerDef;-><init>()V */
	 } // .end method
	 private native void nativeInit ( ) {
	 } // .end method
	 /* # virtual methods */
	 public native void destroy ( ) {
	 } // .end method
	 public native Float getGravitationalConstant ( ) {
	 } // .end method
	 public native Boolean isProportionalToInvRadius ( ) {
	 } // .end method
	 public native void setGravitationalConstant ( Float p0 ) {
	 } // .end method
	 public native void setProportionalToInvRadius ( Boolean p0 ) {
	 } // .end method
