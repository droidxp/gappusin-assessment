public class android.opengl.derived.SwapGLSurfaceView extends android.view.SurfaceView implements android.view.SurfaceHolder$Callback implements com.ansca.corona.version.ISurfaceView {
	 /* .source "SwapGLSurfaceView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/opengl/derived/SwapGLSurfaceView$1;, */
	 /* Landroid/opengl/derived/SwapGLSurfaceView$GLThreadManager;, */
	 /* Landroid/opengl/derived/SwapGLSurfaceView$LogWriter;, */
	 /* Landroid/opengl/derived/SwapGLSurfaceView$GLThread;, */
	 /* Landroid/opengl/derived/SwapGLSurfaceView$EglHelper;, */
	 /* Landroid/opengl/derived/SwapGLSurfaceView$SimpleEGLConfigChooser;, */
	 /* Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;, */
	 /* Landroid/opengl/derived/SwapGLSurfaceView$BaseConfigChooser;, */
	 /* Landroid/opengl/derived/SwapGLSurfaceView$DefaultWindowSurfaceFactory;, */
	 /* Landroid/opengl/derived/SwapGLSurfaceView$DefaultContextFactory; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Boolean LOG_THREADS;
private static final android.opengl.derived.SwapGLSurfaceView$GLThreadManager sGLThreadManager;
/* # instance fields */
private Integer mDebugFlags;
private android.opengl.GLSurfaceView$EGLConfigChooser mEGLConfigChooser;
private android.opengl.GLSurfaceView$EGLContextFactory mEGLContextFactory;
private android.opengl.GLSurfaceView$EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
private android.opengl.derived.SwapGLSurfaceView$GLThread mGLThread;
private android.opengl.GLSurfaceView$GLWrapper mGLWrapper;
private Boolean mNeedsSwap;
private Boolean mSizeChanged;
/* # direct methods */
static android.opengl.derived.SwapGLSurfaceView ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 1206 */
	 /* new-instance v0, Landroid/opengl/derived/SwapGLSurfaceView$GLThreadManager; */
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {v0, v1}, Landroid/opengl/derived/SwapGLSurfaceView$GLThreadManager;-><init>(Landroid/opengl/derived/SwapGLSurfaceView$1;)V */
	 return;
} // .end method
public android.opengl.derived.SwapGLSurfaceView ( ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .prologue */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 166 */
	 /* invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
	 /* .line 1207 */
	 /* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mSizeChanged:Z */
	 /* .line 1216 */
	 /* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mNeedsSwap:Z */
	 /* .line 167 */
	 /* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView;->init()V */
	 /* .line 168 */
	 return;
} // .end method
public android.opengl.derived.SwapGLSurfaceView ( ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 175 */
	 /* invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 /* .line 1207 */
	 /* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mSizeChanged:Z */
	 /* .line 1216 */
	 /* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mNeedsSwap:Z */
	 /* .line 176 */
	 /* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView;->init()V */
	 /* .line 177 */
	 return;
} // .end method
static android.opengl.GLSurfaceView$EGLConfigChooser access$200 ( android.opengl.derived.SwapGLSurfaceView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Landroid/opengl/derived/SwapGLSurfaceView; */
	 /* .prologue */
	 /* .line 158 */
	 v0 = this.mEGLConfigChooser;
} // .end method
static android.opengl.GLSurfaceView$EGLContextFactory access$300 ( android.opengl.derived.SwapGLSurfaceView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Landroid/opengl/derived/SwapGLSurfaceView; */
	 /* .prologue */
	 /* .line 158 */
	 v0 = this.mEGLContextFactory;
} // .end method
static android.opengl.GLSurfaceView$EGLWindowSurfaceFactory access$400 ( android.opengl.derived.SwapGLSurfaceView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Landroid/opengl/derived/SwapGLSurfaceView; */
	 /* .prologue */
	 /* .line 158 */
	 v0 = this.mEGLWindowSurfaceFactory;
} // .end method
static android.opengl.GLSurfaceView$GLWrapper access$500 ( android.opengl.derived.SwapGLSurfaceView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Landroid/opengl/derived/SwapGLSurfaceView; */
	 /* .prologue */
	 /* .line 158 */
	 v0 = this.mGLWrapper;
} // .end method
static Integer access$600 ( android.opengl.derived.SwapGLSurfaceView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Landroid/opengl/derived/SwapGLSurfaceView; */
	 /* .prologue */
	 /* .line 158 */
	 /* iget v0, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mDebugFlags:I */
} // .end method
static android.opengl.derived.SwapGLSurfaceView$GLThreadManager access$700 ( ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 158 */
	 v0 = android.opengl.derived.SwapGLSurfaceView.sGLThreadManager;
} // .end method
static Boolean access$800 ( android.opengl.derived.SwapGLSurfaceView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Landroid/opengl/derived/SwapGLSurfaceView; */
	 /* .prologue */
	 /* .line 158 */
	 /* iget-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mSizeChanged:Z */
} // .end method
static Boolean access$802 ( android.opengl.derived.SwapGLSurfaceView p0, Boolean p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Landroid/opengl/derived/SwapGLSurfaceView; */
	 /* .param p1, "x1" # Z */
	 /* .prologue */
	 /* .line 158 */
	 /* iput-boolean p1, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mSizeChanged:Z */
} // .end method
static Boolean access$900 ( android.opengl.derived.SwapGLSurfaceView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Landroid/opengl/derived/SwapGLSurfaceView; */
	 /* .prologue */
	 /* .line 158 */
	 /* iget-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mNeedsSwap:Z */
} // .end method
static Boolean access$902 ( android.opengl.derived.SwapGLSurfaceView p0, Boolean p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Landroid/opengl/derived/SwapGLSurfaceView; */
	 /* .param p1, "x1" # Z */
	 /* .prologue */
	 /* .line 158 */
	 /* iput-boolean p1, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mNeedsSwap:Z */
} // .end method
private void checkRenderThreadState ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 1163 */
	 v0 = this.mGLThread;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 1164 */
		 /* new-instance v0, Ljava/lang/IllegalStateException; */
		 final String v1 = "setRenderer has already been called for this instance."; // const-string v1, "setRenderer has already been called for this instance."
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
		 /* .line 1167 */
	 } // :cond_0
	 return;
} // .end method
private void init ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 182 */
	 (( android.opengl.derived.SwapGLSurfaceView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Landroid/opengl/derived/SwapGLSurfaceView;->getHolder()Landroid/view/SurfaceHolder;
	 /* .line 183 */
	 /* .local v0, "holder":Landroid/view/SurfaceHolder; */
	 /* .line 184 */
	 return;
} // .end method
/* # virtual methods */
public Boolean canRender ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1228 */
	 v0 = this.mGLThread;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void clearNeedsSwap ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1224 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mNeedsSwap:Z */
/* .line 1225 */
return;
} // .end method
public Integer getDebugFlags ( ) {
/* .locals 1 */
/* .prologue */
/* .line 221 */
/* iget v0, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mDebugFlags:I */
} // .end method
public Integer getRenderMode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 374 */
v0 = this.mGLThread;
v0 = (( android.opengl.derived.SwapGLSurfaceView$GLThread ) v0 ).getRenderMode ( ); // invoke-virtual {v0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->getRenderMode()I
} // .end method
public android.view.View getView ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1232 */
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 1 */
/* .prologue */
/* .line 457 */
/* invoke-super {p0}, Landroid/view/SurfaceView;->onDetachedFromWindow()V */
/* .line 458 */
v0 = this.mGLThread;
(( android.opengl.derived.SwapGLSurfaceView$GLThread ) v0 ).requestExitAndWait ( ); // invoke-virtual {v0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->requestExitAndWait()V
/* .line 459 */
return;
} // .end method
public void onPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 426 */
v0 = this.mGLThread;
(( android.opengl.derived.SwapGLSurfaceView$GLThread ) v0 ).onPause ( ); // invoke-virtual {v0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->onPause()V
/* .line 427 */
return;
} // .end method
public void onResume ( ) {
/* .locals 1 */
/* .prologue */
/* .line 437 */
v0 = this.mGLThread;
(( android.opengl.derived.SwapGLSurfaceView$GLThread ) v0 ).onResume ( ); // invoke-virtual {v0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->onResume()V
/* .line 438 */
return;
} // .end method
public void queueEvent ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* .param p1, "r" # Ljava/lang/Runnable; */
/* .prologue */
/* .line 447 */
v0 = this.mGLThread;
(( android.opengl.derived.SwapGLSurfaceView$GLThread ) v0 ).queueEvent ( p1 ); // invoke-virtual {v0, p1}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->queueEvent(Ljava/lang/Runnable;)V
/* .line 448 */
return;
} // .end method
public void requestRender ( ) {
/* .locals 1 */
/* .prologue */
/* .line 385 */
v0 = this.mGLThread;
(( android.opengl.derived.SwapGLSurfaceView$GLThread ) v0 ).requestRender ( ); // invoke-virtual {v0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->requestRender()V
/* .line 386 */
return;
} // .end method
public void setDebugFlags ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "debugFlags" # I */
/* .prologue */
/* .line 213 */
/* iput p1, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mDebugFlags:I */
/* .line 214 */
return;
} // .end method
public void setEGLConfigChooser ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 7 */
/* .param p1, "redSize" # I */
/* .param p2, "greenSize" # I */
/* .param p3, "blueSize" # I */
/* .param p4, "alphaSize" # I */
/* .param p5, "depthSize" # I */
/* .param p6, "stencilSize" # I */
/* .prologue */
/* .line 343 */
/* new-instance v0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser; */
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move v5, p5 */
/* move v6, p6 */
/* invoke-direct/range {v0 ..v6}, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;-><init>(IIIIII)V */
(( android.opengl.derived.SwapGLSurfaceView ) p0 ).setEGLConfigChooser ( v0 ); // invoke-virtual {p0, v0}, Landroid/opengl/derived/SwapGLSurfaceView;->setEGLConfigChooser(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V
/* .line 345 */
return;
} // .end method
public void setEGLConfigChooser ( android.opengl.GLSurfaceView$EGLConfigChooser p0 ) {
/* .locals 0 */
/* .param p1, "configChooser" # Landroid/opengl/GLSurfaceView$EGLConfigChooser; */
/* .prologue */
/* .line 306 */
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView;->checkRenderThreadState()V */
/* .line 307 */
this.mEGLConfigChooser = p1;
/* .line 308 */
return;
} // .end method
public void setEGLConfigChooser ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "needDepth" # Z */
/* .prologue */
/* .line 325 */
/* new-instance v0, Landroid/opengl/derived/SwapGLSurfaceView$SimpleEGLConfigChooser; */
/* invoke-direct {v0, p1}, Landroid/opengl/derived/SwapGLSurfaceView$SimpleEGLConfigChooser;-><init>(Z)V */
(( android.opengl.derived.SwapGLSurfaceView ) p0 ).setEGLConfigChooser ( v0 ); // invoke-virtual {p0, v0}, Landroid/opengl/derived/SwapGLSurfaceView;->setEGLConfigChooser(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V
/* .line 326 */
return;
} // .end method
public void setEGLContextFactory ( android.opengl.GLSurfaceView$EGLContextFactory p0 ) {
/* .locals 0 */
/* .param p1, "factory" # Landroid/opengl/GLSurfaceView$EGLContextFactory; */
/* .prologue */
/* .line 276 */
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView;->checkRenderThreadState()V */
/* .line 277 */
this.mEGLContextFactory = p1;
/* .line 278 */
return;
} // .end method
public void setEGLWindowSurfaceFactory ( android.opengl.GLSurfaceView$EGLWindowSurfaceFactory p0 ) {
/* .locals 0 */
/* .param p1, "factory" # Landroid/opengl/GLSurfaceView$EGLWindowSurfaceFactory; */
/* .prologue */
/* .line 290 */
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView;->checkRenderThreadState()V */
/* .line 291 */
this.mEGLWindowSurfaceFactory = p1;
/* .line 292 */
return;
} // .end method
public void setGLWrapper ( android.opengl.GLSurfaceView$GLWrapper p0 ) {
/* .locals 0 */
/* .param p1, "glWrapper" # Landroid/opengl/GLSurfaceView$GLWrapper; */
/* .prologue */
/* .line 200 */
this.mGLWrapper = p1;
/* .line 201 */
return;
} // .end method
public void setNeedsSwap ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1220 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView;->mNeedsSwap:Z */
/* .line 1221 */
return;
} // .end method
public void setRenderMode ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "renderMode" # I */
/* .prologue */
/* .line 363 */
v0 = this.mGLThread;
(( android.opengl.derived.SwapGLSurfaceView$GLThread ) v0 ).setRenderMode ( p1 ); // invoke-virtual {v0, p1}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->setRenderMode(I)V
/* .line 364 */
return;
} // .end method
public void setRenderer ( android.opengl.GLSurfaceView$Renderer p0 ) {
/* .locals 3 */
/* .param p1, "renderer" # Landroid/opengl/GLSurfaceView$Renderer; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 251 */
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView;->checkRenderThreadState()V */
/* .line 252 */
v0 = this.mEGLConfigChooser;
/* if-nez v0, :cond_0 */
/* .line 253 */
/* new-instance v0, Landroid/opengl/derived/SwapGLSurfaceView$SimpleEGLConfigChooser; */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, v1}, Landroid/opengl/derived/SwapGLSurfaceView$SimpleEGLConfigChooser;-><init>(Z)V */
this.mEGLConfigChooser = v0;
/* .line 255 */
} // :cond_0
v0 = this.mEGLContextFactory;
/* if-nez v0, :cond_1 */
/* .line 256 */
/* new-instance v0, Landroid/opengl/derived/SwapGLSurfaceView$DefaultContextFactory; */
/* invoke-direct {v0, v2}, Landroid/opengl/derived/SwapGLSurfaceView$DefaultContextFactory;-><init>(Landroid/opengl/derived/SwapGLSurfaceView$1;)V */
this.mEGLContextFactory = v0;
/* .line 258 */
} // :cond_1
v0 = this.mEGLWindowSurfaceFactory;
/* if-nez v0, :cond_2 */
/* .line 259 */
/* new-instance v0, Landroid/opengl/derived/SwapGLSurfaceView$DefaultWindowSurfaceFactory; */
/* invoke-direct {v0, v2}, Landroid/opengl/derived/SwapGLSurfaceView$DefaultWindowSurfaceFactory;-><init>(Landroid/opengl/derived/SwapGLSurfaceView$1;)V */
this.mEGLWindowSurfaceFactory = v0;
/* .line 261 */
} // :cond_2
/* new-instance v0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread; */
/* invoke-direct {v0, p0, p1}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;-><init>(Landroid/opengl/derived/SwapGLSurfaceView;Landroid/opengl/GLSurfaceView$Renderer;)V */
this.mGLThread = v0;
/* .line 262 */
v0 = this.mGLThread;
(( android.opengl.derived.SwapGLSurfaceView$GLThread ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->start()V
/* .line 263 */
return;
} // .end method
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .param p2, "format" # I */
/* .param p3, "w" # I */
/* .param p4, "h" # I */
/* .prologue */
/* .line 416 */
v0 = this.mGLThread;
(( android.opengl.derived.SwapGLSurfaceView$GLThread ) v0 ).onWindowResize ( p3, p4 ); // invoke-virtual {v0, p3, p4}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->onWindowResize(II)V
/* .line 417 */
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 394 */
if ( p1 != null) { // if-eqz p1, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.view.Surface ) v0 ).isValid ( ); // invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z
/* if-nez v0, :cond_1 */
/* .line 400 */
} // :cond_0
} // :goto_0
return;
/* .line 399 */
} // :cond_1
v0 = this.mGLThread;
(( android.opengl.derived.SwapGLSurfaceView$GLThread ) v0 ).surfaceCreated ( ); // invoke-virtual {v0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->surfaceCreated()V
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 408 */
v0 = this.mGLThread;
(( android.opengl.derived.SwapGLSurfaceView$GLThread ) v0 ).surfaceDestroyed ( ); // invoke-virtual {v0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->surfaceDestroyed()V
/* .line 409 */
return;
} // .end method
