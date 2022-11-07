public class org.cocos2dx.lib.Cocos2dxGLSurfaceView extends android.opengl.GLSurfaceView {
	 /* .source "Cocos2dxGLSurfaceView.java" */
	 /* # static fields */
	 private static final Integer HANDLER_CLOSE_IME_KEYBOARD;
	 private static final Integer HANDLER_OPEN_IME_KEYBOARD;
	 private static final java.lang.String TAG;
	 private static org.cocos2dx.lib.Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
	 private static org.cocos2dx.lib.Cocos2dxTextInputWraper sCocos2dxTextInputWraper;
	 private static android.os.Handler sHandler;
	 /* # instance fields */
	 private org.cocos2dx.lib.Cocos2dxEditText mCocos2dxEditText;
	 private org.cocos2dx.lib.Cocos2dxRenderer mCocos2dxRenderer;
	 /* # direct methods */
	 static org.cocos2dx.lib.Cocos2dxGLSurfaceView ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 41 */
		 /* const-class v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 /* .line 54 */
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxGLSurfaceView ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 64 */
		 /* invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V */
		 /* .line 66 */
		 int v0 = 2; // const/4 v0, 0x2
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).setEGLContextClientVersion ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->setEGLContextClientVersion(I)V
		 /* .line 68 */
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).initView ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->initView()V
		 /* .line 69 */
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxGLSurfaceView ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .prologue */
		 /* .line 72 */
		 /* invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 74 */
		 int v0 = 2; // const/4 v0, 0x2
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).setEGLContextClientVersion ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->setEGLContextClientVersion(I)V
		 /* .line 76 */
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).initView ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->initView()V
		 /* .line 77 */
		 return;
	 } // .end method
	 static org.cocos2dx.lib.Cocos2dxEditText access$0 ( org.cocos2dx.lib.Cocos2dxGLSurfaceView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 57 */
		 v0 = this.mCocos2dxEditText;
	 } // .end method
	 static org.cocos2dx.lib.Cocos2dxTextInputWraper access$1 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 54 */
		 v0 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper;
	 } // .end method
	 static org.cocos2dx.lib.Cocos2dxGLSurfaceView access$2 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 53 */
		 v0 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView;
	 } // .end method
	 static org.cocos2dx.lib.Cocos2dxRenderer access$3 ( org.cocos2dx.lib.Cocos2dxGLSurfaceView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 56 */
		 v0 = this.mCocos2dxRenderer;
	 } // .end method
	 public static void closeIMEKeyboard ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 312 */
		 /* new-instance v0, Landroid/os/Message; */
		 /* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
		 /* .line 313 */
		 /* .local v0, "msg":Landroid/os/Message; */
		 int v1 = 3; // const/4 v1, 0x3
		 /* iput v1, v0, Landroid/os/Message;->what:I */
		 /* .line 314 */
		 v1 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.sHandler;
		 (( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
		 /* .line 315 */
		 return;
	 } // .end method
	 private static void dumpMotionEvent ( android.view.MotionEvent p0 ) {
		 /* .locals 9 */
		 /* .param p0, "event" # Landroid/view/MotionEvent; */
		 /* .prologue */
		 int v8 = 6; // const/4 v8, 0x6
		 int v7 = 5; // const/4 v7, 0x5
		 /* .line 336 */
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
		 /* .line 337 */
		 /* .local v3, "names":[Ljava/lang/String; */
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
		 /* .line 338 */
		 /* .local v4, "sb":Ljava/lang/StringBuilder; */
		 v0 = 		 (( android.view.MotionEvent ) p0 ).getAction ( ); // invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I
		 /* .line 339 */
		 /* .local v0, "action":I */
		 /* and-int/lit16 v1, v0, 0xff */
		 /* .line 340 */
		 /* .local v1, "actionCode":I */
		 final String v5 = "event ACTION_"; // const-string v5, "event ACTION_"
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* aget-object v6, v3, v1 */
		 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 341 */
		 /* if-eq v1, v7, :cond_0 */
		 /* if-ne v1, v8, :cond_1 */
		 /* .line 342 */
	 } // :cond_0
	 final String v5 = "(pid "; // const-string v5, "(pid "
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* shr-int/lit8 v6, v0, 0x8 */
	 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 /* .line 343 */
	 final String v5 = ")"; // const-string v5, ")"
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 345 */
} // :cond_1
final String v5 = "["; // const-string v5, "["
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 346 */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
} // :goto_0
v5 = (( android.view.MotionEvent ) p0 ).getPointerCount ( ); // invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I
/* if-lt v2, v5, :cond_2 */
/* .line 355 */
final String v5 = "]"; // const-string v5, "]"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 356 */
v5 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.TAG;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v5,v6 );
/* .line 357 */
return;
/* .line 347 */
} // :cond_2
final String v5 = "#"; // const-string v5, "#"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 348 */
final String v5 = "(pid "; // const-string v5, "(pid "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = (( android.view.MotionEvent ) p0 ).getPointerId ( v2 ); // invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 349 */
final String v5 = ")="; // const-string v5, ")="
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = (( android.view.MotionEvent ) p0 ).getX ( v2 ); // invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F
/* float-to-int v6, v6 */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 350 */
final String v5 = ","; // const-string v5, ","
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = (( android.view.MotionEvent ) p0 ).getY ( v2 ); // invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v6, v6 */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 351 */
/* add-int/lit8 v5, v2, 0x1 */
v6 = (( android.view.MotionEvent ) p0 ).getPointerCount ( ); // invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I
/* if-ge v5, v6, :cond_3 */
/* .line 352 */
final String v5 = ";"; // const-string v5, ";"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 346 */
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
private java.lang.String getContentText ( ) {
/* .locals 1 */
/* .prologue */
/* .line 126 */
v0 = this.mCocos2dxRenderer;
(( org.cocos2dx.lib.Cocos2dxRenderer ) v0 ).getContentText ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxRenderer;->getContentText()Ljava/lang/String;
} // .end method
public static void openIMEKeyboard ( ) {
/* .locals 2 */
/* .prologue */
/* .line 305 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
/* .line 306 */
/* .local v0, "msg":Landroid/os/Message; */
int v1 = 2; // const/4 v1, 0x2
/* iput v1, v0, Landroid/os/Message;->what:I */
/* .line 307 */
v1 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView;
/* invoke-direct {v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->getContentText()Ljava/lang/String; */
this.obj = v1;
/* .line 308 */
v1 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.sHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 309 */
return;
} // .end method
/* # virtual methods */
public void deleteBackward ( ) {
/* .locals 1 */
/* .prologue */
/* .line 327 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$12; */
/* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$12;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 333 */
return;
} // .end method
public org.cocos2dx.lib.Cocos2dxEditText getCocos2dxEditText ( ) {
/* .locals 1 */
/* .prologue */
/* .line 130 */
v0 = this.mCocos2dxEditText;
} // .end method
protected void initView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 80 */
int v0 = 1; // const/4 v0, 0x1
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).setFocusableInTouchMode ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->setFocusableInTouchMode(Z)V
/* .line 82 */
/* .line 83 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxTextInputWraper; */
/* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxTextInputWraper;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V */
/* .line 85 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$1; */
/* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$1;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V */
/* .line 114 */
return;
} // .end method
public void insertText ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "pText" # Ljava/lang/String; */
/* .prologue */
/* .line 318 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$11; */
/* invoke-direct {v0, p0, p1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$11;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;Ljava/lang/String;)V */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 324 */
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "pKeyCode" # I */
/* .param p2, "pKeyEvent" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 281 */
/* sparse-switch p1, :sswitch_data_0 */
/* .line 292 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // :goto_0
/* .line 284 */
/* :sswitch_0 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$10; */
/* invoke-direct {v0, p0, p1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$10;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;I)V */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 290 */
int v0 = 1; // const/4 v0, 0x1
/* .line 281 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x4 -> :sswitch_0 */
/* 0x52 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
public void onPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 160 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$3; */
/* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$3;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 167 */
/* invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V */
/* .line 168 */
return;
} // .end method
public void onResume ( ) {
/* .locals 1 */
/* .prologue */
/* .line 148 */
/* invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V */
/* .line 150 */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$2; */
/* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$2;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).queueEvent ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 156 */
return;
} // .end method
protected void onSizeChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "pNewSurfaceWidth" # I */
/* .param p2, "pNewSurfaceHeight" # I */
/* .param p3, "pOldSurfaceWidth" # I */
/* .param p4, "pOldSurfaceHeight" # I */
/* .prologue */
/* .line 274 */
v0 = (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->isInEditMode()Z
/* if-nez v0, :cond_0 */
/* .line 275 */
v0 = this.mCocos2dxRenderer;
(( org.cocos2dx.lib.Cocos2dxRenderer ) v0 ).setScreenWidthAndHeight ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/cocos2dx/lib/Cocos2dxRenderer;->setScreenWidthAndHeight(II)V
/* .line 277 */
} // :cond_0
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 24 */
/* .param p1, "pMotionEvent" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 173 */
v12 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getPointerCount()I */
/* .line 174 */
/* .local v12, "pointerNumber":I */
/* new-array v9, v12, [I */
/* .line 175 */
/* .local v9, "ids":[I */
/* new-array v0, v12, [F */
/* move-object/from16 v17, v0 */
/* .line 176 */
/* .local v17, "xs":[F */
/* new-array v0, v12, [F */
/* move-object/from16 v22, v0 */
/* .line 178 */
/* .local v22, "ys":[F */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "i":I */
} // :goto_0
/* if-lt v4, v12, :cond_0 */
/* .line 184 */
v23 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getAction()I */
/* move/from16 v0, v23 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v23, v0 */
/* packed-switch v23, :pswitch_data_0 */
/* .line 265 */
} // :goto_1
/* :pswitch_0 */
/* const/16 v23, 0x1 */
/* .line 179 */
} // :cond_0
/* move-object/from16 v0, p1 */
v23 = (( android.view.MotionEvent ) v0 ).getPointerId ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getPointerId(I)I
/* aput v23, v9, v4 */
/* .line 180 */
/* move-object/from16 v0, p1 */
v23 = (( android.view.MotionEvent ) v0 ).getX ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getX(I)F
/* aput v23, v17, v4 */
/* .line 181 */
/* move-object/from16 v0, p1 */
v23 = (( android.view.MotionEvent ) v0 ).getY ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getY(I)F
/* aput v23, v22, v4 */
/* .line 178 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 186 */
/* :pswitch_1 */
v23 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getAction()I */
/* shr-int/lit8 v11, v23, 0x8 */
/* .line 187 */
/* .local v11, "indexPointerDown":I */
/* move-object/from16 v0, p1 */
v6 = (( android.view.MotionEvent ) v0 ).getPointerId ( v11 ); // invoke-virtual {v0, v11}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 188 */
/* .local v6, "idPointerDown":I */
/* move-object/from16 v0, p1 */
v14 = (( android.view.MotionEvent ) v0 ).getX ( v11 ); // invoke-virtual {v0, v11}, Landroid/view/MotionEvent;->getX(I)F
/* .line 189 */
/* .local v14, "xPointerDown":F */
/* move-object/from16 v0, p1 */
v19 = (( android.view.MotionEvent ) v0 ).getY ( v11 ); // invoke-virtual {v0, v11}, Landroid/view/MotionEvent;->getY(I)F
/* .line 191 */
/* .local v19, "yPointerDown":F */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$4; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move/from16 v2, v19 */
/* invoke-direct {v0, v1, v6, v14, v2}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$4;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;IFF)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 201 */
} // .end local v6 # "idPointerDown":I
} // .end local v11 # "indexPointerDown":I
} // .end local v14 # "xPointerDown":F
} // .end local v19 # "yPointerDown":F
/* :pswitch_2 */
/* const/16 v23, 0x0 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v23 */
v5 = (( android.view.MotionEvent ) v0 ).getPointerId ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 202 */
/* .local v5, "idDown":I */
/* const/16 v23, 0x0 */
/* aget v13, v17, v23 */
/* .line 203 */
/* .local v13, "xDown":F */
/* const/16 v23, 0x0 */
/* aget v18, v22, v23 */
/* .line 205 */
/* .local v18, "yDown":F */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$5; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move/from16 v2, v18 */
/* invoke-direct {v0, v1, v5, v13, v2}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$5;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;IFF)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* .line 214 */
} // .end local v5 # "idDown":I
} // .end local v13 # "xDown":F
} // .end local v18 # "yDown":F
/* :pswitch_3 */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$6; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, v17 */
/* move-object/from16 v3, v22 */
/* invoke-direct {v0, v1, v9, v2, v3}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$6;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;[I[F[F)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* goto/16 :goto_1 */
/* .line 223 */
/* :pswitch_4 */
v23 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getAction()I */
/* shr-int/lit8 v10, v23, 0x8 */
/* .line 224 */
/* .local v10, "indexPointUp":I */
/* move-object/from16 v0, p1 */
v7 = (( android.view.MotionEvent ) v0 ).getPointerId ( v10 ); // invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 225 */
/* .local v7, "idPointerUp":I */
/* move-object/from16 v0, p1 */
v15 = (( android.view.MotionEvent ) v0 ).getX ( v10 ); // invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getX(I)F
/* .line 226 */
/* .local v15, "xPointerUp":F */
/* move-object/from16 v0, p1 */
v20 = (( android.view.MotionEvent ) v0 ).getY ( v10 ); // invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getY(I)F
/* .line 228 */
/* .local v20, "yPointerUp":F */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$7; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move/from16 v2, v20 */
/* invoke-direct {v0, v1, v7, v15, v2}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$7;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;IFF)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* goto/16 :goto_1 */
/* .line 238 */
} // .end local v7 # "idPointerUp":I
} // .end local v10 # "indexPointUp":I
} // .end local v15 # "xPointerUp":F
} // .end local v20 # "yPointerUp":F
/* :pswitch_5 */
/* const/16 v23, 0x0 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v23 */
v8 = (( android.view.MotionEvent ) v0 ).getPointerId ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 239 */
/* .local v8, "idUp":I */
/* const/16 v23, 0x0 */
/* aget v16, v17, v23 */
/* .line 240 */
/* .local v16, "xUp":F */
/* const/16 v23, 0x0 */
/* aget v21, v22, v23 */
/* .line 242 */
/* .local v21, "yUp":F */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$8; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move/from16 v2, v16 */
/* move/from16 v3, v21 */
/* invoke-direct {v0, v1, v8, v2, v3}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$8;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;IFF)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* goto/16 :goto_1 */
/* .line 251 */
} // .end local v8 # "idUp":I
} // .end local v16 # "xUp":F
} // .end local v21 # "yUp":F
/* :pswitch_6 */
/* new-instance v23, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$9; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, v17 */
/* move-object/from16 v3, v22 */
/* invoke-direct {v0, v1, v9, v2, v3}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$9;-><init>(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;[I[F[F)V */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v23 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
/* goto/16 :goto_1 */
/* .line 184 */
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
public void setCocos2dxEditText ( org.cocos2dx.lib.Cocos2dxEditText p0 ) {
/* .locals 2 */
/* .param p1, "pCocos2dxEditText" # Lorg/cocos2dx/lib/Cocos2dxEditText; */
/* .prologue */
/* .line 134 */
this.mCocos2dxEditText = p1;
/* .line 135 */
v0 = this.mCocos2dxEditText;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 136 */
v0 = this.mCocos2dxEditText;
v1 = org.cocos2dx.lib.Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper;
(( org.cocos2dx.lib.Cocos2dxEditText ) v0 ).setOnEditorActionListener ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
/* .line 137 */
v0 = this.mCocos2dxEditText;
(( org.cocos2dx.lib.Cocos2dxEditText ) v0 ).setCocos2dxGLSurfaceView ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxEditText;->setCocos2dxGLSurfaceView(Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;)V
/* .line 138 */
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).requestFocus ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->requestFocus()Z
/* .line 140 */
} // :cond_0
return;
} // .end method
public void setCocos2dxRenderer ( org.cocos2dx.lib.Cocos2dxRenderer p0 ) {
/* .locals 1 */
/* .param p1, "renderer" # Lorg/cocos2dx/lib/Cocos2dxRenderer; */
/* .prologue */
/* .line 121 */
this.mCocos2dxRenderer = p1;
/* .line 122 */
v0 = this.mCocos2dxRenderer;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) p0 ).setRenderer ( v0 ); // invoke-virtual {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V
/* .line 123 */
return;
} // .end method
