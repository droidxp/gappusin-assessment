class org.cocos2dx.lib.Cocos2dxGLSurfaceView$9 implements java.lang.Runnable {
	 /* .source "Cocos2dxGLSurfaceView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.cocos2dx.lib.Cocos2dxGLSurfaceView this$0; //synthetic
private final Integer val$idPointerUp; //synthetic
private final Float val$xPointerUp; //synthetic
private final Float val$yPointerUp; //synthetic
/* # direct methods */
 org.cocos2dx.lib.Cocos2dxGLSurfaceView$9 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* iput p2, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$9;->val$idPointerUp:I */
/* iput p3, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$9;->val$xPointerUp:F */
/* iput p4, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$9;->val$yPointerUp:F */
/* .line 328 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 331 */
v0 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$3 ( v0 );
/* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$9;->val$idPointerUp:I */
/* iget v2, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$9;->val$xPointerUp:F */
/* iget v3, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$9;->val$yPointerUp:F */
(( org.cocos2dx.lib.Cocos2dxRenderer ) v0 ).handleActionUp ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lorg/cocos2dx/lib/Cocos2dxRenderer;->handleActionUp(IFF)V
/* .line 332 */
return;
} // .end method
