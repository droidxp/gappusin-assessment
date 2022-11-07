class org.haxe.nme.MainView$4 implements java.lang.Runnable {
	 /* .source "MainView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/haxe/nme/MainView;->sendActivity(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.haxe.nme.MainView this$0; //synthetic
final Integer val$inActivity; //synthetic
/* # direct methods */
 org.haxe.nme.MainView$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 214 */
this.this$0 = p1;
/* iput p2, p0, Lorg/haxe/nme/MainView$4;->val$inActivity:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 214 */
/* iget v0, p0, Lorg/haxe/nme/MainView$4;->val$inActivity:I */
org.haxe.nme.NME .onActivity ( v0 );
return;
} // .end method
