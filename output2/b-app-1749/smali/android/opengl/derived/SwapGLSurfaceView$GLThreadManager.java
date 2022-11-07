class android.opengl.derived.SwapGLSurfaceView$GLThreadManager {
	 /* .source "SwapGLSurfaceView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/opengl/derived/SwapGLSurfaceView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "GLThreadManager" */
} // .end annotation
/* # instance fields */
private android.opengl.derived.SwapGLSurfaceView$GLThread mEglOwner;
/* # direct methods */
private android.opengl.derived.SwapGLSurfaceView$GLThreadManager ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1169 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 android.opengl.derived.SwapGLSurfaceView$GLThreadManager ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Landroid/opengl/derived/SwapGLSurfaceView$1; */
/* .prologue */
/* .line 1169 */
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThreadManager;-><init>()V */
return;
} // .end method
/* # virtual methods */
public synchronized void releaseEglSurface ( android.opengl.derived.SwapGLSurfaceView$GLThread p0 ) {
/* .locals 1 */
/* .param p1, "thread" # Landroid/opengl/derived/SwapGLSurfaceView$GLThread; */
/* .prologue */
/* .line 1197 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.mEglOwner;
	 /* if-ne v0, p1, :cond_0 */
	 /* .line 1198 */
	 int v0 = 0; // const/4 v0, 0x0
	 this.mEglOwner = v0;
	 /* .line 1200 */
} // :cond_0
(( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1201 */
/* monitor-exit p0 */
return;
/* .line 1197 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void threadExiting ( android.opengl.derived.SwapGLSurfaceView$GLThread p0 ) {
/* .locals 1 */
/* .param p1, "thread" # Landroid/opengl/derived/SwapGLSurfaceView$GLThread; */
/* .prologue */
/* .line 1175 */
/* monitor-enter p0 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_0
	 android.opengl.derived.SwapGLSurfaceView$GLThread .access$1002 ( p1,v0 );
	 /* .line 1176 */
	 v0 = this.mEglOwner;
	 /* if-ne v0, p1, :cond_0 */
	 /* .line 1177 */
	 int v0 = 0; // const/4 v0, 0x0
	 this.mEglOwner = v0;
	 /* .line 1179 */
} // :cond_0
(( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1180 */
/* monitor-exit p0 */
return;
/* .line 1175 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized Boolean tryAcquireEglSurface ( android.opengl.derived.SwapGLSurfaceView$GLThread p0 ) {
/* .locals 1 */
/* .param p1, "thread" # Landroid/opengl/derived/SwapGLSurfaceView$GLThread; */
/* .prologue */
/* .line 1188 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.mEglOwner;
	 /* if-eq v0, p1, :cond_0 */
	 v0 = this.mEglOwner;
	 /* if-nez v0, :cond_1 */
	 /* .line 1189 */
} // :cond_0
this.mEglOwner = p1;
/* .line 1190 */
(( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1191 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1193 */
} // :goto_0
/* monitor-exit p0 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 1188 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
