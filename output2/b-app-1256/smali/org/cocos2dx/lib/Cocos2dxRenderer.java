public class org.cocos2dx.lib.Cocos2dxRenderer implements android.opengl.GLSurfaceView$Renderer {
	 /* .source "Cocos2dxRenderer.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final Long NANOSECONDSPERMICROSECOND;
	 private static final Long NANOSECONDSPERSECOND;
	 private static Long sAnimationInterval;
	 /* # instance fields */
	 private Long mLastTickInNanoSeconds;
	 private Integer mScreenHeight;
	 private Integer mScreenWidth;
	 /* # direct methods */
	 static org.cocos2dx.lib.Cocos2dxRenderer ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 39 */
		 /* const-wide/32 v0, 0xfe502a */
		 /* sput-wide v0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->sAnimationInterval:J */
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
		 /* .param p0, "pAnimationInterval" # D */
		 /* .prologue */
		 /* .line 58 */
		 /* const-wide v0, 0x41cdcd6500000000L # 1.0E9 */
		 /* mul-double/2addr v0, p0 */
		 /* double-to-long v0, v0 */
		 /* sput-wide v0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->sAnimationInterval:J */
		 /* .line 59 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getContentText ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 156 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeGetContentText ( );
	 } // .end method
	 public void handleActionCancel ( Integer[] p0, Float[] p1, Float[] p2 ) {
		 /* .locals 0 */
		 /* .param p1, "pIDs" # [I */
		 /* .param p2, "pXs" # [F */
		 /* .param p3, "pYs" # [F */
		 /* .prologue */
		 /* .line 124 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeTouchesCancel ( p1,p2,p3 );
		 /* .line 125 */
		 return;
	 } // .end method
	 public void handleActionDown ( Integer p0, Float p1, Float p2 ) {
		 /* .locals 0 */
		 /* .param p1, "pID" # I */
		 /* .param p2, "pX" # F */
		 /* .param p3, "pY" # F */
		 /* .prologue */
		 /* .line 116 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeTouchesBegin ( p1,p2,p3 );
		 /* .line 117 */
		 return;
	 } // .end method
	 public void handleActionMove ( Integer[] p0, Float[] p1, Float[] p2 ) {
		 /* .locals 0 */
		 /* .param p1, "pIDs" # [I */
		 /* .param p2, "pXs" # [F */
		 /* .param p3, "pYs" # [F */
		 /* .prologue */
		 /* .line 128 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeTouchesMove ( p1,p2,p3 );
		 /* .line 129 */
		 return;
	 } // .end method
	 public void handleActionUp ( Integer p0, Float p1, Float p2 ) {
		 /* .locals 0 */
		 /* .param p1, "pID" # I */
		 /* .param p2, "pX" # F */
		 /* .param p3, "pY" # F */
		 /* .prologue */
		 /* .line 120 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeTouchesEnd ( p1,p2,p3 );
		 /* .line 121 */
		 return;
	 } // .end method
	 public void handleDeleteBackward ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 152 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeDeleteBackward ( );
		 /* .line 153 */
		 return;
	 } // .end method
	 public void handleInsertText ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "pText" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 148 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeInsertText ( p1 );
		 /* .line 149 */
		 return;
	 } // .end method
	 public void handleKeyDown ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "pKeyCode" # I */
		 /* .prologue */
		 /* .line 132 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeKeyDown ( p1 );
		 /* .line 133 */
		 return;
	 } // .end method
	 public void handleOnPause ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 136 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeOnPause ( );
		 /* .line 137 */
		 return;
	 } // .end method
	 public void handleOnResume ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 140 */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeOnResume ( );
		 /* .line 141 */
		 return;
	 } // .end method
	 public void onDrawFrame ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 8 */
		 /* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
		 /* .prologue */
		 /* .line 82 */
		 java.lang.System .nanoTime ( );
		 /* move-result-wide v2 */
		 /* .line 83 */
		 /* .local v2, "nowInNanoSeconds":J */
		 /* iget-wide v4, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->mLastTickInNanoSeconds:J */
		 /* sub-long v0, v2, v4 */
		 /* .line 87 */
		 /* .local v0, "interval":J */
		 org.cocos2dx.lib.Cocos2dxRenderer .nativeRender ( );
		 /* .line 90 */
		 /* sget-wide v4, Lorg/cocos2dx/lib/Cocos2dxRenderer;->sAnimationInterval:J */
		 /* cmp-long v4, v0, v4 */
		 /* if-gez v4, :cond_0 */
		 /* .line 93 */
		 try { // :try_start_0
			 /* sget-wide v4, Lorg/cocos2dx/lib/Cocos2dxRenderer;->sAnimationInterval:J */
			 /* sub-long/2addr v4, v0 */
			 /* const-wide/16 v6, 0x2 */
			 /* mul-long/2addr v4, v6 */
			 /* const-wide/32 v6, 0xf4240 */
			 /* div-long/2addr v4, v6 */
			 java.lang.Thread .sleep ( v4,v5 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 98 */
		 } // :cond_0
	 } // :goto_0
	 /* iput-wide v2, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->mLastTickInNanoSeconds:J */
	 /* .line 99 */
	 return;
	 /* .line 94 */
	 /* :catch_0 */
	 /* move-exception v4 */
} // .end method
public void onSurfaceChanged ( javax.microedition.khronos.opengles.GL10 p0, Integer p1, Integer p2 ) {
	 /* .locals 0 */
	 /* .param p1, "pGL10" # Ljavax/microedition/khronos/opengles/GL10; */
	 /* .param p2, "pWidth" # I */
	 /* .param p3, "pHeight" # I */
	 /* .prologue */
	 /* .line 78 */
	 return;
} // .end method
public void onSurfaceCreated ( javax.microedition.khronos.opengles.GL10 p0, javax.microedition.khronos.egl.EGLConfig p1 ) {
	 /* .locals 2 */
	 /* .param p1, "pGL10" # Ljavax/microedition/khronos/opengles/GL10; */
	 /* .param p2, "pEGLConfig" # Ljavax/microedition/khronos/egl/EGLConfig; */
	 /* .prologue */
	 /* .line 72 */
	 /* iget v0, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->mScreenWidth:I */
	 /* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->mScreenHeight:I */
	 org.cocos2dx.lib.Cocos2dxRenderer .nativeInit ( v0,v1 );
	 /* .line 73 */
	 java.lang.System .nanoTime ( );
	 /* move-result-wide v0 */
	 /* iput-wide v0, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->mLastTickInNanoSeconds:J */
	 /* .line 74 */
	 return;
} // .end method
public void setScreenWidthAndHeight ( Integer p0, Integer p1 ) {
	 /* .locals 0 */
	 /* .param p1, "pSurfaceWidth" # I */
	 /* .param p2, "pSurfaceHeight" # I */
	 /* .prologue */
	 /* .line 62 */
	 /* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->mScreenWidth:I */
	 /* .line 63 */
	 /* iput p2, p0, Lorg/cocos2dx/lib/Cocos2dxRenderer;->mScreenHeight:I */
	 /* .line 64 */
	 return;
} // .end method
