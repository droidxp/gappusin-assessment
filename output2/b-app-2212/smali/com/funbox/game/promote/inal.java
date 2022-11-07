class inal implements android.view.View$OnClickListener {
	 /* .source "AdSplash.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/funbox/game/promote/AdSplash;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.funbox.game.promote.AdSplash this$0; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 128 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 4 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 130 */
final String v0 = "AdSplash"; // const-string v0, "AdSplash"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "moreGame.click(), more url="; // const-string v2, "moreGame.click(), more url="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
com.funbox.game.promote.GameAd .getMoreGameUrl ( );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 133 */
try { // :try_start_0
	 v0 = this.this$0;
	 /* new-instance v1, Landroid/content/Intent; */
	 final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
	 /* .line 134 */
	 com.funbox.game.promote.GameAd .getMoreGameUrl ( );
	 android.net.Uri .parse ( v3 );
	 /* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
	 (( com.funbox.game.promote.AdSplash ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/promote/AdSplash;->startActivity(Landroid/content/Intent;)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 138 */
} // :goto_0
return;
/* .line 135 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
