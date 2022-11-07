class com.balloonisland.hfxw.OpeningActivity$1 extends java.util.TimerTask {
	 /* .source "OpeningActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/balloonisland/hfxw/OpeningActivity;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.balloonisland.hfxw.OpeningActivity this$0; //synthetic
/* # direct methods */
 com.balloonisland.hfxw.OpeningActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 20 */
/* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 24 */
v1 = this.this$0;
com.balloonisland.hfxw.OpeningActivity .access$0 ( v1 );
/* .line 26 */
v1 = this.this$0;
(( com.balloonisland.hfxw.OpeningActivity ) v1 ).finish ( ); // invoke-virtual {v1}, Lcom/balloonisland/hfxw/OpeningActivity;->finish()V
/* .line 27 */
/* new-instance v1, Landroid/content/Intent; */
/* invoke-direct {v1}, Landroid/content/Intent;-><init>()V */
v2 = this.this$0;
/* const-class v3, Lcom/balloonisland/hfxw/StarGems; */
(( android.content.Intent ) v1 ).setClass ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
/* .line 28 */
/* .local v0, "hackbookIntent":Landroid/content/Intent; */
v1 = this.this$0;
(( com.balloonisland.hfxw.OpeningActivity ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Lcom/balloonisland/hfxw/OpeningActivity;->startActivity(Landroid/content/Intent;)V
/* .line 29 */
return;
} // .end method
