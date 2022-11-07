public class com.natenai.jniutil.NateBaseActivity extends android.app.Activity implements com.natenai.jniutil.NateTouchEventHandler$OnTouchEventListener {
	 /* .source "NateBaseActivity.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static com.natenai.jniutil.NateBaseActivity mActivity;
	 public static android.opengl.GLSurfaceView mGLView;
	 public static java.lang.String natenaiAppName;
	 public static Integer resAdViewID;
	 public static Integer resGLViewID;
	 public static Integer resMainLayoutID;
	 /* # instance fields */
	 com.natenai.jniutil.NateTouchEventHandler mTouchEventHandler;
	 /* # direct methods */
	 static com.natenai.jniutil.NateBaseActivity ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 17 */
		 /* .line 18 */
		 /* .line 20 */
		 final String v0 = "Glow Hockey"; // const-string v0, "Glow Hockey"
		 /* .line 22 */
		 /* .line 23 */
		 /* .line 24 */
		 /* .line 15 */
		 return;
	 } // .end method
	 public com.natenai.jniutil.NateBaseActivity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 26 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.mTouchEventHandler = v0;
		 /* .line 15 */
		 return;
	 } // .end method
	 public static com.natenai.jniutil.NateBaseActivity getInstance ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 30 */
		 v0 = com.natenai.jniutil.NateBaseActivity.mActivity;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 37 */
		 /* .line 39 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 41 */
		 (( com.natenai.jniutil.NateBaseActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/natenai/jniutil/NateBaseActivity;->getWindow()Landroid/view/Window;
		 /* const/16 v1, 0x480 */
		 (( android.view.Window ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
		 /* .line 43 */
		 int v0 = 3; // const/4 v0, 0x3
		 (( com.natenai.jniutil.NateBaseActivity ) p0 ).setVolumeControlStream ( v0 ); // invoke-virtual {p0, v0}, Lcom/natenai/jniutil/NateBaseActivity;->setVolumeControlStream(I)V
		 /* .line 45 */
		 com.natenai.jniutil.NateGameJNIUtilLib .SetMainActivity ( p0 );
		 /* .line 47 */
		 com.natenai.jniutil.NateTouchEventHandler .newInstance ( p0 );
		 this.mTouchEventHandler = v0;
		 /* .line 52 */
		 (( com.natenai.jniutil.NateBaseActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/natenai/jniutil/NateBaseActivity;->setContentView(I)V
		 /* .line 54 */
		 (( com.natenai.jniutil.NateBaseActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/natenai/jniutil/NateBaseActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/opengl/GLSurfaceView; */
		 /* .line 55 */
		 v0 = com.natenai.jniutil.NateBaseActivity.mGLView;
		 /* new-instance v1, Lcom/natenai/jniutil/NateRenderer; */
		 /* invoke-direct {v1}, Lcom/natenai/jniutil/NateRenderer;-><init>()V */
		 (( android.opengl.GLSurfaceView ) v0 ).setRenderer ( v1 ); // invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V
		 /* .line 57 */
		 (( com.natenai.jniutil.NateBaseActivity ) p0 ).setFocusOnGLView ( ); // invoke-virtual {p0}, Lcom/natenai/jniutil/NateBaseActivity;->setFocusOnGLView()V
		 /* .line 58 */
		 return;
	 } // .end method
	 protected void onDestroy ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 151 */
		 com.natenai.jniutil.NateAdsManager .destroyAdsManager ( );
		 /* .line 153 */
		 v1 = com.natenai.jniutil.NateBaseActivity.mGLView;
		 (( android.opengl.GLSurfaceView ) v1 ).onPause ( ); // invoke-virtual {v1}, Landroid/opengl/GLSurfaceView;->onPause()V
		 /* .line 155 */
		 int v1 = 0; // const/4 v1, 0x0
		 com.natenai.jniutil.NateGameJNIUtilLib .nativeNotifyEvent ( v1 );
		 /* .line 158 */
		 com.natenai.jniutil.NateGameJNIUtilLib .snd_finalize ( );
		 /* .line 160 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
		 /* .line 164 */
		 /* const-wide/16 v1, 0x1f4 */
		 try { // :try_start_0
			 java.lang.Thread .sleep ( v1,v2 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 169 */
		 } // :goto_0
		 v1 = 		 android.os.Process .myPid ( );
		 android.os.Process .killProcess ( v1 );
		 /* .line 170 */
		 return;
		 /* .line 165 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 166 */
		 /* .local v0, "e":Ljava/lang/InterruptedException; */
		 (( java.lang.InterruptedException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
	 } // .end method
	 public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
		 /* .locals 1 */
		 /* .param p1, "keyCode" # I */
		 /* .param p2, "event" # Landroid/view/KeyEvent; */
		 /* .prologue */
		 /* .line 76 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* if-ne p1, v0, :cond_0 */
		 v0 = 		 (( android.view.KeyEvent ) p2 ).getRepeatCount ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
		 /* if-nez v0, :cond_0 */
		 /* .line 78 */
		 int v0 = 2; // const/4 v0, 0x2
		 com.natenai.jniutil.NateGameJNIUtilLib .nativeNotifyEvent ( v0 );
		 /* .line 80 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 83 */
	 } // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
protected void onPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 131 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 132 */
v0 = com.natenai.jniutil.NateBaseActivity.mGLView;
(( android.opengl.GLSurfaceView ) v0 ).onPause ( ); // invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->onPause()V
/* .line 133 */
int v0 = 0; // const/4 v0, 0x0
com.natenai.jniutil.NateGameJNIUtilLib .nativeNotifyEvent ( v0 );
/* .line 134 */
com.natenai.jniutil.NateGameJNIUtilLib .snd_pause_all ( );
/* .line 135 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 1 */
/* .prologue */
/* .line 139 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 140 */
v0 = com.natenai.jniutil.NateBaseActivity.mGLView;
(( android.opengl.GLSurfaceView ) v0 ).onResume ( ); // invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->onResume()V
/* .line 141 */
int v0 = 1; // const/4 v0, 0x1
com.natenai.jniutil.NateGameJNIUtilLib .nativeNotifyEvent ( v0 );
/* .line 142 */
com.natenai.jniutil.NateGameJNIUtilLib .snd_resume_all ( );
/* .line 144 */
(( com.natenai.jniutil.NateBaseActivity ) p0 ).setFocusOnGLView ( ); // invoke-virtual {p0}, Lcom/natenai/jniutil/NateBaseActivity;->setFocusOnGLView()V
/* .line 145 */
return;
} // .end method
public void onTouchBegan ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 3 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .param p3, "prevX" # F */
/* .param p4, "prevY" # F */
/* .prologue */
/* .line 107 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugTouchEvent:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 108 */
	 final String v0 = "touchEvent"; // const-string v0, "touchEvent"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "t: TOUCHES_BEGAN, x:"; // const-string v2, "t: TOUCHES_BEGAN, x:"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v2 = ", y:"; // const-string v2, ", y:"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v2 = ", px:"; // const-string v2, ", px:"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v2 = ", py:"; // const-string v2, ", py:"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p4 ); // invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,v1 );
	 /* .line 110 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
com.natenai.jniutil.NateGameJNIUtilLib .nativeTouchEvent ( v0,p1,p2,p3,p4 );
/* .line 111 */
return;
} // .end method
public void onTouchEnded ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 3 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .param p3, "prevX" # F */
/* .param p4, "prevY" # F */
/* .prologue */
/* .line 123 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugTouchEvent:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 124 */
	 final String v0 = "touchEvent"; // const-string v0, "touchEvent"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "t: TOUCHES_ENDED, x:"; // const-string v2, "t: TOUCHES_ENDED, x:"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v2 = ", y:"; // const-string v2, ", y:"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v2 = ", px:"; // const-string v2, ", px:"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v2 = ", py:"; // const-string v2, ", py:"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p4 ); // invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,v1 );
	 /* .line 126 */
} // :cond_0
int v0 = 3; // const/4 v0, 0x3
com.natenai.jniutil.NateGameJNIUtilLib .nativeTouchEvent ( v0,p1,p2,p3,p4 );
/* .line 127 */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 101 */
v0 = this.mTouchEventHandler;
(( com.natenai.jniutil.NateTouchEventHandler ) v0 ).onTouchEvent ( p1 ); // invoke-virtual {v0, p1}, Lcom/natenai/jniutil/NateTouchEventHandler;->onTouchEvent(Landroid/view/MotionEvent;)Z
/* .line 102 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void onTouchMoved ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 3 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .param p3, "prevX" # F */
/* .param p4, "prevY" # F */
/* .prologue */
/* .line 115 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugTouchEvent:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 116 */
	 final String v0 = "touchEvent"; // const-string v0, "touchEvent"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "t: TOUCHES_MOVED, x:"; // const-string v2, "t: TOUCHES_MOVED, x:"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v2 = ", y:"; // const-string v2, ", y:"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v2 = ", px:"; // const-string v2, ", px:"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v2 = ", py:"; // const-string v2, ", py:"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p4 ); // invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,v1 );
	 /* .line 118 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
com.natenai.jniutil.NateGameJNIUtilLib .nativeTouchEvent ( v0,p1,p2,p3,p4 );
/* .line 119 */
return;
} // .end method
public void setFocusOnGLView ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 63 */
(( com.natenai.jniutil.NateBaseActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/natenai/jniutil/NateBaseActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/opengl/GLSurfaceView; */
/* .line 64 */
v0 = com.natenai.jniutil.NateBaseActivity.mGLView;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 66 */
	 v0 = com.natenai.jniutil.NateBaseActivity.mGLView;
	 (( android.opengl.GLSurfaceView ) v0 ).setFocusable ( v1 ); // invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setFocusable(Z)V
	 /* .line 67 */
	 v0 = com.natenai.jniutil.NateBaseActivity.mGLView;
	 (( android.opengl.GLSurfaceView ) v0 ).setFocusableInTouchMode ( v1 ); // invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setFocusableInTouchMode(Z)V
	 /* .line 69 */
	 v0 = com.natenai.jniutil.NateBaseActivity.mGLView;
	 (( android.opengl.GLSurfaceView ) v0 ).requestFocus ( ); // invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->requestFocus()Z
	 /* .line 70 */
	 v0 = com.natenai.jniutil.NateBaseActivity.mGLView;
	 (( android.opengl.GLSurfaceView ) v0 ).requestFocusFromTouch ( ); // invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->requestFocusFromTouch()Z
	 /* .line 72 */
} // :cond_0
return;
} // .end method
