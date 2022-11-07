public class com.wiyun.engine.opengl.Camera extends com.wiyun.engine.BaseWYObject {
	 /* # direct methods */
	 protected com.wiyun.engine.opengl.Camera ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/opengl/Camera;->nativeInit()I */
		 return;
	 } // .end method
	 private com.wiyun.engine.opengl.Camera ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 (( com.wiyun.engine.opengl.Camera ) p0 ).restore ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/Camera;->restore()V
		 return;
	 } // .end method
	 public static com.wiyun.engine.opengl.Camera from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/opengl/Camera; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/opengl/Camera;-><init>(I)V */
} // .end method
public static native Float getZEye ( ) {
} // .end method
public static com.wiyun.engine.opengl.Camera make ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Camera; */
/* invoke-direct {v0}, Lcom/wiyun/engine/opengl/Camera;-><init>()V */
} // .end method
private native Integer nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void restore ( ) {
} // .end method
