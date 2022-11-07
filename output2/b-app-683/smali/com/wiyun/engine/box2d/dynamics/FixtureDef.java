public class com.wiyun.engine.box2d.dynamics.FixtureDef extends com.wiyun.engine.BaseObject {
	 /* .source "FixtureDef.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.FixtureDef ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/FixtureDef;->nativeNew()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.FixtureDef ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 19 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.FixtureDef make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/FixtureDef; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/FixtureDef;-><init>()V */
	 } // .end method
	 private native void nativeGetFilter ( com.wiyun.engine.box2d.dynamics.Filter p0 ) {
	 } // .end method
	 private native void nativeNew ( ) {
	 } // .end method
	 /* # virtual methods */
	 public native void destroy ( ) {
	 } // .end method
	 public native Float getDensity ( ) {
	 } // .end method
	 public com.wiyun.engine.box2d.dynamics.Filter getFilter ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 132 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/Filter; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/Filter;-><init>()V */
		 /* .line 133 */
		 /* .local v0, "f":Lcom/wiyun/engine/box2d/dynamics/Filter; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/FixtureDef;->nativeGetFilter(Lcom/wiyun/engine/box2d/dynamics/Filter;)V */
		 /* .line 134 */
	 } // .end method
	 public native Float getFriction ( ) {
	 } // .end method
	 public native Float getRestitution ( ) {
	 } // .end method
	 public native Integer getShape ( ) {
	 } // .end method
	 public native java.lang.Object getUserData ( ) {
	 } // .end method
	 public native Boolean isSensor ( ) {
	 } // .end method
	 public native void setDensity ( Float p0 ) {
	 } // .end method
	 public native void setFilter ( Integer p0, Integer p1, Integer p2 ) {
	 } // .end method
	 public native void setFilterCategory ( Integer p0 ) {
	 } // .end method
	 public native void setFilterGroupIndex ( Integer p0 ) {
	 } // .end method
	 public native void setFilterMask ( Integer p0 ) {
	 } // .end method
	 public native void setFriction ( Float p0 ) {
	 } // .end method
	 public native void setRestitution ( Float p0 ) {
	 } // .end method
	 public native void setSensor ( Boolean p0 ) {
	 } // .end method
	 public native void setShape ( com.wiyun.engine.box2d.collision.Shape p0 ) {
	 } // .end method
	 public native void setUserData ( java.lang.Object p0 ) {
	 } // .end method
