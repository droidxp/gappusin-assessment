public class org.anddev.andengine.opengl.view.ComponentSizeChooser extends org.anddev.andengine.opengl.view.BaseConfigChooser {
	 /* # instance fields */
	 protected Integer mAlphaSize;
	 protected Integer mBlueSize;
	 protected Integer mDepthSize;
	 protected Integer mGreenSize;
	 protected Integer mRedSize;
	 protected Integer mStencilSize;
	 private final mValue;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.view.ComponentSizeChooser ( ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 /* const/16 v0, 0xd */
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/16 v2, 0x3024 */
		 /* aput v2, v0, v1 */
		 /* aput p1, v0, v3 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* const/16 v2, 0x3023 */
		 /* aput v2, v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* aput p2, v0, v1 */
		 int v1 = 4; // const/4 v1, 0x4
		 /* const/16 v2, 0x3022 */
		 /* aput v2, v0, v1 */
		 int v1 = 5; // const/4 v1, 0x5
		 /* aput p3, v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 /* const/16 v2, 0x3021 */
		 /* aput v2, v0, v1 */
		 int v1 = 7; // const/4 v1, 0x7
		 /* aput p4, v0, v1 */
		 /* const/16 v1, 0x8 */
		 /* const/16 v2, 0x3025 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x9 */
		 /* aput p5, v0, v1 */
		 /* const/16 v1, 0xa */
		 /* const/16 v2, 0x3026 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0xb */
		 /* aput p6, v0, v1 */
		 /* const/16 v1, 0xc */
		 /* const/16 v2, 0x3038 */
		 /* aput v2, v0, v1 */
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/opengl/view/BaseConfigChooser;-><init>([I)V */
		 /* new-array v0, v3, [I */
		 this.mValue = v0;
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mRedSize:I */
		 /* iput p2, p0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mGreenSize:I */
		 /* iput p3, p0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mBlueSize:I */
		 /* iput p4, p0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mAlphaSize:I */
		 /* iput p5, p0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mDepthSize:I */
		 /* iput p6, p0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mStencilSize:I */
		 return;
	 } // .end method
	 private Integer findConfigAttrib ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2, Integer p3, Integer p4 ) {
		 /* .locals 2 */
		 v0 = 		 v0 = this.mValue;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.mValue;
			 int v1 = 0; // const/4 v1, 0x0
			 /* aget v0, v0, v1 */
		 } // :goto_0
	 } // :cond_0
	 /* move v0, p5 */
} // .end method
/* # virtual methods */
public javax.microedition.khronos.egl.EGLConfig chooseConfig ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1 ) { //bridge//synthethic
	 /* .locals 1 */
	 /* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/opengl/view/BaseConfigChooser;->chooseConfig(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;)Ljavax/microedition/khronos/egl/EGLConfig; */
} // .end method
public javax.microedition.khronos.egl.EGLConfig chooseConfig ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig[] p2 ) {
	 /* .locals 16 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* const/16 v2, 0x3e8 */
	 /* move-object/from16 v0, p3 */
	 /* array-length v0, v0 */
	 /* move v7, v0 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* move v8, v3 */
	 /* move v9, v2 */
	 /* move-object v10, v1 */
} // :goto_0
/* if-lt v8, v7, :cond_0 */
} // :cond_0
/* aget-object v4, p3, v8 */
/* const/16 v5, 0x3024 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v11 = /* invoke-direct/range {v1 ..v6}, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* const/16 v5, 0x3023 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v12 = /* invoke-direct/range {v1 ..v6}, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* const/16 v5, 0x3022 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v13 = /* invoke-direct/range {v1 ..v6}, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* const/16 v5, 0x3021 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v14 = /* invoke-direct/range {v1 ..v6}, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* const/16 v5, 0x3025 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v15 = /* invoke-direct/range {v1 ..v6}, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* const/16 v5, 0x3026 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v1 = /* invoke-direct/range {v1 ..v6}, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mRedSize:I */
/* move v2, v0 */
/* sub-int v2, v11, v2 */
v2 = java.lang.Math .abs ( v2 );
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mGreenSize:I */
/* move v3, v0 */
/* sub-int v3, v12, v3 */
v3 = java.lang.Math .abs ( v3 );
/* add-int/2addr v2, v3 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mBlueSize:I */
/* move v3, v0 */
/* sub-int v3, v13, v3 */
v3 = java.lang.Math .abs ( v3 );
/* add-int/2addr v2, v3 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mAlphaSize:I */
/* move v3, v0 */
/* sub-int v3, v14, v3 */
v3 = java.lang.Math .abs ( v3 );
/* add-int/2addr v2, v3 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mDepthSize:I */
/* move v3, v0 */
/* sub-int v3, v15, v3 */
v3 = java.lang.Math .abs ( v3 );
/* add-int/2addr v2, v3 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/anddev/andengine/opengl/view/ComponentSizeChooser;->mStencilSize:I */
/* move v3, v0 */
/* sub-int/2addr v1, v3 */
v1 = java.lang.Math .abs ( v1 );
/* add-int/2addr v1, v2 */
/* if-ge v1, v9, :cond_1 */
/* move-object v2, v4 */
} // :goto_1
/* add-int/lit8 v3, v8, 0x1 */
/* move v8, v3 */
/* move v9, v1 */
/* move-object v10, v2 */
/* goto/16 :goto_0 */
} // :cond_1
/* move v1, v9 */
/* move-object v2, v10 */
} // .end method
