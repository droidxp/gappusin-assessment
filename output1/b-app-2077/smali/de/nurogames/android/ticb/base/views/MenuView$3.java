class de.nurogames.android.ticb.base.views.MenuView$3 implements android.view.View$OnClickListener {
	 /* .source "MenuView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/views/MenuView;->showChangeLogDialog()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.views.MenuView this$0; //synthetic
private final android.app.Dialog val$changelog; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.MenuView$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$changelog = p2;
/* .line 901 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 1 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 904 */
v0 = this.val$changelog;
(( android.app.Dialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
/* .line 905 */
return;
} // .end method
