class com.wiyun.engine.opengl.WYGLSurfaceView$WYConfigChooser implements android.opengl.GLSurfaceView$EGLConfigChooser {
	 /* # interfaces */
	 /* # instance fields */
	 private Boolean mTransparent;
	 final com.wiyun.engine.opengl.WYGLSurfaceView this$0; //synthetic
	 /* # direct methods */
	 com.wiyun.engine.opengl.WYGLSurfaceView$WYConfigChooser ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean p2, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView$WYConfigChooser;->mTransparent:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public javax.microedition.khronos.egl.EGLConfig chooseConfig ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1 ) {
		 /* .locals 10 */
		 int v3 = 5; // const/4 v3, 0x5
		 int v2 = 6; // const/4 v2, 0x6
		 int v1 = 5; // const/4 v1, 0x5
		 int v0 = 0; // const/4 v0, 0x0
		 /* iget-boolean v4, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView$WYConfigChooser;->mTransparent:Z */
		 if ( v4 != null) { // if-eqz v4, :cond_5
			 /* const/16 v3, 0x8 */
			 /* const/16 v2, 0x8 */
			 /* const/16 v1, 0x8 */
			 /* const/16 v0, 0x8 */
			 /* move v6, v0 */
			 /* move v7, v1 */
			 /* move v8, v2 */
			 /* move v9, v3 */
		 } // :goto_0
		 /* const/16 v0, 0x20 */
		 /* new-array v2, v0, [I */
		 /* const/16 v0, 0x1f */
		 /* const/16 v1, 0x3038 */
		 /* aput v1, v2, v0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* const/16 v1, 0x3024 */
		 /* aput v1, v2, v0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* aput v9, v2, v0 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* const/16 v1, 0x3023 */
		 /* aput v1, v2, v0 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* aput v8, v2, v0 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* const/16 v1, 0x3022 */
		 /* aput v1, v2, v0 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* aput v7, v2, v0 */
		 int v0 = 6; // const/4 v0, 0x6
		 /* const/16 v1, 0x3021 */
		 /* aput v1, v2, v0 */
		 int v1 = 7; // const/4 v1, 0x7
		 /* const/16 v0, 0x8 */
		 /* aput v6, v2, v1 */
		 v1 = this.this$0;
		 v1 = 		 com.wiyun.engine.opengl.WYGLSurfaceView .access$0 ( v1 );
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* const/16 v0, 0x8 */
			 /* const/16 v1, 0x3025 */
			 /* aput v1, v2, v0 */
			 /* const/16 v1, 0x9 */
			 /* const/16 v0, 0xa */
			 /* const/16 v3, 0x10 */
			 /* aput v3, v2, v1 */
		 } // :cond_0
		 v1 = this.this$0;
		 v1 = 		 com.wiyun.engine.opengl.WYGLSurfaceView .access$1 ( v1 );
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* add-int/lit8 v1, v0, 0x1 */
			 /* const/16 v3, 0x3026 */
			 /* aput v3, v2, v0 */
			 /* add-int/lit8 v0, v1, 0x1 */
			 /* const/16 v3, 0x8 */
			 /* aput v3, v2, v1 */
		 } // :cond_1
		 /* add-int/lit8 v1, v0, 0x1 */
		 /* const/16 v3, 0x3033 */
		 /* aput v3, v2, v0 */
		 /* add-int/lit8 v0, v1, 0x1 */
		 int v3 = 4; // const/4 v3, 0x4
		 /* aput v3, v2, v1 */
		 /* const/16 v1, 0x3038 */
		 /* aput v1, v2, v0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v5, v0, [I */
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 /* move-object v0, p1 */
		 /* move-object v1, p2 */
		 /* invoke-interface/range {v0 ..v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* aget v0, v5, v0 */
		 /* if-gtz v0, :cond_2 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "Failed to find a suitable config"; // const-string v1, "Failed to find a suitable config"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_2
	 int v0 = 0; // const/4 v0, 0x0
	 /* aget v0, v5, v0 */
	 /* new-array v3, v0, [Ljavax/microedition/khronos/egl/EGLConfig; */
	 int v0 = 0; // const/4 v0, 0x0
	 /* aget v4, v5, v0 */
	 /* move-object v0, p1 */
	 /* move-object v1, p2 */
	 /* invoke-interface/range {v0 ..v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v1, v0, [I */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_1
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v5, v2 */
/* if-lt v0, v2, :cond_3 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_2
} // :cond_3
/* aget-object v2, v3, v0 */
v2 = /* const/16 v4, 0x3024 */
if ( v2 != null) { // if-eqz v2, :cond_4
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v1, v2 */
/* if-ne v2, v9, :cond_4 */
/* aget-object v2, v3, v0 */
v2 = /* const/16 v4, 0x3023 */
if ( v2 != null) { // if-eqz v2, :cond_4
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v1, v2 */
/* if-ne v2, v8, :cond_4 */
/* aget-object v2, v3, v0 */
v2 = /* const/16 v4, 0x3022 */
if ( v2 != null) { // if-eqz v2, :cond_4
	 int v2 = 0; // const/4 v2, 0x0
	 /* aget v2, v1, v2 */
	 /* if-ne v2, v7, :cond_4 */
	 /* aget-object v2, v3, v0 */
	 v2 = 	 /* const/16 v4, 0x3021 */
	 if ( v2 != null) { // if-eqz v2, :cond_4
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v2, v1, v2 */
		 /* if-ne v2, v6, :cond_4 */
		 /* aget-object v0, v3, v0 */
	 } // :cond_4
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_5
/* move v6, v0 */
/* move v7, v1 */
/* move v8, v2 */
/* move v9, v3 */
/* goto/16 :goto_0 */
} // .end method
