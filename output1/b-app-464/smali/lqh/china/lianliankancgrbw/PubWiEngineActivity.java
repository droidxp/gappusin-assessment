public abstract class lqh.china.lianliankancgrbw.PubWiEngineActivity extends android.app.Activity implements com.wiyun.engine.nodes.Director$IDirectorLifecycleListener {
	 /* # interfaces */
	 /* # instance fields */
	 public aj ad;
	 protected com.wiyun.engine.opengl.WYGLSurfaceView mGLSurfaceView;
	 protected com.wiyun.engine.nodes.Scene mScene;
	 private Boolean mStarted;
	 /* # direct methods */
	 static lqh.china.lianliankancgrbw.PubWiEngineActivity ( ) {
		 /* .locals 1 */
		 final String v0 = "wiskia"; // const-string v0, "wiskia"
		 java.lang.System .loadLibrary ( v0 );
		 final String v0 = "xml2"; // const-string v0, "xml2"
		 java.lang.System .loadLibrary ( v0 );
		 final String v0 = "wiengine"; // const-string v0, "wiengine"
		 java.lang.System .loadLibrary ( v0 );
		 final String v0 = "wiengine_binding"; // const-string v0, "wiengine_binding"
		 java.lang.System .loadLibrary ( v0 );
		 return;
	 } // .end method
	 public lqh.china.lianliankancgrbw.PubWiEngineActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected java.lang.String checkPrecondition ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 protected com.wiyun.engine.nodes.Layer createLayer ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 protected void createScene ( ) {
		 /* .locals 2 */
		 com.wiyun.engine.nodes.Scene .make ( );
		 this.mScene = v0;
		 v0 = this.mScene;
		 (( lqh.china.lianliankancgrbw.PubWiEngineActivity ) p0 ).createLayer ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->createLayer()Lcom/wiyun/engine/nodes/Layer;
		 (( com.wiyun.engine.nodes.Scene ) v0 ).addChild ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Scene;->addChild(Lcom/wiyun/engine/nodes/Node;)V
		 v0 = this.mScene;
		 int v1 = 1; // const/4 v1, 0x1
		 (( com.wiyun.engine.nodes.Scene ) v0 ).autoRelease ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Scene;->autoRelease(Z)Lcom/wiyun/engine/nodes/Node;
		 return;
	 } // .end method
	 protected Boolean isTransparent ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public void of_openMainLayer ( Float p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 3 */
		 /* const/16 v2, 0x80 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 (( lqh.china.lianliankancgrbw.PubWiEngineActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->getWindow()Landroid/view/Window;
		 /* const/16 v1, 0x400 */
		 (( android.view.Window ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
		 int v0 = 1; // const/4 v0, 0x1
		 (( lqh.china.lianliankancgrbw.PubWiEngineActivity ) p0 ).requestWindowFeature ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->requestWindowFeature(I)Z
		 (( lqh.china.lianliankancgrbw.PubWiEngineActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->getWindow()Landroid/view/Window;
		 (( android.view.Window ) v0 ).setFlags ( v2, v2 ); // invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V
		 /* new-instance v0, Lcom/wiyun/engine/opengl/WYGLSurfaceView; */
		 v1 = 		 (( lqh.china.lianliankancgrbw.PubWiEngineActivity ) p0 ).isTransparent ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->isTransparent()Z
		 /* invoke-direct {v0, p0, v1}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;-><init>(Landroid/content/Context;Z)V */
		 this.mGLSurfaceView = v0;
		 v0 = this.mGLSurfaceView;
		 (( lqh.china.lianliankancgrbw.PubWiEngineActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->setContentView(Landroid/view/View;)V
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).addLifecycleListener ( p0 ); // invoke-virtual {v0, p0}, Lcom/wiyun/engine/nodes/Director;->addLifecycleListener(Lcom/wiyun/engine/nodes/Director$IDirectorLifecycleListener;)V
		 return;
	 } // .end method
	 protected void onDestroy ( ) {
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).end ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->end()V
		 v0 = this.ad;
		 (( aj ) v0 ).e ( ); // invoke-virtual {v0}, Laj;->e()V
		 /* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
		 return;
	 } // .end method
	 public void onDirectorEnded ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onDirectorPaused ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onDirectorResumed ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onDirectorScreenCaptured ( java.lang.String p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 protected void onPause ( ) {
		 /* .locals 1 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
		 return;
	 } // .end method
	 protected void onResume ( ) {
		 /* .locals 1 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
		 return;
	 } // .end method
	 public void onSurfaceChanged ( Integer p0, Integer p1 ) {
		 /* .locals 3 */
		 int v1 = 1; // const/4 v1, 0x1
		 v0 = 		 (( lqh.china.lianliankancgrbw.PubWiEngineActivity ) p0 ).getRequestedOrientation ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->getRequestedOrientation()I
		 /* if-nez v0, :cond_3 */
		 /* move v0, v1 */
	 } // :goto_0
	 /* iget-boolean v2, p0, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->mStarted:Z */
	 /* if-nez v2, :cond_2 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* if-ge p1, p2, :cond_1 */
	 } // :cond_0
	 /* if-nez v0, :cond_2 */
	 /* if-lt p2, p1, :cond_2 */
} // :cond_1
/* iput-boolean v1, p0, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->mStarted:Z */
(( lqh.china.lianliankancgrbw.PubWiEngineActivity ) p0 ).createScene ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->createScene()V
com.wiyun.engine.nodes.Director .getInstance ( );
v1 = this.mScene;
(( com.wiyun.engine.nodes.Director ) v0 ).runWithScene ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Director;->runWithScene(Lcom/wiyun/engine/nodes/Scene;)V
} // :cond_2
return;
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onSurfaceCreated ( ) {
/* .locals 2 */
(( lqh.china.lianliankancgrbw.PubWiEngineActivity ) p0 ).checkPrecondition ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->checkPrecondition()Ljava/lang/String;
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* new-instance v1, Laz; */
/* invoke-direct {v1, p0, v0}, Laz;-><init>(Llqh/china/lianliankancgrbw/PubWiEngineActivity;Ljava/lang/String;)V */
(( lqh.china.lianliankancgrbw.PubWiEngineActivity ) p0 ).runOnUiThread ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/PubWiEngineActivity;->runOnUiThread(Ljava/lang/Runnable;)V
} // :cond_0
return;
} // .end method
public void onSurfaceDestroyed ( ) {
/* .locals 0 */
return;
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V */
/* if-nez p1, :cond_1 */
ay .a ( );
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* sget-boolean v0, Lay;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
ay .a ( p0,v0 );
} // .end method
