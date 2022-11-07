public class com.natenai.jniutil.NateRenderer implements android.opengl.GLSurfaceView$Renderer {
	 /* .source "NateRenderer.java" */
	 /* # interfaces */
	 /* # direct methods */
	 public com.natenai.jniutil.NateRenderer ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 9 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onDrawFrame ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 0 */
		 /* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
		 /* .prologue */
		 /* .line 38 */
		 /* .line 39 */
		 com.natenai.jniutil.NateGameJNIUtilLib .nativeDraw ( );
		 /* .line 40 */
		 return;
	 } // .end method
	 public void onSurfaceChanged ( javax.microedition.khronos.opengles.GL10 p0, Integer p1, Integer p2 ) {
		 /* .locals 6 */
		 /* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
		 /* .param p2, "width" # I */
		 /* .param p3, "height" # I */
		 /* .prologue */
		 /* .line 25 */
		 v0 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
		 final String v1 = "onSurfaceChanged"; // const-string v1, "onSurfaceChanged"
		 android.util.Log .d ( v0,v1 );
		 /* .line 26 */
		 /* .line 28 */
		 /* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->ScreenInfoIsReady:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 30 */
			 com.natenai.jniutil.NateGameJNIUtilLib .GetMainActivity ( );
			 com.natenai.jniutil.NateGameJNIUtilLib .SetMainActivity ( v0 );
			 /* .line 31 */
			 /* .line 32 */
			 /* .line 33 */
			 /* sget-boolean v4, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DrawFillScreen:Z */
			 /* sget-boolean v5, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DrawFromTop2Bottom:Z */
			 /* .line 31 */
			 /* invoke-static/range {v0 ..v5}, Lcom/natenai/jniutil/NateGameJNIUtilLib;->nativeResize(IIIIZZ)V */
			 /* .line 35 */
		 } // :cond_0
		 return;
	 } // .end method
	 public void onSurfaceCreated ( javax.microedition.khronos.opengles.GL10 p0, javax.microedition.khronos.egl.EGLConfig p1 ) {
		 /* .locals 6 */
		 /* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
		 /* .param p2, "config" # Ljavax/microedition/khronos/egl/EGLConfig; */
		 /* .prologue */
		 /* .line 12 */
		 v0 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
		 final String v1 = "onSurfaceCreated"; // const-string v1, "onSurfaceCreated"
		 android.util.Log .d ( v0,v1 );
		 /* .line 13 */
		 /* .line 15 */
		 /* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->ScreenInfoIsReady:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 17 */
			 com.natenai.jniutil.NateGameJNIUtilLib .GetMainActivity ( );
			 com.natenai.jniutil.NateGameJNIUtilLib .SetMainActivity ( v0 );
			 /* .line 18 */
			 /* .line 19 */
			 /* .line 20 */
			 /* sget-boolean v4, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DrawFillScreen:Z */
			 /* sget-boolean v5, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DrawFromTop2Bottom:Z */
			 /* .line 18 */
			 /* invoke-static/range {v0 ..v5}, Lcom/natenai/jniutil/NateGameJNIUtilLib;->nativeInit(IIIIZZ)V */
			 /* .line 22 */
		 } // :cond_0
		 return;
	 } // .end method
