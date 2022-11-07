class org.haxe.nme.MainView$10 implements java.lang.Runnable {
	 /* .source "MainView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/haxe/nme/MainView;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.haxe.nme.MainView this$0; //synthetic
final Integer val$id; //synthetic
final org.haxe.nme.MainView val$me; //synthetic
final Float val$sizeX; //synthetic
final Float val$sizeY; //synthetic
final Integer val$t; //synthetic
final Float val$x; //synthetic
final Float val$y; //synthetic
/* # direct methods */
 org.haxe.nme.MainView$10 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 443 */
this.this$0 = p1;
this.val$me = p2;
/* iput p3, p0, Lorg/haxe/nme/MainView$10;->val$t:I */
/* iput p4, p0, Lorg/haxe/nme/MainView$10;->val$x:F */
/* iput p5, p0, Lorg/haxe/nme/MainView$10;->val$y:F */
/* iput p6, p0, Lorg/haxe/nme/MainView$10;->val$id:I */
/* iput p7, p0, Lorg/haxe/nme/MainView$10;->val$sizeX:F */
/* iput p8, p0, Lorg/haxe/nme/MainView$10;->val$sizeY:F */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 7 */
/* .prologue */
/* .line 447 */
v6 = this.val$me;
/* iget v0, p0, Lorg/haxe/nme/MainView$10;->val$t:I */
/* iget v1, p0, Lorg/haxe/nme/MainView$10;->val$x:F */
/* iget v2, p0, Lorg/haxe/nme/MainView$10;->val$y:F */
/* iget v3, p0, Lorg/haxe/nme/MainView$10;->val$id:I */
/* iget v4, p0, Lorg/haxe/nme/MainView$10;->val$sizeX:F */
/* iget v5, p0, Lorg/haxe/nme/MainView$10;->val$sizeY:F */
v0 = /* invoke-static/range {v0 ..v5}, Lorg/haxe/nme/NME;->onTouch(IFFIFF)I */
(( org.haxe.nme.MainView ) v6 ).HandleResult ( v0 ); // invoke-virtual {v6, v0}, Lorg/haxe/nme/MainView;->HandleResult(I)V
/* .line 449 */
return;
} // .end method
