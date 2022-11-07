class com.ansca.corona.version.android8.CoronaGLSurfaceView extends android.opengl.derived.SwapGLSurfaceView {
	 /* .source "CoronaGLSurfaceView.java" */
	 /* # instance fields */
	 private com.ansca.corona.CoronaRenderer myRenderer;
	 /* # direct methods */
	 public com.ansca.corona.version.android8.CoronaGLSurfaceView ( ) {
		 /* .locals 7 */
		 /* .param p1, "activity" # Lcom/ansca/corona/CoronaActivity; */
		 /* .prologue */
		 int v5 = 0; // const/4 v5, 0x0
		 /* const/16 v1, 0x8 */
		 /* .line 13 */
		 /* invoke-direct {p0, p1}, Landroid/opengl/derived/SwapGLSurfaceView;-><init>(Landroid/content/Context;)V */
		 /* move-object v0, p0 */
		 /* move v2, v1 */
		 /* move v3, v1 */
		 /* move v4, v1 */
		 /* move v6, v5 */
		 /* .line 20 */
		 /* invoke-virtual/range {v0 ..v6}, Lcom/ansca/corona/version/android8/CoronaGLSurfaceView;->setEGLConfigChooser(IIIIII)V */
		 /* .line 23 */
		 /* new-instance v0, Lcom/ansca/corona/CoronaRenderer; */
		 /* invoke-direct {v0, p1}, Lcom/ansca/corona/CoronaRenderer;-><init>(Lcom/ansca/corona/CoronaActivity;)V */
		 this.myRenderer = v0;
		 /* .line 24 */
		 v0 = this.myRenderer;
		 (( com.ansca.corona.version.android8.CoronaGLSurfaceView ) p0 ).setRenderer ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/version/android8/CoronaGLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V
		 /* .line 25 */
		 (( com.ansca.corona.version.android8.CoronaGLSurfaceView ) p0 ).setRenderMode ( v5 ); // invoke-virtual {p0, v5}, Lcom/ansca/corona/version/android8/CoronaGLSurfaceView;->setRenderMode(I)V
		 /* .line 28 */
		 (( com.ansca.corona.version.android8.CoronaGLSurfaceView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/ansca/corona/version/android8/CoronaGLSurfaceView;->getHolder()Landroid/view/SurfaceHolder;
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 31 */
		 int v0 = 3; // const/4 v0, 0x3
		 (( com.ansca.corona.version.android8.CoronaGLSurfaceView ) p0 ).setDebugFlags ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/version/android8/CoronaGLSurfaceView;->setDebugFlags(I)V
		 /* .line 32 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean canRender ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 39 */
		 v0 = this.myRenderer;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.myRenderer;
			 v0 = 			 (( com.ansca.corona.CoronaRenderer ) v0 ).canRender ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaRenderer;->canRender()Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = 				 /* invoke-super {p0}, Landroid/opengl/derived/SwapGLSurfaceView;->canRender()Z */
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 int v0 = 1; // const/4 v0, 0x1
				 } // :goto_0
			 } // :cond_0
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
		 public void clearFirstSurface ( ) {
			 /* .locals 1 */
			 /* .prologue */
			 /* .line 35 */
			 v0 = this.myRenderer;
			 (( com.ansca.corona.CoronaRenderer ) v0 ).clearFirstSurface ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaRenderer;->clearFirstSurface()V
			 /* .line 36 */
			 return;
		 } // .end method
		 public void onPause ( ) {
			 /* .locals 1 */
			 /* .prologue */
			 /* .line 53 */
			 int v0 = 1; // const/4 v0, 0x1
			 (( com.ansca.corona.version.android8.CoronaGLSurfaceView ) p0 ).setRenderMode ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/version/android8/CoronaGLSurfaceView;->setRenderMode(I)V
			 /* .line 54 */
			 /* invoke-super {p0}, Landroid/opengl/derived/SwapGLSurfaceView;->onPause()V */
			 /* .line 55 */
			 return;
		 } // .end method
		 public void onResume ( ) {
			 /* .locals 1 */
			 /* .prologue */
			 /* .line 62 */
			 /* invoke-super {p0}, Landroid/opengl/derived/SwapGLSurfaceView;->onResume()V */
			 /* .line 63 */
			 int v0 = 0; // const/4 v0, 0x0
			 (( com.ansca.corona.version.android8.CoronaGLSurfaceView ) p0 ).setRenderMode ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/version/android8/CoronaGLSurfaceView;->setRenderMode(I)V
			 /* .line 67 */
			 return;
		 } // .end method
