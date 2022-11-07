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
	 /* .locals 5 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "inActivity" # Landroid/app/Activity; */
	 /* .prologue */
	 int v4 = 0; // const/4 v4, 0x0
	 int v2 = 1; // const/4 v2, 0x1
	 /* .line 59 */
	 /* invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V */
	 /* .line 183 */
	 /* new-instance v3, Ljava/util/Timer; */
	 /* invoke-direct {v3}, Ljava/util/Timer;-><init>()V */
	 this.mTimer = v3;
	 /* .line 184 */
	 /* iput v4, p0, Lorg/haxe/nme/MainView;->mTimerID:I */
	 /* .line 61 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 82 */
	 /* .local v0, "eglVersion":I */
	 /* if-ne v0, v2, :cond_0 */
	 /* move v1, v2 */
	 /* .line 85 */
	 /* .local v1, "renderType":I */
} // :goto_0
/* new-instance v3, Lorg/haxe/nme/MainView$1; */
/* invoke-direct {v3, p0, v1}, Lorg/haxe/nme/MainView$1;-><init>(Lorg/haxe/nme/MainView;I)V */
(( org.haxe.nme.MainView ) p0 ).setEGLConfigChooser ( v3 ); // invoke-virtual {p0, v3}, Lorg/haxe/nme/MainView;->setEGLConfigChooser(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V
/* .line 169 */
this.mActivity = p2;
/* .line 170 */
/* .line 171 */
(( org.haxe.nme.MainView ) p0 ).setFocusable ( v2 ); // invoke-virtual {p0, v2}, Lorg/haxe/nme/MainView;->setFocusable(Z)V
/* .line 172 */
(( org.haxe.nme.MainView ) p0 ).setFocusableInTouchMode ( v2 ); // invoke-virtual {p0, v2}, Lorg/haxe/nme/MainView;->setFocusableInTouchMode(Z)V
/* .line 173 */
/* new-instance v2, Lorg/haxe/nme/MainView$Renderer; */
/* invoke-direct {v2, p0}, Lorg/haxe/nme/MainView$Renderer;-><init>(Lorg/haxe/nme/MainView;)V */
(( org.haxe.nme.MainView ) p0 ).setRenderer ( v2 ); // invoke-virtual {p0, v2}, Lorg/haxe/nme/MainView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V
/* .line 174 */
(( org.haxe.nme.MainView ) p0 ).setRenderMode ( v4 ); // invoke-virtual {p0, v4}, Lorg/haxe/nme/MainView;->setRenderMode(I)V
/* .line 175 */
return;
/* .line 82 */
} // .end local v1 # "renderType":I
} // :cond_0
int v1 = 4; // const/4 v1, 0x4
} // .end method
public static void renderNow ( ) {
/* .locals 1 */
/* .prologue */
/* .line 232 */
v0 = org.haxe.nme.MainView.mRefreshView;
(( org.haxe.nme.MainView ) v0 ).requestRender ( ); // invoke-virtual {v0}, Lorg/haxe/nme/MainView;->requestRender()V
/* .line 233 */
return;
} // .end method
/* # virtual methods */
public void HandleResult ( Integer p0 ) {
/* .locals 9 */
/* .param p1, "inCode" # I */
/* .prologue */
/* .line 188 */
int v5 = -1; // const/4 v5, -0x1
/* if-ne p1, v5, :cond_0 */
/* .line 191 */
v5 = this.mActivity;
(( android.app.Activity ) v5 ).finish ( ); // invoke-virtual {v5}, Landroid/app/Activity;->finish()V
/* .line 210 */
} // :goto_0
return;
/* .line 194 */
} // :cond_0
org.haxe.nme.NME .getNextWake ( );
/* move-result-wide v3 */
/* .line 195 */
/* .local v3, "wake":D */
/* move-object v1, p0 */
/* .line 196 */
/* .local v1, "me":Lorg/haxe/nme/MainView; */
/* const-wide/16 v5, 0x0 */
/* cmpg-double v5, v3, v5 */
/* if-gtz v5, :cond_1 */
/* .line 197 */
/* new-instance v5, Lorg/haxe/nme/MainView$2; */
/* invoke-direct {v5, p0, v1}, Lorg/haxe/nme/MainView$2;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v5 ); // invoke-virtual {p0, v5}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 200 */
} // :cond_1
/* iget v5, p0, Lorg/haxe/nme/MainView;->mTimerID:I */
/* add-int/lit8 v2, v5, 0x1 */
/* iput v2, p0, Lorg/haxe/nme/MainView;->mTimerID:I */
/* .line 201 */
/* .local v2, "tid":I */
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
/* .line 202 */
/* .local v0, "end":Ljava/util/Date; */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v5 */
/* const-wide v7, 0x408f400000000000L # 1000.0 */
/* mul-double/2addr v7, v3 */
/* double-to-int v7, v7 */
/* int-to-long v7, v7 */
/* add-long/2addr v5, v7 */
(( java.util.Date ) v0 ).setTime ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Ljava/util/Date;->setTime(J)V
/* .line 203 */
v5 = this.mTimer;
/* new-instance v6, Lorg/haxe/nme/MainView$3; */
/* invoke-direct {v6, p0, v2, v1}, Lorg/haxe/nme/MainView$3;-><init>(Lorg/haxe/nme/MainView;ILorg/haxe/nme/MainView;)V */
(( java.util.Timer ) v5 ).schedule ( v6, v0 ); // invoke-virtual {v5, v6, v0}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;Ljava/util/Date;)V
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
/* .param p1, "inKeyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 320 */
/* move-object v1, p0 */
/* .line 321 */
/* .local v1, "me":Lorg/haxe/nme/MainView; */
v0 = (( org.haxe.nme.MainView ) p0 ).translateKey ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/haxe/nme/MainView;->translateKey(ILandroid/view/KeyEvent;)I
/* .line 322 */
/* .local v0, "keyCode":I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 323 */
/* new-instance v2, Lorg/haxe/nme/MainView$8; */
/* invoke-direct {v2, p0, v1, v0}, Lorg/haxe/nme/MainView$8;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;I)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v2 ); // invoke-virtual {p0, v2}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 328 */
int v2 = 1; // const/4 v2, 0x1
/* .line 330 */
} // :goto_0
} // :cond_0
v2 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
/* .param p1, "inKeyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 337 */
/* move-object v1, p0 */
/* .line 338 */
/* .local v1, "me":Lorg/haxe/nme/MainView; */
v0 = (( org.haxe.nme.MainView ) p0 ).translateKey ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/haxe/nme/MainView;->translateKey(ILandroid/view/KeyEvent;)I
/* .line 339 */
/* .local v0, "keyCode":I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 340 */
/* new-instance v2, Lorg/haxe/nme/MainView$9; */
/* invoke-direct {v2, p0, v1, v0}, Lorg/haxe/nme/MainView$9;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;I)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v2 ); // invoke-virtual {p0, v2}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 345 */
int v2 = 1; // const/4 v2, 0x1
/* .line 347 */
} // :goto_0
} // :cond_0
v2 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
void onPoll ( ) {
/* .locals 1 */
/* .prologue */
/* .line 225 */
v0 = org.haxe.nme.NME .onPoll ( );
(( org.haxe.nme.MainView ) p0 ).HandleResult ( v0 ); // invoke-virtual {p0, v0}, Lorg/haxe/nme/MainView;->HandleResult(I)V
/* .line 226 */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 13 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 237 */
/* move-object v2, p0 */
/* .line 239 */
/* .local v2, "me":Lorg/haxe/nme/MainView; */
v9 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* .line 241 */
/* .local v9, "action":I */
int v12 = -1; // const/4 v12, -0x1
/* .line 243 */
/* .local v12, "type":I */
/* and-int/lit16 v0, v9, 0xff */
/* packed-switch v0, :pswitch_data_0 */
/* .line 255 */
} // :goto_0
/* :pswitch_0 */
/* const v0, 0xff00 */
/* and-int/2addr v0, v9 */
/* shr-int/lit8 v11, v0, 0x8 */
/* .line 258 */
/* .local v11, "idx":I */
/* move v3, v12 */
/* .line 262 */
/* .local v3, "t":I */
int v10 = 0; // const/4 v10, 0x0
/* .local v10, "i":I */
} // :goto_1
v0 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* if-ge v10, v0, :cond_2 */
/* .line 264 */
v6 = (( android.view.MotionEvent ) p1 ).getPointerId ( v10 ); // invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 265 */
/* .local v6, "id":I */
v4 = (( android.view.MotionEvent ) p1 ).getX ( v10 ); // invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getX(I)F
/* .line 266 */
/* .local v4, "x":F */
v5 = (( android.view.MotionEvent ) p1 ).getY ( v10 ); // invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getY(I)F
/* .line 267 */
/* .local v5, "y":F */
v7 = (( android.view.MotionEvent ) p1 ).getSize ( v10 ); // invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getSize(I)F
/* .line 268 */
/* .local v7, "sizeX":F */
v8 = (( android.view.MotionEvent ) p1 ).getSize ( v10 ); // invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getSize(I)F
/* .line 271 */
/* .local v8, "sizeY":F */
/* const/16 v0, 0x10 */
/* if-eq v12, v0, :cond_0 */
/* if-ne v10, v11, :cond_1 */
/* .line 273 */
} // :cond_0
/* new-instance v0, Lorg/haxe/nme/MainView$6; */
/* move-object v1, p0 */
/* invoke-direct/range {v0 ..v8}, Lorg/haxe/nme/MainView$6;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;IFFIFF)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 262 */
} // :cond_1
/* add-int/lit8 v10, v10, 0x1 */
/* .line 244 */
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
/* .line 245 */
/* :pswitch_2 */
/* const/16 v12, 0xf */
/* .line 246 */
/* :pswitch_3 */
/* const/16 v12, 0x10 */
/* .line 247 */
/* :pswitch_4 */
/* const/16 v12, 0x11 */
/* .line 248 */
/* :pswitch_5 */
/* const/16 v12, 0x11 */
/* .line 249 */
/* :pswitch_6 */
/* const/16 v12, 0x11 */
/* .line 278 */
/* .restart local v3 # "t":I */
/* .restart local v10 # "i":I */
/* .restart local v11 # "idx":I */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* .line 243 */
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
/* .line 284 */
/* move-object v0, p0 */
/* .line 285 */
/* .local v0, "me":Lorg/haxe/nme/MainView; */
/* new-instance v1, Lorg/haxe/nme/MainView$7; */
/* invoke-direct {v1, p0, p1, v0}, Lorg/haxe/nme/MainView$7;-><init>(Lorg/haxe/nme/MainView;Landroid/view/MotionEvent;Lorg/haxe/nme/MainView;)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v1 ); // invoke-virtual {p0, v1}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 291 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
void queuePoll ( ) {
/* .locals 2 */
/* .prologue */
/* .line 219 */
/* move-object v0, p0 */
/* .line 220 */
/* .local v0, "me":Lorg/haxe/nme/MainView; */
/* new-instance v1, Lorg/haxe/nme/MainView$5; */
/* invoke-direct {v1, p0, v0}, Lorg/haxe/nme/MainView$5;-><init>(Lorg/haxe/nme/MainView;Lorg/haxe/nme/MainView;)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v1 ); // invoke-virtual {p0, v1}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 221 */
return;
} // .end method
void sendActivity ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "inActivity" # I */
/* .prologue */
/* .line 214 */
/* new-instance v0, Lorg/haxe/nme/MainView$4; */
/* invoke-direct {v0, p0, p1}, Lorg/haxe/nme/MainView$4;-><init>(Lorg/haxe/nme/MainView;I)V */
(( org.haxe.nme.MainView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/haxe/nme/MainView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 215 */
return;
} // .end method
public Integer translateKey ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .param p1, "inCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 295 */
/* sparse-switch p1, :sswitch_data_0 */
/* .line 308 */
v1 = (( android.view.KeyEvent ) p2 ).getMetaState ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I
v0 = (( android.view.KeyEvent ) p2 ).getUnicodeChar ( v1 ); // invoke-virtual {p2, v1}, Landroid/view/KeyEvent;->getUnicodeChar(I)I
/* .line 309 */
/* .local v0, "result":I */
/* const/high16 v1, -0x80000000 */
/* if-ne v0, v1, :cond_0 */
/* .line 312 */
int v0 = 0; // const/4 v0, 0x0
/* .line 314 */
} // .end local v0 # "result":I
} // :cond_0
} // :goto_0
/* .line 297 */
/* :sswitch_0 */
/* const/16 v0, 0xd */
/* .line 298 */
/* :sswitch_1 */
/* const/16 v0, 0x25 */
/* .line 299 */
/* :sswitch_2 */
/* const/16 v0, 0x27 */
/* .line 300 */
/* :sswitch_3 */
/* const/16 v0, 0x26 */
/* .line 301 */
/* :sswitch_4 */
/* const/16 v0, 0x28 */
/* .line 302 */
/* :sswitch_5 */
/* const/16 v0, 0x1b */
/* .line 303 */
/* :sswitch_6 */
/* const v0, 0x1000012 */
/* .line 305 */
/* :sswitch_7 */
/* const/16 v0, 0x8 */
/* .line 295 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x4 -> :sswitch_5 */
/* 0x13 -> :sswitch_3 */
/* 0x14 -> :sswitch_4 */
/* 0x15 -> :sswitch_1 */
/* 0x16 -> :sswitch_2 */
/* 0x17 -> :sswitch_0 */
/* 0x43 -> :sswitch_7 */
/* 0x52 -> :sswitch_6 */
} // .end sparse-switch
} // .end method
