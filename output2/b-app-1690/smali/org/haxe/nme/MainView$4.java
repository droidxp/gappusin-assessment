class org.haxe.nme.MainView$4 implements java.lang.Runnable {
	 /* .source "MainView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/haxe/nme/MainView;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.haxe.nme.MainView this$0; //synthetic
final Integer val$axis; //synthetic
final Integer val$deviceId; //synthetic
final org.haxe.nme.MainView val$me; //synthetic
final android.view.InputDevice$MotionRange val$range; //synthetic
final Float val$value; //synthetic
/* # direct methods */
 org.haxe.nme.MainView$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 272 */
this.this$0 = p1;
this.val$me = p2;
/* iput p3, p0, Lorg/haxe/nme/MainView$4;->val$deviceId:I */
/* iput p4, p0, Lorg/haxe/nme/MainView$4;->val$axis:I */
/* iput p5, p0, Lorg/haxe/nme/MainView$4;->val$value:F */
this.val$range = p6;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 276 */
v0 = this.val$me;
/* iget v1, p0, Lorg/haxe/nme/MainView$4;->val$deviceId:I */
/* iget v2, p0, Lorg/haxe/nme/MainView$4;->val$axis:I */
/* iget v3, p0, Lorg/haxe/nme/MainView$4;->val$value:F */
v4 = this.val$range;
v4 = (( android.view.InputDevice$MotionRange ) v4 ).getMin ( ); // invoke-virtual {v4}, Landroid/view/InputDevice$MotionRange;->getMin()F
/* sub-float/2addr v3, v4 */
v4 = this.val$range;
v4 = (( android.view.InputDevice$MotionRange ) v4 ).getRange ( ); // invoke-virtual {v4}, Landroid/view/InputDevice$MotionRange;->getRange()F
/* div-float/2addr v3, v4 */
/* const v4, 0x477fff00 # 65535.0f */
/* mul-float/2addr v3, v4 */
/* const/high16 v4, 0x47000000 # 32768.0f */
/* sub-float/2addr v3, v4 */
v1 = org.haxe.nme.NME .onJoyMotion ( v1,v2,v3 );
(( org.haxe.nme.MainView ) v0 ).HandleResult ( v1 ); // invoke-virtual {v0, v1}, Lorg/haxe/nme/MainView;->HandleResult(I)V
/* .line 278 */
return;
} // .end method
