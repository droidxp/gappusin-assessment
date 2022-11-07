public class com.wiyun.engine.opengl.WYGLSurfaceView extends android.opengl.GLSurfaceView {
	 /* .source "WYGLSurfaceView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/opengl/WYGLSurfaceView$WYConfigChooser; */
	 /* } */
} // .end annotation
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
	 /* .prologue */
	 /* .line 48 */
	 int v0 = 0; // const/4 v0, 0x0
	 com.wiyun.engine.opengl.WYGLSurfaceView.sMuteSet = (v0!= 0);
	 /* .line 28 */
	 return;
} // .end method
public com.wiyun.engine.opengl.WYGLSurfaceView ( ) {
	 /* .locals 6 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .prologue */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 56 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move v4, v3 */
	 /* move v5, v3 */
	 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ZZZ)V */
	 /* .line 57 */
	 return;
} // .end method
public com.wiyun.engine.opengl.WYGLSurfaceView ( ) {
	 /* .locals 6 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 76 */
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v2, p2 */
	 /* move v4, v3 */
	 /* move v5, v3 */
	 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ZZZ)V */
	 /* .line 77 */
	 return;
} // .end method
public com.wiyun.engine.opengl.WYGLSurfaceView ( ) {
	 /* .locals 9 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .param p3, "enableZBuffer" # Z */
	 /* .param p4, "enableStencilBuffer" # Z */
	 /* .param p5, "transparent" # Z */
	 /* .prologue */
	 int v8 = 1; // const/4 v8, 0x1
	 /* .line 89 */
	 /* invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 /* .line 95 */
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* .line 97 */
		 try { // :try_start_0
			 (( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 /* .line 98 */
			 /* .local v3, "pkg":Ljava/lang/String; */
			 /* new-instance v6, Ljava/lang/StringBuilder; */
			 java.lang.String .valueOf ( v3 );
			 /* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 final String v7 = ".R$styleable"; // const-string v7, ".R$styleable"
			 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 99 */
			 /* .local v5, "styleableName":Ljava/lang/String; */
			 java.lang.Class .forName ( v5 );
			 /* .line 100 */
			 /* .local v4, "styleableClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
			 final String v6 = "com_wiyun_engine_opengl_WYGLSurfaceView"; // const-string v6, "com_wiyun_engine_opengl_WYGLSurfaceView"
			 (( java.lang.Class ) v4 ).getField ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 101 */
			 /* .local v1, "f1":Ljava/lang/reflect/Field; */
			 final String v6 = "com_wiyun_engine_opengl_WYGLSurfaceView_transparent"; // const-string v6, "com_wiyun_engine_opengl_WYGLSurfaceView_transparent"
			 (( java.lang.Class ) v4 ).getField ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 102 */
			 /* .local v2, "f2":Ljava/lang/reflect/Field; */
			 int v6 = 0; // const/4 v6, 0x0
			 (( java.lang.reflect.Field ) v1 ).get ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v6, [I */
			 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v6 ); // invoke-virtual {p1, p2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
			 /* .line 103 */
			 /* .local v0, "a":Landroid/content/res/TypedArray; */
			 int v6 = 0; // const/4 v6, 0x0
			 v6 = 			 (( java.lang.reflect.Field ) v2 ).getInt ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
			 int v7 = 0; // const/4 v7, 0x0
			 (( android.content.res.TypedArray ) v0 ).getBoolean ( v6, v7 ); // invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
			 /* :try_end_0 */
			 p5 = 			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 109 */
		 } // .end local v0 # "a":Landroid/content/res/TypedArray;
	 } // .end local v1 # "f1":Ljava/lang/reflect/Field;
} // .end local v2 # "f2":Ljava/lang/reflect/Field;
} // .end local v3 # "pkg":Ljava/lang/String;
} // .end local v4 # "styleableClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
} // .end local v5 # "styleableName":Ljava/lang/String;
} // :cond_0
} // :goto_0
/* iput-boolean v8, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
/* .line 110 */
/* iput-boolean v8, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
/* .line 111 */
/* iput-boolean p3, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mEnableZBuffer:Z */
/* .line 112 */
/* iput-boolean p4, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mEnableStencilBuffer:Z */
/* .line 115 */
com.wiyun.engine.nodes.Director .getInstance ( );
this.mDirector = v6;
/* .line 116 */
v6 = this.mDirector;
(( com.wiyun.engine.nodes.Director ) v6 ).attachContext ( p1 ); // invoke-virtual {v6, p1}, Lcom/wiyun/engine/nodes/Director;->attachContext(Landroid/content/Context;)V
/* .line 119 */
com.wiyun.engine.events.EventDispatcher .getInstance ( );
this.mDispatcher = v6;
/* .line 122 */
/* new-instance v6, Landroid/view/GestureDetector; */
v7 = this.mDispatcher;
/* invoke-direct {v6, p1, v7}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V */
this.mGestureDetector = v6;
/* .line 123 */
v6 = this.mGestureDetector;
(( android.view.GestureDetector ) v6 ).setIsLongpressEnabled ( v8 ); // invoke-virtual {v6, v8}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V
/* .line 126 */
/* new-instance v6, Lcom/wiyun/engine/opengl/WYGLSurfaceView$WYConfigChooser; */
/* invoke-direct {v6, p0, p5}, Lcom/wiyun/engine/opengl/WYGLSurfaceView$WYConfigChooser;-><init>(Lcom/wiyun/engine/opengl/WYGLSurfaceView;Z)V */
(( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).setEGLConfigChooser ( v6 ); // invoke-virtual {p0, v6}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->setEGLConfigChooser(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V
/* .line 127 */
if ( p5 != null) { // if-eqz p5, :cond_1
/* .line 128 */
(( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->getHolder()Landroid/view/SurfaceHolder;
int v7 = -3; // const/4 v7, -0x3
/* .line 130 */
} // :cond_1
v6 = this.mDirector;
(( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).setRenderer ( v6 ); // invoke-virtual {p0, v6}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V
/* .line 133 */
(( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).setFocusable ( v8 ); // invoke-virtual {p0, v8}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->setFocusable(Z)V
/* .line 134 */
(( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).setFocusableInTouchMode ( v8 ); // invoke-virtual {p0, v8}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->setFocusableInTouchMode(Z)V
/* .line 135 */
return;
/* .line 104 */
/* :catch_0 */
/* move-exception v6 */
} // .end method
public com.wiyun.engine.opengl.WYGLSurfaceView ( ) {
/* .locals 6 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "transparent" # Z */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 66 */
int v2 = 0; // const/4 v2, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v4, v3 */
/* move v5, p2 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ZZZ)V */
/* .line 67 */
return;
} // .end method
static Boolean access$0 ( com.wiyun.engine.opengl.WYGLSurfaceView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 42 */
/* iget-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mEnableZBuffer:Z */
} // .end method
static Boolean access$1 ( com.wiyun.engine.opengl.WYGLSurfaceView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 45 */
/* iget-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mEnableStencilBuffer:Z */
} // .end method
/* # virtual methods */
public void disableSystemHandleMenuKey ( ) {
/* .locals 1 */
/* .prologue */
/* .line 163 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
/* .line 164 */
return;
} // .end method
public void disableSystemHandleVolumnKey ( ) {
/* .locals 1 */
/* .prologue */
/* .line 149 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
/* .line 150 */
return;
} // .end method
public void enableSystemHandleMenuKey ( ) {
/* .locals 1 */
/* .prologue */
/* .line 156 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
/* .line 157 */
return;
} // .end method
public void enableSystemHandleVolumnKey ( ) {
/* .locals 1 */
/* .prologue */
/* .line 142 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
/* .line 143 */
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 291 */
/* sparse-switch p1, :sswitch_data_0 */
/* .line 308 */
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyDown ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyDown(Landroid/view/KeyEvent;)Z
/* .line 309 */
} // :goto_0
/* .line 294 */
/* :sswitch_0 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 295 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
/* .line 297 */
} // :cond_0
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyDown ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyDown(Landroid/view/KeyEvent;)Z
/* .line 301 */
/* :sswitch_1 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 302 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
/* .line 304 */
} // :cond_1
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyDown ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyDown(Landroid/view/KeyEvent;)Z
/* .line 291 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x18 -> :sswitch_0 */
/* 0x19 -> :sswitch_0 */
/* 0x52 -> :sswitch_1 */
} // .end sparse-switch
} // .end method
public Boolean onKeyMultiple ( Integer p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 2 */
/* .param p1, "keyCode" # I */
/* .param p2, "repeatCount" # I */
/* .param p3, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 339 */
/* sparse-switch p1, :sswitch_data_0 */
/* .line 356 */
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyMultiple ( p3 ); // invoke-virtual {v1, p3}, Lcom/wiyun/engine/events/EventDispatcher;->keyMultiple(Landroid/view/KeyEvent;)Z
/* .line 357 */
} // :goto_0
/* .line 342 */
/* :sswitch_0 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 343 */
v0 = /* invoke-super {p0, p1, p2, p3}, Landroid/opengl/GLSurfaceView;->onKeyMultiple(IILandroid/view/KeyEvent;)Z */
/* .line 345 */
} // :cond_0
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyMultiple ( p3 ); // invoke-virtual {v1, p3}, Lcom/wiyun/engine/events/EventDispatcher;->keyMultiple(Landroid/view/KeyEvent;)Z
/* .line 349 */
/* :sswitch_1 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 350 */
v0 = /* invoke-super {p0, p1, p2, p3}, Landroid/opengl/GLSurfaceView;->onKeyMultiple(IILandroid/view/KeyEvent;)Z */
/* .line 352 */
} // :cond_1
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyMultiple ( p3 ); // invoke-virtual {v1, p3}, Lcom/wiyun/engine/events/EventDispatcher;->keyMultiple(Landroid/view/KeyEvent;)Z
/* .line 339 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x18 -> :sswitch_0 */
/* 0x19 -> :sswitch_0 */
/* 0x52 -> :sswitch_1 */
} // .end sparse-switch
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 315 */
/* sparse-switch p1, :sswitch_data_0 */
/* .line 332 */
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyUp ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyUp(Landroid/view/KeyEvent;)Z
/* .line 333 */
} // :goto_0
/* .line 318 */
/* :sswitch_0 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleVolumnKey:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 319 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyUp(ILandroid/view/KeyEvent;)Z */
/* .line 321 */
} // :cond_0
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyUp ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyUp(Landroid/view/KeyEvent;)Z
/* .line 325 */
/* :sswitch_1 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mSystemHandleMenuKey:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 326 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyUp(ILandroid/view/KeyEvent;)Z */
/* .line 328 */
} // :cond_1
v1 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v1 ).keyUp ( p2 ); // invoke-virtual {v1, p2}, Lcom/wiyun/engine/events/EventDispatcher;->keyUp(Landroid/view/KeyEvent;)Z
/* .line 315 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x18 -> :sswitch_0 */
/* 0x19 -> :sswitch_0 */
/* 0x52 -> :sswitch_1 */
} // .end sparse-switch
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 6 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 212 */
v4 = this.mGestureDetector;
(( android.view.GestureDetector ) v4 ).onTouchEvent ( p1 ); // invoke-virtual {v4, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
/* .line 214 */
android.view.MotionEvent .obtain ( p1 );
/* .line 244 */
/* .local v2, "e":Landroid/view/MotionEvent; */
v4 = (( android.view.MotionEvent ) v2 ).getAction ( ); // invoke-virtual {v2}, Landroid/view/MotionEvent;->getAction()I
/* packed-switch v4, :pswitch_data_0 */
/* .line 275 */
v4 = (( android.view.MotionEvent ) v2 ).getAction ( ); // invoke-virtual {v2}, Landroid/view/MotionEvent;->getAction()I
/* and-int/lit16 v4, v4, 0xff */
/* packed-switch v4, :pswitch_data_1 */
/* .line 286 */
} // :goto_0
int v4 = 1; // const/4 v4, 0x1
/* .line 247 */
/* :pswitch_0 */
v4 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v4 ).touchesCancelled ( v2 ); // invoke-virtual {v4, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesCancelled(Landroid/view/MotionEvent;)Z
/* .line 251 */
/* :pswitch_1 */
v4 = (( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).isFocused ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->isFocused()Z
/* if-nez v4, :cond_0 */
/* .line 252 */
(( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).requestFocus ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->requestFocus()Z
/* .line 255 */
(( com.wiyun.engine.opengl.WYGLSurfaceView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->getContext()Landroid/content/Context;
/* .line 256 */
/* .local v1, "context":Landroid/content/Context; */
/* instance-of v4, v1, Landroid/app/Activity; */
if ( v4 != null) { // if-eqz v4, :cond_0
/* move-object v0, v1 */
/* .line 257 */
/* check-cast v0, Landroid/app/Activity; */
/* .line 258 */
/* .local v0, "act":Landroid/app/Activity; */
final String v4 = "input_method"; // const-string v4, "input_method"
(( android.content.Context ) v1 ).getSystemService ( v4 ); // invoke-virtual {v1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v3, Landroid/view/inputmethod/InputMethodManager; */
/* .line 259 */
/* .local v3, "imm":Landroid/view/inputmethod/InputMethodManager; */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 260 */
(( android.app.Activity ) v0 ).getWindow ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v4 ).getDecorView ( ); // invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;
(( android.view.View ) v4 ).getWindowToken ( ); // invoke-virtual {v4}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
int v5 = 0; // const/4 v5, 0x0
(( android.view.inputmethod.InputMethodManager ) v3 ).hideSoftInputFromWindow ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
/* .line 265 */
} // .end local v0 # "act":Landroid/app/Activity;
} // .end local v1 # "context":Landroid/content/Context;
} // .end local v3 # "imm":Landroid/view/inputmethod/InputMethodManager;
} // :cond_0
v4 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v4 ).touchesBegan ( v2 ); // invoke-virtual {v4, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesBegan(Landroid/view/MotionEvent;)Z
/* .line 268 */
/* :pswitch_2 */
v4 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v4 ).touchesMoved ( v2 ); // invoke-virtual {v4, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesMoved(Landroid/view/MotionEvent;)Z
/* .line 271 */
/* :pswitch_3 */
v4 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v4 ).touchesEnded ( v2 ); // invoke-virtual {v4, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesEnded(Landroid/view/MotionEvent;)Z
/* .line 277 */
/* :pswitch_4 */
v4 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v4 ).touchesPointerBegan ( v2 ); // invoke-virtual {v4, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesPointerBegan(Landroid/view/MotionEvent;)Z
/* .line 280 */
/* :pswitch_5 */
v4 = this.mDispatcher;
(( com.wiyun.engine.events.EventDispatcher ) v4 ).touchesPointerEnded ( v2 ); // invoke-virtual {v4, v2}, Lcom/wiyun/engine/events/EventDispatcher;->touchesPointerEnded(Landroid/view/MotionEvent;)Z
/* .line 244 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
/* .line 275 */
/* :pswitch_data_1 */
/* .packed-switch 0x5 */
/* :pswitch_4 */
/* :pswitch_5 */
} // .end packed-switch
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "hasWindowFocus" # Z */
/* .prologue */
/* .line 168 */
/* invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->onWindowFocusChanged(Z)V */
/* .line 172 */
/* if-nez p1, :cond_0 */
/* .line 173 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager .isMuted ( );
com.wiyun.engine.opengl.WYGLSurfaceView.sMuteSet = (v0!= 0);
/* .line 177 */
} // :cond_0
/* sget-boolean v0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->sMuteSet:Z */
/* if-nez v0, :cond_1 */
/* .line 180 */
if ( p1 != null) { // if-eqz p1, :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
com.wiyun.engine.sound.AudioManager .setMute ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 184 */
} // :cond_1
} // :goto_1
return;
/* .line 180 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* .line 182 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public void setRenderer ( android.opengl.GLSurfaceView$Renderer p0 ) {
/* .locals 1 */
/* .param p1, "renderer" # Landroid/opengl/GLSurfaceView$Renderer; */
/* .prologue */
/* .line 188 */
/* move-object v0, p1 */
/* check-cast v0, Lcom/wiyun/engine/nodes/Director; */
(( com.wiyun.engine.nodes.Director ) v0 ).attachInView ( p0 ); // invoke-virtual {v0, p0}, Lcom/wiyun/engine/nodes/Director;->attachInView(Lcom/wiyun/engine/opengl/WYGLSurfaceView;)V
/* .line 189 */
/* invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V */
/* .line 190 */
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 2 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 202 */
/* invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->surfaceCreated(Landroid/view/SurfaceHolder;)V */
/* .line 205 */
com.wiyun.engine.nodes.Director .getInstance ( );
/* iget-boolean v1, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView;->mEnableZBuffer:Z */
(( com.wiyun.engine.nodes.Director ) v0 ).setDepthTest ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Director;->setDepthTest(Z)V
/* .line 206 */
return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 194 */
/* invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->surfaceDestroyed(Landroid/view/SurfaceHolder;)V */
/* .line 197 */
v0 = this.mDirector;
(( com.wiyun.engine.nodes.Director ) v0 ).onSurfaceDestroyed ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->onSurfaceDestroyed()V
/* .line 198 */
return;
} // .end method
