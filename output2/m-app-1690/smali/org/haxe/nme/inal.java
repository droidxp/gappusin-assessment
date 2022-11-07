class inal implements java.lang.Runnable {
	 /* .source "GameActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/haxe/nme/GameActivity;->postUICallback(J)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = null */
} // .end annotation
/* # instance fields */
final Long val$inHandle; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 414 */
/* iput-wide p1, p0, Lorg/haxe/nme/GameActivity$1;->val$inHandle:J */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 417 */
/* iget-wide v0, p0, Lorg/haxe/nme/GameActivity$1;->val$inHandle:J */
org.haxe.nme.NME .onCallback ( v0,v1 );
/* .line 418 */
return;
} // .end method
