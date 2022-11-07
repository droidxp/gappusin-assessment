class org.anddev.andengine.opengl.view.GLSurfaceView$EglHelper {
	 /* # instance fields */
	 javax.microedition.khronos.egl.EGL10 mEgl;
	 javax.microedition.khronos.egl.EGLConfig mEglConfig;
	 javax.microedition.khronos.egl.EGLContext mEglContext;
	 javax.microedition.khronos.egl.EGLDisplay mEglDisplay;
	 javax.microedition.khronos.egl.EGLSurface mEglSurface;
	 final org.anddev.andengine.opengl.view.GLSurfaceView this$0; //synthetic
	 /* # direct methods */
	 public org.anddev.andengine.opengl.view.GLSurfaceView$EglHelper ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public javax.microedition.khronos.opengles.GL createSurface ( android.view.SurfaceHolder p0 ) {
		 /* .locals 5 */
		 v0 = this.mEglSurface;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.mEgl;
			 v1 = this.mEglDisplay;
			 v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
			 v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
			 v4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
			 v0 = this.mEgl;
			 v1 = this.mEglDisplay;
			 v2 = this.mEglSurface;
		 } // :cond_0
		 v0 = this.mEgl;
		 v1 = this.mEglDisplay;
		 v2 = this.mEglConfig;
		 int v3 = 0; // const/4 v3, 0x0
		 this.mEglSurface = v0;
		 v0 = this.mEgl;
		 v1 = this.mEglDisplay;
		 v2 = this.mEglSurface;
		 v3 = this.mEglSurface;
		 v4 = this.mEglContext;
		 v0 = this.mEglContext;
		 (( javax.microedition.khronos.egl.EGLContext ) v0 ).getGL ( ); // invoke-virtual {v0}, Ljavax/microedition/khronos/egl/EGLContext;->getGL()Ljavax/microedition/khronos/opengles/GL;
		 v1 = this.this$0;
		 org.anddev.andengine.opengl.view.GLSurfaceView .access$2 ( v1 );
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 v1 = this.this$0;
			 org.anddev.andengine.opengl.view.GLSurfaceView .access$2 ( v1 );
		 } // :cond_1
	 } // .end method
	 public void finish ( ) {
		 /* .locals 6 */
		 int v5 = 0; // const/4 v5, 0x0
		 v0 = this.mEglSurface;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.mEgl;
			 v1 = this.mEglDisplay;
			 v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
			 v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
			 v4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
			 v0 = this.mEgl;
			 v1 = this.mEglDisplay;
			 v2 = this.mEglSurface;
			 this.mEglSurface = v5;
		 } // :cond_0
		 v0 = this.mEglContext;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = this.mEgl;
			 v1 = this.mEglDisplay;
			 v2 = this.mEglContext;
			 this.mEglContext = v5;
		 } // :cond_1
		 v0 = this.mEglDisplay;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 v0 = this.mEgl;
			 v1 = this.mEglDisplay;
			 this.mEglDisplay = v5;
		 } // :cond_2
		 return;
	 } // .end method
	 public void start ( ) {
		 /* .locals 5 */
		 int v4 = 0; // const/4 v4, 0x0
		 javax.microedition.khronos.egl.EGLContext .getEGL ( );
		 /* check-cast v0, Ljavax/microedition/khronos/egl/EGL10; */
		 this.mEgl = v0;
		 v0 = this.mEgl;
		 v1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
		 this.mEglDisplay = v0;
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [I */
		 v1 = this.mEgl;
		 v2 = this.mEglDisplay;
		 v0 = this.this$0;
		 org.anddev.andengine.opengl.view.GLSurfaceView .access$1 ( v0 );
		 v1 = this.mEgl;
		 v2 = this.mEglDisplay;
		 this.mEglConfig = v0;
		 v0 = this.mEgl;
		 v1 = this.mEglDisplay;
		 v2 = this.mEglConfig;
		 v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
		 this.mEglContext = v0;
		 this.mEglSurface = v4;
		 return;
	 } // .end method
	 public Boolean swap ( ) {
		 /* .locals 3 */
		 v0 = this.mEgl;
		 v1 = this.mEglDisplay;
		 v2 = this.mEglSurface;
		 v0 = 		 v0 = this.mEgl;
		 /* const/16 v1, 0x300e */
		 /* if-eq v0, v1, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
