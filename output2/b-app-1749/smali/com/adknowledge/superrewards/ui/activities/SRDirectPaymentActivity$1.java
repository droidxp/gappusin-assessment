class com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity$1 implements android.view.View$OnClickListener {
	 /* .source "SRDirectPaymentActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->getBuyButtonOnCLickListener()Landroid/view/View$OnClickListener; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity this$0; //synthetic
/* # direct methods */
 com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 87 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 9 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .prologue */
/* .line 92 */
v7 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity .access$000 ( v7 );
(( android.widget.Spinner ) v7 ).getSelectedItem ( ); // invoke-virtual {v7}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;
/* check-cast v4, Ljava/lang/String; */
/* .line 93 */
/* .local v4, "pricePointSelecetedText":Ljava/lang/String; */
v7 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity .access$100 ( v7 );
(( com.adknowledge.superrewards.model.SROffer ) v7 ).getPricePoints ( ); // invoke-virtual {v7}, Lcom/adknowledge/superrewards/model/SROffer;->getPricePoints()Ljava/util/List;
/* .local v2, "i$":Ljava/util/Iterator; */
v7 = } // :cond_0
if ( v7 != null) { // if-eqz v7, :cond_1
/* check-cast v3, Lcom/adknowledge/superrewards/model/SRPricePoint; */
/* .line 94 */
/* .local v3, "pricePoint":Lcom/adknowledge/superrewards/model/SRPricePoint; */
(( com.adknowledge.superrewards.model.SRPricePoint ) v3 ).getLocalText ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/model/SRPricePoint;->getLocalText()Ljava/lang/String;
v7 = (( java.lang.String ) v4 ).equals ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_0
	 /* .line 95 */
	 /* new-instance v7, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
	 v8 = this.this$0;
	 com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity .access$100 ( v8 );
	 (( com.adknowledge.superrewards.model.SROffer ) v8 ).getUrl ( ); // invoke-virtual {v8}, Lcom/adknowledge/superrewards/model/SROffer;->getUrl()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v8 = "&amount="; // const-string v8, "&amount="
	 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( com.adknowledge.superrewards.model.SRPricePoint ) v3 ).getAmount ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/model/SRPricePoint;->getAmount()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v8 = "&custom_param_sr_mobile=true"; // const-string v8, "&custom_param_sr_mobile=true"
	 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 96 */
	 /* .local v6, "url":Ljava/lang/String; */
	 com.adknowledge.superrewards.web.SRClient .getInstance ( );
	 (( com.adknowledge.superrewards.web.SRClient ) v7 ).createRequest ( ); // invoke-virtual {v7}, Lcom/adknowledge/superrewards/web/SRClient;->createRequest()Lcom/adknowledge/superrewards/web/SRRequest;
	 /* .line 97 */
	 /* .local v5, "request":Lcom/adknowledge/superrewards/web/SRRequest; */
	 v7 = com.adknowledge.superrewards.web.SRRequest$Command.METHOD;
	 (( com.adknowledge.superrewards.web.SRRequest ) v5 ).setCommand ( v7 ); // invoke-virtual {v5, v7}, Lcom/adknowledge/superrewards/web/SRRequest;->setCommand(Lcom/adknowledge/superrewards/web/SRRequest$Command;)V
	 /* .line 98 */
	 v7 = com.adknowledge.superrewards.web.SRRequest$Call.CLICK;
	 (( com.adknowledge.superrewards.web.SRRequest ) v5 ).setCall ( v7 ); // invoke-virtual {v5, v7}, Lcom/adknowledge/superrewards/web/SRRequest;->setCall(Lcom/adknowledge/superrewards/web/SRRequest$Call;)V
	 /* .line 99 */
	 final String v7 = "amount"; // const-string v7, "amount"
	 (( com.adknowledge.superrewards.model.SRPricePoint ) v3 ).getAmount ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/model/SRPricePoint;->getAmount()Ljava/lang/String;
	 (( com.adknowledge.superrewards.web.SRRequest ) v5 ).addInnerParam ( v7, v8 ); // invoke-virtual {v5, v7, v8}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 100 */
	 final String v7 = "click_url"; // const-string v7, "click_url"
	 (( com.adknowledge.superrewards.web.SRRequest ) v5 ).addInnerParam ( v7, v6 ); // invoke-virtual {v5, v7, v6}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 101 */
	 /* new-instance v1, Landroid/content/Intent; */
	 final String v7 = "android.intent.action.VIEW"; // const-string v7, "android.intent.action.VIEW"
	 /* invoke-direct {v1, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
	 /* .line 102 */
	 /* .local v1, "i":Landroid/content/Intent; */
	 v7 = this.this$0;
	 (( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) v7 ).getApplicationContext ( ); // invoke-virtual {v7}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->getApplicationContext()Landroid/content/Context;
	 v8 = com.adknowledge.superrewards.tracking.SRAppInstallTracker.h;
	 (( com.adknowledge.superrewards.web.SRRequest ) v5 ).getUrlWithJson ( v7, v8 ); // invoke-virtual {v5, v7, v8}, Lcom/adknowledge/superrewards/web/SRRequest;->getUrlWithJson(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
	 /* .line 103 */
	 /* .local v0, "finalurl":Ljava/lang/String; */
	 android.net.Uri .parse ( v0 );
	 (( android.content.Intent ) v1 ).setData ( v7 ); // invoke-virtual {v1, v7}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
	 /* .line 104 */
	 v7 = this.this$0;
	 (( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) v7 ).startActivity ( v1 ); // invoke-virtual {v7, v1}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->startActivity(Landroid/content/Intent;)V
	 /* .line 108 */
} // .end local v0 # "finalurl":Ljava/lang/String;
} // .end local v1 # "i":Landroid/content/Intent;
} // .end local v3 # "pricePoint":Lcom/adknowledge/superrewards/model/SRPricePoint;
} // .end local v5 # "request":Lcom/adknowledge/superrewards/web/SRRequest;
} // .end local v6 # "url":Ljava/lang/String;
} // :cond_1
return;
} // .end method
