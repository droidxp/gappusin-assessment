public class org.anddev.andengine.opengl.view.GLSurfaceView extends android.view.SurfaceView implements android.view.SurfaceHolder$Callback {
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer DEBUG_CHECK_GL_ERROR;
	 public static final Integer DEBUG_LOG_GL_CALLS;
	 public static final Integer RENDERMODE_CONTINUOUSLY;
	 public static final Integer RENDERMODE_WHEN_DIRTY;
	 private static final java.util.concurrent.Semaphore sEglSemaphore;
	 /* # instance fields */
	 private Integer mDebugFlags;
	 private org.anddev.andengine.opengl.view.EGLConfigChooser mEGLConfigChooser;
	 private org.anddev.andengine.opengl.view.GLSurfaceView$GLThread mGLThread;
	 private org.anddev.andengine.opengl.view.GLWrapper mGLWrapper;
	 private Boolean mHasSurface;
	 private Integer mRenderMode;
	 private org.anddev.andengine.opengl.view.GLSurfaceView$Renderer mRenderer;
	 private Integer mSurfaceHeight;
	 private Integer mSurfaceWidth;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.view.GLSurfaceView ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/util/concurrent/Semaphore; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.view.GLSurfaceView ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->init()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.view.GLSurfaceView ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->init()V */
		 return;
	 } // .end method
	 static java.util.concurrent.Semaphore access$0 ( ) { //synthethic
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.view.GLSurfaceView.sEglSemaphore;
	 } // .end method
	 static org.anddev.andengine.opengl.view.EGLConfigChooser access$1 ( org.anddev.andengine.opengl.view.GLSurfaceView p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.mEGLConfigChooser;
	 } // .end method
	 static org.anddev.andengine.opengl.view.GLWrapper access$2 ( org.anddev.andengine.opengl.view.GLSurfaceView p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.mGLWrapper;
	 } // .end method
	 private void init ( ) {
		 /* .locals 2 */
		 (( org.anddev.andengine.opengl.view.GLSurfaceView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->getHolder()Landroid/view/SurfaceHolder;
		 int v1 = 2; // const/4 v1, 0x2
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mRenderMode:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getDebugFlags ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mDebugFlags:I */
	 } // .end method
	 public Integer getRenderMode ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mRenderMode:I */
	 } // .end method
	 public void onPause ( ) {
		 /* .locals 1 */
		 v0 = this.mGLThread;
		 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).onPause ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->onPause()V
		 v0 = this.mGLThread;
		 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).requestExitAndWait ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->requestExitAndWait()V
		 int v0 = 0; // const/4 v0, 0x0
		 this.mGLThread = v0;
		 return;
	 } // .end method
	 public void onResume ( ) {
		 /* .locals 3 */
		 v0 = this.mEGLConfigChooser;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/view/SimpleEGLConfigChooser; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/opengl/view/SimpleEGLConfigChooser;-><init>(Z)V */
		 this.mEGLConfigChooser = v0;
	 } // :cond_0
	 /* new-instance v0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread; */
	 v1 = this.mRenderer;
	 /* invoke-direct {v0, p0, v1}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;-><init>(Lorg/anddev/andengine/opengl/view/GLSurfaceView;Lorg/anddev/andengine/opengl/view/GLSurfaceView$Renderer;)V */
	 this.mGLThread = v0;
	 v0 = this.mGLThread;
	 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).start ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->start()V
	 v0 = this.mGLThread;
	 /* iget v1, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mRenderMode:I */
	 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).setRenderMode ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->setRenderMode(I)V
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mHasSurface:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.mGLThread;
		 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).surfaceCreated ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->surfaceCreated()V
	 } // :cond_1
	 /* iget v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mSurfaceWidth:I */
	 /* if-lez v0, :cond_2 */
	 /* iget v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mSurfaceHeight:I */
	 /* if-lez v0, :cond_2 */
	 v0 = this.mGLThread;
	 /* iget v1, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mSurfaceWidth:I */
	 /* iget v2, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mSurfaceHeight:I */
	 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).onWindowResize ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->onWindowResize(II)V
} // :cond_2
v0 = this.mGLThread;
(( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).onResume ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->onResume()V
return;
} // .end method
public void queueEvent ( java.lang.Runnable p0 ) {
/* .locals 1 */
v0 = this.mGLThread;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.mGLThread;
	 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).queueEvent ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->queueEvent(Ljava/lang/Runnable;)V
} // :cond_0
return;
} // .end method
public void requestRender ( ) {
/* .locals 1 */
v0 = this.mGLThread;
(( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).requestRender ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->requestRender()V
return;
} // .end method
public void setDebugFlags ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mDebugFlags:I */
return;
} // .end method
public void setEGLConfigChooser ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 7 */
/* new-instance v0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser; */
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move v5, p5 */
/* move v6, p6 */
/* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;-><init>(IIIIII)V */
(( org.anddev.andengine.opengl.view.GLSurfaceView ) p0 ).setEGLConfigChooser ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->setEGLConfigChooser(Lorg/anddev/andengine/opengl/view/EGLConfigChooser;)V
return;
} // .end method
public void setEGLConfigChooser ( org.anddev.andengine.opengl.view.EGLConfigChooser p0 ) {
/* .locals 2 */
v0 = this.mRenderer;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 final String v1 = "setRenderer has already been called for this instance."; // const-string v1, "setRenderer has already been called for this instance."
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
this.mEGLConfigChooser = p1;
return;
} // .end method
public void setEGLConfigChooser ( Boolean p0 ) {
/* .locals 1 */
/* new-instance v0, Lorg/anddev/andengine/opengl/view/SimpleEGLConfigChooser; */
/* invoke-direct {v0, p1}, Lorg/anddev/andengine/opengl/view/SimpleEGLConfigChooser;-><init>(Z)V */
(( org.anddev.andengine.opengl.view.GLSurfaceView ) p0 ).setEGLConfigChooser ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->setEGLConfigChooser(Lorg/anddev/andengine/opengl/view/EGLConfigChooser;)V
return;
} // .end method
public void setGLWrapper ( org.anddev.andengine.opengl.view.GLWrapper p0 ) {
/* .locals 0 */
this.mGLWrapper = p1;
return;
} // .end method
public void setRenderMode ( Integer p0 ) {
/* .locals 1 */
/* iput p1, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mRenderMode:I */
v0 = this.mGLThread;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.mGLThread;
	 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).setRenderMode ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->setRenderMode(I)V
} // :cond_0
return;
} // .end method
public void setRenderer ( org.anddev.andengine.opengl.view.GLSurfaceView$Renderer p0 ) {
/* .locals 2 */
v0 = this.mRenderer;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 final String v1 = "setRenderer has already been called for this instance."; // const-string v1, "setRenderer has already been called for this instance."
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
this.mRenderer = p1;
return;
} // .end method
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
v0 = this.mGLThread;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.mGLThread;
	 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).onWindowResize ( p3, p4 ); // invoke-virtual {v0, p3, p4}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->onWindowResize(II)V
} // :cond_0
/* iput p3, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mSurfaceWidth:I */
/* iput p4, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mSurfaceHeight:I */
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
v0 = this.mGLThread;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.mGLThread;
	 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).surfaceCreated ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->surfaceCreated()V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mHasSurface:Z */
return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
v0 = this.mGLThread;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.mGLThread;
	 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) v0 ).surfaceDestroyed ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->surfaceDestroyed()V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->mHasSurface:Z */
return;
} // .end method
