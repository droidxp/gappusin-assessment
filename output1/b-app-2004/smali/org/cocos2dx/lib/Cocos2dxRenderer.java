public class org.cocos2dx.lib.Cocos2dxRenderer implements android.opengl.GLSurfaceView$Renderer {
	 /* .source "Cocos2dxRenderer.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final Long NANOSECONDSPERMINISECOND;
	 private static final Long NANOSECONDSPERSECOND;
	 private static Long animationInterval;
	 /* # instance fields */
	 private Long last;
	 private Integer screenHeight;
	 private Integer screenWidth;
	 /* # direct methods */
	 static org.cocos2dx.lib.Cocos2dxRenderer ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 34 */
		 /* const-wide/32 v0, 0xfe502a */
		 /* sput-wide v0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->animationInterval:J */
		 /* .line 31 */
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxRenderer ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static native void nativeDeleteBackward ( ) {
	 } // .end method
	 private static native java.lang.String nativeGetContentText ( ) {
	 } // .end method
	 private static native void nativeInit ( Integer p0, Integer p1 ) {
	 } // .end method
	 private static native void nativeInsertText ( java.lang.String p0 ) {
	 } // .end method
	 private static native Boolean nativeKeyDown ( Integer p0 ) {
	 } // .end method
	 private static native void nativeOnPause ( ) {
	 } // .end method
	 private static native void nativeOnResume ( ) {
	 } // .end method
	 private static native void nativeRender ( ) {
	 } // .end method
	 private static native void nativeTouchesBegin ( Integer p0, Float p1, Float p2 ) {
	 } // .end method
	 private static native void nativeTouchesCancel ( Integer[] p0, Float[] p1, Float[] p2 ) {
	 } // .end method
	 private static native void nativeTouchesEnd ( Integer p0, Float p1, Float p2 ) {
	 } // .end method
	 private static native void nativeTouchesMove ( Integer[] p0, Float[] p1, Float[] p2 ) {
	 } // .end method
	 public static void setAnimationInterval ( Double p0 ) {
		 /* .locals 2 */
		 /* .param p0, "interval" # D */
		 /* .prologue */
		 /* .line 106 */
		 /* const-wide v0, 0x41cdcd6500000000L # 1.0E9 */
		 /* mul-double/2addr v0, p0 */
		 /* double-to-long v0, v0 */
		 /* sput-wide v0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->animationInterval:J */
		 /* .line 107 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getContentText ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 131 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeGetContentText ( );
	 } // .end method
	 public void handleActionCancel ( Integer[] p0, Float[] p1, Float[] p2 ) {
		 /* .locals 0 */
		 /* .param p1, "id" # [I */
		 /* .param p2, "x" # [F */
		 /* .param p3, "y" # [F */
		 /* .prologue */
		 /* .line 84 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeTouchesCancel ( p1,p2,p3 );
		 /* .line 85 */
		 return;
	 } // .end method
	 public void handleActionDown ( Integer p0, Float p1, Float p2 ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .param p2, "x" # F */
		 /* .param p3, "y" # F */
		 /* .prologue */
		 /* .line 74 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeTouchesBegin ( p1,p2,p3 );
		 /* .line 75 */
		 return;
	 } // .end method
	 public void handleActionMove ( Integer[] p0, Float[] p1, Float[] p2 ) {
		 /* .locals 0 */
		 /* .param p1, "id" # [I */
		 /* .param p2, "x" # [F */
		 /* .param p3, "y" # [F */
		 /* .prologue */
		 /* .line 89 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeTouchesMove ( p1,p2,p3 );
		 /* .line 90 */
		 return;
	 } // .end method
	 public void handleActionUp ( Integer p0, Float p1, Float p2 ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .param p2, "x" # F */
		 /* .param p3, "y" # F */
		 /* .prologue */
		 /* .line 79 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeTouchesEnd ( p1,p2,p3 );
		 /* .line 80 */
		 return;
	 } // .end method
	 public void handleDeleteBackward ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 127 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeDeleteBackward ( );
		 /* .line 128 */
		 return;
	 } // .end method
	 public void handleInsertText ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "text" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 123 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeInsertText ( p1 );
		 /* .line 124 */
		 return;
	 } // .end method
	 public void handleKeyDown ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "keyCode" # I */
		 /* .prologue */
		 /* .line 94 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeKeyDown ( p1 );
		 /* .line 95 */
		 return;
	 } // .end method
	 public void handleOnPause ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 98 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeOnPause ( );
		 /* .line 99 */
		 return;
	 } // .end method
	 public void handleOnResume ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 102 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeOnResume ( );
		 /* .line 103 */
		 return;
	 } // .end method
	 public void onDrawFrame ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 8 */
		 /* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
		 /* .prologue */
		 /* .line 54 */
		 java.lang.System .nanoTime ( );
		 /* move-result-wide v2 */
		 /* .line 55 */
		 /* .local v2, "now":J */
		 /* iget-wide v4, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->last:J */
		 /* sub-long v0, v2, v4 */
		 /* .line 59 */
		 /* .local v0, "interval":J */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeRender ( );
		 /* .line 62 */
		 /* sget-wide v4, Lorg/cocos2dx/lib/Cocos2dxRenderer;->animationInterval:J */
		 /* cmp-long v4, v0, v4 */
		 /* if-gez v4, :cond_0 */
		 /* .line 65 */
		 try { // :try_start_0
			 /* sget-wide v4, Lorg/cocos2dx/lib/Cocos2dxRenderer;->animationInterval:J */
			 /* sub-long/2addr v4, v0 */
			 /* const-wide/16 v6, 0x2 */
			 /* mul-long/2addr v4, v6 */
			 /* const-wide/32 v6, 0xf4240 */
			 /* div-long/2addr v4, v6 */
			 java.lang.Thread .sleep ( v4,v5 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 69 */
		 } // :cond_0
	 } // :goto_0
	 /* iput-wide v2, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->last:J */
	 /* .line 70 */
	 return;
	 /* .line 66 */
	 /* :catch_0 */
	 /* move-exception v4 */
} // .end method
public void onSurfaceChanged ( javax.microedition.khronos.opengles.GL10 p0, Integer p1, Integer p2 ) {
	 /* .locals 0 */
	 /* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
	 /* .param p2, "w" # I */
	 /* .param p3, "h" # I */
	 /* .prologue */
	 /* .line 50 */
	 return;
} // .end method
public void onSurfaceCreated ( javax.microedition.khronos.opengles.GL10 p0, javax.microedition.khronos.egl.EGLConfig p1 ) {
	 /* .locals 2 */
	 /* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
	 /* .param p2, "config" # Ljavax/microedition/khronos/egl/EGLConfig; */
	 /* .prologue */
	 /* .line 40 */
	 /* iget v0, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->screenWidth:I */
	 /* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->screenHeight:I */
	 org.cocos2dx.lib.Cocos2dxRenderer .nativeInit ( v0,v1 );
	 /* .line 41 */
	 java.lang.System .nanoTime ( );
	 /* move-result-wide v0 */
	 /* iput-wide v0, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->last:J */
	 /* .line 42 */
	 return;
} // .end method
public void setScreenWidthAndHeight ( Integer p0, Integer p1 ) {
	 /* .locals 0 */
	 /* .param p1, "w" # I */
	 /* .param p2, "h" # I */
	 /* .prologue */
	 /* .line 45 */
	 /* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->screenWidth:I */
	 /* .line 46 */
	 /* iput p2, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->screenHeight:I */
	 /* .line 47 */
	 return;
} // .end method
