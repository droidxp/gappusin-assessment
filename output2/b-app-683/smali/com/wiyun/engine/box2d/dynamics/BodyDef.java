public class com.wiyun.engine.box2d.dynamics.BodyDef extends com.wiyun.engine.BaseObject {
	 /* .source "BodyDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.BodyDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/BodyDef;->nativeNew()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.BodyDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 17 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.BodyDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/BodyDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/BodyDef;-><init>()V */
	 } // .end method
	 private native void nativeGetPosition ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 private native void nativeNew ( ) {
	 } // .end method
	 /* # virtual methods */
	 public native void destroy ( ) {
	 } // .end method
	 public native Float getAngle ( ) {
	 } // .end method
	 public native Float getAngularDamping ( ) {
	 } // .end method
	 public native Float getGravityScale ( ) {
	 } // .end method
	 public native Float getLinearDamping ( ) {
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getPosition ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 185 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* .line 186 */
		 /* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/BodyDef;->nativeGetPosition(Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 187 */
	 } // .end method
	 public native Integer getType ( ) {
	 } // .end method
	 public native java.lang.Object getUserData ( ) {
	 } // .end method
	 public native Boolean isAllowSleep ( ) {
	 } // .end method
	 public native Boolean isBullet ( ) {
	 } // .end method
	 public native Boolean isFixedRotation ( ) {
	 } // .end method
	 public native void setAllowSleep ( Boolean p0 ) {
	 } // .end method
	 public native void setAngle ( Float p0 ) {
	 } // .end method
	 public native void setAngularDamping ( Float p0 ) {
	 } // .end method
	 public native void setAngularVelocity ( Float p0 ) {
	 } // .end method
	 public native void setBullet ( Boolean p0 ) {
	 } // .end method
	 public native void setFixedRotation ( Boolean p0 ) {
	 } // .end method
	 public native void setGravityScale ( Float p0 ) {
	 } // .end method
	 public native void setLinearDamping ( Float p0 ) {
	 } // .end method
	 public native void setLinearVelocity ( Float p0, Float p1 ) {
	 } // .end method
	 public void setLinearVelocity ( com.wiyun.engine.types.WYPoint p0 ) {
		 /* .locals 2 */
		 /* .param p1, "v" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 82 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 (( com.wiyun.engine.box2d.dynamics.BodyDef ) p0 ).setLinearVelocity ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/box2d/dynamics/BodyDef;->setLinearVelocity(FF)V
		 /* .line 83 */
		 return;
	 } // .end method
	 public native void setPosition ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setPosition ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 public native void setType ( Integer p0 ) {
	 } // .end method
	 public native void setUserData ( java.lang.Object p0 ) {
	 } // .end method
