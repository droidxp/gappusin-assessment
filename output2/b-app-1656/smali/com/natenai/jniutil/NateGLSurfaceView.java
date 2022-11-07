public class com.natenai.jniutil.NateGLSurfaceView extends android.opengl.GLSurfaceView {
	 /* .source "NateGLSurfaceView.java" */
	 /* # instance fields */
	 com.natenai.jniutil.NateRenderer mRenderer;
	 /* # direct methods */
	 public com.natenai.jniutil.NateGLSurfaceView ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V */
		 /* .line 12 */
		 /* new-instance v0, Lcom/natenai/jniutil/NateRenderer; */
		 /* invoke-direct {v0}, Lcom/natenai/jniutil/NateRenderer;-><init>()V */
		 this.mRenderer = v0;
		 /* .line 13 */
		 v0 = this.mRenderer;
		 (( com.natenai.jniutil.NateGLSurfaceView ) p0 ).setRenderer ( v0 ); // invoke-virtual {p0, v0}, Lcom/natenai/jniutil/NateGLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V
		 /* .line 14 */
		 return;
	 } // .end method
