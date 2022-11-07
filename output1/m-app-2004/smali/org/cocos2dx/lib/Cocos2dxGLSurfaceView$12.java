class org.cocos2dx.lib.Cocos2dxGLSurfaceView$12 implements java.lang.Runnable {
	 /* .source "Cocos2dxGLSurfaceView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.cocos2dx.lib.Cocos2dxGLSurfaceView this$0; //synthetic
private final Integer val$kc; //synthetic
/* # direct methods */
 org.cocos2dx.lib.Cocos2dxGLSurfaceView$12 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* iput p2, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$12;->val$kc:I */
/* .line 377 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 380 */
v0 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$3 ( v0 );
/* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$12;->val$kc:I */
(( org.cocos2dx.lib.Cocos2dxRenderer ) v0 ).handleKeyDown ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxRenderer;->handleKeyDown(I)V
/* .line 381 */
return;
} // .end method
