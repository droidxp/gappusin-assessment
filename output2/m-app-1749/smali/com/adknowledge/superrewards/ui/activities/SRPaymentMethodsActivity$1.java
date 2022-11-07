class com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity$1 implements android.widget.AdapterView$OnItemClickListener {
	 /* .source "SRPaymentMethodsActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getDirectPaymentOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity this$0; //synthetic
/* # direct methods */
 com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 261 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onItemClick ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
/* .locals 6 */
/* .param p2, "arg1" # Landroid/view/View; */
/* .param p3, "position" # I */
/* .param p4, "arg3" # J */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/widget/AdapterView", */
/* "<*>;", */
/* "Landroid/view/View;", */
/* "IJ)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 265 */
/* .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;" */
v4 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$100 ( v4 );
/* check-cast v3, Lcom/adknowledge/superrewards/model/SROffer; */
/* .line 268 */
/* .local v3, "selectedOffer":Lcom/adknowledge/superrewards/model/SROffer; */
(( com.adknowledge.superrewards.model.SROffer ) v3 ).getName ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
final String v5 = "zong"; // const-string v5, "zong"
v4 = (( java.lang.String ) v4 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 269 */
/* new-instance v2, Lcom/adknowledge/superrewards/model/SRRequestBuilder; */
v4 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v4 ).getApplicationContext ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
/* invoke-direct {v2, v4, v3}, Lcom/adknowledge/superrewards/model/SRRequestBuilder;-><init>(Landroid/content/Context;Lcom/adknowledge/superrewards/model/SROffer;)V */
/* .line 270 */
/* .local v2, "request":Lcom/adknowledge/superrewards/model/SRRequestBuilder; */
(( com.adknowledge.superrewards.model.SRRequestBuilder ) v2 ).getRequest ( ); // invoke-virtual {v2}, Lcom/adknowledge/superrewards/model/SRRequestBuilder;->getRequest()Lcom/zong/android/engine/activities/ZongPaymentRequest;
/* .line 271 */
/* .local v1, "paymentRequest":Lcom/zong/android/engine/activities/ZongPaymentRequest; */
/* new-instance v0, Landroid/content/Intent; */
v4 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v4 ).getApplicationContext ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
/* const-class v5, Lcom/zong/android/engine/web/ZongWebView; */
/* invoke-direct {v0, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 272 */
/* .local v0, "intent":Landroid/content/Intent; */
final String v4 = "com.zong.intent.Request"; // const-string v4, "com.zong.intent.Request"
(( android.content.Intent ) v0 ).putExtra ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
/* .line 273 */
v4 = this.this$0;
int v5 = 1; // const/4 v5, 0x1
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v4 ).startActivityForResult ( v0, v5 ); // invoke-virtual {v4, v0, v5}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 281 */
} // .end local v1 # "paymentRequest":Lcom/zong/android/engine/activities/ZongPaymentRequest;
} // .end local v2 # "request":Lcom/adknowledge/superrewards/model/SRRequestBuilder;
} // :goto_0
return;
/* .line 276 */
} // .end local v0 # "intent":Landroid/content/Intent;
} // :cond_0
/* new-instance v0, Landroid/content/Intent; */
final String v4 = "android.intent.action.VIEW"; // const-string v4, "android.intent.action.VIEW"
/* invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 277 */
/* .restart local v0 # "intent":Landroid/content/Intent; */
final String v4 = "offer"; // const-string v4, "offer"
(( android.content.Intent ) v0 ).putExtra ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 278 */
(( android.widget.AdapterView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/widget/AdapterView;->getContext()Landroid/content/Context;
/* const-class v5, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity; */
(( java.lang.Class ) v5 ).getName ( ); // invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( android.content.Intent ) v0 ).setClassName ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
/* .line 279 */
v4 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v4 ).startActivity ( v0 ); // invoke-virtual {v4, v0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->startActivity(Landroid/content/Intent;)V
} // .end method
