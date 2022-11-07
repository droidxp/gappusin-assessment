class com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity$1 implements android.view.View$OnClickListener {
	 /* .source "SROfferPaymentActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->getBuyButtonOnCLickListener()Landroid/view/View$OnClickListener; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity this$0; //synthetic
/* # direct methods */
 com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 69 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 6 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .prologue */
/* .line 73 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
v5 = this.this$0;
com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity .access$000 ( v5 );
(( com.adknowledge.superrewards.model.SROffer ) v5 ).getUrl ( ); // invoke-virtual {v5}, Lcom/adknowledge/superrewards/model/SROffer;->getUrl()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "&amount="; // const-string v5, "&amount="
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v5 = this.this$0;
com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity .access$000 ( v5 );
(( com.adknowledge.superrewards.model.SROffer ) v5 ).getPayout ( ); // invoke-virtual {v5}, Lcom/adknowledge/superrewards/model/SROffer;->getPayout()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 75 */
/* .local v3, "url":Ljava/lang/String; */
com.adknowledge.superrewards.web.SRClient .getInstance ( );
(( com.adknowledge.superrewards.web.SRClient ) v4 ).createRequest ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/web/SRClient;->createRequest()Lcom/adknowledge/superrewards/web/SRRequest;
/* .line 76 */
/* .local v2, "request":Lcom/adknowledge/superrewards/web/SRRequest; */
v4 = com.adknowledge.superrewards.web.SRRequest$Command.METHOD;
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).setCommand ( v4 ); // invoke-virtual {v2, v4}, Lcom/adknowledge/superrewards/web/SRRequest;->setCommand(Lcom/adknowledge/superrewards/web/SRRequest$Command;)V
/* .line 77 */
v4 = com.adknowledge.superrewards.web.SRRequest$Call.CLICK;
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).setCall ( v4 ); // invoke-virtual {v2, v4}, Lcom/adknowledge/superrewards/web/SRRequest;->setCall(Lcom/adknowledge/superrewards/web/SRRequest$Call;)V
/* .line 78 */
final String v4 = "amount"; // const-string v4, "amount"
v5 = this.this$0;
com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity .access$000 ( v5 );
(( com.adknowledge.superrewards.model.SROffer ) v5 ).getPayout ( ); // invoke-virtual {v5}, Lcom/adknowledge/superrewards/model/SROffer;->getPayout()Ljava/lang/String;
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).addInnerParam ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
/* .line 79 */
final String v4 = "click_url"; // const-string v4, "click_url"
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).addInnerParam ( v4, v3 ); // invoke-virtual {v2, v4, v3}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
/* .line 80 */
/* new-instance v1, Landroid/content/Intent; */
final String v4 = "android.intent.action.VIEW"; // const-string v4, "android.intent.action.VIEW"
/* invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 81 */
/* .local v1, "i":Landroid/content/Intent; */
v4 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) v4 ).getApplicationContext ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->getApplicationContext()Landroid/content/Context;
v5 = com.adknowledge.superrewards.tracking.SRAppInstallTracker.h;
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).getUrlWithJson ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lcom/adknowledge/superrewards/web/SRRequest;->getUrlWithJson(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
/* .line 82 */
/* .local v0, "finalurl":Ljava/lang/String; */
android.net.Uri .parse ( v0 );
(( android.content.Intent ) v1 ).setData ( v4 ); // invoke-virtual {v1, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 83 */
v4 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) v4 ).startActivity ( v1 ); // invoke-virtual {v4, v1}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->startActivity(Landroid/content/Intent;)V
/* .line 84 */
return;
} // .end method
