class org.nwhy.Whackczkm.GameView$1 implements java.lang.Runnable {
	 /* .source "GameView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/nwhy/Whackczkm/GameView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.nwhy.Whackczkm.GameView this$0; //synthetic
/* # direct methods */
 org.nwhy.Whackczkm.GameView$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 164 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 166 */
v0 = this.this$0;
(( org.nwhy.Whackczkm.GameView ) v0 ).invalidate ( ); // invoke-virtual {v0}, Lorg/nwhy/Whackczkm/GameView;->invalidate()V
/* .line 167 */
v0 = this.this$0;
/* const-wide/16 v1, 0x64 */
(( org.nwhy.Whackczkm.GameView ) v0 ).postDelayed ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Lorg/nwhy/Whackczkm/GameView;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 168 */
return;
} // .end method
