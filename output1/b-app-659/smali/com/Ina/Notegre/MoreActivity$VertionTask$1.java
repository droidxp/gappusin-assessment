class com.Ina.Notegre.MoreActivity$VertionTask$1 implements android.content.DialogInterface$OnClickListener {
	 /* .source "MoreActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/Ina/Notegre/MoreActivity$VertionTask;->onProgressUpdate([Ljava/lang/Integer;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.MoreActivity$VertionTask this$1; //synthetic
/* # direct methods */
 com.Ina.Notegre.MoreActivity$VertionTask$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
/* .line 488 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 495 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* .line 496 */
v2 = this.this$1;
v2 = this.mLoadString;
android.net.Uri .parse ( v2 );
/* .line 495 */
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 497 */
/* .local v0, "fIntent":Landroid/content/Intent; */
v1 = this.this$1;
com.Ina.Notegre.MoreActivity$VertionTask .access$3 ( v1 );
(( com.Ina.Notegre.MoreActivity ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Lcom/Ina/Notegre/MoreActivity;->startActivity(Landroid/content/Intent;)V
/* .line 499 */
return;
} // .end method
