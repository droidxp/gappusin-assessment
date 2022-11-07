class de.nurogames.android.ticb.base.core.ShopMngr$2 implements android.view.View$OnClickListener {
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
private final android.content.Intent val$myIntent; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.core.ShopMngr$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$myIntent = p2;
this.val$dialog = p3;
/* .line 158 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 161 */
v0 = this.this$0;
de.nurogames.android.ticb.base.core.ShopMngr .access$1 ( v0 );
v1 = this.val$myIntent;
(( android.app.Activity ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 162 */
v0 = this.val$dialog;
(( android.app.Dialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
/* .line 163 */
return;
} // .end method
