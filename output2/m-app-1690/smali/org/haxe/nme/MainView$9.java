class org.haxe.nme.MainView$9 implements java.lang.Runnable {
	 /* .source "MainView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/haxe/nme/MainView;->onKeyUp(ILandroid/view/KeyEvent;)Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.haxe.nme.MainView this$0; //synthetic
final Integer val$keyCode; //synthetic
final org.haxe.nme.MainView val$me; //synthetic
/* # direct methods */
 org.haxe.nme.MainView$9 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 387 */
this.this$0 = p1;
this.val$me = p2;
/* iput p3, p0, Lorg/haxe/nme/MainView$9;->val$keyCode:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 391 */
v0 = this.val$me;
/* iget v1, p0, Lorg/haxe/nme/MainView$9;->val$keyCode:I */
int v2 = 0; // const/4 v2, 0x0
v1 = org.haxe.nme.NME .onKeyChange ( v1,v2 );
(( org.haxe.nme.MainView ) v0 ).HandleResult ( v1 ); // invoke-virtual {v0, v1}, Lorg/haxe/nme/MainView;->HandleResult(I)V
/* .line 393 */
return;
} // .end method
