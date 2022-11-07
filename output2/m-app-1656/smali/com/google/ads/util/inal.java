class inal implements android.content.DialogInterface$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/ads/util/g$a;->a(Landroid/app/AlertDialog$Builder;Ljava/lang/String;Landroid/webkit/JsResult;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = null */
} // .end annotation
/* # instance fields */
final android.webkit.JsResult a; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 372 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 375 */
v0 = this.a;
(( android.webkit.JsResult ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/webkit/JsResult;->cancel()V
/* .line 376 */
return;
} // .end method
