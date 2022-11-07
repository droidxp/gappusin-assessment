public class com.emman.vog.TitleActivity extends android.app.Activity implements com.wiyun.engine.nodes.Director$IDirectorLifecycleListener {
	 /* .source "TitleActivity.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static com.emman.vog.TitleActivity instance;
	 /* # instance fields */
	 private com.emman.vog.GameAd _gameAd;
	 protected com.wiyun.engine.opengl.WYGLSurfaceView mGLView;
	 private Boolean mStarted;
	 /* # direct methods */
	 static com.emman.vog.TitleActivity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 24 */
		 final String v0 = "wiskia"; // const-string v0, "wiskia"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 25 */
		 final String v0 = "xml2"; // const-string v0, "xml2"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 26 */
		 final String v0 = "wiengine"; // const-string v0, "wiengine"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 27 */
		 final String v0 = "lua"; // const-string v0, "lua"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 28 */
		 final String v0 = "chipmunk"; // const-string v0, "chipmunk"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 29 */
		 final String v0 = "box2d"; // const-string v0, "box2d"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 30 */
		 final String v0 = "wisound"; // const-string v0, "wisound"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 31 */
		 final String v0 = "wiengine_binding"; // const-string v0, "wiengine_binding"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 34 */
		 return;
	 } // .end method
	 public com.emman.vog.TitleActivity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 40 */
		 /* new-instance v0, Lcom/emman/vog/GameAd; */
		 /* invoke-direct {v0}, Lcom/emman/vog/GameAd;-><init>()V */
		 this._gameAd = v0;
		 /* .line 17 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 3 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 int v2 = 1; // const/4 v2, 0x1
		 /* .line 44 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 45 */
		 (( com.emman.vog.TitleActivity ) p0 ).requestWindowFeature ( v2 ); // invoke-virtual {p0, v2}, Lcom/emman/vog/TitleActivity;->requestWindowFeature(I)Z
		 /* .line 46 */
		 (( com.emman.vog.TitleActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/emman/vog/TitleActivity;->getWindow()Landroid/view/Window;
		 /* const/16 v1, 0x400 */
		 (( android.view.Window ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
		 /* .line 47 */
		 /* .line 49 */
		 /* new-instance v0, Lcom/wiyun/engine/opengl/WYGLSurfaceView; */
		 /* invoke-direct {v0, p0}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;-><init>(Landroid/content/Context;)V */
		 this.mGLView = v0;
		 /* .line 50 */
		 v0 = this.mGLView;
		 (( com.emman.vog.TitleActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/emman/vog/TitleActivity;->setContentView(Landroid/view/View;)V
		 /* .line 53 */
		 int v0 = 3; // const/4 v0, 0x3
		 (( com.emman.vog.TitleActivity ) p0 ).setVolumeControlStream ( v0 ); // invoke-virtual {p0, v0}, Lcom/emman/vog/TitleActivity;->setVolumeControlStream(I)V
		 /* .line 56 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).addLifecycleListener ( p0 ); // invoke-virtual {v0, p0}, Lcom/wiyun/engine/nodes/Director;->addLifecycleListener(Lcom/wiyun/engine/nodes/Director$IDirectorLifecycleListener;)V
		 /* .line 60 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).setScaleMode ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/Director;->setScaleMode(I)V
		 /* .line 62 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 /* const/16 v1, 0x1e0 */
		 /* const/16 v2, 0x140 */
		 (( com.wiyun.engine.nodes.Director ) v0 ).setBaseSize ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/Director;->setBaseSize(II)V
		 /* .line 63 */
		 v0 = this._gameAd;
		 (( com.emman.vog.GameAd ) v0 ).Advertise ( p0 ); // invoke-virtual {v0, p0}, Lcom/emman/vog/GameAd;->Advertise(Landroid/app/Activity;)V
		 /* .line 64 */
		 return;
	 } // .end method
	 public void onDestroy ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 80 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).end ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->end()V
		 /* .line 82 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
		 /* .line 83 */
		 return;
	 } // .end method
	 public void onDirectorEnded ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 87 */
		 return;
	 } // .end method
	 public void onDirectorPaused ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 91 */
		 return;
	 } // .end method
	 public void onDirectorResumed ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 95 */
		 return;
	 } // .end method
	 public void onDirectorScreenCaptured ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 99 */
		 return;
	 } // .end method
	 public void onPause ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 68 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
		 /* .line 69 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).pause ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->pause()V
		 /* .line 70 */
		 return;
	 } // .end method
	 public void onResume ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 74 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
		 /* .line 75 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).resume ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->resume()V
		 /* .line 76 */
		 return;
	 } // .end method
	 public void onSurfaceChanged ( Integer p0, Integer p1 ) {
		 /* .locals 3 */
		 /* .param p1, "w" # I */
		 /* .param p2, "h" # I */
		 /* .prologue */
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 114 */
		 v2 = 		 (( com.emman.vog.TitleActivity ) p0 ).getRequestedOrientation ( ); // invoke-virtual {p0}, Lcom/emman/vog/TitleActivity;->getRequestedOrientation()I
		 /* if-nez v2, :cond_3 */
		 /* move v0, v1 */
		 /* .line 115 */
		 /* .local v0, "landscape":Z */
	 } // :goto_0
	 /* iget-boolean v2, p0, Lcom/emman/vog/TitleActivity;->mStarted:Z */
	 /* if-nez v2, :cond_2 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* if-ge p1, p2, :cond_1 */
	 } // :cond_0
	 /* if-nez v0, :cond_2 */
	 /* if-lt p2, p1, :cond_2 */
	 /* .line 116 */
} // :cond_1
/* iput-boolean v1, p0, Lcom/emman/vog/TitleActivity;->mStarted:Z */
/* .line 117 */
com.wiyun.engine.nodes.Director .getInstance ( );
/* new-instance v2, Lcom/emman/vog/MenuScene; */
/* invoke-direct {v2}, Lcom/emman/vog/MenuScene;-><init>()V */
(( com.wiyun.engine.nodes.Director ) v1 ).runWithScene ( v2 ); // invoke-virtual {v1, v2}, Lcom/wiyun/engine/nodes/Director;->runWithScene(Lcom/wiyun/engine/nodes/Scene;)V
/* .line 119 */
} // :cond_2
return;
/* .line 114 */
} // .end local v0 # "landscape":Z
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onSurfaceCreated ( ) {
/* .locals 0 */
/* .prologue */
/* .line 123 */
return;
} // .end method
public void onSurfaceDestroyed ( ) {
/* .locals 0 */
/* .prologue */
/* .line 127 */
return;
} // .end method
