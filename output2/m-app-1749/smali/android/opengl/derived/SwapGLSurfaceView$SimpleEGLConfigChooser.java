class android.opengl.derived.SwapGLSurfaceView$SimpleEGLConfigChooser extends android.opengl.derived.SwapGLSurfaceView$ComponentSizeChooser {
	 /* .source "SwapGLSurfaceView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/opengl/derived/SwapGLSurfaceView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "SimpleEGLConfigChooser" */
} // .end annotation
/* # direct methods */
public android.opengl.derived.SwapGLSurfaceView$SimpleEGLConfigChooser ( ) {
/* .locals 8 */
/* .param p1, "withDepthBuffer" # Z */
/* .prologue */
int v7 = 5; // const/4 v7, 0x5
int v1 = 4; // const/4 v1, 0x4
int v4 = 0; // const/4 v4, 0x0
/* .line 620 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* const/16 v5, 0x10 */
} // :goto_0
/* move-object v0, p0 */
/* move v2, v1 */
/* move v3, v1 */
/* move v6, v4 */
/* invoke-direct/range {v0 ..v6}, Landroid/opengl/derived/SwapGLSurfaceView$ComponentSizeChooser;-><init>(IIIIII)V */
/* .line 623 */
/* iput v7, p0, Landroid/opengl/derived/SwapGLSurfaceView$SimpleEGLConfigChooser;->mRedSize:I */
/* .line 624 */
int v0 = 6; // const/4 v0, 0x6
/* iput v0, p0, Landroid/opengl/derived/SwapGLSurfaceView$SimpleEGLConfigChooser;->mGreenSize:I */
/* .line 625 */
/* iput v7, p0, Landroid/opengl/derived/SwapGLSurfaceView$SimpleEGLConfigChooser;->mBlueSize:I */
/* .line 626 */
return;
} // :cond_0
/* move v5, v4 */
/* .line 620 */
} // .end method
