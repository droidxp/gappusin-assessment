public class com.wiyun.engine.box2d.controllers.TensorDampingControllerDef extends com.wiyun.engine.box2d.controllers.ControllerDef {
	 /* .source "TensorDampingControllerDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.controllers.TensorDampingControllerDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/ControllerDef;-><init>()V */
		 /* .line 20 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/TensorDampingControllerDef;->nativeInit()V */
		 /* .line 21 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.controllers.TensorDampingControllerDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 16 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/controllers/TensorDampingControllerDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/controllers/TensorDampingControllerDef;-><init>()V */
	 } // .end method
	 private native void nativeGetMatrix ( com.wiyun.engine.box2d.common.Matrix22 p0 ) {
	 } // .end method
	 private native void nativeInit ( ) {
	 } // .end method
	 /* # virtual methods */
	 public native void destroy ( ) {
	 } // .end method
	 public com.wiyun.engine.box2d.common.Matrix22 getMatrix ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 40 */
		 com.wiyun.engine.box2d.common.Matrix22 .makeZero ( );
		 /* .line 41 */
		 /* .local v0, "t":Lcom/wiyun/engine/box2d/common/Matrix22; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/controllers/TensorDampingControllerDef;->nativeGetMatrix(Lcom/wiyun/engine/box2d/common/Matrix22;)V */
		 /* .line 42 */
	 } // .end method
	 public native Float getMaxTimeStep ( ) {
	 } // .end method
	 public native void setAxisAligned ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setMatrix ( com.wiyun.engine.box2d.common.Matrix22 p0 ) {
	 } // .end method
	 public native void setMaxTimeStep ( Float p0 ) {
	 } // .end method
