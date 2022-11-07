public class com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity extends android.app.TabActivity {
	 /* .source "SRPaymentMethodsActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity$PaymentMethodsTask; */
	 /* } */
} // .end annotation
/* # instance fields */
private Boolean customTitleSupported;
private com.adknowledge.superrewards.ui.adapter.SRDirectPaymentAdapter directAdapter;
private java.util.ArrayList directItemList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.List directPaymentList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SROffer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private com.adknowledge.superrewards.ui.adapter.SRInstallPaymentAdapter installAdapter;
private java.util.ArrayList installItemList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.List installPaymentList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SROffer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private android.widget.TabHost$TabSpec mDirectTabSpec;
private android.widget.TabHost$TabSpec mInstallTabSpec;
private android.widget.TabHost$TabSpec mOfferTabSpec;
private android.widget.TabHost$TabSpec mSupportTabSpec;
private com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter offerAdapter;
private java.util.ArrayList offerItemList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.List offerPaymentList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SROffer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.List paymentMethodList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SROffer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private android.widget.TabHost tabHost;
/* # direct methods */
public com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ( ) {
/* .locals 0 */
/* .prologue */
/* .line 53 */
/* invoke-direct {p0}, Landroid/app/TabActivity;-><init>()V */
/* .line 149 */
return;
} // .end method
static java.util.List access$000 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.paymentMethodList;
} // .end method
static java.util.List access$002 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0, java.util.List p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .param p1, "x1" # Ljava/util/List; */
/* .prologue */
/* .line 53 */
this.paymentMethodList = p1;
} // .end method
static java.util.List access$100 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.directPaymentList;
} // .end method
static android.widget.TabHost$TabSpec access$1000 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.mInstallTabSpec;
} // .end method
static java.util.List access$102 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0, java.util.List p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .param p1, "x1" # Ljava/util/List; */
/* .prologue */
/* .line 53 */
this.directPaymentList = p1;
} // .end method
static android.widget.TabHost$TabSpec access$1100 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.mDirectTabSpec;
} // .end method
static android.widget.TabHost$TabSpec access$1200 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.mOfferTabSpec;
} // .end method
static android.widget.TabHost$TabSpec access$1300 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.mSupportTabSpec;
} // .end method
static android.widget.TabHost$TabSpec access$1302 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0, android.widget.TabHost$TabSpec p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .param p1, "x1" # Landroid/widget/TabHost$TabSpec; */
/* .prologue */
/* .line 53 */
this.mSupportTabSpec = p1;
} // .end method
static com.adknowledge.superrewards.ui.adapter.SRDirectPaymentAdapter access$1400 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.directAdapter;
} // .end method
static com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter access$1500 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.offerAdapter;
} // .end method
static com.adknowledge.superrewards.ui.adapter.SRInstallPaymentAdapter access$1600 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.installAdapter;
} // .end method
static java.util.List access$200 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0, java.util.List p1, com.adknowledge.superrewards.model.SROfferType p2 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .param p1, "x1" # Ljava/util/List; */
/* .param p2, "x2" # Lcom/adknowledge/superrewards/model/SROfferType; */
/* .prologue */
/* .line 53 */
/* invoke-direct {p0, p1, p2}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->filterOffers(Ljava/util/List;Lcom/adknowledge/superrewards/model/SROfferType;)Ljava/util/List; */
} // .end method
static java.util.List access$300 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.offerPaymentList;
} // .end method
static java.util.List access$302 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0, java.util.List p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .param p1, "x1" # Ljava/util/List; */
/* .prologue */
/* .line 53 */
this.offerPaymentList = p1;
} // .end method
static java.util.List access$400 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.installPaymentList;
} // .end method
static java.util.List access$402 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0, java.util.List p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .param p1, "x1" # Ljava/util/List; */
/* .prologue */
/* .line 53 */
this.installPaymentList = p1;
} // .end method
static java.util.ArrayList access$500 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.directItemList;
} // .end method
static java.util.ArrayList access$502 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0, java.util.ArrayList p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .param p1, "x1" # Ljava/util/ArrayList; */
/* .prologue */
/* .line 53 */
this.directItemList = p1;
} // .end method
static java.util.ArrayList access$600 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.offerItemList;
} // .end method
static java.util.ArrayList access$602 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0, java.util.ArrayList p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .param p1, "x1" # Ljava/util/ArrayList; */
/* .prologue */
/* .line 53 */
this.offerItemList = p1;
} // .end method
static java.util.ArrayList access$700 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.installItemList;
} // .end method
static java.util.ArrayList access$702 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0, java.util.ArrayList p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .param p1, "x1" # Ljava/util/ArrayList; */
/* .prologue */
/* .line 53 */
this.installItemList = p1;
} // .end method
static Boolean access$800 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
/* iget-boolean v0, p0, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->customTitleSupported:Z */
} // .end method
static android.widget.TabHost access$900 ( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
/* .prologue */
/* .line 53 */
v0 = this.tabHost;
} // .end method
private java.util.List filterOffers ( java.util.List p0, com.adknowledge.superrewards.model.SROfferType p1 ) {
/* .locals 4 */
/* .param p2, "type" # Lcom/adknowledge/superrewards/model/SROfferType; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SROffer;", */
/* ">;", */
/* "Lcom/adknowledge/superrewards/model/SROfferType;", */
/* ")", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SROffer;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 251 */
/* .local p1, "offers":Ljava/util/List;, "Ljava/util/List<Lcom/adknowledge/superrewards/model/SROffer;>;" */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 252 */
/* .local v0, "filteredOffers":Ljava/util/List;, "Ljava/util/List<Lcom/adknowledge/superrewards/model/SROffer;>;" */
/* .local v1, "i$":Ljava/util/Iterator; */
} // :cond_0
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* check-cast v2, Lcom/adknowledge/superrewards/model/SROffer; */
/* .line 253 */
/* .local v2, "srOffer":Lcom/adknowledge/superrewards/model/SROffer; */
(( com.adknowledge.superrewards.model.SROffer ) v2 ).getOfferType ( ); // invoke-virtual {v2}, Lcom/adknowledge/superrewards/model/SROffer;->getOfferType()Lcom/adknowledge/superrewards/model/SROfferType;
v3 = (( com.adknowledge.superrewards.model.SROfferType ) v3 ).equals ( p2 ); // invoke-virtual {v3, p2}, Lcom/adknowledge/superrewards/model/SROfferType;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 254 */
/* .line 257 */
} // .end local v2 # "srOffer":Lcom/adknowledge/superrewards/model/SROffer;
} // :cond_1
} // .end method
/* # virtual methods */
public void customTitleBar ( java.lang.String p0, Boolean p1, java.lang.Boolean p2 ) {
/* .locals 5 */
/* .param p1, "blurb" # Ljava/lang/String; */
/* .param p2, "spinner" # Z */
/* .param p3, "customTitleSupported" # Ljava/lang/Boolean; */
/* .prologue */
/* .line 288 */
v2 = (( java.lang.Boolean ) p3 ).booleanValue ( ); // invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 289 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getWindow()Landroid/view/Window;
int v3 = 7; // const/4 v3, 0x7
(( android.view.Window ) v2 ).setFeatureInt ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/view/Window;->setFeatureInt(II)V
/* .line 290 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
/* .line 291 */
/* .local v0, "SRCustomTitleLeft":Landroid/widget/TextView; */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 293 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/ProgressBar; */
/* .line 295 */
/* .local v1, "titleProgressBar":Landroid/widget/ProgressBar; */
/* const/16 v2, 0x8 */
(( android.widget.ProgressBar ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V
/* .line 296 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 297 */
final String v2 = "Loading..."; // const-string v2, "Loading..."
(( android.widget.TextView ) v0 ).setText ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 298 */
int v2 = 0; // const/4 v2, 0x0
(( android.widget.ProgressBar ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V
/* .line 301 */
} // .end local v0 # "SRCustomTitleLeft":Landroid/widget/TextView;
} // .end local v1 # "titleProgressBar":Landroid/widget/ProgressBar;
} // :cond_0
return;
} // .end method
protected android.widget.AdapterView$OnItemClickListener getDirectPaymentOnItemClickListener ( ) {
/* .locals 1 */
/* .prologue */
/* .line 261 */
/* new-instance v0, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity$1; */
/* invoke-direct {v0, p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity$1;-><init>(Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;)V */
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 14 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 70 */
/* invoke-super {p0, p1}, Landroid/app/TabActivity;->onCreate(Landroid/os/Bundle;)V */
/* .line 71 */
final String v10 = "SR"; // const-string v10, "SR"
final String v11 = "Setting up Payment Methods"; // const-string v11, "Setting up Payment Methods"
android.util.Log .i ( v10,v11 );
/* .line 72 */
int v10 = 7; // const/4 v10, 0x7
v10 = (( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).requestWindowFeature ( v10 ); // invoke-virtual {p0, v10}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->requestWindowFeature(I)Z
/* iput-boolean v10, p0, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->customTitleSupported:Z */
/* .line 73 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
v10 = com.adknowledge.superrewards.Utils .isOnline ( v10 );
/* if-nez v10, :cond_0 */
/* .line 74 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
final String v11 = "\tThis Application \nRequires Internet Access."; // const-string v11, "\tThis Application \nRequires Internet Access."
int v12 = 1; // const/4 v12, 0x1
android.widget.Toast .makeText ( v10,v11,v12 );
(( android.widget.Toast ) v10 ).show ( ); // invoke-virtual {v10}, Landroid/widget/Toast;->show()V
/* .line 75 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->finish()V
/* .line 78 */
} // :cond_0
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).setContentView ( v10 ); // invoke-virtual {p0, v10}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->setContentView(I)V
/* .line 80 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v10 ).getExtras ( ); // invoke-virtual {v10}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* .line 81 */
/* .local v2, "extras":Landroid/os/Bundle; */
final String v10 = "h"; // const-string v10, "h"
(( android.os.Bundle ) v2 ).getString ( v10 ); // invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 82 */
/* .local v3, "h":Ljava/lang/String; */
final String v10 = "uid"; // const-string v10, "uid"
(( android.os.Bundle ) v2 ).getString ( v10 ); // invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 83 */
/* .local v8, "uid":Ljava/lang/String; */
final String v10 = "cc"; // const-string v10, "cc"
(( android.os.Bundle ) v2 ).getString ( v10 ); // invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 84 */
/* .local v0, "cc":Ljava/lang/String; */
final String v10 = "xml"; // const-string v10, "xml"
(( android.os.Bundle ) v2 ).getString ( v10 ); // invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 85 */
/* .local v9, "xml":Ljava/lang/String; */
final String v10 = "nOffers"; // const-string v10, "nOffers"
(( android.os.Bundle ) v2 ).getString ( v10 ); // invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 87 */
/* .local v5, "nOffers":Ljava/lang/String; */
/* new-instance v10, Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter; */
/* invoke-direct {v10, p0}, Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter;-><init>(Landroid/content/Context;)V */
this.offerAdapter = v10;
/* .line 88 */
/* new-instance v10, Lcom/adknowledge/superrewards/ui/adapter/SRDirectPaymentAdapter; */
/* invoke-direct {v10, p0}, Lcom/adknowledge/superrewards/ui/adapter/SRDirectPaymentAdapter;-><init>(Landroid/content/Context;)V */
this.directAdapter = v10;
/* .line 89 */
/* new-instance v10, Lcom/adknowledge/superrewards/ui/adapter/SRInstallPaymentAdapter; */
/* invoke-direct {v10, p0}, Lcom/adknowledge/superrewards/ui/adapter/SRInstallPaymentAdapter;-><init>(Landroid/content/Context;)V */
this.installAdapter = v10;
/* .line 91 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).findViewById ( v10 ); // invoke-virtual {p0, v10}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/ListView; */
/* .line 92 */
/* .local v1, "directListView":Landroid/widget/ListView; */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).findViewById ( v10 ); // invoke-virtual {p0, v10}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->findViewById(I)Landroid/view/View;
/* check-cast v6, Landroid/widget/ListView; */
/* .line 93 */
/* .local v6, "offerListView":Landroid/widget/ListView; */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).findViewById ( v10 ); // invoke-virtual {p0, v10}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->findViewById(I)Landroid/view/View;
/* check-cast v4, Landroid/widget/ListView; */
/* .line 95 */
/* .local v4, "installListView":Landroid/widget/ListView; */
v10 = this.directAdapter;
(( android.widget.ListView ) v1 ).setAdapter ( v10 ); // invoke-virtual {v1, v10}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
/* .line 96 */
v10 = this.offerAdapter;
(( android.widget.ListView ) v6 ).setAdapter ( v10 ); // invoke-virtual {v6, v10}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
/* .line 97 */
v10 = this.installAdapter;
(( android.widget.ListView ) v4 ).setAdapter ( v10 ); // invoke-virtual {v4, v10}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
/* .line 100 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
v10 = com.adknowledge.superrewards.Utils .checkRunFlag ( v10 );
/* if-nez v10, :cond_1 */
/* .line 101 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getApplicationContext()Landroid/content/Context;
com.adknowledge.superrewards.tracking.SRAppInstallTracker .getInstance ( v10,v3 );
/* .line 102 */
/* .local v7, "tracker":Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker; */
(( com.adknowledge.superrewards.tracking.SRAppInstallTracker ) v7 ).track ( ); // invoke-virtual {v7}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->track()V
/* .line 112 */
} // .end local v7 # "tracker":Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;
} // :cond_1
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).getTabHost ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getTabHost()Landroid/widget/TabHost;
this.tabHost = v10;
/* .line 113 */
v10 = this.tabHost;
(( android.widget.TabHost ) v10 ).setup ( ); // invoke-virtual {v10}, Landroid/widget/TabHost;->setup()V
/* .line 114 */
v10 = this.tabHost;
final String v11 = "INSTALL"; // const-string v11, "INSTALL"
(( android.widget.TabHost ) v10 ).newTabSpec ( v11 ); // invoke-virtual {v10, v11}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;
final String v11 = "install"; // const-string v11, "install"
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v12 ).getDrawable ( v13 ); // invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
(( android.widget.TabHost$TabSpec ) v10 ).setIndicator ( v11, v12 ); // invoke-virtual {v10, v11, v12}, Landroid/widget/TabHost$TabSpec;->setIndicator(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Landroid/widget/TabHost$TabSpec;
(( android.widget.TabHost$TabSpec ) v10 ).setContent ( v11 ); // invoke-virtual {v10, v11}, Landroid/widget/TabHost$TabSpec;->setContent(I)Landroid/widget/TabHost$TabSpec;
this.mInstallTabSpec = v10;
/* .line 122 */
v10 = this.tabHost;
v11 = this.mInstallTabSpec;
(( android.widget.TabHost ) v10 ).addTab ( v11 ); // invoke-virtual {v10, v11}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V
/* .line 123 */
v10 = this.tabHost;
final String v11 = "DIRECT"; // const-string v11, "DIRECT"
(( android.widget.TabHost ) v10 ).newTabSpec ( v11 ); // invoke-virtual {v10, v11}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;
final String v11 = "buy"; // const-string v11, "buy"
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v12 ).getDrawable ( v13 ); // invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
(( android.widget.TabHost$TabSpec ) v10 ).setIndicator ( v11, v12 ); // invoke-virtual {v10, v11, v12}, Landroid/widget/TabHost$TabSpec;->setIndicator(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Landroid/widget/TabHost$TabSpec;
(( android.widget.TabHost$TabSpec ) v10 ).setContent ( v11 ); // invoke-virtual {v10, v11}, Landroid/widget/TabHost$TabSpec;->setContent(I)Landroid/widget/TabHost$TabSpec;
this.mDirectTabSpec = v10;
/* .line 131 */
v10 = this.tabHost;
v11 = this.mDirectTabSpec;
(( android.widget.TabHost ) v10 ).addTab ( v11 ); // invoke-virtual {v10, v11}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V
/* .line 132 */
v10 = this.tabHost;
final String v11 = "OFFER"; // const-string v11, "OFFER"
(( android.widget.TabHost ) v10 ).newTabSpec ( v11 ); // invoke-virtual {v10, v11}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;
final String v11 = "earn"; // const-string v11, "earn"
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v12 ).getDrawable ( v13 ); // invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
(( android.widget.TabHost$TabSpec ) v10 ).setIndicator ( v11, v12 ); // invoke-virtual {v10, v11, v12}, Landroid/widget/TabHost$TabSpec;->setIndicator(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Landroid/widget/TabHost$TabSpec;
(( android.widget.TabHost$TabSpec ) v10 ).setContent ( v11 ); // invoke-virtual {v10, v11}, Landroid/widget/TabHost$TabSpec;->setContent(I)Landroid/widget/TabHost$TabSpec;
this.mOfferTabSpec = v10;
/* .line 140 */
v10 = this.tabHost;
v11 = this.mOfferTabSpec;
(( android.widget.TabHost ) v10 ).addTab ( v11 ); // invoke-virtual {v10, v11}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V
/* .line 142 */
/* new-instance v10, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity$PaymentMethodsTask; */
/* invoke-direct {v10, p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity$PaymentMethodsTask;-><init>(Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;)V */
int v11 = 7; // const/4 v11, 0x7
/* new-array v11, v11, [Ljava/lang/String; */
int v12 = 0; // const/4 v12, 0x0
/* aput-object v3, v11, v12 */
int v12 = 1; // const/4 v12, 0x1
/* aput-object v8, v11, v12 */
int v12 = 2; // const/4 v12, 0x2
/* aput-object v0, v11, v12 */
int v12 = 3; // const/4 v12, 0x3
final String v13 = "3"; // const-string v13, "3"
/* aput-object v13, v11, v12 */
int v12 = 4; // const/4 v12, 0x4
v13 = com.adknowledge.superrewards.model.SRParams.v;
/* aput-object v13, v11, v12 */
int v12 = 5; // const/4 v12, 0x5
/* aput-object v5, v11, v12 */
int v12 = 6; // const/4 v12, 0x6
int v13 = 0; // const/4 v13, 0x0
/* aput-object v13, v11, v12 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity$PaymentMethodsTask ) v10 ).execute ( v11 ); // invoke-virtual {v10, v11}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity$PaymentMethodsTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* .line 144 */
final String v10 = "SR"; // const-string v10, "SR"
final String v11 = "Finished Setting up Payment Methods"; // const-string v11, "Finished Setting up Payment Methods"
android.util.Log .i ( v10,v11 );
/* .line 145 */
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).getDirectPaymentOnItemClickListener ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->getDirectPaymentOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;
(( android.widget.ListView ) v1 ).setOnItemClickListener ( v10 ); // invoke-virtual {v1, v10}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
/* .line 146 */
int v10 = -1; // const/4 v10, -0x1
(( com.adknowledge.superrewards.ui.activities.SRPaymentMethodsActivity ) p0 ).setResult ( v10 ); // invoke-virtual {p0, v10}, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity;->setResult(I)V
/* .line 147 */
return;
} // .end method
