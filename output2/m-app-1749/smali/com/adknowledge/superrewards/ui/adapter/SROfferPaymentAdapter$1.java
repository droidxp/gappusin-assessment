class com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter$1 implements android.view.View$OnClickListener {
	 /* .source "SROfferPaymentAdapter.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter;->getClickListener(Lcom/adknowledge/superrewards/model/SROffer;)Landroid/view/View$OnClickListener; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter this$0; //synthetic
final com.adknowledge.superrewards.model.SROffer val$srOffer; //synthetic
/* # direct methods */
 com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 140 */
this.this$0 = p1;
this.val$srOffer = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 3 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 144 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 145 */
/* .local v0, "intent":Landroid/content/Intent; */
final String v1 = "offer"; // const-string v1, "offer"
v2 = this.val$srOffer;
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 146 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter .access$000 ( v1 );
/* const-class v2, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity; */
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( android.content.Intent ) v0 ).setClassName ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
/* .line 147 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter .access$000 ( v1 );
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 149 */
return;
} // .end method
