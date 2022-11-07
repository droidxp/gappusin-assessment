class de.nurogames.android.ticb.base.tinysanta$CatalogAdapter extends android.widget.ArrayAdapter {
	 /* .source "tinysanta.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/tinysanta; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "CatalogAdapter" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/widget/ArrayAdapter", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
private de.nurogames.android.ticb.base.tinysanta$CatalogEntry mCatalog;
private Boolean mIsSubscriptionsSupported;
private java.util.Set mOwnedItems;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public de.nurogames.android.ticb.base.tinysanta$CatalogAdapter ( ) {
/* .locals 4 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "catalog" # [Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 990 */
/* const v2, 0x1090008 */
/* invoke-direct {p0, p1, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V */
/* .line 986 */
/* new-instance v2, Ljava/util/HashSet; */
/* invoke-direct {v2}, Ljava/util/HashSet;-><init>()V */
this.mOwnedItems = v2;
/* .line 987 */
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/tinysanta$CatalogAdapter;->mIsSubscriptionsSupported:Z */
/* .line 991 */
this.mCatalog = p2;
/* .line 992 */
/* array-length v2, p2 */
} // :goto_0
/* if-lt v1, v2, :cond_0 */
/* .line 995 */
/* const v1, 0x1090009 */
(( de.nurogames.android.ticb.base.tinysanta$CatalogAdapter ) p0 ).setDropDownViewResource ( v1 ); // invoke-virtual {p0, v1}, Lde/nurogames/android/ticb/base/tinysanta$CatalogAdapter;->setDropDownViewResource(I)V
/* .line 996 */
return;
/* .line 992 */
} // :cond_0
/* aget-object v0, p2, v1 */
/* .line 993 */
/* .local v0, "element":Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry; */
/* iget v3, v0, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry;->nameId:I */
(( android.content.Context ) p1 ).getString ( v3 ); // invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( de.nurogames.android.ticb.base.tinysanta$CatalogAdapter ) p0 ).add ( v3 ); // invoke-virtual {p0, v3}, Lde/nurogames/android/ticb/base/tinysanta$CatalogAdapter;->add(Ljava/lang/Object;)V
/* .line 992 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
/* # virtual methods */
public Boolean areAllItemsEnabled ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1010 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.view.View getDropDownView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 2 */
/* .param p1, "position" # I */
/* .param p2, "convertView" # Landroid/view/View; */
/* .param p3, "parent" # Landroid/view/ViewGroup; */
/* .prologue */
/* .line 1031 */
/* invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View; */
/* .line 1032 */
/* .local v0, "view":Landroid/view/View; */
v1 = (( de.nurogames.android.ticb.base.tinysanta$CatalogAdapter ) p0 ).isEnabled ( p1 ); // invoke-virtual {p0, p1}, Lde/nurogames/android/ticb/base/tinysanta$CatalogAdapter;->isEnabled(I)Z
(( android.view.View ) v0 ).setEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V
/* .line 1033 */
} // .end method
public Boolean isEnabled ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "position" # I */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 1017 */
v2 = this.mCatalog;
/* aget-object v0, v2, p1 */
/* .line 1018 */
/* .local v0, "entry":Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry; */
v2 = this.managed;
v3 = de.nurogames.android.ticb.base.tinysanta$Managed.MANAGED;
/* if-ne v2, v3, :cond_1 */
v2 = this.mOwnedItems;
v2 = v3 = this.sku;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 1024 */
} // :cond_0
} // :goto_0
/* .line 1021 */
} // :cond_1
v2 = this.managed;
v3 = de.nurogames.android.ticb.base.tinysanta$Managed.SUBSCRIPTION;
/* if-ne v2, v3, :cond_2 */
/* iget-boolean v2, p0, Lde/nurogames/android/ticb/base/tinysanta$CatalogAdapter;->mIsSubscriptionsSupported:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 1024 */
} // :cond_2
int v1 = 1; // const/4 v1, 0x1
} // .end method
public void setOwnedItems ( java.util.Set p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 999 */
/* .local p1, "ownedItems":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
this.mOwnedItems = p1;
/* .line 1000 */
(( de.nurogames.android.ticb.base.tinysanta$CatalogAdapter ) p0 ).notifyDataSetChanged ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/tinysanta$CatalogAdapter;->notifyDataSetChanged()V
/* .line 1001 */
return;
} // .end method
