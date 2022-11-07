class de.nurogames.android.ticb.base.views.MenuView$2 implements android.view.View$OnClickListener {
	 /* .source "MenuView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/views/MenuView;->checkForLove()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.views.MenuView this$0; //synthetic
private final android.app.Dialog val$dialog; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.MenuView$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$dialog = p2;
/* .line 278 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 1 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .prologue */
/* .line 281 */
v0 = this.val$dialog;
(( android.app.Dialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
/* .line 282 */
return;
} // .end method
