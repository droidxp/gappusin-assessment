class de.nurogames.android.ticb.base.core.ShopMngr$1 implements android.view.View$OnClickListener {
	 /* .source "ShopMngr.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/core/ShopMngr;->getBrandNew()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.core.ShopMngr this$0; //synthetic
private final android.app.Dialog val$dialog; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.core.ShopMngr$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$dialog = p2;
/* .line 148 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 151 */
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
de.nurogames.android.ticb.base.core.ShopMngr .access$0 ( v0,v1 );
/* .line 152 */
v0 = this.val$dialog;
(( android.app.Dialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
/* .line 153 */
return;
} // .end method
