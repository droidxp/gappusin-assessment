public class com.wiyun.engine.box2d.controllers.ConstantForceControllerDef extends com.wiyun.engine.box2d.controllers.ControllerDef {
	 /* .source "ConstantForceControllerDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.controllers.ConstantForceControllerDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/ControllerDef;-><init>()V */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/ConstantForceControllerDef;->nativeInit()V */
		 /* .line 20 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.controllers.ConstantForceControllerDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 15 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/controllers/ConstantForceControllerDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/controllers/ConstantForceControllerDef;-><init>()V */
	 } // .end method
	 private native void nativeGetForce ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeInit ( ) {
	 } // .end method
	 /* # virtual methods */
	 public native void destroy ( ) {
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getForce ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 29 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 30 */
		 /* .local v0, "f":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/controllers/ConstantForceControllerDef;->nativeGetForce(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 31 */
	 } // .end method
	 public native void setForce ( Float p0, Float p1 ) {
	 } // .end method
