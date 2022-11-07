class org.cocos2dx.lib.Cocos2dxGLSurfaceView$3 implements java.lang.Runnable {
	 /* .source "Cocos2dxGLSurfaceView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->onPause()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.cocos2dx.lib.Cocos2dxGLSurfaceView this$0; //synthetic
/* # direct methods */
 org.cocos2dx.lib.Cocos2dxGLSurfaceView$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 160 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 163 */
v0 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$3 ( v0 );
(( org.cocos2dx.lib.Cocos2dxRenderer ) v0 ).handleOnPause ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxRenderer;->handleOnPause()V
/* .line 164 */
return;
} // .end method
