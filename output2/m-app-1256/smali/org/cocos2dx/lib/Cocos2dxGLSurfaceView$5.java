class org.cocos2dx.lib.Cocos2dxGLSurfaceView$5 implements java.lang.Runnable {
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
private final Integer val$idDown; //synthetic
private final Float val$xDown; //synthetic
private final Float val$yDown; //synthetic
/* # direct methods */
 org.cocos2dx.lib.Cocos2dxGLSurfaceView$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* iput p2, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$5;->val$idDown:I */
/* iput p3, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$5;->val$xDown:F */
/* iput p4, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$5;->val$yDown:F */
/* .line 205 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 208 */
v0 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$3 ( v0 );
/* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$5;->val$idDown:I */
/* iget v2, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$5;->val$xDown:F */
/* iget v3, p0, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView$5;->val$yDown:F */
(( org.cocos2dx.lib.Cocos2dxRenderer ) v0 ).handleActionDown ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lorg/cocos2dx/lib/Cocos2dxRenderer;->handleActionDown(IFF)V
/* .line 209 */
return;
} // .end method
