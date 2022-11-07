class org.haxe.nme.MainView$7 implements java.lang.Runnable {
	 /* .source "MainView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/haxe/nme/MainView;->onTrackballEvent(Landroid/view/MotionEvent;)Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.haxe.nme.MainView this$0; //synthetic
final android.view.MotionEvent val$ev; //synthetic
final org.haxe.nme.MainView val$me; //synthetic
/* # direct methods */
 org.haxe.nme.MainView$7 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 285 */
this.this$0 = p1;
this.val$ev = p2;
this.val$me = p3;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 287 */
v2 = this.val$ev;
v0 = (( android.view.MotionEvent ) v2 ).getX ( ); // invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F
/* .line 288 */
/* .local v0, "x":F */
v2 = this.val$ev;
v1 = (( android.view.MotionEvent ) v2 ).getY ( ); // invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F
/* .line 289 */
/* .local v1, "y":F */
v2 = this.val$me;
v3 = org.haxe.nme.NME .onTrackball ( v0,v1 );
(( org.haxe.nme.MainView ) v2 ).HandleResult ( v3 ); // invoke-virtual {v2, v3}, Lorg/haxe/nme/MainView;->HandleResult(I)V
/* .line 290 */
return;
} // .end method
