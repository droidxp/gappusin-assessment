public class com.wiyun.engine.opengl.TextureManager extends com.wiyun.engine.BaseWYObject {
	 /* .source "TextureManager.java" */
	 /* # static fields */
	 public static final Integer TEXTURE_PIXEL_FORMAT_A8;
	 public static final Integer TEXTURE_PIXEL_FORMAT_RGB565;
	 public static final Integer TEXTURE_PIXEL_FORMAT_RGBA4444;
	 public static final Integer TEXTURE_PIXEL_FORMAT_RGBA5551;
	 public static final Integer TEXTURE_PIXEL_FORMAT_RGBA8888;
	 private static com.wiyun.engine.opengl.TextureManager sInstance;
	 /* # direct methods */
	 private com.wiyun.engine.opengl.TextureManager ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 57 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 58 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/opengl/TextureManager;->nativeInit()V */
		 /* .line 59 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.opengl.TextureManager getInstance ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 44 */
		 /* const-class v1, Lcom/wiyun/engine/opengl/TextureManager; */
		 /* monitor-enter v1 */
		 /* .line 45 */
		 try { // :try_start_0
			 v0 = com.wiyun.engine.opengl.TextureManager.sInstance;
			 /* if-nez v0, :cond_0 */
			 /* .line 46 */
			 /* new-instance v0, Lcom/wiyun/engine/opengl/TextureManager; */
			 /* invoke-direct {v0}, Lcom/wiyun/engine/opengl/TextureManager;-><init>()V */
			 /* .line 50 */
		 } // :goto_0
		 v0 = com.wiyun.engine.opengl.TextureManager.sInstance;
		 /* monitor-exit v1 */
		 /* .line 48 */
	 } // :cond_0
	 v0 = com.wiyun.engine.opengl.TextureManager.sInstance;
	 v2 = 	 com.wiyun.engine.opengl.TextureManager .nativeGetInstance ( );
	 (( com.wiyun.engine.opengl.TextureManager ) v0 ).setPointer ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/opengl/TextureManager;->setPointer(I)V
	 /* .line 44 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
private static native Integer nativeGetInstance ( ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native Integer getTextureCount ( ) {
} // .end method
public native Integer getTexturePixelFormat ( ) {
} // .end method
public native void removeAllTextures ( ) {
} // .end method
public native void removeTexture ( Integer p0 ) {
} // .end method
public native void removeTexture ( com.wiyun.engine.opengl.Texture2D p0, Boolean p1 ) {
} // .end method
public native void removeTexture ( java.lang.String p0 ) {
} // .end method
public native void setTexturePixelFormat ( Integer p0 ) {
} // .end method
