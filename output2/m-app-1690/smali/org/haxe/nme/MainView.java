class org.haxe.nme.MainView extends android.opengl.GLSurfaceView {
	 /* .source "MainView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/haxe/nme/MainView$Renderer; */
	 /* } */
} // .end annotation
/* # static fields */
static final Integer etTouchBegin;
static final Integer etTouchEnd;
static final Integer etTouchMove;
static final Integer etTouchTap;
static org.haxe.nme.MainView mRefreshView;
static final Integer resTerminate;
/* # instance fields */
android.app.Activity mActivity;
java.util.Timer mTimer;
Integer mTimerID;
/* # direct methods */
public org.haxe.nme.MainView ( ) {
	 /* .locals 12 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "inActivity" # Landroid/app/Activity; */
	 /* .prologue */
	 int v11 = 2; // const/4 v11, 0x2
	 int v10 = 0; // const/4 v10, 0x0
	 int v4 = 1; // const/4 v4, 0x1
	 /* .line 42 */
	 /* invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V */
	 /* .line 36 */
	 /* new-instance v9, Ljava/util/Timer; */
	 /* invoke-direct {v9}, Ljava/util/Timer;-><init>()V */
	 this.mTimer = v9;
	 /* .line 37 */
	 /* iput v10, p0, Lorg/haxe/nme/MainView;->mTimerID:I */
	 /* .line 44 */
	 int v6 = 1; // const/4 v6, 0x1
	 /* .line 48 */
	 /* .local v6, "eglVersion":I */
	 javax.microedition.khronos.egl.EGLContext .getEGL ( );
	 /* check-cast v0, Ljavax/microedition/khronos/egl/EGL10; */
	 /* .line 49 */
	 /* .local v0, "egl":Ljavax/microedition/khronos/egl/EGL10; */
	 v9 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
	 /* .line 50 */
	 /* .local v1, "display":Ljavax/microedition/khronos/egl/EGLDisplay; */
	 /* new-array v8, v11, [I */
	 /* .line 52 */
	 /* .local v8, "version":[I */
	 /* .line 54 */
	 /* new-array v3, v4, [Ljavax/microedition/khronos/egl/EGLConfig; */
	 /* .line 55 */
	 /* .local v3, "v2_configs":[Ljavax/microedition/khronos/egl/EGLConfig; */
	 /* new-array v5, v4, [I */
	 /* .line 56 */
	 /* .local v5, "num_config":[I */
	 int v9 = 3; // const/4 v9, 0x3
	 /* new-array v2, v9, [I */
	 /* fill-array-data v2, :array_0 */
	 /* .line 57 */
	 /* .local v2, "attrs":[I */
	 /* invoke-interface/range {v0 ..v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
	 /* .line 59 */
	 /* aget v9, v5, v10 */
	 /* if-ne v9, v4, :cond_0 */
	 /* .line 61 */
	 int v6 = 2; // const/4 v6, 0x2
	 /* .line 62 */
	 (( org.haxe.nme.MainView ) p0 ).setEGLContextClientVersion ( v11 ); // invoke-virtual {p0, v11}, Lorg/haxe/nme/MainView;->setEGLContextClientVersion(I)V
	 /* .line 68 */
} // :cond_0
/* if-ne v6, v4, :cond_1 */
/* move v7, v4 */
/* .line 70 */
/* .local v7, "renderType":I */
} // :goto_0
/* new-instance v9, Lorg/haxe/nme/MainView$1; */
/* invoke-direct {v9, p0, v7}, Lorg/haxe/nme/MainView$1;-><init>(Lorg/haxe/nme/MainView;I)V */
(( org.haxe.nme.MainView ) p0 ).setEGLConfigChooser ( v9 ); // invoke-virtual {p0, v9}, Lorg/haxe/nme/MainView;->setEGLConfigChooser(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V
/* .line 184 */
this.mActivity = p2;
/* .line 185 */
/* .line 186 */
(( org.haxe.nme.MainView ) p0 ).setFocusable ( v4 ); // invoke-virtual {p0, v4}, Lorg/haxe/nme/MainView;->setFocusable(Z)V
/* .line 187 */
(( org.haxe.nme.MainView ) p0 ).setFocusableInTouchMode ( v4 ); // invoke-virtual {p0, v4}, Lorg/haxe/nme/MainView;->setFocusableInTouchMode(Z)V
/* .line 188 */
/* new-instance v4, Lorg/haxe/nme/MainView$Renderer; */
/* invoke-direct {v4, p0}, Lorg/haxe/nme/MainView$Renderer;-><init>(Lorg/haxe/nme/MainView;)V */
(( org.haxe.nme.MainView ) p0 ).setRenderer ( v4 ); // invoke-virtual {p0, v4}, Lorg/haxe/nme/MainView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V
/* .line 189 */
(( org.haxe.nme.MainView ) p0 ).setRenderMode ( v10 ); // invoke-virtual {p0, v10}, Lorg/haxe/nme/MainView;->setRenderMode(I)V
/* .line 191 */
return;
/* .line 68 */
} // .end local v7 # "renderType":I
} // :cond_1
int v7 = 4; // const/4 v7, 0x4
/* .line 56 */
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x3040 */
/* 0x4 */
/* 0x3038 */
} // .end array-data
} // .end method
public static void renderNow ( ) {
/* .locals 1 */
/* .prologue */
/* .line 504 */
v0 = org.haxe.nme.MainView.mRefreshView;
(( org.haxe.nme.MainView ) v0 ).requestRender ( ); // invoke-virtual {v0}, Lorg/haxe/nme/MainView;->requestRender()V
/* .line 506 */
return;
} // .end method
/* # virtual methods */
public void HandleResult ( Integer p0 ) {
/* .locals 9 */
/* .param p1, "inCode" # I */
/* .prologue */
/* .line 196 */
int v5 = -1; // const/4 v5, -0x1
/* if-ne p1, v5, :cond_0 */
/* .line 198 */
v5 = this.mActivity;
(( android.app.Activity ) v5 ).finish ( ); // invoke-virtual {v5}, Landroid/app/Activity;->finish()V
/* .line 240 */
} // :goto_0
return;
/* .line 203 */
} // :cond_0
org.haxe.nme.NME .getNextWake ( );
/* move-result-wide v3 */
/* .line 204 */
/* .local v3, "wake":D */
/* move-object v1, p0 */
/* .line 206 */
/* .local v1, "me":Lorg/haxe/nme/MainView; */
/* const-wide/16 v5, 0x0 */
/* cmpg-double v5, v3, v5 */
/* if-gtz v5, :cond_1 */
/* .line 208 */
/* new-instance v5, Lorg/haxe/nme/MainView$2; */
/* invoke-direct {v5, p0, v1}, Lorg/haxe/nme/MainView$2;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v5 ); // invoke-virtual {p0, v5}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 220 */
} // :cond_1
/* iget v5, p0, Lorg/haxe/nme/MainView;->mTimerID:I */
/* add-int/lit8 v2, v5, 0x1 */
/* iput v2, p0, Lorg/haxe/nme/MainView;->mTimerID:I */
/* .line 221 */
/* .local v2, "tid":I */
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
/* .line 222 */
/* .local v0, "end":Ljava/util/Date; */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v5 */
/* const-wide v7, 0x408f400000000000L # 1000.0 */
/* mul-double/2addr v7, v3 */
/* double-to-int v7, v7 */
/* int-to-long v7, v7 */
/* add-long/2addr v5, v7 */
(( java.util.Date ) v0 ).setTime ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Ljava/util/Date;->setTime(J)V
/* .line 224 */
v5 = this.mTimer;
/* new-instance v6, Lorg/haxe/nme/MainView$3; */
/* invoke-direct {v6, p0, v2, v1}, Lorg/haxe/nme/MainView$3;-><init>(Lorg/haxe/nme/MainView;ILorg/haxe/nme/MainView;)V */
(( java.util.Timer ) v5 ).schedule ( v6, v0 ); // invoke-virtual {v5, v6, v0}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;Ljava/util/Date;)V
} // .end method
public Boolean onGenericMotionEvent ( android.view.MotionEvent p0 ) {
/* .locals 11 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 245 */
v0 = (( android.view.MotionEvent ) p1 ).getSource ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I
/* and-int/lit8 v0, v0, 0x10 */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_3 */
/* .line 247 */
/* move-object v2, p0 */
/* .line 248 */
/* .local v2, "me":Lorg/haxe/nme/MainView; */
(( android.view.MotionEvent ) p1 ).getDevice ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getDevice()Landroid/view/InputDevice;
/* .line 249 */
/* .local v8, "device":Landroid/view/InputDevice; */
v3 = (( android.view.MotionEvent ) p1 ).getDeviceId ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getDeviceId()I
/* .line 251 */
/* .local v3, "deviceId":I */
/* const/16 v0, 0xa */
/* new-array v7, v0, [I */
/* fill-array-data v7, :array_0 */
/* .line 260 */
/* .local v7, "axisList":[I */
int v10 = 0; // const/4 v10, 0x0
/* .local v10, "i":I */
} // :goto_0
/* array-length v0, v7 */
/* if-ge v10, v0, :cond_2 */
/* .line 262 */
/* aget v4, v7, v10 */
/* .line 263 */
/* .local v4, "axis":I */
v0 = (( android.view.MotionEvent ) p1 ).getSource ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I
(( android.view.InputDevice ) v8 ).getMotionRange ( v4, v0 ); // invoke-virtual {v8, v4, v0}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;
/* .line 265 */
/* .local v6, "range":Landroid/view/InputDevice$MotionRange; */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 267 */
v9 = (( android.view.InputDevice$MotionRange ) v6 ).getFlat ( ); // invoke-virtual {v6}, Landroid/view/InputDevice$MotionRange;->getFlat()F
/* .line 268 */
/* .local v9, "flat":F */
v5 = (( android.view.MotionEvent ) p1 ).getAxisValue ( v4 ); // invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getAxisValue(I)F
/* .line 270 */
/* .local v5, "value":F */
v0 = java.lang.Math .abs ( v5 );
/* cmpl-float v0, v0, v9 */
/* if-lez v0, :cond_1 */
/* .line 272 */
/* new-instance v0, Lorg/haxe/nme/MainView$4; */
/* move-object v1, p0 */
/* invoke-direct/range {v0 ..v6}, Lorg/haxe/nme/MainView$4;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;IIFLandroid/view/InputDevice$MotionRange;)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 260 */
} // .end local v5 # "value":F
} // .end local v9 # "flat":F
} // :cond_0
} // :goto_1
/* add-int/lit8 v10, v10, 0x1 */
/* .line 284 */
/* .restart local v5 # "value":F */
/* .restart local v9 # "flat":F */
} // :cond_1
/* new-instance v0, Lorg/haxe/nme/MainView$5; */
/* invoke-direct {v0, p0, v2, v3, v4}, Lorg/haxe/nme/MainView$5;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;II)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 299 */
} // .end local v4 # "axis":I
} // .end local v5 # "value":F
} // .end local v6 # "range":Landroid/view/InputDevice$MotionRange;
} // .end local v9 # "flat":F
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* .line 303 */
} // .end local v2 # "me":Lorg/haxe/nme/MainView;
} // .end local v3 # "deviceId":I
} // .end local v7 # "axisList":[I
} // .end local v8 # "device":Landroid/view/InputDevice;
} // .end local v10 # "i":I
} // :goto_2
} // :cond_3
v0 = /* invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z */
/* .line 251 */
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x1 */
/* 0xb */
/* 0xc */
/* 0xd */
/* 0xe */
/* 0xf */
/* 0x10 */
/* 0x11 */
/* 0x12 */
} // .end array-data
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 6 */
/* .param p1, "inKeyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
/* .line 310 */
/* move-object v2, p0 */
/* .line 312 */
/* .local v2, "me":Lorg/haxe/nme/MainView; */
/* const/16 v5, 0xc */
/* if-lt v4, v5, :cond_2 */
v4 = android.view.KeyEvent .isGamepadButton ( p1 );
/* if-nez v4, :cond_0 */
/* const/16 v4, 0x13 */
/* if-lt p1, v4, :cond_2 */
/* const/16 v4, 0x16 */
/* if-gt p1, v4, :cond_2 */
/* .line 314 */
} // :cond_0
v4 = (( android.view.KeyEvent ) p2 ).getRepeatCount ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
/* if-nez v4, :cond_1 */
/* .line 316 */
v0 = (( android.view.KeyEvent ) p2 ).getDeviceId ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I
/* .line 318 */
/* .local v0, "deviceId":I */
/* new-instance v4, Lorg/haxe/nme/MainView$6; */
/* invoke-direct {v4, p0, v2, v0, p1}, Lorg/haxe/nme/MainView$6;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;II)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v4 ); // invoke-virtual {p0, v4}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 352 */
} // .end local v0 # "deviceId":I
} // :cond_1
} // :goto_0
/* .line 334 */
} // :cond_2
v1 = (( org.haxe.nme.MainView ) p0 ).translateKey ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/haxe/nme/MainView;->translateKey(ILandroid/view/KeyEvent;)I
/* .line 336 */
/* .local v1, "keyCode":I */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 338 */
/* new-instance v4, Lorg/haxe/nme/MainView$7; */
/* invoke-direct {v4, p0, v2, v1}, Lorg/haxe/nme/MainView$7;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;I)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v4 ); // invoke-virtual {p0, v4}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 352 */
} // :cond_3
v3 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 6 */
/* .param p1, "inKeyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
/* .line 359 */
/* move-object v2, p0 */
/* .line 361 */
/* .local v2, "me":Lorg/haxe/nme/MainView; */
/* const/16 v5, 0xc */
/* if-lt v4, v5, :cond_2 */
v4 = android.view.KeyEvent .isGamepadButton ( p1 );
/* if-nez v4, :cond_0 */
/* const/16 v4, 0x13 */
/* if-lt p1, v4, :cond_2 */
/* const/16 v4, 0x16 */
/* if-gt p1, v4, :cond_2 */
/* .line 363 */
} // :cond_0
v4 = (( android.view.KeyEvent ) p2 ).getRepeatCount ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
/* if-nez v4, :cond_1 */
/* .line 365 */
v0 = (( android.view.KeyEvent ) p2 ).getDeviceId ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I
/* .line 367 */
/* .local v0, "deviceId":I */
/* new-instance v4, Lorg/haxe/nme/MainView$8; */
/* invoke-direct {v4, p0, v2, v0, p1}, Lorg/haxe/nme/MainView$8;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;II)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v4 ); // invoke-virtual {p0, v4}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 401 */
} // .end local v0 # "deviceId":I
} // :cond_1
} // :goto_0
/* .line 383 */
} // :cond_2
v1 = (( org.haxe.nme.MainView ) p0 ).translateKey ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/haxe/nme/MainView;->translateKey(ILandroid/view/KeyEvent;)I
/* .line 385 */
/* .local v1, "keyCode":I */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 387 */
/* new-instance v4, Lorg/haxe/nme/MainView$9; */
/* invoke-direct {v4, p0, v2, v1}, Lorg/haxe/nme/MainView$9;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;I)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v4 ); // invoke-virtual {p0, v4}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 401 */
} // :cond_3
v3 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
void onPoll ( ) {
/* .locals 1 */
/* .prologue */
/* .line 408 */
v0 = org.haxe.nme.NME .onPoll ( );
(( org.haxe.nme.MainView ) p0 ).HandleResult ( v0 ); // invoke-virtual {p0, v0}, Lorg/haxe/nme/MainView;->HandleResult(I)V
/* .line 410 */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 13 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 415 */
/* move-object v2, p0 */
/* .line 416 */
/* .local v2, "me":Lorg/haxe/nme/MainView; */
v9 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* .line 417 */
/* .local v9, "action":I */
int v12 = -1; // const/4 v12, -0x1
/* .line 419 */
/* .local v12, "type":I */
/* and-int/lit16 v0, v9, 0xff */
/* packed-switch v0, :pswitch_data_0 */
/* .line 430 */
} // :goto_0
/* :pswitch_0 */
/* const v0, 0xff00 */
/* and-int/2addr v0, v9 */
/* shr-int/lit8 v11, v0, 0x8 */
/* .line 431 */
/* .local v11, "idx":I */
/* move v3, v12 */
/* .line 433 */
/* .local v3, "t":I */
int v10 = 0; // const/4 v10, 0x0
/* .local v10, "i":I */
} // :goto_1
v0 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* if-ge v10, v0, :cond_2 */
/* .line 435 */
v6 = (( android.view.MotionEvent ) p1 ).getPointerId ( v10 ); // invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 436 */
/* .local v6, "id":I */
v4 = (( android.view.MotionEvent ) p1 ).getX ( v10 ); // invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getX(I)F
/* .line 437 */
/* .local v4, "x":F */
v5 = (( android.view.MotionEvent ) p1 ).getY ( v10 ); // invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getY(I)F
/* .line 438 */
/* .local v5, "y":F */
v7 = (( android.view.MotionEvent ) p1 ).getSize ( v10 ); // invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getSize(I)F
/* .line 439 */
/* .local v7, "sizeX":F */
v8 = (( android.view.MotionEvent ) p1 ).getSize ( v10 ); // invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getSize(I)F
/* .line 441 */
/* .local v8, "sizeY":F */
/* const/16 v0, 0x10 */
/* if-eq v12, v0, :cond_0 */
/* if-ne v10, v11, :cond_1 */
/* .line 443 */
} // :cond_0
/* new-instance v0, Lorg/haxe/nme/MainView$10; */
/* move-object v1, p0 */
/* invoke-direct/range {v0 ..v8}, Lorg/haxe/nme/MainView$10;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;IFFIFF)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 433 */
} // :cond_1
/* add-int/lit8 v10, v10, 0x1 */
/* .line 421 */
} // .end local v3 # "t":I
} // .end local v4 # "x":F
} // .end local v5 # "y":F
} // .end local v6 # "id":I
} // .end local v7 # "sizeX":F
} // .end local v8 # "sizeY":F
} // .end local v10 # "i":I
} // .end local v11 # "idx":I
/* :pswitch_1 */
/* const/16 v12, 0xf */
/* .line 422 */
/* :pswitch_2 */
/* const/16 v12, 0xf */
/* .line 423 */
/* :pswitch_3 */
/* const/16 v12, 0x10 */
/* .line 424 */
/* :pswitch_4 */
/* const/16 v12, 0x11 */
/* .line 425 */
/* :pswitch_5 */
/* const/16 v12, 0x11 */
/* .line 426 */
/* :pswitch_6 */
/* const/16 v12, 0x11 */
/* .line 457 */
/* .restart local v3 # "t":I */
/* .restart local v10 # "i":I */
/* .restart local v11 # "idx":I */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* .line 419 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_6 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_5 */
} // .end packed-switch
} // .end method
public Boolean onTrackballEvent ( android.view.MotionEvent p0 ) {
/* .locals 2 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 464 */
/* move-object v0, p0 */
/* .line 466 */
/* .local v0, "me":Lorg/haxe/nme/MainView; */
/* new-instance v1, Lorg/haxe/nme/MainView$11; */
/* invoke-direct {v1, p0, p1, v0}, Lorg/haxe/nme/MainView$11;-><init>(Lorg/haxe/nme/MainView;Landroid/view/MotionEvent;Lorg/haxe/nme/MainView;)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v1 ); // invoke-virtual {p0, v1}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 479 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
void queuePoll ( ) {
/* .locals 2 */
/* .prologue */
/* .line 486 */
/* move-object v0, p0 */
/* .line 488 */
/* .local v0, "me":Lorg/haxe/nme/MainView; */
/* new-instance v1, Lorg/haxe/nme/MainView$12; */
/* invoke-direct {v1, p0, v0}, Lorg/haxe/nme/MainView$12;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v1 ); // invoke-virtual {p0, v1}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 498 */
return;
} // .end method
void sendActivity ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "inActivity" # I */
/* .prologue */
/* .line 511 */
/* new-instance v0, Lorg/haxe/nme/MainView$13; */
/* invoke-direct {v0, p0, p1}, Lorg/haxe/nme/MainView$13;-><init>(Lorg/haxe/nme/MainView;I)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 521 */
return;
} // .end method
public Integer translateKey ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .param p1, "inCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 526 */
/* sparse-switch p1, :sswitch_data_0 */
/* .line 534 */
v1 = (( android.view.KeyEvent ) p2 ).getMetaState ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I
v0 = (( android.view.KeyEvent ) p2 ).getUnicodeChar ( v1 ); // invoke-virtual {p2, v1}, Landroid/view/KeyEvent;->getUnicodeChar(I)I
/* .line 536 */
/* .local v0, "result":I */
/* const/high16 v1, -0x80000000 */
/* if-ne v0, v1, :cond_0 */
/* .line 539 */
int v0 = 0; // const/4 v0, 0x0
/* .line 543 */
} // .end local v0 # "result":I
} // :cond_0
} // :goto_0
/* .line 528 */
/* :sswitch_0 */
/* const/16 v0, 0x1b */
/* .line 529 */
/* :sswitch_1 */
/* const v0, 0x1000012 */
/* .line 530 */
/* :sswitch_2 */
/* const/16 v0, 0x8 */
/* .line 526 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x4 -> :sswitch_0 */
/* 0x43 -> :sswitch_2 */
/* 0x52 -> :sswitch_1 */
} // .end sparse-switch
} // .end method
