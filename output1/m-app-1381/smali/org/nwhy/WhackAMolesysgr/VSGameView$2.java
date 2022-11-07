class org.nwhy.WhackAMolesysgr.VSGameView$2 implements java.lang.Runnable {
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
 org.nwhy.WhackAMolesysgr.VSGameView$2 ( ) {
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
/* .locals 5 */
/* .prologue */
/* .line 166 */
java.lang.Math .random ( );
/* move-result-wide v1 */
/* const-wide/high16 v3, 0x4018000000000000L # 6.0 */
/* mul-double/2addr v1, v3 */
/* double-to-int v0, v1 */
/* .line 167 */
/* .local v0, "rand":I */
v1 = this.this$0;
org.nwhy.WhackAMolesysgr.VSGameView .access$0 ( v1 );
/* check-cast v1, Lorg/nwhy/WhackAMolesysgr/VSPic; */
(( org.nwhy.WhackAMolesysgr.VSPic ) v1 ).toShow ( ); // invoke-virtual {v1}, Lorg/nwhy/WhackAMolesysgr/VSPic;->toShow()V
/* .line 168 */
v1 = this.this$0;
org.nwhy.WhackAMolesysgr.VSGameView .access$1 ( v1 );
/* check-cast v1, Lorg/nwhy/WhackAMolesysgr/VSPic; */
(( org.nwhy.WhackAMolesysgr.VSPic ) v1 ).toShow ( ); // invoke-virtual {v1}, Lorg/nwhy/WhackAMolesysgr/VSPic;->toShow()V
/* .line 169 */
v1 = this.this$0;
int v2 = 0; // const/4 v2, 0x0
org.nwhy.WhackAMolesysgr.VSGameView .access$2 ( v1,v2 );
/* .line 170 */
v1 = this.this$0;
(( org.nwhy.WhackAMolesysgr.VSGameView ) v1 ).invalidate ( ); // invoke-virtual {v1}, Lorg/nwhy/WhackAMolesysgr/VSGameView;->invalidate()V
/* .line 171 */
v1 = this.this$0;
/* const-wide/16 v2, 0x3e8 */
(( org.nwhy.WhackAMolesysgr.VSGameView ) v1 ).postDelayed ( p0, v2, v3 ); // invoke-virtual {v1, p0, v2, v3}, Lorg/nwhy/WhackAMolesysgr/VSGameView;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 172 */
return;
} // .end method
