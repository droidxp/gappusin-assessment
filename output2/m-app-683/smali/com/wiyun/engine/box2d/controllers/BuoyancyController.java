public class com.wiyun.engine.box2d.controllers.BuoyancyController extends com.wiyun.engine.box2d.controllers.Controller {
	 /* .source "BuoyancyController.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.controllers.BuoyancyController ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/Controller;-><init>()V */
		 /* .line 23 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.controllers.BuoyancyController ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/controllers/Controller;-><init>(I)V */
		 /* .line 27 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.controllers.BuoyancyController from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/controllers/BuoyancyController; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/controllers/BuoyancyController;-><init>(I)V */
} // .end method
private native void nativeGetGravity ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetNormal ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetVelocity ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
/* # virtual methods */
public native Float getAngularDrag ( ) {
} // .end method
public native Float getDensity ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getGravity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 169 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 170 */
/* .local v0, "g":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/controllers/BuoyancyController;->nativeGetGravity(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 171 */
} // .end method
public native Float getLinearDrag ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getNormal ( ) {
/* .locals 1 */
/* .prologue */
/* .line 43 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 44 */
/* .local v0, "n":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/controllers/BuoyancyController;->nativeGetNormal(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 45 */
} // .end method
public native Float getOffset ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getVelocity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 92 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 93 */
/* .local v0, "v":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/controllers/BuoyancyController;->nativeGetVelocity(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 94 */
} // .end method
public native Boolean isUseDensity ( ) {
} // .end method
public native Boolean isUseWorldGravity ( ) {
} // .end method
public native void setAngularDrag ( Float p0 ) {
} // .end method
public native void setDensity ( Float p0 ) {
} // .end method
public native void setGravity ( Float p0, Float p1 ) {
} // .end method
public native void setLinearDrag ( Float p0 ) {
} // .end method
public native void setNormal ( Float p0, Float p1 ) {
} // .end method
public native void setOffset ( Float p0 ) {
} // .end method
public native void setUseDensity ( Boolean p0 ) {
} // .end method
public native void setUseWorldGravity ( Boolean p0 ) {
} // .end method
public native void setVelocity ( Float p0, Float p1 ) {
} // .end method
