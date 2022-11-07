class com.ansca.corona.MediaManager$3 implements java.lang.Runnable {
	 /* .source "MediaManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/MediaManager;->playVideo(ILjava/lang/String;Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.MediaManager this$0; //synthetic
final Boolean val$mediaControlsEnabled; //synthetic
final java.lang.String val$path; //synthetic
/* # direct methods */
 com.ansca.corona.MediaManager$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 241 */
this.this$0 = p1;
this.val$path = p2;
/* iput-boolean p3, p0, Lcom/ansca/corona/MediaManager$3;->val$mediaControlsEnabled:Z */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 244 */
v3 = this.this$0;
com.ansca.corona.MediaManager .access$100 ( v3 );
(( com.ansca.corona.CoronaActivity ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Lcom/ansca/corona/CoronaActivity;->getPackageName()Ljava/lang/String;
/* .line 245 */
/* .local v1, "packageName":Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
/* .line 248 */
/* .local v2, "videoUri":Landroid/net/Uri; */
v3 = this.val$path;
v3 = android.webkit.URLUtil .isNetworkUrl ( v3 );
/* if-nez v3, :cond_0 */
v3 = this.val$path;
(( java.lang.String ) v3 ).toLowerCase ( ); // invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v4 = "rtsp:"; // const-string v4, "rtsp:"
v3 = (( java.lang.String ) v3 ).startsWith ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
	 /* .line 251 */
} // :cond_0
v3 = this.val$path;
android.net.Uri .parse ( v3 );
/* .line 261 */
} // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 262 */
/* new-instance v0, Landroid/content/Intent; */
v3 = this.this$0;
com.ansca.corona.MediaManager .access$100 ( v3 );
/* const-class v4, Lcom/ansca/corona/VideoActivity; */
/* invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 263 */
/* .local v0, "intent":Landroid/content/Intent; */
final String v3 = "video_uri"; // const-string v3, "video_uri"
(( android.net.Uri ) v2 ).toString ( ); // invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;
(( android.content.Intent ) v0 ).putExtra ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 264 */
final String v3 = "video_id"; // const-string v3, "video_id"
v4 = this.this$0;
v4 = com.ansca.corona.MediaManager .access$200 ( v4 );
(( android.content.Intent ) v0 ).putExtra ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 265 */
final String v3 = "media_controls_enabled"; // const-string v3, "media_controls_enabled"
/* iget-boolean v4, p0, Lcom/ansca/corona/MediaManager$3;->val$mediaControlsEnabled:Z */
(( android.content.Intent ) v0 ).putExtra ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 266 */
/* const/high16 v3, 0x10000 */
(( android.content.Intent ) v0 ).setFlags ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
/* .line 267 */
v3 = this.this$0;
com.ansca.corona.MediaManager .access$100 ( v3 );
(( com.ansca.corona.CoronaActivity ) v3 ).startActivity ( v0 ); // invoke-virtual {v3, v0}, Lcom/ansca/corona/CoronaActivity;->startActivity(Landroid/content/Intent;)V
/* .line 269 */
} // .end local v0 # "intent":Landroid/content/Intent;
} // :cond_1
return;
/* .line 257 */
} // :cond_2
v3 = this.this$0;
com.ansca.corona.MediaManager .access$100 ( v3 );
v4 = this.val$path;
com.ansca.corona.FileContentProvider .getContentUriFromFilePath ( v3,v4 );
} // .end method
