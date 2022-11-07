public class com.adknowledge.superrewards.ui.adapter.SRDirectPaymentAdapter extends android.widget.BaseAdapter {
	 /* .source "SRDirectPaymentAdapter.java" */
	 /* # instance fields */
	 private final android.content.Context context;
	 private java.util.List directs;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.adknowledge.superrewards.ui.adapter.SRDirectPaymentAdapter ( ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 34 */
/* invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V */
/* .line 35 */
this.context = p1;
/* .line 36 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.directs = v0;
/* .line 37 */
return;
} // .end method
/* # virtual methods */
public Integer getCount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 49 */
v0 = v0 = this.directs;
} // .end method
public com.adknowledge.superrewards.ui.adapter.item.SRDirectPaymentItem getItem ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 59 */
try { // :try_start_0
	 v1 = this.directs;
	 /* check-cast v1, Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem; */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 61 */
} // :goto_0
/* .line 60 */
/* :catch_0 */
/* move-exception v0 */
/* .line 61 */
/* .local v0, "e":Ljava/lang/Exception; */
int v1 = 0; // const/4 v1, 0x0
} // .end method
public java.lang.Object getItem ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .param p1, "x0" # I */
/* .prologue */
/* .line 29 */
(( com.adknowledge.superrewards.ui.adapter.SRDirectPaymentAdapter ) p0 ).getItem ( p1 ); // invoke-virtual {p0, p1}, Lcom/adknowledge/superrewards/ui/adapter/SRDirectPaymentAdapter;->getItem(I)Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem;
} // .end method
public Long getItemId ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 71 */
/* int-to-long v0, p1 */
/* return-wide v0 */
} // .end method
public android.view.View getView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 7 */
/* .param p1, "position" # I */
/* .param p2, "convertView" # Landroid/view/View; */
/* .param p3, "parent" # Landroid/view/ViewGroup; */
/* .prologue */
/* .line 80 */
/* move-object v3, p2 */
/* .line 81 */
/* .local v3, "v":Landroid/view/View; */
/* if-nez v3, :cond_0 */
/* .line 82 */
v5 = this.context;
final String v6 = "layout_inflater"; // const-string v6, "layout_inflater"
(( android.content.Context ) v5 ).getSystemService ( v6 ); // invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v4, Landroid/view/LayoutInflater; */
/* .line 83 */
/* .local v4, "vi":Landroid/view/LayoutInflater; */
int v6 = 0; // const/4 v6, 0x0
(( android.view.LayoutInflater ) v4 ).inflate ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* .line 86 */
} // .end local v4 # "vi":Landroid/view/LayoutInflater;
} // :cond_0
(( com.adknowledge.superrewards.ui.adapter.SRDirectPaymentAdapter ) p0 ).getItem ( p1 ); // invoke-virtual {p0, p1}, Lcom/adknowledge/superrewards/ui/adapter/SRDirectPaymentAdapter;->getItem(I)Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem;
/* .line 87 */
/* .local v1, "srOfferItem":Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 88 */
(( android.view.View ) v3 ).findViewById ( v5 ); // invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/ImageView; */
/* .line 89 */
/* .local v0, "srListItemImageView":Landroid/widget/ImageView; */
(( android.view.View ) v3 ).findViewById ( v5 ); // invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/TextView; */
/* .line 90 */
/* .local v2, "srTextView":Landroid/widget/TextView; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 91 */
(( com.adknowledge.superrewards.ui.adapter.item.SRDirectPaymentItem ) v1 ).getOfferIcon ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem;->getOfferIcon()Landroid/graphics/drawable/Drawable;
(( android.widget.ImageView ) v0 ).setImageDrawable ( v5 ); // invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 93 */
} // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 94 */
(( com.adknowledge.superrewards.ui.adapter.item.SRDirectPaymentItem ) v1 ).getOfferName ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem;->getOfferName()Ljava/lang/String;
(( java.lang.String ) v5 ).toLowerCase ( ); // invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( android.widget.TextView ) v2 ).setText ( v5 ); // invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 97 */
} // .end local v0 # "srListItemImageView":Landroid/widget/ImageView;
} // .end local v2 # "srTextView":Landroid/widget/TextView;
} // :cond_2
} // .end method
public void setOffers ( java.util.List p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 40 */
/* .local p1, "offers":Ljava/util/List;, "Ljava/util/List<Lcom/adknowledge/superrewards/ui/adapter/item/SRDirectPaymentItem;>;" */
this.directs = p1;
/* .line 41 */
return;
} // .end method
