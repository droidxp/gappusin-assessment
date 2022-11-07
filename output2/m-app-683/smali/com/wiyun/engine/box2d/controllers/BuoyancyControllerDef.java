public class com.wiyun.engine.box2d.controllers.BuoyancyControllerDef extends com.wiyun.engine.box2d.controllers.ControllerDef {
	 /* .source "BuoyancyControllerDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.controllers.BuoyancyControllerDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/ControllerDef;-><init>()V */
		 /* .line 20 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/controllers/BuoyancyControllerDef;->nativeInit()V */
		 /* .line 21 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.controllers.BuoyancyControllerDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 16 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/controllers/BuoyancyControllerDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/controllers/BuoyancyControllerDef;-><init>()V */
	 } // .end method
	 private native void nativeGetGravity ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeGetNormal ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeGetVelocity ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeInit ( ) {
	 } // .end method
	 /* # virtual methods */
	 public native void destroy ( ) {
	 } // .end method
	 public native Float getAngularDrag ( ) {
	 } // .end method
	 public native Float getDensity ( ) {
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getGravity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 167 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 168 */
		 /* .local v0, "g":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/controllers/BuoyancyControllerDef;->nativeGetGravity(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 169 */
	 } // .end method
	 public native Float getLinearDrag ( ) {
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getNormal ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 41 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 42 */
		 /* .local v0, "n":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/controllers/BuoyancyControllerDef;->nativeGetNormal(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 43 */
	 } // .end method
	 public native Float getOffset ( ) {
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getVelocity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 90 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 91 */
		 /* .local v0, "v":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/controllers/BuoyancyControllerDef;->nativeGetVelocity(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 92 */
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
