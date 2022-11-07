abstract class org.anddev.andengine.opengl.view.BaseConfigChooser implements org.anddev.andengine.opengl.view.EGLConfigChooser {
	 /* # interfaces */
	 /* # instance fields */
	 protected final mConfigSpec;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.view.BaseConfigChooser ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mConfigSpec = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public javax.microedition.khronos.egl.EGLConfig chooseConfig ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1 ) {
		 /* .locals 6 */
		 int v4 = 0; // const/4 v4, 0x0
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v5, v0, [I */
		 v2 = this.mConfigSpec;
		 int v3 = 0; // const/4 v3, 0x0
		 /* move-object v0, p1 */
		 /* move-object v1, p2 */
		 /* invoke-interface/range {v0 ..v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
		 /* aget v4, v5, v4 */
		 /* if-gtz v4, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "No configs match configSpec"; // const-string v1, "No configs match configSpec"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 /* new-array v3, v4, [Ljavax/microedition/khronos/egl/EGLConfig; */
	 v2 = this.mConfigSpec;
	 /* move-object v0, p1 */
	 /* move-object v1, p2 */
	 /* invoke-interface/range {v0 ..v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
	 (( org.anddev.andengine.opengl.view.BaseConfigChooser ) p0 ).chooseConfig ( p1, p2, v3 ); // invoke-virtual {p0, p1, p2, v3}, Lorg/anddev/andengine/opengl/view/BaseConfigChooser;->chooseConfig(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;
	 /* if-nez v0, :cond_1 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 final String v1 = "No config chosen"; // const-string v1, "No config chosen"
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_1
} // .end method
abstract javax.microedition.khronos.egl.EGLConfig chooseConfig ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig[] p2 ) {
} // .end method
