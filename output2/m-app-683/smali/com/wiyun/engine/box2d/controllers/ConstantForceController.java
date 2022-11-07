public class com.wiyun.engine.box2d.controllers.ConstantForceController extends com.wiyun.engine.box2d.controllers.Controller {
	 /* .source "ConstantForceController.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.controllers.ConstantForceController ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/Controller;-><init>()V */
		 /* .line 20 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.controllers.ConstantForceController ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/controllers/Controller;-><init>(I)V */
		 /* .line 24 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.controllers.ConstantForceController from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 15 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/controllers/ConstantForceController; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/controllers/ConstantForceController;-><init>(I)V */
} // .end method
private native void nativeGetForce ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPoint getForce ( ) {
/* .locals 1 */
/* .prologue */
/* .line 29 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 30 */
/* .local v0, "f":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/controllers/ConstantForceController;->nativeGetForce(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 31 */
} // .end method
public native void setForce ( Float p0, Float p1 ) {
} // .end method
