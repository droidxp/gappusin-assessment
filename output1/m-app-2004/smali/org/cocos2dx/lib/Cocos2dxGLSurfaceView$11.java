class org.cocos2dx.lib.Cocos2dxGLSurfaceView$11 implements java.lang.Runnable {
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
private final val$ids; //synthetic
private final val$xs; //synthetic
private final val$ys; //synthetic
/* # direct methods */
 org.cocos2dx.lib.Cocos2dxGLSurfaceView$11 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$ids = p2;
this.val$xs = p3;
this.val$ys = p4;
/* .line 351 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 354 */
v0 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$3 ( v0 );
v1 = this.val$ids;
v2 = this.val$xs;
v3 = this.val$ys;
(( org.cocos2dx.lib.Cocos2dxRenderer ) v0 ).handleActionCancel ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lorg/cocos2dx/lib/Cocos2dxRenderer;->handleActionCancel([I[F[F)V
/* .line 355 */
return;
} // .end method
