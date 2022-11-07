class android.opengl.derived.SwapGLSurfaceView$ComponentSizeChooser extends android.opengl.derived.SwapGLSurfaceView$BaseConfigChooser {
	 /* .source "SwapGLSurfaceView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/opengl/derived/SwapGLSurfaceView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "ComponentSizeChooser" */
} // .end annotation
/* # instance fields */
protected Integer mAlphaSize;
protected Integer mBlueSize;
protected Integer mDepthSize;
protected Integer mGreenSize;
protected Integer mRedSize;
protected Integer mStencilSize;
private mValue;
/* # direct methods */
public android.opengl.derived.SwapGLSurfaceView$ComponentSizeChooser ( ) {
/* .locals 6 */
/* .param p1, "redSize" # I */
/* .param p2, "greenSize" # I */
/* .param p3, "blueSize" # I */
/* .param p4, "alphaSize" # I */
/* .param p5, "depthSize" # I */
/* .param p6, "stencilSize" # I */
/* .prologue */
/* const/16 v5, 0x3038 */
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* .line 523 */
/* const/16 v0, 0xf */
/* new-array v0, v0, [I */
/* const/16 v1, 0x3024 */
/* aput v1, v0, v3 */
/* aput p1, v0, v4 */
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
/* aput v3, v0, v1 */
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
/* const/16 v2, 0x3027 */
/* aput v2, v0, v1 */
/* const/16 v1, 0xd */
/* aput v5, v0, v1 */
/* const/16 v1, 0xe */
/* aput v5, v0, v1 */
/* invoke-direct {p0, v0}, Landroid/opengl/derived/SwapGLSurfaceView$BaseConfigChooser;-><init>([I)V */
/* .line 541 */
/* new-array v0, v4, [I */
this.mValue = v0;
/* .line 542 */
/* iput p1, p0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mRedSize:I */
/* .line 543 */
/* iput p2, p0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mGreenSize:I */
/* .line 544 */
/* iput p3, p0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mBlueSize:I */
/* .line 545 */
/* iput p4, p0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mAlphaSize:I */
/* .line 546 */
/* iput p5, p0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mDepthSize:I */
/* .line 547 */
/* iput p6, p0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mStencilSize:I */
/* .line 548 */
return;
} // .end method
private Integer findConfigAttrib ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2, Integer p3, Integer p4 ) {
/* .locals 2 */
/* .param p1, "egl" # Ljavax/microedition/khronos/egl/EGL10; */
/* .param p2, "display" # Ljavax/microedition/khronos/egl/EGLDisplay; */
/* .param p3, "config" # Ljavax/microedition/khronos/egl/EGLConfig; */
/* .param p4, "attribute" # I */
/* .param p5, "defaultValue" # I */
/* .prologue */
/* .line 597 */
v0 = v0 = this.mValue;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 598 */
	 v0 = this.mValue;
	 int v1 = 0; // const/4 v1, 0x0
	 /* aget p5, v0, v1 */
	 /* .line 600 */
} // .end local p5 # "defaultValue":I
} // :cond_0
} // .end method
/* # virtual methods */
public javax.microedition.khronos.egl.EGLConfig chooseConfig ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig[] p2 ) {
/* .locals 19 */
/* .param p1, "egl" # Ljavax/microedition/khronos/egl/EGL10; */
/* .param p2, "display" # Ljavax/microedition/khronos/egl/EGLDisplay; */
/* .param p3, "configs" # [Ljavax/microedition/khronos/egl/EGLConfig; */
/* .prologue */
/* .line 552 */
int v10 = 0; // const/4 v10, 0x0
/* .line 553 */
/* .local v10, "closestConfig":Ljavax/microedition/khronos/egl/EGLConfig; */
/* const/16 v11, 0x3e8 */
/* .line 556 */
/* .local v11, "closestDistance":I */
/* move-object/from16 v8, p3 */
/* .local v8, "arr$":[Ljavax/microedition/khronos/egl/EGLConfig; */
/* array-length v0, v8 */
/* move/from16 v16, v0 */
/* .local v16, "len$":I */
int v15 = 0; // const/4 v15, 0x0
/* .local v15, "i$":I */
} // :goto_0
/* move/from16 v0, v16 */
/* if-ge v15, v0, :cond_2 */
/* aget-object v4, v8, v15 */
/* .line 558 */
/* .local v4, "config":Ljavax/microedition/khronos/egl/EGLConfig; */
/* const/16 v5, 0x3025 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v12 = /* invoke-direct/range {v1 ..v6}, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* .line 559 */
/* .local v12, "depth":I */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mDepthSize:I */
/* if-ge v12, v1, :cond_1 */
/* .line 556 */
} // :cond_0
} // :goto_1
/* add-int/lit8 v15, v15, 0x1 */
/* .line 564 */
} // :cond_1
/* const/16 v5, 0x3026 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v18 = /* invoke-direct/range {v1 ..v6}, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* .line 565 */
/* .local v18, "stencil":I */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mStencilSize:I */
/* move/from16 v0, v18 */
/* if-lt v0, v1, :cond_0 */
/* .line 570 */
/* const/16 v5, 0x3024 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v17 = /* invoke-direct/range {v1 ..v6}, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* .line 571 */
/* .local v17, "red":I */
/* const/16 v5, 0x3023 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v14 = /* invoke-direct/range {v1 ..v6}, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* .line 572 */
/* .local v14, "green":I */
/* const/16 v5, 0x3022 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v9 = /* invoke-direct/range {v1 ..v6}, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* .line 573 */
/* .local v9, "blue":I */
/* const/16 v5, 0x3021 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
v7 = /* invoke-direct/range {v1 ..v6}, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I */
/* .line 576 */
/* .local v7, "alpha":I */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mRedSize:I */
/* sub-int v1, v17, v1 */
v1 = java.lang.Math .abs ( v1 );
/* move-object/from16 v0, p0 */
/* iget v2, v0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mGreenSize:I */
/* sub-int v2, v14, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int/2addr v1, v2 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mBlueSize:I */
/* sub-int v2, v9, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int/2addr v1, v2 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mAlphaSize:I */
/* sub-int v2, v7, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int v13, v1, v2 */
/* .line 578 */
/* .local v13, "distance":I */
/* if-ge v13, v11, :cond_0 */
/* .line 579 */
/* move v11, v13 */
/* .line 580 */
/* move-object v10, v4 */
/* .line 583 */
} // .end local v4 # "config":Ljavax/microedition/khronos/egl/EGLConfig;
} // .end local v7 # "alpha":I
} // .end local v9 # "blue":I
} // .end local v12 # "depth":I
} // .end local v13 # "distance":I
} // .end local v14 # "green":I
} // .end local v17 # "red":I
} // .end local v18 # "stencil":I
} // :cond_2
} // .end method
public Integer getMinAlphaSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 587 */
/* iget v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mAlphaSize:I */
} // .end method
public void setMinAlphaSize ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "value" # I */
/* .prologue */
/* .line 591 */
/* iput p1, p0, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;->mAlphaSize:I */
/* .line 592 */
return;
} // .end method
