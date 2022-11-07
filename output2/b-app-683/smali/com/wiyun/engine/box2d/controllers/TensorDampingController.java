public class com.wiyun.engine.box2d.controllers.TensorDampingController extends com.wiyun.engine.box2d.controllers.Controller {
	 /* .source "TensorDampingController.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.controllers.TensorDampingController ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/Controller;-><init>()V */
		 /* .line 24 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.controllers.TensorDampingController ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/controllers/Controller;-><init>(I)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.controllers.TensorDampingController from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 19 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/controllers/TensorDampingController; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/controllers/TensorDampingController;-><init>(I)V */
} // .end method
private native void nativeGetMatrix ( com.wiyun.engine.box2d.common.Matrix22 p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.box2d.common.Matrix22 getMatrix ( ) {
/* .locals 1 */
/* .prologue */
/* .line 43 */
com.wiyun.engine.box2d.common.Matrix22 .makeZero ( );
/* .line 44 */
/* .local v0, "t":Lcom/wiyun/engine/box2d/common/Matrix22; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/controllers/TensorDampingController;->nativeGetMatrix(Lcom/wiyun/engine/box2d/common/Matrix22;)V */
/* .line 45 */
} // .end method
public native Float getMaxTimeStep ( ) {
} // .end method
public native void setMatrix ( com.wiyun.engine.box2d.common.Matrix22 p0 ) {
} // .end method
public native void setMaxTimeStep ( Float p0 ) {
} // .end method
