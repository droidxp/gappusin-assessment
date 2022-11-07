class com.ansca.corona.Controller$11 implements android.content.DialogInterface$OnClickListener {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->showTrialAlert()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$11 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 710 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "arg0" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 713 */
v0 = this.this$0;
final String v1 = "http://www.coronalabs.com/products/corona-sdk/?utm_source=corona-sdk&utm_medium=corona-sdk&utm_campaign=trial-popup"; // const-string v1, "http://www.coronalabs.com/products/corona-sdk/?utm_source=corona-sdk&utm_medium=corona-sdk&utm_campaign=trial-popup"
(( com.ansca.corona.Controller ) v0 ).openUrl ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/Controller;->openUrl(Ljava/lang/String;)V
/* .line 714 */
return;
} // .end method
