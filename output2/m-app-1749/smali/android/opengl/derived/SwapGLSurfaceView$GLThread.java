class android.opengl.derived.SwapGLSurfaceView$GLThread extends java.lang.Thread {
	 /* .source "SwapGLSurfaceView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/opengl/derived/SwapGLSurfaceView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "GLThread" */
} // .end annotation
/* # instance fields */
private Boolean mDone;
private android.opengl.derived.SwapGLSurfaceView$EglHelper mEglHelper;
private java.util.ArrayList mEventQueue;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Ljava/lang/Runnable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean mEventsWaiting;
private Boolean mHasSurface;
private Boolean mHaveEgl;
private Integer mHeight;
private Boolean mPaused;
private Integer mRenderMode;
private android.opengl.GLSurfaceView$Renderer mRenderer;
private Boolean mRequestRender;
private Boolean mWaitingForSurface;
private Integer mWidth;
final android.opengl.derived.SwapGLSurfaceView this$0; //synthetic
/* # direct methods */
 android.opengl.derived.SwapGLSurfaceView$GLThread ( ) {
/* .locals 3 */
/* .param p2, "renderer" # Landroid/opengl/GLSurfaceView$Renderer; */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 807 */
this.this$0 = p1;
/* .line 808 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
/* .line 1125 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.mEventQueue = v0;
/* .line 809 */
/* iput-boolean v1, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mDone:Z */
/* .line 810 */
/* iput v1, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mWidth:I */
/* .line 811 */
/* iput v1, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHeight:I */
/* .line 812 */
/* iput-boolean v2, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mRequestRender:Z */
/* .line 813 */
/* iput v2, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mRenderMode:I */
/* .line 814 */
this.mRenderer = p2;
/* .line 815 */
return;
} // .end method
static Boolean access$1002 ( android.opengl.derived.SwapGLSurfaceView$GLThread p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Landroid/opengl/derived/SwapGLSurfaceView$GLThread; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 806 */
/* iput-boolean p1, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mDone:Z */
} // .end method
private java.lang.Runnable getEvent ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1101 */
/* monitor-enter p0 */
/* .line 1102 */
try { // :try_start_0
v0 = this.mEventQueue;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lez v0, :cond_0 */
/* .line 1103 */
v0 = this.mEventQueue;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Runnable; */
/* monitor-exit p0 */
/* .line 1107 */
} // :goto_0
/* .line 1106 */
} // :cond_0
/* monitor-exit p0 */
/* .line 1107 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1106 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
private void guardedRun ( ) {
/* .locals 14 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/InterruptedException; */
/* } */
} // .end annotation
/* .prologue */
int v13 = 1; // const/4 v13, 0x1
/* .line 847 */
/* new-instance v10, Landroid/opengl/derived/SwapGLSurfaceView$EglHelper; */
v11 = this.this$0;
/* invoke-direct {v10, v11}, Landroid/opengl/derived/SwapGLSurfaceView$EglHelper;-><init>(Landroid/opengl/derived/SwapGLSurfaceView;)V */
this.mEglHelper = v10;
/* .line 849 */
int v3 = 0; // const/4 v3, 0x0
/* .line 850 */
/* .local v3, "gl":Ljavax/microedition/khronos/opengles/GL10; */
int v8 = 1; // const/4 v8, 0x1
/* .line 851 */
/* .local v8, "tellRendererSurfaceCreated":Z */
int v7 = 1; // const/4 v7, 0x1
/* .line 857 */
/* .local v7, "tellRendererSurfaceChanged":Z */
} // :cond_0
} // :goto_0
try { // :try_start_0
v10 = /* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->isDone()Z */
/* if-nez v10, :cond_f */
/* .line 861 */
int v9 = 0; // const/4 v9, 0x0
/* .line 862 */
/* .local v9, "w":I */
int v4 = 0; // const/4 v4, 0x0
/* .line 863 */
/* .local v4, "h":I */
int v1 = 0; // const/4 v1, 0x0
/* .line 864 */
/* .local v1, "changed":Z */
int v5 = 0; // const/4 v5, 0x0
/* .line 865 */
/* .local v5, "needStart":Z */
int v2 = 0; // const/4 v2, 0x0
/* .line 867 */
/* .local v2, "eventsWaiting":Z */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
/* monitor-enter v11 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_3 */
/* .line 871 */
} // :goto_1
try { // :try_start_1
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mPaused:Z */
if ( v10 != null) { // if-eqz v10, :cond_1
/* .line 872 */
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->stopEglLocked()V */
/* .line 874 */
} // :cond_1
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHasSurface:Z */
/* if-nez v10, :cond_3 */
/* .line 875 */
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mWaitingForSurface:Z */
/* if-nez v10, :cond_2 */
/* .line 876 */
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->stopEglLocked()V */
/* .line 877 */
int v10 = 1; // const/4 v10, 0x1
/* iput-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mWaitingForSurface:Z */
/* .line 878 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
(( java.lang.Object ) v10 ).notifyAll ( ); // invoke-virtual {v10}, Ljava/lang/Object;->notifyAll()V
/* .line 896 */
} // :cond_2
} // :goto_2
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mDone:Z */
if ( v10 != null) { // if-eqz v10, :cond_4
/* .line 897 */
/* monitor-exit v11 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
/* .line 984 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
/* monitor-enter v11 */
/* .line 985 */
try { // :try_start_2
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->stopEglLocked()V */
/* .line 986 */
/* monitor-exit v11 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 988 */
} // .end local v1 # "changed":Z
} // .end local v2 # "eventsWaiting":Z
} // .end local v4 # "h":I
} // .end local v5 # "needStart":Z
} // .end local v9 # "w":I
} // :goto_3
return;
/* .line 881 */
/* .restart local v1 # "changed":Z */
/* .restart local v2 # "eventsWaiting":Z */
/* .restart local v4 # "h":I */
/* .restart local v5 # "needStart":Z */
/* .restart local v9 # "w":I */
} // :cond_3
try { // :try_start_3
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHaveEgl:Z */
/* if-nez v10, :cond_2 */
/* .line 882 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
v10 = (( android.opengl.derived.SwapGLSurfaceView$GLThreadManager ) v10 ).tryAcquireEglSurface ( p0 ); // invoke-virtual {v10, p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThreadManager;->tryAcquireEglSurface(Landroid/opengl/derived/SwapGLSurfaceView$GLThread;)Z
if ( v10 != null) { // if-eqz v10, :cond_2
/* .line 883 */
int v10 = 1; // const/4 v10, 0x1
/* iput-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHaveEgl:Z */
/* .line 884 */
v10 = this.mEglHelper;
(( android.opengl.derived.SwapGLSurfaceView$EglHelper ) v10 ).start ( ); // invoke-virtual {v10}, Landroid/opengl/derived/SwapGLSurfaceView$EglHelper;->start()V
/* .line 885 */
int v10 = 1; // const/4 v10, 0x1
/* iput-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mRequestRender:Z */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
/* .line 886 */
int v5 = 1; // const/4 v5, 0x1
/* .line 986 */
/* :catchall_0 */
/* move-exception v10 */
try { // :try_start_4
/* monitor-exit v11 */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* throw v10 */
/* .line 900 */
} // :cond_4
try { // :try_start_5
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mEventsWaiting:Z */
if ( v10 != null) { // if-eqz v10, :cond_7
/* .line 901 */
int v2 = 1; // const/4 v2, 0x1
/* .line 902 */
int v10 = 0; // const/4 v10, 0x0
/* iput-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mEventsWaiting:Z */
/* .line 930 */
} // :cond_5
} // :goto_4
/* monitor-exit v11 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_2 */
/* .line 935 */
if ( v2 != null) { // if-eqz v2, :cond_a
/* .line 937 */
} // :cond_6
try { // :try_start_6
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->getEvent()Ljava/lang/Runnable; */
/* .local v6, "r":Ljava/lang/Runnable; */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 938 */
/* .line 939 */
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->isDone()Z */
/* :try_end_6 */
v10 = /* .catchall {:try_start_6 ..:try_end_6} :catchall_3 */
if ( v10 != null) { // if-eqz v10, :cond_6
/* .line 984 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
/* monitor-enter v11 */
/* .line 985 */
try { // :try_start_7
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->stopEglLocked()V */
/* .line 986 */
/* monitor-exit v11 */
/* :catchall_1 */
/* move-exception v10 */
/* monitor-exit v11 */
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* throw v10 */
/* .line 906 */
} // .end local v6 # "r":Ljava/lang/Runnable;
} // :cond_7
try { // :try_start_8
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mPaused:Z */
/* if-nez v10, :cond_9 */
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHasSurface:Z */
if ( v10 != null) { // if-eqz v10, :cond_9
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHaveEgl:Z */
if ( v10 != null) { // if-eqz v10, :cond_9
/* iget v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mWidth:I */
/* if-lez v10, :cond_9 */
/* iget v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHeight:I */
/* if-lez v10, :cond_9 */
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mRequestRender:Z */
/* if-nez v10, :cond_8 */
/* iget v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mRenderMode:I */
/* if-ne v10, v13, :cond_9 */
/* .line 910 */
} // :cond_8
v10 = this.this$0;
v1 = android.opengl.derived.SwapGLSurfaceView .access$800 ( v10 );
/* .line 911 */
/* iget v9, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mWidth:I */
/* .line 912 */
/* iget v4, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHeight:I */
/* .line 913 */
v10 = this.this$0;
int v12 = 0; // const/4 v12, 0x0
android.opengl.derived.SwapGLSurfaceView .access$802 ( v10,v12 );
/* .line 914 */
int v10 = 0; // const/4 v10, 0x0
/* iput-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mRequestRender:Z */
/* .line 915 */
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHasSurface:Z */
if ( v10 != null) { // if-eqz v10, :cond_5
/* iget-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mWaitingForSurface:Z */
if ( v10 != null) { // if-eqz v10, :cond_5
/* .line 916 */
int v1 = 1; // const/4 v1, 0x1
/* .line 917 */
int v10 = 0; // const/4 v10, 0x0
/* iput-boolean v10, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mWaitingForSurface:Z */
/* .line 918 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
(( java.lang.Object ) v10 ).notifyAll ( ); // invoke-virtual {v10}, Ljava/lang/Object;->notifyAll()V
/* .line 930 */
/* :catchall_2 */
/* move-exception v10 */
/* monitor-exit v11 */
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_2 */
try { // :try_start_9
/* throw v10 */
/* :try_end_9 */
/* .catchall {:try_start_9 ..:try_end_9} :catchall_3 */
/* .line 984 */
} // .end local v1 # "changed":Z
} // .end local v2 # "eventsWaiting":Z
} // .end local v4 # "h":I
} // .end local v5 # "needStart":Z
} // .end local v9 # "w":I
/* :catchall_3 */
/* move-exception v10 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
/* monitor-enter v11 */
/* .line 985 */
try { // :try_start_a
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->stopEglLocked()V */
/* .line 986 */
/* monitor-exit v11 */
/* :try_end_a */
/* .catchall {:try_start_a ..:try_end_a} :catchall_5 */
/* throw v10 */
/* .line 928 */
/* .restart local v1 # "changed":Z */
/* .restart local v2 # "eventsWaiting":Z */
/* .restart local v4 # "h":I */
/* .restart local v5 # "needStart":Z */
/* .restart local v9 # "w":I */
} // :cond_9
try { // :try_start_b
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
(( java.lang.Object ) v10 ).wait ( ); // invoke-virtual {v10}, Ljava/lang/Object;->wait()V
/* :try_end_b */
/* .catchall {:try_start_b ..:try_end_b} :catchall_2 */
/* goto/16 :goto_1 */
/* .line 947 */
} // :cond_a
if ( v5 != null) { // if-eqz v5, :cond_b
/* .line 948 */
int v8 = 1; // const/4 v8, 0x1
/* .line 949 */
int v1 = 1; // const/4 v1, 0x1
/* .line 951 */
} // :cond_b
if ( v1 != null) { // if-eqz v1, :cond_c
/* .line 952 */
try { // :try_start_c
v10 = this.mEglHelper;
v11 = this.this$0;
(( android.opengl.derived.SwapGLSurfaceView ) v11 ).getHolder ( ); // invoke-virtual {v11}, Landroid/opengl/derived/SwapGLSurfaceView;->getHolder()Landroid/view/SurfaceHolder;
(( android.opengl.derived.SwapGLSurfaceView$EglHelper ) v10 ).createSurface ( v11 ); // invoke-virtual {v10, v11}, Landroid/opengl/derived/SwapGLSurfaceView$EglHelper;->createSurface(Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;
/* move-object v0, v10 */
/* check-cast v0, Ljavax/microedition/khronos/opengles/GL10; */
/* move-object v3, v0 */
/* .line 953 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 956 */
int v7 = 1; // const/4 v7, 0x1
/* .line 958 */
} // :cond_c
if ( v8 != null) { // if-eqz v8, :cond_d
/* .line 959 */
v10 = this.mRenderer;
v11 = this.mEglHelper;
v11 = this.mEglConfig;
/* .line 960 */
int v8 = 0; // const/4 v8, 0x0
/* .line 962 */
} // :cond_d
if ( v7 != null) { // if-eqz v7, :cond_e
/* .line 963 */
v10 = this.mRenderer;
/* .line 964 */
int v7 = 0; // const/4 v7, 0x0
/* .line 966 */
} // :cond_e
/* if-lez v9, :cond_0 */
/* if-lez v4, :cond_0 */
/* .line 968 */
v10 = this.mRenderer;
/* .line 974 */
v10 = this.this$0;
v10 = android.opengl.derived.SwapGLSurfaceView .access$900 ( v10 );
if ( v10 != null) { // if-eqz v10, :cond_0
/* .line 975 */
v10 = this.mEglHelper;
(( android.opengl.derived.SwapGLSurfaceView$EglHelper ) v10 ).swap ( ); // invoke-virtual {v10}, Landroid/opengl/derived/SwapGLSurfaceView$EglHelper;->swap()Z
/* .line 976 */
v10 = this.this$0;
int v11 = 0; // const/4 v11, 0x0
android.opengl.derived.SwapGLSurfaceView .access$902 ( v10,v11 );
/* :try_end_c */
/* .catchall {:try_start_c ..:try_end_c} :catchall_3 */
/* goto/16 :goto_0 */
/* .line 984 */
} // .end local v1 # "changed":Z
} // .end local v2 # "eventsWaiting":Z
} // .end local v4 # "h":I
} // .end local v5 # "needStart":Z
} // .end local v9 # "w":I
} // :cond_f
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
/* monitor-enter v11 */
/* .line 985 */
try { // :try_start_d
/* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->stopEglLocked()V */
/* .line 986 */
/* monitor-exit v11 */
/* goto/16 :goto_3 */
/* :catchall_4 */
/* move-exception v10 */
/* monitor-exit v11 */
/* :try_end_d */
/* .catchall {:try_start_d ..:try_end_d} :catchall_4 */
/* throw v10 */
/* :catchall_5 */
/* move-exception v10 */
try { // :try_start_e
/* monitor-exit v11 */
/* :try_end_e */
/* .catchall {:try_start_e ..:try_end_e} :catchall_5 */
/* throw v10 */
} // .end method
private Boolean isDone ( ) {
/* .locals 2 */
/* .prologue */
/* .line 991 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
/* monitor-enter v1 */
/* .line 992 */
try { // :try_start_0
/* iget-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mDone:Z */
/* monitor-exit v1 */
/* .line 993 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
private void stopEglLocked ( ) {
/* .locals 1 */
/* .prologue */
/* .line 838 */
/* iget-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHaveEgl:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 839 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHaveEgl:Z */
/* .line 840 */
v0 = this.mEglHelper;
(( android.opengl.derived.SwapGLSurfaceView$EglHelper ) v0 ).destroySurface ( ); // invoke-virtual {v0}, Landroid/opengl/derived/SwapGLSurfaceView$EglHelper;->destroySurface()V
/* .line 841 */
v0 = this.mEglHelper;
(( android.opengl.derived.SwapGLSurfaceView$EglHelper ) v0 ).finish ( ); // invoke-virtual {v0}, Landroid/opengl/derived/SwapGLSurfaceView$EglHelper;->finish()V
/* .line 842 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
(( android.opengl.derived.SwapGLSurfaceView$GLThreadManager ) v0 ).releaseEglSurface ( p0 ); // invoke-virtual {v0, p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThreadManager;->releaseEglSurface(Landroid/opengl/derived/SwapGLSurfaceView$GLThread;)V
/* .line 844 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public Integer getRenderMode ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1009 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
/* monitor-enter v1 */
/* .line 1010 */
try { // :try_start_0
/* iget v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mRenderMode:I */
/* monitor-exit v1 */
/* .line 1011 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void onPause ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1049 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
/* monitor-enter v1 */
/* .line 1050 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_0
/* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mPaused:Z */
/* .line 1051 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
(( java.lang.Object ) v0 ).notifyAll ( ); // invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
/* .line 1052 */
/* monitor-exit v1 */
/* .line 1053 */
return;
/* .line 1052 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void onResume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1056 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
/* monitor-enter v1 */
/* .line 1057 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
/* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mPaused:Z */
/* .line 1058 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mRequestRender:Z */
/* .line 1059 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
(( java.lang.Object ) v0 ).notifyAll ( ); // invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
/* .line 1060 */
/* monitor-exit v1 */
/* .line 1061 */
return;
/* .line 1060 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void onWindowResize ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "w" # I */
/* .param p2, "h" # I */
/* .prologue */
/* .line 1064 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
/* monitor-enter v1 */
/* .line 1065 */
try { // :try_start_0
/* iput p1, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mWidth:I */
/* .line 1066 */
/* iput p2, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHeight:I */
/* .line 1067 */
v0 = this.this$0;
int v2 = 1; // const/4 v2, 0x1
android.opengl.derived.SwapGLSurfaceView .access$802 ( v0,v2 );
/* .line 1068 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
(( java.lang.Object ) v0 ).notifyAll ( ); // invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
/* .line 1069 */
/* monitor-exit v1 */
/* .line 1070 */
return;
/* .line 1069 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void queueEvent ( java.lang.Runnable p0 ) {
/* .locals 2 */
/* .param p1, "r" # Ljava/lang/Runnable; */
/* .prologue */
/* .line 1091 */
/* monitor-enter p0 */
/* .line 1092 */
try { // :try_start_0
v0 = this.mEventQueue;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 1093 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
/* monitor-enter v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 1094 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_1
/* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mEventsWaiting:Z */
/* .line 1095 */
android.opengl.derived.SwapGLSurfaceView .access$700 ( );
(( java.lang.Object ) v0 ).notifyAll ( ); // invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
/* .line 1096 */
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 1097 */
try { // :try_start_2
/* monitor-exit p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 1098 */
return;
/* .line 1096 */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_3
/* monitor-exit v1 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
try { // :try_start_4
	 /* throw v0 */
	 /* .line 1097 */
	 /* :catchall_1 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_4 */
	 /* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
	 /* throw v0 */
} // .end method
public void requestExitAndWait ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 1075 */
	 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
	 /* monitor-enter v2 */
	 /* .line 1076 */
	 int v1 = 1; // const/4 v1, 0x1
	 try { // :try_start_0
		 /* iput-boolean v1, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mDone:Z */
		 /* .line 1077 */
		 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
		 (( java.lang.Object ) v1 ).notifyAll ( ); // invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
		 /* .line 1078 */
		 /* monitor-exit v2 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 1080 */
		 try { // :try_start_1
			 (( android.opengl.derived.SwapGLSurfaceView$GLThread ) p0 ).join ( ); // invoke-virtual {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->join()V
			 /* :try_end_1 */
			 /* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* .line 1084 */
		 } // :goto_0
		 return;
		 /* .line 1078 */
		 /* :catchall_0 */
		 /* move-exception v1 */
		 try { // :try_start_2
			 /* monitor-exit v2 */
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
			 /* throw v1 */
			 /* .line 1081 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 1082 */
			 /* .local v0, "ex":Ljava/lang/InterruptedException; */
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
		 } // .end method
		 public void requestRender ( ) {
			 /* .locals 2 */
			 /* .prologue */
			 /* .line 1015 */
			 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
			 /* monitor-enter v1 */
			 /* .line 1016 */
			 int v0 = 1; // const/4 v0, 0x1
			 try { // :try_start_0
				 /* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mRequestRender:Z */
				 /* .line 1017 */
				 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
				 (( java.lang.Object ) v0 ).notifyAll ( ); // invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
				 /* .line 1018 */
				 /* monitor-exit v1 */
				 /* .line 1019 */
				 return;
				 /* .line 1018 */
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit v1 */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* throw v0 */
			 } // .end method
			 public void run ( ) {
				 /* .locals 3 */
				 /* .prologue */
				 /* .line 819 */
				 /* new-instance v0, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v1 = "GLThread "; // const-string v1, "GLThread "
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( android.opengl.derived.SwapGLSurfaceView$GLThread ) p0 ).getId ( ); // invoke-virtual {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->getId()J
				 /* move-result-wide v1 */
				 (( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 (( android.opengl.derived.SwapGLSurfaceView$GLThread ) p0 ).setName ( v0 ); // invoke-virtual {p0, v0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->setName(Ljava/lang/String;)V
				 /* .line 825 */
				 try { // :try_start_0
					 /* invoke-direct {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->guardedRun()V */
					 /* :try_end_0 */
					 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* .line 829 */
					 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
					 (( android.opengl.derived.SwapGLSurfaceView$GLThreadManager ) v0 ).threadExiting ( p0 ); // invoke-virtual {v0, p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThreadManager;->threadExiting(Landroid/opengl/derived/SwapGLSurfaceView$GLThread;)V
					 /* .line 831 */
				 } // :goto_0
				 return;
				 /* .line 826 */
				 /* :catch_0 */
				 /* move-exception v0 */
				 /* .line 829 */
				 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
				 (( android.opengl.derived.SwapGLSurfaceView$GLThreadManager ) v0 ).threadExiting ( p0 ); // invoke-virtual {v0, p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThreadManager;->threadExiting(Landroid/opengl/derived/SwapGLSurfaceView$GLThread;)V
				 /* :catchall_0 */
				 /* move-exception v0 */
				 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
				 (( android.opengl.derived.SwapGLSurfaceView$GLThreadManager ) v1 ).threadExiting ( p0 ); // invoke-virtual {v1, p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThreadManager;->threadExiting(Landroid/opengl/derived/SwapGLSurfaceView$GLThread;)V
				 /* throw v0 */
			 } // .end method
			 public void setRenderMode ( Integer p0 ) {
				 /* .locals 2 */
				 /* .param p1, "renderMode" # I */
				 /* .prologue */
				 int v0 = 1; // const/4 v0, 0x1
				 /* .line 997 */
				 /* if-ltz p1, :cond_0 */
				 /* if-le p1, v0, :cond_1 */
				 /* .line 998 */
			 } // :cond_0
			 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
			 final String v1 = "renderMode"; // const-string v1, "renderMode"
			 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
			 /* throw v0 */
			 /* .line 1000 */
		 } // :cond_1
		 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
		 /* monitor-enter v1 */
		 /* .line 1001 */
		 try { // :try_start_0
			 /* iput p1, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mRenderMode:I */
			 /* .line 1002 */
			 /* if-ne p1, v0, :cond_2 */
			 /* .line 1003 */
			 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
			 (( java.lang.Object ) v0 ).notifyAll ( ); // invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
			 /* .line 1005 */
		 } // :cond_2
		 /* monitor-exit v1 */
		 /* .line 1006 */
		 return;
		 /* .line 1005 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit v1 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw v0 */
	 } // .end method
	 public void surfaceCreated ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 1022 */
		 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
		 /* monitor-enter v1 */
		 /* .line 1026 */
		 int v0 = 1; // const/4 v0, 0x1
		 try { // :try_start_0
			 /* iput-boolean v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHasSurface:Z */
			 /* .line 1027 */
			 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
			 (( java.lang.Object ) v0 ).notifyAll ( ); // invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
			 /* .line 1028 */
			 /* monitor-exit v1 */
			 /* .line 1029 */
			 return;
			 /* .line 1028 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit v1 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* throw v0 */
		 } // .end method
		 public void surfaceDestroyed ( ) {
			 /* .locals 3 */
			 /* .prologue */
			 /* .line 1032 */
			 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
			 /* monitor-enter v2 */
			 /* .line 1036 */
			 int v1 = 0; // const/4 v1, 0x0
			 try { // :try_start_0
				 /* iput-boolean v1, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mHasSurface:Z */
				 /* .line 1037 */
				 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
				 (( java.lang.Object ) v1 ).notifyAll ( ); // invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
				 /* .line 1038 */
			 } // :goto_0
			 /* iget-boolean v1, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mWaitingForSurface:Z */
			 /* if-nez v1, :cond_0 */
			 v1 = 			 (( android.opengl.derived.SwapGLSurfaceView$GLThread ) p0 ).isAlive ( ); // invoke-virtual {p0}, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->isAlive()Z
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* iget-boolean v1, p0, Landroid/opengl/derived/SwapGLSurfaceView$GLThread;->mDone:Z */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* if-nez v1, :cond_0 */
				 /* .line 1040 */
				 try { // :try_start_1
					 android.opengl.derived.SwapGLSurfaceView .access$700 ( );
					 (( java.lang.Object ) v1 ).wait ( ); // invoke-virtual {v1}, Ljava/lang/Object;->wait()V
					 /* :try_end_1 */
					 /* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
					 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
					 /* .line 1041 */
					 /* :catch_0 */
					 /* move-exception v0 */
					 /* .line 1042 */
					 /* .local v0, "e":Ljava/lang/InterruptedException; */
					 try { // :try_start_2
						 java.lang.Thread .currentThread ( );
						 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
						 /* .line 1045 */
					 } // .end local v0 # "e":Ljava/lang/InterruptedException;
					 /* :catchall_0 */
					 /* move-exception v1 */
					 /* monitor-exit v2 */
					 /* :try_end_2 */
					 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
					 /* throw v1 */
				 } // :cond_0
				 try { // :try_start_3
					 /* monitor-exit v2 */
					 /* :try_end_3 */
					 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
					 /* .line 1046 */
					 return;
				 } // .end method
