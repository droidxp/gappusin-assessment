class android.opengl.derived.SwapGLSurfaceView$EglHelper {
	 /* .source "SwapGLSurfaceView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/opengl/derived/SwapGLSurfaceView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "EglHelper" */
} // .end annotation
/* # instance fields */
javax.microedition.khronos.egl.EGL10 mEgl;
javax.microedition.khronos.egl.EGLConfig mEglConfig;
javax.microedition.khronos.egl.EGLContext mEglContext;
javax.microedition.khronos.egl.EGLDisplay mEglDisplay;
javax.microedition.khronos.egl.EGLSurface mEglSurface;
final android.opengl.derived.SwapGLSurfaceView this$0; //synthetic
/* # direct methods */
public android.opengl.derived.SwapGLSurfaceView$EglHelper ( ) {
/* .locals 0 */
/* .prologue */
/* .line 634 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 636 */
return;
} // .end method
/* # virtual methods */
public javax.microedition.khronos.opengles.GL createSurface ( android.view.SurfaceHolder p0 ) {
/* .locals 9 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 678 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 if ( v4 != null) { // if-eqz v4, :cond_0
		 v4 = 		 (( android.view.Surface ) v4 ).isValid ( ); // invoke-virtual {v4}, Landroid/view/Surface;->isValid()Z
		 /* if-nez v4, :cond_1 */
		 /* .line 744 */
	 } // :cond_0
} // :goto_0
/* .line 686 */
} // :cond_1
v4 = this.mEglSurface;
if ( v4 != null) { // if-eqz v4, :cond_2
v4 = this.mEglSurface;
v5 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
/* if-eq v4, v5, :cond_2 */
/* .line 691 */
v4 = this.mEgl;
v5 = this.mEglDisplay;
v6 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v7 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v8 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
/* .line 693 */
v4 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$400 ( v4 );
v5 = this.mEgl;
v6 = this.mEglDisplay;
v7 = this.mEglSurface;
/* .line 699 */
} // :cond_2
v4 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$400 ( v4 );
v5 = this.mEgl;
v6 = this.mEglDisplay;
v7 = this.mEglConfig;
this.mEglSurface = v4;
/* .line 700 */
v4 = this.mEglSurface;
if ( v4 != null) { // if-eqz v4, :cond_3
v4 = this.mEglSurface;
v5 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
/* if-ne v4, v5, :cond_4 */
/* .line 701 */
} // :cond_3
/* new-instance v4, Ljava/lang/RuntimeException; */
final String v5 = "createWindowSurface failed"; // const-string v5, "createWindowSurface failed"
/* invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v4 */
/* .line 708 */
} // :cond_4
v4 = this.mEgl;
v5 = this.mEglDisplay;
v6 = this.mEglSurface;
v7 = this.mEglSurface;
v4 = v8 = this.mEglContext;
/* if-nez v4, :cond_5 */
/* .line 709 */
/* new-instance v4, Ljava/lang/RuntimeException; */
final String v5 = "eglMakeCurrent failed."; // const-string v5, "eglMakeCurrent failed."
/* invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v4 */
/* .line 713 */
} // :cond_5
/* const/16 v4, 0x1f01 */
android.opengl.GLES10 .glGetString ( v4 );
/* .line 714 */
/* .local v3, "rendererName":Ljava/lang/String; */
if ( v3 != null) { // if-eqz v3, :cond_6
final String v4 = "PowerVR SGX 540"; // const-string v4, "PowerVR SGX 540"
v4 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_6
v4 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$200 ( v4 );
/* instance-of v4, v4, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser; */
if ( v4 != null) { // if-eqz v4, :cond_6
v4 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$200 ( v4 );
/* check-cast v4, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser; */
v4 = (( android.opengl.derived.SwapGLSurfaceView$ComponentSizeChooser ) v4 ).getMinAlphaSize ( ); // invoke-virtual {v4}, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->getMinAlphaSize()I
/* if-lez v4, :cond_6 */
/* .line 720 */
v4 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$200 ( v4 );
/* check-cast v4, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser; */
int v5 = 0; // const/4 v5, 0x0
(( android.opengl.derived.SwapGLSurfaceView$ComponentSizeChooser ) v4 ).setMinAlphaSize ( v5 ); // invoke-virtual {v4, v5}, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->setMinAlphaSize(I)V
/* .line 721 */
(( android.opengl.derived.SwapGLSurfaceView$EglHelper ) p0 ).destroySurface ( ); // invoke-virtual {p0}, Landroid/opengl/derived/SwapGLSurfaceView$EglHelper;->destroySurface()V
/* .line 722 */
v4 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$300 ( v4 );
v5 = this.mEgl;
v6 = this.mEglDisplay;
v7 = this.mEglContext;
/* .line 723 */
this.mEglContext = v1;
/* .line 724 */
(( android.opengl.derived.SwapGLSurfaceView$EglHelper ) p0 ).start ( ); // invoke-virtual {p0}, Landroid/opengl/derived/SwapGLSurfaceView$EglHelper;->start()V
/* .line 725 */
(( android.opengl.derived.SwapGLSurfaceView$EglHelper ) p0 ).createSurface ( p1 ); // invoke-virtual {p0, p1}, Landroid/opengl/derived/SwapGLSurfaceView$EglHelper;->createSurface(Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;
/* goto/16 :goto_0 */
/* .line 728 */
} // :cond_6
v4 = this.mEglContext;
(( javax.microedition.khronos.egl.EGLContext ) v4 ).getGL ( ); // invoke-virtual {v4}, Ljavax/microedition/khronos/egl/EGLContext;->getGL()Ljavax/microedition/khronos/opengles/GL;
/* .line 729 */
/* .local v1, "gl":Ljavax/microedition/khronos/opengles/GL; */
v4 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$500 ( v4 );
if ( v4 != null) { // if-eqz v4, :cond_7
/* .line 730 */
v4 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$500 ( v4 );
/* .line 733 */
} // :cond_7
v4 = this.this$0;
v4 = android.opengl.derived.SwapGLSurfaceView .access$600 ( v4 );
/* and-int/lit8 v4, v4, 0x3 */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 734 */
int v0 = 0; // const/4 v0, 0x0
/* .line 735 */
/* .local v0, "configFlags":I */
int v2 = 0; // const/4 v2, 0x0
/* .line 736 */
/* .local v2, "log":Ljava/io/Writer; */
v4 = this.this$0;
v4 = android.opengl.derived.SwapGLSurfaceView .access$600 ( v4 );
/* and-int/lit8 v4, v4, 0x1 */
if ( v4 != null) { // if-eqz v4, :cond_8
	 /* .line 737 */
	 /* or-int/lit8 v0, v0, 0x1 */
	 /* .line 739 */
} // :cond_8
v4 = this.this$0;
v4 = android.opengl.derived.SwapGLSurfaceView .access$600 ( v4 );
/* and-int/lit8 v4, v4, 0x2 */
if ( v4 != null) { // if-eqz v4, :cond_9
	 /* .line 740 */
	 /* new-instance v2, Landroid/opengl/derived/SwapGLSurfaceView$LogWriter; */
} // .end local v2 # "log":Ljava/io/Writer;
/* invoke-direct {v2}, Landroid/opengl/derived/SwapGLSurfaceView$LogWriter;-><init>()V */
/* .line 742 */
/* .restart local v2 # "log":Ljava/io/Writer; */
} // :cond_9
android.opengl.GLDebugHelper .wrap ( v1,v0,v2 );
/* goto/16 :goto_0 */
} // .end method
public void destroySurface ( ) {
/* .locals 5 */
/* .prologue */
/* .line 770 */
v0 = this.mEglSurface;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mEglSurface;
v1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
/* if-eq v0, v1, :cond_0 */
/* .line 771 */
v0 = this.mEgl;
v1 = this.mEglDisplay;
v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
/* .line 774 */
v0 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$400 ( v0 );
v1 = this.mEgl;
v2 = this.mEglDisplay;
v3 = this.mEglSurface;
/* .line 775 */
int v0 = 0; // const/4 v0, 0x0
this.mEglSurface = v0;
/* .line 777 */
} // :cond_0
return;
} // .end method
public void finish ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 780 */
v0 = this.mEglContext;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 781 */
v0 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$300 ( v0 );
v1 = this.mEgl;
v2 = this.mEglDisplay;
v3 = this.mEglContext;
/* .line 782 */
this.mEglContext = v4;
/* .line 784 */
} // :cond_0
v0 = this.mEglDisplay;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 785 */
v0 = this.mEgl;
v1 = this.mEglDisplay;
/* .line 786 */
this.mEglDisplay = v4;
/* .line 788 */
} // :cond_1
return;
} // .end method
public void start ( ) {
/* .locals 5 */
/* .prologue */
/* .line 646 */
javax.microedition.khronos.egl.EGLContext .getEGL ( );
/* check-cast v1, Ljavax/microedition/khronos/egl/EGL10; */
this.mEgl = v1;
/* .line 651 */
v1 = this.mEgl;
v2 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
this.mEglDisplay = v1;
/* .line 656 */
int v1 = 2; // const/4 v1, 0x2
/* new-array v0, v1, [I */
/* .line 657 */
/* .local v0, "version":[I */
v1 = this.mEgl;
v2 = this.mEglDisplay;
/* .line 658 */
v1 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$200 ( v1 );
v2 = this.mEgl;
v3 = this.mEglDisplay;
this.mEglConfig = v1;
/* .line 664 */
v1 = this.this$0;
android.opengl.derived.SwapGLSurfaceView .access$300 ( v1 );
v2 = this.mEgl;
v3 = this.mEglDisplay;
v4 = this.mEglConfig;
this.mEglContext = v1;
/* .line 665 */
v1 = this.mEglContext;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.mEglContext;
v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
/* if-ne v1, v2, :cond_1 */
/* .line 666 */
} // :cond_0
/* new-instance v1, Ljava/lang/RuntimeException; */
final String v2 = "createContext failed"; // const-string v2, "createContext failed"
/* invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 669 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
this.mEglSurface = v1;
/* .line 670 */
return;
} // .end method
public Boolean swap ( ) {
/* .locals 4 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 753 */
v1 = this.mEgl;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.mEglDisplay;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.mEglSurface;
/* if-nez v1, :cond_1 */
/* .line 766 */
} // :cond_0
} // :goto_0
/* .line 758 */
} // :cond_1
v1 = this.mEgl;
v2 = this.mEglDisplay;
v3 = this.mEglSurface;
/* .line 766 */
v1 = v1 = this.mEgl;
/* const/16 v2, 0x300e */
/* if-eq v1, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
