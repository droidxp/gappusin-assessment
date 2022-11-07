class com.balloonisland.hfxw.StarGems$1$1 implements android.content.DialogInterface$OnClickListener {
	 /* .source "StarGems.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/balloonisland/hfxw/StarGems$1;->handleMessage(Landroid/os/Message;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.balloonisland.hfxw.StarGems$1 this$1; //synthetic
/* # direct methods */
 com.balloonisland.hfxw.StarGems$1$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
/* .line 310 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "whichButton" # I */
/* .prologue */
/* .line 315 */
try { // :try_start_0
	 final String v4 = "market://details?id=com.balloonisland.stargems"; // const-string v4, "market://details?id=com.balloonisland.stargems"
	 android.net.Uri .parse ( v4 );
	 /* .line 316 */
	 /* .local v2, "marketAppUri":Landroid/net/Uri; */
	 /* new-instance v1, Landroid/content/Intent; */
	 final String v4 = "android.intent.action.VIEW"; // const-string v4, "android.intent.action.VIEW"
	 /* invoke-direct {v1, v4, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
	 /* .line 317 */
	 /* .local v1, "intent":Landroid/content/Intent; */
	 v4 = this.this$1;
	 com.balloonisland.hfxw.StarGems$1 .access$0 ( v4 );
	 (( com.balloonisland.hfxw.StarGems ) v4 ).startActivity ( v1 ); // invoke-virtual {v4, v1}, Lcom/balloonisland/hfxw/StarGems;->startActivity(Landroid/content/Intent;)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 324 */
} // .end local v2 # "marketAppUri":Landroid/net/Uri;
} // :goto_0
v4 = this.this$1;
com.balloonisland.hfxw.StarGems$1 .access$0 ( v4 );
com.balloonisland.hfxw.StarGems .access$15 ( v4 );
/* .line 325 */
return;
/* .line 318 */
} // .end local v1 # "intent":Landroid/content/Intent;
/* :catch_0 */
/* move-exception v0 */
/* .line 320 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v4 = "http://market.android.com/details?id=com.balloonisland.stargems"; // const-string v4, "http://market.android.com/details?id=com.balloonisland.stargems"
android.net.Uri .parse ( v4 );
/* .line 321 */
/* .local v3, "marketWebUri":Landroid/net/Uri; */
/* new-instance v1, Landroid/content/Intent; */
final String v4 = "android.intent.action.VIEW"; // const-string v4, "android.intent.action.VIEW"
/* invoke-direct {v1, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 322 */
/* .restart local v1 # "intent":Landroid/content/Intent; */
v4 = this.this$1;
com.balloonisland.hfxw.StarGems$1 .access$0 ( v4 );
(( com.balloonisland.hfxw.StarGems ) v4 ).startActivity ( v1 ); // invoke-virtual {v4, v1}, Lcom/balloonisland/hfxw/StarGems;->startActivity(Landroid/content/Intent;)V
} // .end method
