class com.adknowledge.superrewards.ui.adapter.SRInstallPaymentAdapter$1 implements android.view.View$OnClickListener {
	 /* .source "SRInstallPaymentAdapter.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/adknowledge/superrewards/ui/adapter/SRInstallPaymentAdapter;->getClickListener(Lcom/adknowledge/superrewards/model/SROffer;)Landroid/view/View$OnClickListener; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.adknowledge.superrewards.ui.adapter.SRInstallPaymentAdapter this$0; //synthetic
final com.adknowledge.superrewards.model.SROffer val$srOffer; //synthetic
/* # direct methods */
 com.adknowledge.superrewards.ui.adapter.SRInstallPaymentAdapter$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 142 */
this.this$0 = p1;
this.val$srOffer = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 146 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 147 */
/* .local v0, "intent":Landroid/content/Intent; */
v1 = this.val$srOffer;
(( com.adknowledge.superrewards.model.SROffer ) v1 ).getUrl ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/model/SROffer;->getUrl()Ljava/lang/String;
android.net.Uri .parse ( v1 );
(( android.content.Intent ) v0 ).setData ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 148 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.adapter.SRInstallPaymentAdapter .access$000 ( v1 );
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 150 */
return;
} // .end method
