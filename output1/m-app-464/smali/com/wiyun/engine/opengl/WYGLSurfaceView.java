public class com.wiyun.engine.opengl.WYGLSurfaceView extends android.opengl.GLSurfaceView {
	 /* # static fields */
	 static Boolean sMuteSet;
	 /* # instance fields */
	 protected com.wiyun.engine.nodes.Director mDirector;
	 private com.wiyun.engine.events.EventDispatcher mDispatcher;
	 private Boolean mEnableStencilBuffer;
	 private Boolean mEnableZBuffer;
	 private android.view.GestureDetector mGestureDetector;
	 private Boolean mSystemHandleMenuKey;
	 private Boolean mSystemHandleVolumnKey;
	 /* # direct methods */
	 static com.wiyun.engine.opengl.WYGLSurfaceView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.wiyun.engine.opengl.WYGLSurfaceView.sMuteSet = (v0!= 0);
		 return;
	 } // .end method
	 public com.wiyun.engine.opengl.WYGLSurfaceView ( ) {
		 /* .locals 6 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v4, v3 */
		 /* move v5, v3 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ZZZ)V */
		 return;
	 } // .end method
	 public com.wiyun.engine.opengl.WYGLSurfaceView ( ) {
		 /* .locals 6 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move v4, v3 */
		 /* move v5, v3 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ZZZ)V */
		 return;
	 } // .end method
	 public com.wiyun.engine.opengl.WYGLSurfaceView ( ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 /* invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 try { // :try_start_0
				 (( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 java.lang.String .valueOf ( v0 );
				 /* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 final String v0 = ".R$styleable"; // const-string v0, ".R$styleable"
				 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 java.lang.Class .forName ( v0 );
				 final String v1 = "com_wiyun_engine_opengl_WYGLSurfaceView"; // const-string v1, "com_wiyun_engine_opengl_WYGLSurfaceView"
				 (( java.lang.Class ) v0 ).getField ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
				 final String v2 = "com_wiyun_engine_opengl_WYGLSurfaceView_transparent"; // const-string v2, "com_wiyun_engine_opengl_WYGLSurfaceView_transparent"
				 (( java.lang.Class ) v0 ).getField ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
				 int v0 = 0; // const/4 v0, 0x0
				 (( java.lang.reflect.Field ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
				 /* check-cast v0, [I */
				 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
				 int v1 = 0; // const/4 v1, 0x0
				 v1 = 				 (( java.lang.reflect.Field ) v2 ).getInt ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
				 int v2 = 0; // const/4 v2, 0x0
				 (( android.content.res.TypedArray ) v0 ).getBoolean ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
				 /* :try_end_0 */
				 p5 = 				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :cond_0
		 } // :goto_0
		 /* iput-boolean v3, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
		 /* iput-boolean v3, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
		 /* iput-boolean p3, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mEnableZBuffer:Z */
		 /* iput-boolean p4, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mEnableStencilBuffer:Z */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 this.mDirector = v0;
		 v0 = this.mDirector;
		 (( com.wiyun.engine.nodes.Director ) v0 ).attachContext ( p1 ); // invoke-virtual {v0, p1}, Lcom/wiyun/engine/nodes/Director;->attachContext(Landroid/content/Context;)V
		 com.wiyun.engine.events.EventDispatcher .getInstance ( );
		 this.mDispatcher = v0;
		 /* new-instance v0, Landroid/view/GestureDetector; */
		 v1 = this.mDispatcher;
		 /* invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V */
		 this.mGestureDetector = v0;
		 v0 = this.mGestureDetector;
		 (( android.view.GestureDetector ) v0 ).setIsLongpressEnabled ( v3 ); // invoke-virtual {v0, v3}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V
		 /* new-instance v0, Lcom/wiyun/engine/opengl/WYGLSurfaceView$WYConfigChooser; */
		 /* invoke-direct {v0, p0, p5}, Lcom/wiyun/engine/opengl/WYGLSurfaceView$WYConfigChooser;-><init>(Lcom/wiyun/engine/opengl/WYGLSurfaceView;Z)V */
		 (( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).setEGLConfigChooser ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->setEGLConfigChooser(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V
		 if ( p5 != null) { // if-eqz p5, :cond_1
			 (( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->getHolder()Landroid/view/SurfaceHolder;
			 int v1 = -3; // const/4 v1, -0x3
		 } // :cond_1
		 v0 = this.mDirector;
		 (( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).setRenderer ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V
		 (( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).setFocusable ( v3 ); // invoke-virtual {p0, v3}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->setFocusable(Z)V
		 (( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).setFocusableInTouchMode ( v3 ); // invoke-virtual {p0, v3}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->setFocusableInTouchMode(Z)V
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 public com.wiyun.engine.opengl.WYGLSurfaceView ( ) {
		 /* .locals 6 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v4, v3 */
		 /* move v5, p2 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ZZZ)V */
		 return;
	 } // .end method
	 static Boolean access$0 ( com.wiyun.engine.opengl.WYGLSurfaceView p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mEnableZBuffer:Z */
	 } // .end method
	 static Boolean access$1 ( com.wiyun.engine.opengl.WYGLSurfaceView p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mEnableStencilBuffer:Z */
	 } // .end method
	 /* # virtual methods */
	 public void disableSystemHandleMenuKey ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
		 return;
	 } // .end method
	 public void disableSystemHandleVolumnKey ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
		 return;
	 } // .end method
	 public void enableSystemHandleMenuKey ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
		 return;
	 } // .end method
	 public void enableSystemHandleVolumnKey ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
		 return;
	 } // .end method
	 public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
		 /* .locals 2 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* sparse-switch p1, :sswitch_data_0 */
		 v1 = this.mDispatcher;
		 (( com.wiyun.engine.events.EventDispatcher ) v1 ).keyDown ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyDown(Landroid/view/KeyEvent;)Z
	 } // :goto_0
	 /* :sswitch_0 */
	 /* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 v0 = 		 /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
	 } // :cond_0
	 v1 = this.mDispatcher;
	 (( com.wiyun.engine.events.EventDispatcher ) v1 ).keyDown ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyDown(Landroid/view/KeyEvent;)Z
	 /* :sswitch_1 */
	 /* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 v0 = 		 /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
	 } // :cond_1
	 v1 = this.mDispatcher;
	 (( com.wiyun.engine.events.EventDispatcher ) v1 ).keyDown ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyDown(Landroid/view/KeyEvent;)Z
	 /* :sswitch_data_0 */
	 /* .sparse-switch */
	 /* 0x18 -> :sswitch_0 */
	 /* 0x19 -> :sswitch_0 */
	 /* 0x52 -> :sswitch_1 */
} // .end sparse-switch
} // .end method
public Boolean onKeyMultiple ( Integer p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* sparse-switch p1, :sswitch_data_0 */
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyMultiple ( p3 ); // invoke-virtual {v1, p3}, Lcom/wiyun/engine/events/EventDispatcher;->keyMultiple(Landroid/view/KeyEvent;)Z
} // :goto_0
/* :sswitch_0 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = /* invoke-super {p0, p1, p2, p3}, Landroid/opengl/GLSurfaceView;->onKeyMultiple(IILandroid/view/KeyEvent;)Z */
} // :cond_0
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyMultiple ( p3 ); // invoke-virtual {v1, p3}, Lcom/wiyun/engine/events/EventDispatcher;->keyMultiple(Landroid/view/KeyEvent;)Z
/* :sswitch_1 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
v0 = /* invoke-super {p0, p1, p2, p3}, Landroid/opengl/GLSurfaceView;->onKeyMultiple(IILandroid/view/KeyEvent;)Z */
} // :cond_1
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyMultiple ( p3 ); // invoke-virtual {v1, p3}, Lcom/wiyun/engine/events/EventDispatcher;->keyMultiple(Landroid/view/KeyEvent;)Z
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x18 -> :sswitch_0 */
/* 0x19 -> :sswitch_0 */
/* 0x52 -> :sswitch_1 */
} // .end sparse-switch
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* sparse-switch p1, :sswitch_data_0 */
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyUp ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyUp(Landroid/view/KeyEvent;)Z
} // :goto_0
/* :sswitch_0 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyUp(ILandroid/view/KeyEvent;)Z */
} // :cond_0
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyUp ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyUp(Landroid/view/KeyEvent;)Z
/* :sswitch_1 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
v0 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyUp(ILandroid/view/KeyEvent;)Z */
} // :cond_1
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyUp ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyUp(Landroid/view/KeyEvent;)Z
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x18 -> :sswitch_0 */
/* 0x19 -> :sswitch_0 */
/* 0x52 -> :sswitch_1 */
} // .end sparse-switch
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 4 */
v0 = this.mGestureDetector;
(( android.view.GestureDetector ) v0 ).onTouchEvent ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
android.view.MotionEvent .obtain ( p1 );
v0 = (( android.view.MotionEvent ) v2 ).getAction ( ); // invoke-virtual {v2}, Landroid/view/MotionEvent;->getAction()I
/* packed-switch v0, :pswitch_data_0 */
v0 = (( android.view.MotionEvent ) v2 ).getAction ( ); // invoke-virtual {v2}, Landroid/view/MotionEvent;->getAction()I
/* and-int/lit16 v0, v0, 0xff */
/* packed-switch v0, :pswitch_data_1 */
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
/* :pswitch_0 */
v0 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v0 ).touchesCancelled ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesCancelled(Landroid/view/MotionEvent;)Z
/* :pswitch_1 */
v0 = (( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).isFocused ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->isFocused()Z
/* if-nez v0, :cond_0 */
(( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).requestFocus ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->requestFocus()Z
(( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->getContext()Landroid/content/Context;
/* instance-of v0, v1, Landroid/app/Activity; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* move-object v0, v1 */
/* check-cast v0, Landroid/app/Activity; */
final String v3 = "input_method"; // const-string v3, "input_method"
(( android.content.Context ) v1 ).getSystemService ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/inputmethod/InputMethodManager; */
if ( v1 != null) { // if-eqz v1, :cond_0
(( android.app.Activity ) v0 ).getWindow ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
(( android.view.View ) v0 ).getWindowToken ( ); // invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
int v3 = 0; // const/4 v3, 0x0
(( android.view.inputmethod.InputMethodManager ) v1 ).hideSoftInputFromWindow ( v0, v3 ); // invoke-virtual {v1, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
} // :cond_0
v0 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v0 ).touchesBegan ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesBegan(Landroid/view/MotionEvent;)Z
/* :pswitch_2 */
v0 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v0 ).touchesMoved ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesMoved(Landroid/view/MotionEvent;)Z
/* :pswitch_3 */
v0 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v0 ).touchesEnded ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesEnded(Landroid/view/MotionEvent;)Z
/* :pswitch_4 */
v0 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v0 ).touchesPointerBegan ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesPointerBegan(Landroid/view/MotionEvent;)Z
/* :pswitch_5 */
v0 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v0 ).touchesPointerEnded ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesPointerEnded(Landroid/view/MotionEvent;)Z
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
/* :pswitch_data_1 */
/* .packed-switch 0x5 */
/* :pswitch_4 */
/* :pswitch_5 */
} // .end packed-switch
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->onWindowFocusChanged(Z)V */
/* if-nez p1, :cond_0 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager .isMuted ( );
com.wiyun.engine.opengl.WYGLSurfaceView.sMuteSet = (v0!= 0);
} // :cond_0
/* sget-boolean v0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->sMuteSet:Z */
/* if-nez v0, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
com.wiyun.engine.sound.AudioManager .setMute ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_1
} // :goto_1
return;
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* :catch_0 */
/* move-exception v0 */
} // .end method
public void setRenderer ( android.opengl.GLSurfaceView$Renderer p0 ) {
/* .locals 1 */
/* move-object v0, p1 */
/* check-cast v0, Lcom/wiyun/engine/nodes/Director; */
(( com.wiyun.engine.nodes.Director ) v0 ).attachInView ( p0 ); // invoke-virtual {v0, p0}, Lcom/wiyun/engine/nodes/Director;->attachInView(Lcom/wiyun/engine/opengl/WYGLSurfaceView;)V
/* invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V */
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->surfaceCreated(Landroid/view/SurfaceHolder;)V */
com.wiyun.engine.nodes.Director .getInstance ( );
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mEnableZBuffer:Z */
(( com.wiyun.engine.nodes.Director ) v0 ).setDepthTest ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Director;->setDepthTest(Z)V
return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->surfaceDestroyed(Landroid/view/SurfaceHolder;)V */
v0 = this.mDirector;
(( com.wiyun.engine.nodes.Director ) v0 ).onSurfaceDestroyed ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->onSurfaceDestroyed()V
return;
} // .end method
