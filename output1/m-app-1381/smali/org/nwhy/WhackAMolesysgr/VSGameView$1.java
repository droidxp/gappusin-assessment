class org.nwhy.WhackAMolesysgr.VSGameView$1 implements java.lang.Runnable {
	 /* .source "VSGameView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/nwhy/WhackAMolesysgr/VSGameView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.nwhy.WhackAMolesysgr.VSGameView this$0; //synthetic
/* # direct methods */
 org.nwhy.WhackAMolesysgr.VSGameView$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 157 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 159 */
v0 = this.this$0;
(( org.nwhy.WhackAMolesysgr.VSGameView ) v0 ).invalidate ( ); // invoke-virtual {v0}, Lorg/nwhy/WhackAMolesysgr/VSGameView;->invalidate()V
/* .line 160 */
v0 = this.this$0;
/* const-wide/16 v1, 0x64 */
(( org.nwhy.WhackAMolesysgr.VSGameView ) v0 ).postDelayed ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Lorg/nwhy/WhackAMolesysgr/VSGameView;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 161 */
return;
} // .end method
