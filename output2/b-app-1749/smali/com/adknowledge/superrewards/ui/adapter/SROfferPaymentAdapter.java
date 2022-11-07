public class com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter extends android.widget.BaseAdapter {
	 /* .source "SROfferPaymentAdapter.java" */
	 /* # instance fields */
	 private android.content.Context context;
	 private java.util.List offers;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter ( ) {
/* .locals 1 */
/* .prologue */
/* .line 39 */
/* invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V */
/* .line 40 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.offers = v0;
/* .line 41 */
return;
} // .end method
public com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter ( ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 43 */
/* invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V */
/* .line 44 */
this.context = p1;
/* .line 45 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.offers = v0;
/* .line 46 */
return;
} // .end method
static android.content.Context access$000 ( com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter; */
/* .prologue */
/* .line 34 */
v0 = this.context;
} // .end method
private android.view.View$OnClickListener getClickListener ( com.adknowledge.superrewards.model.SROffer p0 ) {
/* .locals 1 */
/* .param p1, "srOffer" # Lcom/adknowledge/superrewards/model/SROffer; */
/* .prologue */
/* .line 140 */
/* new-instance v0, Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter$1; */
/* invoke-direct {v0, p0, p1}, Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter$1;-><init>(Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter;Lcom/adknowledge/superrewards/model/SROffer;)V */
} // .end method
/* # virtual methods */
public Integer getCount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 66 */
v0 = v0 = this.offers;
} // .end method
public com.adknowledge.superrewards.ui.adapter.item.SROfferPaymentItem getItem ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 76 */
try { // :try_start_0
	 v1 = this.offers;
	 /* check-cast v1, Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem; */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 78 */
} // :goto_0
/* .line 77 */
/* :catch_0 */
/* move-exception v0 */
/* .line 78 */
/* .local v0, "e":Ljava/lang/Exception; */
int v1 = 0; // const/4 v1, 0x0
} // .end method
public java.lang.Object getItem ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .param p1, "x0" # I */
/* .prologue */
/* .line 34 */
(( com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter ) p0 ).getItem ( p1 ); // invoke-virtual {p0, p1}, Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter;->getItem(I)Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;
} // .end method
public Long getItemId ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 88 */
/* int-to-long v0, p1 */
/* return-wide v0 */
} // .end method
public java.util.List getOffers ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 49 */
v0 = this.offers;
} // .end method
public android.view.View getView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 14 */
/* .param p1, "position" # I */
/* .param p2, "convertView" # Landroid/view/View; */
/* .param p3, "parent" # Landroid/view/ViewGroup; */
/* .prologue */
/* .line 97 */
/* move-object/from16 v9, p2 */
/* .line 98 */
/* .local v9, "v":Landroid/view/View; */
/* if-nez v9, :cond_0 */
/* .line 99 */
v11 = this.context;
final String v12 = "layout_inflater"; // const-string v12, "layout_inflater"
(( android.content.Context ) v11 ).getSystemService ( v12 ); // invoke-virtual {v11, v12}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v10, Landroid/view/LayoutInflater; */
/* .line 100 */
/* .local v10, "vi":Landroid/view/LayoutInflater; */
int v12 = 0; // const/4 v12, 0x0
(( android.view.LayoutInflater ) v10 ).inflate ( v11, v12 ); // invoke-virtual {v10, v11, v12}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* .line 103 */
} // .end local v10 # "vi":Landroid/view/LayoutInflater;
} // :cond_0
(( com.adknowledge.superrewards.ui.adapter.SROfferPaymentAdapter ) p0 ).getItem ( p1 ); // invoke-virtual {p0, p1}, Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter;->getItem(I)Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;
/* .line 104 */
/* .local v4, "srOfferItem":Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem; */
if ( v4 != null) { // if-eqz v4, :cond_7
/* .line 105 */
(( android.view.View ) v9 ).findViewById ( v11 ); // invoke-virtual {v9, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/TextView; */
/* .line 106 */
/* .local v5, "srTextView":Landroid/widget/TextView; */
(( android.view.View ) v9 ).findViewById ( v11 ); // invoke-virtual {v9, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v8, Landroid/widget/TextView; */
/* .line 107 */
/* .local v8, "srTextViewPoints":Landroid/widget/TextView; */
(( android.view.View ) v9 ).findViewById ( v11 ); // invoke-virtual {v9, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v3, Landroid/widget/ImageView; */
/* .line 108 */
/* .local v3, "srImageView":Landroid/widget/ImageView; */
(( android.view.View ) v9 ).findViewById ( v11 ); // invoke-virtual {v9, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v6, Landroid/widget/TextView; */
/* .line 109 */
/* .local v6, "srTextViewCurrency":Landroid/widget/TextView; */
(( android.view.View ) v9 ).findViewById ( v11 ); // invoke-virtual {v9, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v7, Landroid/widget/TextView; */
/* .line 110 */
/* .local v7, "srTextViewDescription":Landroid/widget/TextView; */
(( android.view.View ) v9 ).findViewById ( v11 ); // invoke-virtual {v9, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/RelativeLayout; */
/* .line 112 */
/* .local v2, "relativelayout":Landroid/widget/RelativeLayout; */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 113 */
(( com.adknowledge.superrewards.ui.adapter.item.SROfferPaymentItem ) v4 ).getOffer ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;->getOffer()Lcom/adknowledge/superrewards/model/SROffer;
(( com.adknowledge.superrewards.model.SROffer ) v11 ).getName ( ); // invoke-virtual {v11}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
(( java.lang.String ) v11 ).trim ( ); // invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;
android.text.Html .fromHtml ( v11 );
(( android.widget.TextView ) v5 ).setText ( v11 ); // invoke-virtual {v5, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 115 */
} // :cond_1
if ( v8 != null) { // if-eqz v8, :cond_2
/* .line 116 */
(( com.adknowledge.superrewards.ui.adapter.item.SROfferPaymentItem ) v4 ).getOffer ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;->getOffer()Lcom/adknowledge/superrewards/model/SROffer;
(( com.adknowledge.superrewards.model.SROffer ) v11 ).getPayout ( ); // invoke-virtual {v11}, Lcom/adknowledge/superrewards/model/SROffer;->getPayout()Ljava/lang/String;
(( android.widget.TextView ) v8 ).setText ( v11 ); // invoke-virtual {v8, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 118 */
} // :cond_2
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 119 */
(( com.adknowledge.superrewards.ui.adapter.item.SROfferPaymentItem ) v4 ).getOffer ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;->getOffer()Lcom/adknowledge/superrewards/model/SROffer;
(( com.adknowledge.superrewards.model.SROffer ) v11 ).getCurrency ( ); // invoke-virtual {v11}, Lcom/adknowledge/superrewards/model/SROffer;->getCurrency()Ljava/lang/String;
(( android.widget.TextView ) v6 ).setText ( v11 ); // invoke-virtual {v6, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 121 */
} // :cond_3
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 122 */
(( com.adknowledge.superrewards.ui.adapter.item.SROfferPaymentItem ) v4 ).getImage ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;->getImage()Landroid/graphics/drawable/Drawable;
(( android.widget.ImageView ) v3 ).setImageDrawable ( v11 ); // invoke-virtual {v3, v11}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 124 */
} // :cond_4
if ( v7 != null) { // if-eqz v7, :cond_6
/* .line 127 */
(( com.adknowledge.superrewards.ui.adapter.item.SROfferPaymentItem ) v4 ).getOffer ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;->getOffer()Lcom/adknowledge/superrewards/model/SROffer;
(( com.adknowledge.superrewards.model.SROffer ) v11 ).getDescription ( ); // invoke-virtual {v11}, Lcom/adknowledge/superrewards/model/SROffer;->getDescription()Ljava/lang/String;
android.text.Html .fromHtml ( v11 );
/* .line 128 */
/* .local v0, "SpannedDescription":Landroid/text/Spanned; */
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.String ) v11 ).trim ( ); // invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 129 */
/* .local v1, "StringDescription":Ljava/lang/String; */
v11 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* const/16 v12, 0x37 */
/* if-le v11, v12, :cond_5 */
/* .line 130 */
/* new-instance v11, Ljava/lang/StringBuilder; */
/* invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V */
int v12 = 0; // const/4 v12, 0x0
/* const/16 v13, 0x37 */
(( java.lang.String ) v1 ).substring ( v12, v13 ); // invoke-virtual {v1, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v12 = "(...)"; // const-string v12, "(...)"
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v11 ).toString ( ); // invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 132 */
} // :cond_5
(( android.widget.TextView ) v7 ).setText ( v1 ); // invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 134 */
} // .end local v0 # "SpannedDescription":Landroid/text/Spanned;
} // .end local v1 # "StringDescription":Ljava/lang/String;
} // :cond_6
(( com.adknowledge.superrewards.ui.adapter.item.SROfferPaymentItem ) v4 ).getOffer ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;->getOffer()Lcom/adknowledge/superrewards/model/SROffer;
/* invoke-direct {p0, v11}, Lcom/adknowledge/superrewards/ui/adapter/SROfferPaymentAdapter;->getClickListener(Lcom/adknowledge/superrewards/model/SROffer;)Landroid/view/View$OnClickListener; */
(( android.widget.RelativeLayout ) v2 ).setOnClickListener ( v11 ); // invoke-virtual {v2, v11}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 136 */
} // .end local v2 # "relativelayout":Landroid/widget/RelativeLayout;
} // .end local v3 # "srImageView":Landroid/widget/ImageView;
} // .end local v5 # "srTextView":Landroid/widget/TextView;
} // .end local v6 # "srTextViewCurrency":Landroid/widget/TextView;
} // .end local v7 # "srTextViewDescription":Landroid/widget/TextView;
} // .end local v8 # "srTextViewPoints":Landroid/widget/TextView;
} // :cond_7
} // .end method
public void setContext ( android.content.Context p0 ) {
/* .locals 0 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 57 */
this.context = p1;
/* .line 58 */
return;
} // .end method
public void setOffers ( java.util.List p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 53 */
/* .local p1, "offers":Ljava/util/List;, "Ljava/util/List<Lcom/adknowledge/superrewards/ui/adapter/item/SROfferPaymentItem;>;" */
this.offers = p1;
/* .line 54 */
return;
} // .end method
