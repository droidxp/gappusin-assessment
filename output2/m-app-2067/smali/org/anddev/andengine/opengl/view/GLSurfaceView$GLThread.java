class org.anddev.andengine.opengl.view.GLSurfaceView$GLThread extends java.lang.Thread {
	 /* # instance fields */
	 private Boolean mDone;
	 private org.anddev.andengine.opengl.view.GLSurfaceView$EglHelper mEglHelper;
	 private final java.util.ArrayList mEventQueue;
	 private Boolean mHasSurface;
	 private Integer mHeight;
	 private Boolean mPaused;
	 private Integer mRenderMode;
	 private final org.anddev.andengine.opengl.view.GLSurfaceView$Renderer mRenderer;
	 private Boolean mRequestRender;
	 private Boolean mSizeChanged;
	 private Integer mWidth;
	 final org.anddev.andengine.opengl.view.GLSurfaceView this$0; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ( ) {
		 /* .locals 3 */
		 int v2 = 1; // const/4 v2, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mEventQueue = v0;
		 /* iput-boolean v1, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mDone:Z */
		 /* iput v1, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mWidth:I */
		 /* iput v1, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mHeight:I */
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mRequestRender:Z */
		 /* iput v2, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mRenderMode:I */
		 this.mRenderer = p2;
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mSizeChanged:Z */
		 final String v0 = "GLThread"; // const-string v0, "GLThread"
		 (( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) p0 ).setName ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->setName(Ljava/lang/String;)V
		 return;
	 } // .end method
	 private java.lang.Runnable getEvent ( ) {
		 /* .locals 2 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v0 = this.mEventQueue;
			 v0 = 			 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
			 /* if-lez v0, :cond_0 */
			 v0 = this.mEventQueue;
			 int v1 = 0; // const/4 v1, 0x0
			 (( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
			 /* check-cast v0, Ljava/lang/Runnable; */
			 /* monitor-exit p0 */
		 } // :goto_0
	 } // :cond_0
	 /* monitor-exit p0 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
private void guardedRun ( ) {
	 /* .locals 11 */
	 int v9 = 0; // const/4 v9, 0x0
	 int v8 = 1; // const/4 v8, 0x1
	 /* new-instance v0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$EglHelper; */
	 v1 = this.this$0;
	 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$EglHelper;-><init>(Lorg/anddev/andengine/opengl/view/GLSurfaceView;)V */
	 this.mEglHelper = v0;
	 v0 = this.mEglHelper;
	 (( org.anddev.andengine.opengl.view.GLSurfaceView$EglHelper ) v0 ).start ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$EglHelper;->start()V
	 int v0 = 0; // const/4 v0, 0x0
	 /* move v1, v8 */
	 /* move-object v2, v0 */
	 /* move v0, v8 */
} // :goto_0
/* iget-boolean v3, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mDone:Z */
if ( v3 != null) { // if-eqz v3, :cond_0
} // :goto_1
v0 = this.mEglHelper;
(( org.anddev.andengine.opengl.view.GLSurfaceView$EglHelper ) v0 ).finish ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$EglHelper;->finish()V
return;
} // :cond_0
/* monitor-enter p0 */
} // :goto_2
try { // :try_start_0
/* invoke-direct {p0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->getEvent()Ljava/lang/Runnable; */
/* if-nez v3, :cond_1 */
/* iget-boolean v3, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mPaused:Z */
if ( v3 != null) { // if-eqz v3, :cond_8
v3 = this.mEglHelper;
(( org.anddev.andengine.opengl.view.GLSurfaceView$EglHelper ) v3 ).finish ( ); // invoke-virtual {v3}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$EglHelper;->finish()V
/* move v3, v8 */
} // :goto_3
v4 = /* invoke-direct {p0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->needToWait()Z */
/* if-nez v4, :cond_2 */
/* iget-boolean v4, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mDone:Z */
if ( v4 != null) { // if-eqz v4, :cond_3
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // :cond_1
try { // :try_start_1
} // :cond_2
(( java.lang.Object ) p0 ).wait ( ); // invoke-virtual {p0}, Ljava/lang/Object;->wait()V
} // :cond_3
/* iget-boolean v4, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mSizeChanged:Z */
/* iget v5, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mWidth:I */
/* iget v6, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mHeight:I */
int v7 = 0; // const/4 v7, 0x0
/* iput-boolean v7, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mSizeChanged:Z */
int v7 = 0; // const/4 v7, 0x0
/* iput-boolean v7, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mRequestRender:Z */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v3 != null) { // if-eqz v3, :cond_7
v1 = this.mEglHelper;
(( org.anddev.andengine.opengl.view.GLSurfaceView$EglHelper ) v1 ).start ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$EglHelper;->start()V
/* move v1, v8 */
/* move v3, v8 */
} // :goto_4
if ( v1 != null) { // if-eqz v1, :cond_6
v0 = this.mEglHelper;
v1 = this.this$0;
(( org.anddev.andengine.opengl.view.GLSurfaceView ) v1 ).getHolder ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/view/GLSurfaceView;->getHolder()Landroid/view/SurfaceHolder;
(( org.anddev.andengine.opengl.view.GLSurfaceView$EglHelper ) v0 ).createSurface ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$EglHelper;->createSurface(Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;
/* check-cast v0, Ljavax/microedition/khronos/opengles/GL10; */
/* move-object v1, v0 */
/* move v0, v8 */
} // :goto_5
if ( v3 != null) { // if-eqz v3, :cond_9
v2 = this.mRenderer;
v3 = this.mEglHelper;
v3 = this.mEglConfig;
/* move v2, v9 */
} // :goto_6
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.mRenderer;
/* move v0, v9 */
} // :cond_4
/* if-lez v5, :cond_5 */
/* if-lez v6, :cond_5 */
v3 = this.mRenderer;
v3 = this.mEglHelper;
(( org.anddev.andengine.opengl.view.GLSurfaceView$EglHelper ) v3 ).swap ( ); // invoke-virtual {v3}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$EglHelper;->swap()Z
} // :cond_5
/* move v10, v2 */
/* move-object v2, v1 */
/* move v1, v10 */
} // :cond_6
/* move-object v1, v2 */
} // :cond_7
/* move v3, v1 */
/* move v1, v4 */
} // :cond_8
/* move v3, v9 */
} // :cond_9
/* move v2, v3 */
} // .end method
private Boolean needToWait ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
int v1 = 1; // const/4 v1, 0x1
/* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mDone:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v0, v2 */
} // :goto_0
} // :cond_0
/* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mPaused:Z */
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mHasSurface:Z */
/* if-nez v0, :cond_2 */
} // :cond_1
/* move v0, v1 */
} // :cond_2
/* iget v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mWidth:I */
/* if-lez v0, :cond_4 */
/* iget v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mHeight:I */
/* if-lez v0, :cond_4 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mRequestRender:Z */
/* if-nez v0, :cond_3 */
/* iget v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mRenderMode:I */
/* if-ne v0, v1, :cond_4 */
} // :cond_3
/* move v0, v2 */
} // :cond_4
/* move v0, v1 */
} // .end method
/* # virtual methods */
public Integer getRenderMode ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mRenderMode:I */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void onPause ( ) {
/* .locals 1 */
/* monitor-enter p0 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_0
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mPaused:Z */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void onResume ( ) {
/* .locals 1 */
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mPaused:Z */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void onWindowResize ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* iput p1, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mWidth:I */
/* iput p2, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mHeight:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mSizeChanged:Z */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void queueEvent ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.mEventQueue;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void requestExitAndWait ( ) {
/* .locals 1 */
/* monitor-enter p0 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_0
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mDone:Z */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
try { // :try_start_1
(( org.anddev.andengine.opengl.view.GLSurfaceView$GLThread ) p0 ).join ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->join()V
/* :try_end_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
} // :goto_0
return;
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_2
/* monitor-exit p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw v0 */
/* :catch_0 */
/* move-exception v0 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
} // .end method
public void requestRender ( ) {
/* .locals 1 */
/* monitor-enter p0 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_0
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mRequestRender:Z */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void run ( ) {
/* .locals 2 */
try { // :try_start_0
org.anddev.andengine.opengl.view.GLSurfaceView .access$0 ( );
(( java.util.concurrent.Semaphore ) v0 ).acquire ( ); // invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
try { // :try_start_1
/* invoke-direct {p0}, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->guardedRun()V */
/* :try_end_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
org.anddev.andengine.opengl.view.GLSurfaceView .access$0 ( );
(( java.util.concurrent.Semaphore ) v0 ).release ( ); // invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
org.anddev.andengine.opengl.view.GLSurfaceView .access$0 ( );
(( java.util.concurrent.Semaphore ) v0 ).release ( ); // invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V
/* :catch_1 */
/* move-exception v0 */
org.anddev.andengine.opengl.view.GLSurfaceView .access$0 ( );
(( java.util.concurrent.Semaphore ) v0 ).release ( ); // invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V
/* :catchall_0 */
/* move-exception v0 */
org.anddev.andengine.opengl.view.GLSurfaceView .access$0 ( );
(( java.util.concurrent.Semaphore ) v1 ).release ( ); // invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->release()V
/* throw v0 */
} // .end method
public void setRenderMode ( Integer p0 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* if-ltz p1, :cond_0 */
/* if-le p1, v0, :cond_1 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "renderMode"; // const-string v1, "renderMode"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
/* monitor-enter p0 */
try { // :try_start_0
/* iput p1, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mRenderMode:I */
/* if-ne p1, v0, :cond_2 */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
} // :cond_2
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void surfaceCreated ( ) {
/* .locals 1 */
/* monitor-enter p0 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_0
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mHasSurface:Z */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void surfaceDestroyed ( ) {
/* .locals 1 */
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/view/GLSurfaceView$GLThread;->mHasSurface:Z */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
