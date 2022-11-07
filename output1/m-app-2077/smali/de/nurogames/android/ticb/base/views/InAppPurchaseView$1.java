class de.nurogames.android.ticb.base.views.InAppPurchaseView$1 implements android.view.View$OnClickListener {
	 /* .source "InAppPurchaseView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->itemClicked(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.views.InAppPurchaseView this$0; //synthetic
private final android.app.Dialog val$dialog; //synthetic
private final java.lang.String val$item_name; //synthetic
private final java.lang.String val$item_sku; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.InAppPurchaseView$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$item_name = p2;
this.val$item_sku = p3;
this.val$dialog = p4;
/* .line 319 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 3 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 324 */
v0 = this.val$item_name;
v1 = this.val$item_sku;
int v2 = 0; // const/4 v2, 0x0
de.nurogames.android.ticb.base.tinysanta .buyPurchaseItem ( v0,v1,v2 );
/* .line 326 */
v0 = this.val$dialog;
(( android.app.Dialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
/* .line 327 */
return;
} // .end method
