public class com.wiyun.engine.opengl.Camera extends com.wiyun.engine.BaseWYObject {
	 /* .source "Camera.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.opengl.Camera ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/opengl/Camera;->nativeInit()I */
		 /* .line 19 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.opengl.Camera ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 34 */
		 (( com.wiyun.engine.opengl.Camera ) p0 ).restore ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/Camera;->restore()V
		 /* .line 35 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.opengl.Camera from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 24 */
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
/* .prologue */
/* .line 11 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Camera; */
/* invoke-direct {v0}, Lcom/wiyun/engine/opengl/Camera;-><init>()V */
} // .end method
private native Integer nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void getCenter ( Float[] p0 ) {
} // .end method
public native void getEye ( Float[] p0 ) {
} // .end method
public native void getUp ( Float[] p0 ) {
} // .end method
public native Boolean isDirty ( ) {
} // .end method
public native void locate ( ) {
} // .end method
public native void restore ( ) {
} // .end method
public native void setCenter ( Float p0, Float p1, Float p2 ) {
} // .end method
public native void setDirty ( Boolean p0 ) {
} // .end method
public native void setEye ( Float p0, Float p1, Float p2 ) {
} // .end method
public native void setUp ( Float p0, Float p1, Float p2 ) {
} // .end method
