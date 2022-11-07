public class com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity$PaymentMethodsTask extends android.os.AsyncTask {
	 /* .source "SRPaymentMethodsActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "PaymentMethodsTask" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/AsyncTask", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Void;", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
android.app.ProgressDialog myProgressDialog;
final com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity this$0; //synthetic
/* # direct methods */
public com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity$PaymentMethodsTask ( ) {
/* .locals 4 */
/* .prologue */
/* .line 149 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
/* .line 150 */
v0 = this.this$0;
final String v1 = "Please wait..."; // const-string v1, "Please wait..."
final String v2 = "Loading data from Super Rewards"; // const-string v2, "Loading data from Super Rewards"
int v3 = 0; // const/4 v3, 0x0
android.app.ProgressDialog .show ( v0,v1,v2,v3 );
this.myProgressDialog = v0;
return;
} // .end method
/* # virtual methods */
protected java.lang.Object doInBackground ( java.lang.Object[] p0 ) { //bridge//synthethic
/* .locals 1 */
/* .param p1, "x0" # [Ljava/lang/Object; */
/* .prologue */
/* .line 149 */
/* check-cast p1, [Ljava/lang/String; */
} // .end local p1 # "x0":[Ljava/lang/Object;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity$PaymentMethodsTask ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity$PaymentMethodsTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Void;
} // .end method
protected java.lang.Void doInBackground ( java.lang.String...p0 ) {
/* .locals 14 */
/* .param p1, "params" # [Ljava/lang/String; */
/* .prologue */
/* .line 153 */
final String v1 = "SR"; // const-string v1, "SR"
final String v2 = "In Payment Methods parent thread"; // const-string v2, "In Payment Methods parent thread"
android.util.Log .i ( v1,v2 );
/* .line 154 */
/* new-instance v0, Lcom/adknowledge/superrewards/SuperRewardsImpl; */
/* invoke-direct {v0}, Lcom/adknowledge/superrewards/SuperRewardsImpl;-><init>()V */
/* .line 155 */
/* .local v0, "sr":Lcom/adknowledge/superrewards/SuperRewards; */
v13 = this.this$0;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v1, p1, v1 */
int v2 = 1; // const/4 v2, 0x1
/* aget-object v2, p1, v2 */
int v3 = 2; // const/4 v3, 0x2
/* aget-object v3, p1, v3 */
int v4 = 3; // const/4 v4, 0x3
/* aget-object v4, p1, v4 */
int v5 = 4; // const/4 v5, 0x4
/* aget-object v5, p1, v5 */
int v6 = 5; // const/4 v6, 0x5
/* aget-object v6, p1, v6 */
int v7 = 0; // const/4 v7, 0x0
v8 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v8 ).getApplicationContext ( ); // invoke-virtual {v8}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
/* invoke-interface/range {v0 ..v8}, Lcom/adknowledge/superrewards/SuperRewards;->getOffers(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/util/List; */
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$002 ( v13,v1 );
/* .line 156 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$000 ( v1 );
/* if-nez v1, :cond_0 */
/* .line 157 */
v1 = this.myProgressDialog;
(( android.app.ProgressDialog ) v1 ).dismiss ( ); // invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
/* .line 158 */
v1 = this.this$0;
int v2 = 0; // const/4 v2, 0x0
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v1 ).setResult ( v2 ); // invoke-virtual {v1, v2}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->setResult(I)V
/* .line 159 */
v1 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v1 ).finish ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->finish()V
/* .line 160 */
int v1 = 1; // const/4 v1, 0x1
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity$PaymentMethodsTask ) p0 ).cancel ( v1 ); // invoke-virtual {p0, v1}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity$PaymentMethodsTask;->cancel(Z)Z
/* .line 162 */
} // :cond_0
v1 = (( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity$PaymentMethodsTask ) p0 ).isCancelled ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity$PaymentMethodsTask;->isCancelled()Z
/* if-nez v1, :cond_4 */
/* .line 163 */
v1 = this.this$0;
v2 = this.this$0;
v3 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$000 ( v3 );
v4 = com.adknowledge.superrewards.model.SROfferType.DIRECT;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$200 ( v2,v3,v4 );
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$102 ( v1,v2 );
/* .line 164 */
v1 = this.this$0;
v2 = this.this$0;
v3 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$000 ( v3 );
v4 = com.adknowledge.superrewards.model.SROfferType.OFFER;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$200 ( v2,v3,v4 );
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$302 ( v1,v2 );
/* .line 165 */
v1 = this.this$0;
v2 = this.this$0;
v3 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$000 ( v3 );
v4 = com.adknowledge.superrewards.model.SROfferType.INSTALL;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$200 ( v2,v3,v4 );
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$402 ( v1,v2 );
/* .line 167 */
v1 = this.this$0;
/* new-instance v2, Ljava/util/ArrayList; */
v3 = this.this$0;
v3 = com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$100 ( v3 );
/* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V */
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$502 ( v1,v2 );
/* .line 168 */
v1 = this.this$0;
/* new-instance v2, Ljava/util/ArrayList; */
v3 = this.this$0;
v3 = com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$300 ( v3 );
/* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V */
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$602 ( v1,v2 );
/* .line 169 */
v1 = this.this$0;
/* new-instance v2, Ljava/util/ArrayList; */
v3 = this.this$0;
v3 = com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$400 ( v3 );
/* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V */
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$702 ( v1,v2 );
/* .line 171 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$100 ( v1 );
/* .local v10, "i$":Ljava/util/Iterator; */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v11, Lcom/adknowledge/superrewards/model/SROffer; */
/* .line 173 */
/* .local v11, "srDirect":Lcom/adknowledge/superrewards/model/SROffer; */
(( com.adknowledge.superrewards.model.SROffer ) v11 ).getName ( ); // invoke-virtual {v11}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
v1 = com.adknowledge.superrewards.model.SRImageByName .getDirectPayImageByName ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 174 */
v1 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v1 ).getResources ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getResources()Landroid/content/res/Resources;
(( com.adknowledge.superrewards.model.SROffer ) v11 ).getName ( ); // invoke-virtual {v11}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
v2 = com.adknowledge.superrewards.model.SRImageByName .getDirectPayImageByName ( v2 );
(( android.content.res.Resources ) v1 ).getDrawable ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* .line 176 */
/* .local v9, "drawable":Landroid/graphics/drawable/Drawable; */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$500 ( v1 );
/* new-instance v2, Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem; */
(( com.adknowledge.superrewards.model.SROffer ) v11 ).getName ( ); // invoke-virtual {v11}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
/* invoke-direct {v2, v9, v3}, Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V */
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 182 */
} // .end local v9 # "drawable":Landroid/graphics/drawable/Drawable;
} // :goto_1
final String v1 = "SR"; // const-string v1, "SR"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Set Direct Payment Offer: "; // const-string v3, "Set Direct Payment Offer: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.adknowledge.superrewards.model.SROffer ) v11 ).getName ( ); // invoke-virtual {v11}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
/* .line 178 */
} // :cond_1
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$500 ( v1 );
/* new-instance v2, Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem; */
v3 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v3 ).getApplicationContext ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
(( com.adknowledge.superrewards.model.SROffer ) v11 ).getIcon ( ); // invoke-virtual {v11}, Lcom/adknowledge/superrewards/model/SROffer;->getIcon()Ljava/lang/String;
com.adknowledge.superrewards.Utils .getImage ( v3,v4 );
(( com.adknowledge.superrewards.model.SROffer ) v11 ).getName ( ); // invoke-virtual {v11}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
/* invoke-direct {v2, v3, v4}, Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V */
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 185 */
} // .end local v11 # "srDirect":Lcom/adknowledge/superrewards/model/SROffer;
} // :cond_2
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$300 ( v1 );
v1 = } // :goto_2
if ( v1 != null) { // if-eqz v1, :cond_3
/* check-cast v12, Lcom/adknowledge/superrewards/model/SROffer; */
/* .line 186 */
/* .local v12, "srOffer":Lcom/adknowledge/superrewards/model/SROffer; */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$600 ( v1 );
/* new-instance v2, Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem; */
v3 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v3 ).getApplicationContext ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
(( com.adknowledge.superrewards.model.SROffer ) v12 ).getIcon ( ); // invoke-virtual {v12}, Lcom/adknowledge/superrewards/model/SROffer;->getIcon()Ljava/lang/String;
com.adknowledge.superrewards.Utils .getImage ( v3,v4 );
v4 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v4 ).getApplicationContext ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
(( com.adknowledge.superrewards.model.SROffer ) v12 ).getImage ( ); // invoke-virtual {v12}, Lcom/adknowledge/superrewards/model/SROffer;->getImage()Ljava/lang/String;
com.adknowledge.superrewards.Utils .getImage ( v4,v5 );
/* invoke-direct {v2, v3, v4, v12}, Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcom/adknowledge/superrewards/model/SROffer;)V */
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 188 */
final String v1 = "SR"; // const-string v1, "SR"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Set Offer: "; // const-string v3, "Set Offer: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.adknowledge.superrewards.model.SROffer ) v12 ).getName ( ); // invoke-virtual {v12}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
/* .line 191 */
} // .end local v12 # "srOffer":Lcom/adknowledge/superrewards/model/SROffer;
} // :cond_3
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$400 ( v1 );
v1 = } // :goto_3
if ( v1 != null) { // if-eqz v1, :cond_4
/* check-cast v12, Lcom/adknowledge/superrewards/model/SROffer; */
/* .line 192 */
/* .restart local v12 # "srOffer":Lcom/adknowledge/superrewards/model/SROffer; */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$700 ( v1 );
/* new-instance v2, Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem; */
v3 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v3 ).getApplicationContext ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
(( com.adknowledge.superrewards.model.SROffer ) v12 ).getIcon ( ); // invoke-virtual {v12}, Lcom/adknowledge/superrewards/model/SROffer;->getIcon()Ljava/lang/String;
com.adknowledge.superrewards.Utils .getImage ( v3,v4 );
v4 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v4 ).getApplicationContext ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
(( com.adknowledge.superrewards.model.SROffer ) v12 ).getImage ( ); // invoke-virtual {v12}, Lcom/adknowledge/superrewards/model/SROffer;->getImage()Ljava/lang/String;
com.adknowledge.superrewards.Utils .getImage ( v4,v5 );
/* invoke-direct {v2, v3, v4, v12}, Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcom/adknowledge/superrewards/model/SROffer;)V */
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 194 */
final String v1 = "SR"; // const-string v1, "SR"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Set Offer: "; // const-string v3, "Set Offer: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.adknowledge.superrewards.model.SROffer ) v12 ).getName ( ); // invoke-virtual {v12}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
/* .line 197 */
} // .end local v10 # "i$":Ljava/util/Iterator;
} // .end local v12 # "srOffer":Lcom/adknowledge/superrewards/model/SROffer;
} // :cond_4
int v1 = 0; // const/4 v1, 0x0
} // .end method
protected void onPostExecute ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .param p1, "x0" # Ljava/lang/Object; */
/* .prologue */
/* .line 149 */
/* check-cast p1, Ljava/lang/Void; */
} // .end local p1 # "x0":Ljava/lang/Object;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity$PaymentMethodsTask ) p0 ).onPostExecute ( p1 ); // invoke-virtual {p0, p1}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity$PaymentMethodsTask;->onPostExecute(Ljava/lang/Void;)V
return;
} // .end method
protected void onPostExecute ( java.lang.Void p0 ) {
/* .locals 7 */
/* .param p1, "nothing" # Ljava/lang/Void; */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 201 */
v1 = (( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity$PaymentMethodsTask ) p0 ).isCancelled ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity$PaymentMethodsTask;->isCancelled()Z
/* if-nez v1, :cond_3 */
/* .line 202 */
v1 = this.this$0;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "get more "; // const-string v3, "get more "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = com.adknowledge.superrewards.model.SRParams.currency;
(( java.lang.String ) v3 ).toLowerCase ( ); // invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v3 = this.this$0;
v3 = com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$800 ( v3 );
java.lang.Boolean .valueOf ( v3 );
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v1 ).customTitleBar ( v2, v6, v3 ); // invoke-virtual {v1, v2, v6, v3}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->customTitleBar(Ljava/lang/String;ZLjava/lang/Boolean;)V
/* .line 208 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$900 ( v1 );
(( android.widget.TabHost ) v1 ).clearAllTabs ( ); // invoke-virtual {v1}, Landroid/widget/TabHost;->clearAllTabs()V
/* .line 210 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$700 ( v1 );
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 211 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$900 ( v1 );
v2 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$1000 ( v2 );
(( android.widget.TabHost ) v1 ).addTab ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V
/* .line 214 */
} // :cond_0
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$500 ( v1 );
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 215 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$900 ( v1 );
v2 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$1100 ( v2 );
(( android.widget.TabHost ) v1 ).addTab ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V
/* .line 218 */
} // :cond_1
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$600 ( v1 );
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 219 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$900 ( v1 );
v2 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$1200 ( v2 );
(( android.widget.TabHost ) v1 ).addTab ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V
/* .line 222 */
} // :cond_2
/* new-instance v0, Landroid/content/Intent; */
v1 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v1 ).getApplicationContext ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
/* const-class v2, Lcom/adknowledge/superrewards/ui/activities/SRWebViewActivity; */
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 224 */
/* .local v0, "i":Landroid/content/Intent; */
final String v1 = "http://www.srpoints.com"; // const-string v1, "http://www.srpoints.com"
v2 = com.adknowledge.superrewards.model.SRParams.help;
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 225 */
v1 = this.this$0;
v2 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$900 ( v2 );
final String v3 = "SUPPORT"; // const-string v3, "SUPPORT"
(( android.widget.TabHost ) v2 ).newTabSpec ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;
final String v3 = "support"; // const-string v3, "support"
v4 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v4 ).getResources ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v4 ).getDrawable ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
(( android.widget.TabHost$TabSpec ) v2 ).setIndicator ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/widget/TabHost$TabSpec;->setIndicator(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Landroid/widget/TabHost$TabSpec;
(( android.widget.TabHost$TabSpec ) v2 ).setContent ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/TabHost$TabSpec;->setContent(Landroid/content/Intent;)Landroid/widget/TabHost$TabSpec;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$1302 ( v1,v2 );
/* .line 233 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$900 ( v1 );
v2 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$1300 ( v2 );
(( android.widget.TabHost ) v1 ).addTab ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V
/* .line 235 */
v1 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v1 ).getTabWidget ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getTabWidget()Landroid/widget/TabWidget;
(( android.widget.TabWidget ) v1 ).setCurrentTab ( v6 ); // invoke-virtual {v1, v6}, Landroid/widget/TabWidget;->setCurrentTab(I)V
/* .line 236 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$1400 ( v1 );
v2 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$500 ( v2 );
(( com.adknowledge.superrewards.ui.adapter.SRDirectPaymentAdapter ) v1 ).setOffers ( v2 ); // invoke-virtual {v1, v2}, Lcom/adknowledge/superrewards/ui/adapter/SRDirectPaymentAdapter;->setOffers(Ljava/util/List;)V
/* .line 237 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$1500 ( v1 );
v2 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$600 ( v2 );
(( com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter ) v1 ).setOffers ( v2 ); // invoke-virtual {v1, v2}, Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter;->setOffers(Ljava/util/List;)V
/* .line 238 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$1600 ( v1 );
v2 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$700 ( v2 );
(( com.adknowledge.superrewards.ui.adapter.SRInstallPaymentAdapter ) v1 ).setOffers ( v2 ); // invoke-virtual {v1, v2}, Lcom/adknowledge/superrewards/ui/adapter/SRInstallPaymentAdapter;->setOffers(Ljava/util/List;)V
/* .line 239 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$1400 ( v1 );
(( com.adknowledge.superrewards.ui.adapter.SRDirectPaymentAdapter ) v1 ).notifyDataSetChanged ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/ui/adapter/SRDirectPaymentAdapter;->notifyDataSetChanged()V
/* .line 240 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$1500 ( v1 );
(( com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter ) v1 ).notifyDataSetChanged ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter;->notifyDataSetChanged()V
/* .line 241 */
v1 = this.this$0;
com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity .access$1600 ( v1 );
(( com.adknowledge.superrewards.ui.adapter.SRInstallPaymentAdapter ) v1 ).notifyDataSetChanged ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/ui/adapter/SRInstallPaymentAdapter;->notifyDataSetChanged()V
/* .line 243 */
v1 = this.myProgressDialog;
(( android.app.ProgressDialog ) v1 ).dismiss ( ); // invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
/* .line 247 */
} // .end local v0 # "i":Landroid/content/Intent;
} // :goto_0
return;
/* .line 245 */
} // :cond_3
v1 = this.this$0;
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) v1 ).getApplicationContext ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
final String v2 = "Sorry, an error occurred.\nPlease try again later."; // const-string v2, "Sorry, an error occurred.\nPlease try again later."
int v3 = 1; // const/4 v3, 0x1
android.widget.Toast .makeText ( v1,v2,v3 );
(( android.widget.Toast ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/widget/Toast;->show()V
} // .end method
