public class org.cocos2dx.lib.Cocos2dxGLSurfaceView extends android.opengl.GLSurfaceView {
	 /* .source "Cocos2dxGLSurfaceView.java" */
	 /* # static fields */
	 private static final Integer HANDLER_CLOSE_IME_KEYBOARD;
	 private static final Integer HANDLER_OPEN_IME_KEYBOARD;
	 private static final java.lang.String TAG;
	 private static final Boolean debug;
	 private static android.os.Handler handler;
	 private static org.cocos2dx.lib.Cocos2dxGLSurfaceView mainView;
	 private static org.cocos2dx.lib.TextInputWraper textInputWraper;
	 /* # instance fields */
	 private org.cocos2dx.lib.Cocos2dxRenderer mRenderer;
	 private org.cocos2dx.lib.Cocos2dxEditText mTextField;
	 /* # direct methods */
	 static org.cocos2dx.lib.Cocos2dxGLSurfaceView ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 130 */
		 /* const-class v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView; */
		 (( java.lang.Class ) v0 ).getCanonicalName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
		 /* .line 126 */
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxGLSurfaceView ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 139 */
		 /* invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V */
		 /* .line 140 */
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).initView ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->initView()V
		 /* .line 141 */
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxGLSurfaceView ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .prologue */
		 /* .line 144 */
		 /* invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 145 */
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).initView ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->initView()V
		 /* .line 146 */
		 return;
	 } // .end method
	 static org.cocos2dx.lib.Cocos2dxEditText access$0 ( org.cocos2dx.lib.Cocos2dxGLSurfaceView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 216 */
		 v0 = this.mTextField;
	 } // .end method
	 static org.cocos2dx.lib.TextInputWraper access$1 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 215 */
		 v0 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.textInputWraper;
	 } // .end method
	 static org.cocos2dx.lib.Cocos2dxGLSurfaceView access$2 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 128 */
		 v0 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.mainView;
	 } // .end method
	 static org.cocos2dx.lib.Cocos2dxRenderer access$3 ( org.cocos2dx.lib.Cocos2dxGLSurfaceView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 131 */
		 v0 = this.mRenderer;
	 } // .end method
	 public static void closeIMEKeyboard ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 244 */
		 /* new-instance v0, Landroid/os/Message; */
		 /* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
		 /* .line 245 */
		 /* .local v0, "msg":Landroid/os/Message; */
		 int v1 = 3; // const/4 v1, 0x3
		 /* iput v1, v0, Landroid/os/Message;->what:I */
		 /* .line 246 */
		 v1 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.handler;
		 (( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
		 /* .line 247 */
		 return;
	 } // .end method
	 private void dumpEvent ( android.view.MotionEvent p0 ) {
		 /* .locals 9 */
		 /* .param p1, "event" # Landroid/view/MotionEvent; */
		 /* .prologue */
		 int v8 = 6; // const/4 v8, 0x6
		 int v7 = 5; // const/4 v7, 0x5
		 /* .line 390 */
		 /* const/16 v5, 0xa */
		 /* new-array v3, v5, [Ljava/lang/String; */
		 int v5 = 0; // const/4 v5, 0x0
		 final String v6 = "DOWN"; // const-string v6, "DOWN"
		 /* aput-object v6, v3, v5 */
		 int v5 = 1; // const/4 v5, 0x1
		 final String v6 = "UP"; // const-string v6, "UP"
		 /* aput-object v6, v3, v5 */
		 int v5 = 2; // const/4 v5, 0x2
		 final String v6 = "MOVE"; // const-string v6, "MOVE"
		 /* aput-object v6, v3, v5 */
		 int v5 = 3; // const/4 v5, 0x3
		 final String v6 = "CANCEL"; // const-string v6, "CANCEL"
		 /* aput-object v6, v3, v5 */
		 int v5 = 4; // const/4 v5, 0x4
		 final String v6 = "OUTSIDE"; // const-string v6, "OUTSIDE"
		 /* aput-object v6, v3, v5 */
		 /* .line 391 */
		 final String v5 = "POINTER_DOWN"; // const-string v5, "POINTER_DOWN"
		 /* aput-object v5, v3, v7 */
		 final String v5 = "POINTER_UP"; // const-string v5, "POINTER_UP"
		 /* aput-object v5, v3, v8 */
		 int v5 = 7; // const/4 v5, 0x7
		 final String v6 = "7?"; // const-string v6, "7?"
		 /* aput-object v6, v3, v5 */
		 /* const/16 v5, 0x8 */
		 final String v6 = "8?"; // const-string v6, "8?"
		 /* aput-object v6, v3, v5 */
		 /* const/16 v5, 0x9 */
		 final String v6 = "9?"; // const-string v6, "9?"
		 /* aput-object v6, v3, v5 */
		 /* .line 392 */
		 /* .local v3, "names":[Ljava/lang/String; */
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
		 /* .line 393 */
		 /* .local v4, "sb":Ljava/lang/StringBuilder; */
		 v0 = 		 (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
		 /* .line 394 */
		 /* .local v0, "action":I */
		 /* and-int/lit16 v1, v0, 0xff */
		 /* .line 395 */
		 /* .local v1, "actionCode":I */
		 final String v5 = "event ACTION_"; // const-string v5, "event ACTION_"
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* aget-object v6, v3, v1 */
		 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 396 */
		 /* if-eq v1, v7, :cond_0 */
		 /* .line 397 */
		 /* if-ne v1, v8, :cond_1 */
		 /* .line 398 */
	 } // :cond_0
	 final String v5 = "(pid "; // const-string v5, "(pid "
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 399 */
	 /* shr-int/lit8 v6, v0, 0x8 */
	 /* .line 398 */
	 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 /* .line 400 */
	 final String v5 = ")"; // const-string v5, ")"
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 402 */
} // :cond_1
final String v5 = "["; // const-string v5, "["
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 403 */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
} // :goto_0
v5 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* if-lt v2, v5, :cond_2 */
/* .line 411 */
final String v5 = "]"; // const-string v5, "]"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 412 */
v5 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.TAG;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v5,v6 );
/* .line 413 */
return;
/* .line 404 */
} // :cond_2
final String v5 = "#"; // const-string v5, "#"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 405 */
final String v5 = "(pid "; // const-string v5, "(pid "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = (( android.view.MotionEvent ) p1 ).getPointerId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 406 */
final String v5 = ")="; // const-string v5, ")="
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = (( android.view.MotionEvent ) p1 ).getX ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F
/* float-to-int v6, v6 */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 407 */
final String v5 = ","; // const-string v5, ","
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = (( android.view.MotionEvent ) p1 ).getY ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v6, v6 */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 408 */
/* add-int/lit8 v5, v2, 0x1 */
v6 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* if-ge v5, v6, :cond_3 */
/* .line 409 */
final String v5 = ";"; // const-string v5, ";"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 403 */
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
private java.lang.String getContentText ( ) {
/* .locals 1 */
/* .prologue */
/* .line 240 */
v0 = this.mRenderer;
(( org.cocos2dx.lib.Cocos2dxRenderer ) v0 ).getContentText ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxRenderer;->getContentText()Ljava/lang/String;
} // .end method
public static void openIMEKeyboard ( ) {
/* .locals 2 */
/* .prologue */
/* .line 232 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
/* .line 233 */
/* .local v0, "msg":Landroid/os/Message; */
int v1 = 2; // const/4 v1, 0x2
/* iput v1, v0, Landroid/os/Message;->what:I */
/* .line 234 */
v1 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.mainView;
/* invoke-direct {v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->getContentText()Ljava/lang/String; */
this.obj = v1;
/* .line 235 */
v1 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.handler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 237 */
return;
} // .end method
/* # virtual methods */
public void deleteBackward ( ) {
/* .locals 1 */
/* .prologue */
/* .line 259 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$5; */
/* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$5;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 265 */
return;
} // .end method
public android.widget.TextView getTextField ( ) {
/* .locals 1 */
/* .prologue */
/* .line 219 */
v0 = this.mTextField;
} // .end method
protected void initView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 149 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxRenderer; */
/* invoke-direct {v0}, Lorg/cocos2dx/lib/Cocos2dxRenderer;-><init>()V */
this.mRenderer = v0;
/* .line 150 */
int v0 = 1; // const/4 v0, 0x1
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).setFocusableInTouchMode ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->setFocusableInTouchMode(Z)V
/* .line 151 */
v0 = this.mRenderer;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).setRenderer ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V
/* .line 153 */
/* new-instance v0, Lorg/cocos2dx/lib/TextInputWraper; */
/* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/TextInputWraper;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V */
/* .line 155 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$1; */
/* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$1;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V */
/* .line 184 */
/* .line 185 */
return;
} // .end method
public void insertText ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 250 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$4; */
/* invoke-direct {v0, p0, p1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$4;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;Ljava/lang/String;)V */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 256 */
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 375 */
/* move v0, p1 */
/* .line 376 */
/* .local v0, "kc":I */
int v1 = 4; // const/4 v1, 0x4
/* if-eq p1, v1, :cond_0 */
/* const/16 v1, 0x52 */
/* if-ne p1, v1, :cond_1 */
/* .line 377 */
} // :cond_0
/* new-instance v1, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$12; */
/* invoke-direct {v1, p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$12;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;I)V */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).queueEvent ( v1 ); // invoke-virtual {p0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 383 */
int v1 = 1; // const/4 v1, 0x1
/* .line 385 */
} // :goto_0
} // :cond_1
v1 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public void onPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 188 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$2; */
/* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$2;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 195 */
/* invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V */
/* .line 196 */
return;
} // .end method
public void onResume ( ) {
/* .locals 1 */
/* .prologue */
/* .line 199 */
/* invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V */
/* .line 201 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$3; */
/* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$3;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 207 */
return;
} // .end method
protected void onSizeChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "w" # I */
/* .param p2, "h" # I */
/* .param p3, "oldw" # I */
/* .param p4, "oldh" # I */
/* .prologue */
/* .line 370 */
v0 = this.mRenderer;
(( org.cocos2dx.lib.Cocos2dxRenderer ) v0 ).setScreenWidthAndHeight ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/cocos2dx/lib/Cocos2dxRenderer;->setScreenWidthAndHeight(II)V
/* .line 371 */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 24 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 273 */
v12 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getPointerCount()I */
/* .line 274 */
/* .local v12, "pointerNumber":I */
/* new-array v9, v12, [I */
/* .line 275 */
/* .local v9, "ids":[I */
/* new-array v0, v12, [F */
/* move-object/from16 v17, v0 */
/* .line 276 */
/* .local v17, "xs":[F */
/* new-array v0, v12, [F */
/* move-object/from16 v22, v0 */
/* .line 278 */
/* .local v22, "ys":[F */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "i":I */
} // :goto_0
/* if-lt v4, v12, :cond_0 */
/* .line 284 */
v23 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getAction()I */
/* move/from16 v0, v23 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v23, v0 */
/* packed-switch v23, :pswitch_data_0 */
/* .line 363 */
} // :goto_1
/* :pswitch_0 */
/* const/16 v23, 0x1 */
/* .line 279 */
} // :cond_0
/* move-object/from16 v0, p1 */
v23 = (( android.view.MotionEvent ) v0 ).getPointerId ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getPointerId(I)I
/* aput v23, v9, v4 */
/* .line 280 */
/* move-object/from16 v0, p1 */
v23 = (( android.view.MotionEvent ) v0 ).getX ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getX(I)F
/* aput v23, v17, v4 */
/* .line 281 */
/* move-object/from16 v0, p1 */
v23 = (( android.view.MotionEvent ) v0 ).getY ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getY(I)F
/* aput v23, v22, v4 */
/* .line 278 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 286 */
/* :pswitch_1 */
v23 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getAction()I */
/* shr-int/lit8 v11, v23, 0x8 */
/* .line 287 */
/* .local v11, "indexPointerDown":I */
/* move-object/from16 v0, p1 */
v6 = (( android.view.MotionEvent ) v0 ).getPointerId ( v11 ); // invoke-virtual {v0, v11}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 288 */
/* .local v6, "idPointerDown":I */
/* move-object/from16 v0, p1 */
v14 = (( android.view.MotionEvent ) v0 ).getX ( v11 ); // invoke-virtual {v0, v11}, Landroid/view/MotionEvent;->getX(I)F
/* .line 289 */
/* .local v14, "xPointerDown":F */
/* move-object/from16 v0, p1 */
v19 = (( android.view.MotionEvent ) v0 ).getY ( v11 ); // invoke-virtual {v0, v11}, Landroid/view/MotionEvent;->getY(I)F
/* .line 291 */
/* .local v19, "yPointerDown":F */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$6; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move/from16 v2, v19 */
/* invoke-direct {v0, v1, v6, v14, v2}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$6;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;IFF)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 301 */
} // .end local v6 # "idPointerDown":I
} // .end local v11 # "indexPointerDown":I
} // .end local v14 # "xPointerDown":F
} // .end local v19 # "yPointerDown":F
/* :pswitch_2 */
/* const/16 v23, 0x0 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v23 */
v5 = (( android.view.MotionEvent ) v0 ).getPointerId ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 302 */
/* .local v5, "idDown":I */
/* const/16 v23, 0x0 */
/* aget v13, v17, v23 */
/* .line 303 */
/* .local v13, "xDown":F */
/* const/16 v23, 0x0 */
/* aget v18, v22, v23 */
/* .line 305 */
/* .local v18, "yDown":F */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$7; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move/from16 v2, v18 */
/* invoke-direct {v0, v1, v5, v13, v2}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$7;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;IFF)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 314 */
} // .end local v5 # "idDown":I
} // .end local v13 # "xDown":F
} // .end local v18 # "yDown":F
/* :pswitch_3 */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$8; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, v17 */
/* move-object/from16 v3, v22 */
/* invoke-direct {v0, v1, v9, v2, v3}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$8;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;[I[F[F)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* goto/16 :goto_1 */
/* .line 323 */
/* :pswitch_4 */
v23 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getAction()I */
/* shr-int/lit8 v10, v23, 0x8 */
/* .line 324 */
/* .local v10, "indexPointUp":I */
/* move-object/from16 v0, p1 */
v7 = (( android.view.MotionEvent ) v0 ).getPointerId ( v10 ); // invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 325 */
/* .local v7, "idPointerUp":I */
/* move-object/from16 v0, p1 */
v15 = (( android.view.MotionEvent ) v0 ).getX ( v10 ); // invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getX(I)F
/* .line 326 */
/* .local v15, "xPointerUp":F */
/* move-object/from16 v0, p1 */
v20 = (( android.view.MotionEvent ) v0 ).getY ( v10 ); // invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getY(I)F
/* .line 328 */
/* .local v20, "yPointerUp":F */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$9; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move/from16 v2, v20 */
/* invoke-direct {v0, v1, v7, v15, v2}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$9;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;IFF)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* goto/16 :goto_1 */
/* .line 338 */
} // .end local v7 # "idPointerUp":I
} // .end local v10 # "indexPointUp":I
} // .end local v15 # "xPointerUp":F
} // .end local v20 # "yPointerUp":F
/* :pswitch_5 */
/* const/16 v23, 0x0 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v23 */
v8 = (( android.view.MotionEvent ) v0 ).getPointerId ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 339 */
/* .local v8, "idUp":I */
/* const/16 v23, 0x0 */
/* aget v16, v17, v23 */
/* .line 340 */
/* .local v16, "xUp":F */
/* const/16 v23, 0x0 */
/* aget v21, v22, v23 */
/* .line 342 */
/* .local v21, "yUp":F */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$10; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move/from16 v2, v16 */
/* move/from16 v3, v21 */
/* invoke-direct {v0, v1, v8, v2, v3}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$10;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;IFF)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* goto/16 :goto_1 */
/* .line 351 */
} // .end local v8 # "idUp":I
} // .end local v16 # "xUp":F
} // .end local v21 # "yUp":F
/* :pswitch_6 */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$11; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, v17 */
/* move-object/from16 v3, v22 */
/* invoke-direct {v0, v1, v9, v2, v3}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$11;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;[I[F[F)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* goto/16 :goto_1 */
/* .line 284 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_2 */
/* :pswitch_5 */
/* :pswitch_3 */
/* :pswitch_6 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_4 */
} // .end packed-switch
} // .end method
public void setTextField ( org.cocos2dx.lib.Cocos2dxEditText p0 ) {
/* .locals 2 */
/* .param p1, "view" # Lorg/cocos2dx/lib/Cocos2dxEditText; */
/* .prologue */
/* .line 223 */
this.mTextField = p1;
/* .line 224 */
v0 = this.mTextField;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.textInputWraper;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 225 */
v0 = this.mTextField;
v1 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.textInputWraper;
(( org.cocos2dx.lib.Cocos2dxEditText ) v0 ).setOnEditorActionListener ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
/* .line 226 */
v0 = this.mTextField;
(( org.cocos2dx.lib.Cocos2dxEditText ) v0 ).setMainView ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxEditText;->setMainView(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V
/* .line 227 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).requestFocus ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->requestFocus()Z
/* .line 229 */
} // :cond_0
return;
} // .end method
